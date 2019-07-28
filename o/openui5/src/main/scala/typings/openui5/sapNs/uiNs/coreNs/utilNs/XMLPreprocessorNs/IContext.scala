package typings.openui5.sapNs.uiNs.coreNs.utilNs.XMLPreprocessorNs

import typings.openui5.sapNs.uiNs.modelNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context interface provided by XML template processing as an additional firstargument to any
  * formatter function which opts in to this mechanism. Candidates forsuch formatter functions are all
  * those used in binding expressions which areevaluated during XML template processing, including those
  * used inside templateinstructions like <code>&lt;template:if></code>. The formatter function needs to
  * bemarked with a property <code>requiresIContext = true</code> to express that itrequires this
  * extended signature (compared to ordinary formatter functions). Theusual arguments are provided after
  * the first one (currently: the raw value from themodel).This interface provides callback functions to
  * access the model and path  which areneeded to process OData V4 annotations. It initially offers a
  * subset of methodsfrom {@link sap.ui.model.Context} so that formatters might also be called with
  * acontext object for convenience, e.g. outside of XML template processing (see belowfor an exception
  * to this rule).<b>Example:</b> Suppose you have a formatter function called "foo" like belowand it is
  * used within an XML template like<code>&lt;template:if test="{path: '...', formatter:
  * 'foo'}"></code>.In this case <code>foo</code> is called with arguments<code>oInterface,
  * vRawValue</code> such that<code>oInterface.getModel().getObject(oInterface.getPath()) ===
  * vRawValue</code>holds.<pre>window.foo = function (oInterface, vRawValue) {    //TODO
  * ...};window.foo.requiresIContext = true;</pre><b>Composite Binding Examples:</b> Suppose you have
  * the same formatter function andit is used in a composite binding like <code>&lt;Text text="{path:
  * 'Label',formatter: 'foo'}: {path: 'Value', formatter: 'foo'}"/></code>.In this case
  * <code>oInterface.getPath()</code> refers to ".../Label" in the 1st calland ".../Value" in the 2nd
  * call. This means each formatter call knows which part ofthe composite binding it belongs to and
  * behaves just as if it was an ordinarybinding.Suppose your formatter is not used within a part of the
  * composite binding, but atthe root of the composite binding in order to aggregate all parts like
  * <code>&lt;Text text="{parts: [{path: 'Label'}, {path: 'Value'}], formatter: 'foo'}"/></code>. In
  * this case <code>oInterface.getPath(0)</code> refers to ".../Label"
  * and<code>oInterface.getPath(1)</code> refers to ".../Value". This means, the rootformatter can
  * access the ith part of the composite binding at will (since 1.31.0);see also {@link #.getInterface
  * getInterface}.The function <code>foo</code> is called with arguments such that
  * <code>oInterface.getModel(i).getObject(oInterface.getPath(i)) === arguments[i + 1]</code>holds.To
  * distinguish those two use cases, just check whether<code>oInterface.getModel() === undefined</code>,
  * in which case the formatter iscalled on root level of a composite binding. To find out the number of
  * parts, probefor the smallest non-negative integer where<code>oInterface.getModel(i) ===
  * undefined</code>.This additional functionality is, of course, not available from{@link
  * sap.ui.model.Context}, i.e. such formatters MUST be called with an instanceof this context
  * interface.
  * @resource sap/ui/core/util/XMLPreprocessor.js
  */
@js.native
trait IContext extends js.Object {
  /**
    * Returns a context interface for the indicated part in case of the root formatterof a composite
    * binding. The new interface provides access to the originalsettings, but only to the model and path
    * of the indicated part:<pre>this.getInterface(i).getSetting(sName) ===
    * this.getSetting(sName);this.getInterface(i).getModel() ===
    * this.getModel(i);this.getInterface(i).getPath() === this.getPath(i);</pre>If a path is given, the
    * new interface points to the resolved path as follows:<pre>this.getInterface(i, "foo/bar").getPath()
    * === this.getPath(i) + "/foo/bar";this.getInterface(i, "/absolute/path").getPath() ===
    * "/absolute/path";</pre>A formatter which is not at the root level of a composite binding can
    * alsoprovide a path, but must not provide an index:<pre>this.getInterface("foo/bar").getPath() ===
    * this.getPath() + "/foo/bar";this.getInterface("/absolute/path").getPath() ===
    * "/absolute/path";</pre>Note that at least one argument must be present.
    * @since 1.31.0
    * @param iPart index of part in case of the root formatter of a composite binding
    * @param sPath a path, interpreted relative to <code>this.getPath(iPart)</code>
    * @returns the context interface related to the indicated part
    */
  def getInterface(iPart: Double): IContext = js.native
  def getInterface(iPart: Double, sPath: String): IContext = js.native
  /**
    * Returns the model related to the current formatter call.
    * @param iPart index of part in case of the root formatter of a composite binding  (since 1.31.0)
    * @returns the model related to the current formatter call, or (since 1.31.0)  <code>undefined</code>
    * in case of a root formatter if no <code>iPart</code> is  given or if <code>iPart</code> is out of
    * range
    */
  def getModel(iPart: Double): Model = js.native
  /**
    * Returns the absolute path related to the current formatter call.
    * @param iPart index of part in case of the root formatter of a composite binding  (since 1.31.0)
    * @returns the absolute path related to the current formatter call, or (since 1.31.0) 
    * <code>undefined</code> in case of a root formatter if no <code>iPart</code> is  given or if
    * <code>iPart</code> is out of range
    */
  def getPath(iPart: Double): String = js.native
  /**
    * Returns the value of the setting with the given name which was provided to theXML template
    * processing.
    * @param sName the name of the setting
    * @returns the value of the setting
    */
  def getSetting(sName: String): js.Any = js.native
}

