package typings.openui5.sapNs.uiNs.coreNs.tmplNs

import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import typings.openui5.sapNs.uiNs.coreNs.mvcNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.tmpl.Template")
@js.native
abstract class Template protected () extends ManagedObject {
  /**
    * Creates and initializes a new template with the given <code>sId</code> andsettings.The set of
    * allowed entries in the <code>mSettings</code> object depends onthe concrete subclass and is
    * described there.Accepts an object literal <code>mSettings</code> that defines initialproperty
    * values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId optional id for the new template; generated automatically if           no non-empty id is
    * given Note: this can be omitted, no matter           whether <code>mSettings</code> will be given or
    * not!
    * @param mSettings optional map/JSON-object with initial settings for the           new component
    * instance
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Returns the registered template for the given id, if any.
    * @param sId undefined
    * @returns the template for the given id
    */
  def byId(sId: String): js.Any = js.native
  /**
    * Creates an anonymous TemplateControl for the Template.
    * @param sId the control ID
    * @param oContext the context for the renderer/templating
    * @param oView undefined
    * @returns the created control instance
    */
  def createControl(sId: String, oContext: js.Any, oView: View): TemplateControl = js.native
  /**
    * Declares a new control based on this template and returns the createdclass / constructor function.
    * The class is based on the information comingfrom the abstract functions <code>createMetadata</code>
    * and<code>createRenderer</code>.
    * @param sControl the fully qualified name of the control
    * @returns the created class / constructor function
    */
  def declareControl(sControl: String): js.Any = js.native
  /**
    * Gets current value of property <code>content</code>.The Template definition as a String.
    * @returns Value of property <code>content</code>
    */
  def getContent(): String = js.native
  /**
    * parses the given path and extracts the model and path
    * @param sPath the path
    * @returns the model and the path
    */
  def parsePath(sPath: String): js.Any = js.native
  /**
    * Creates an anonymous TemplateControl for the Template and places the controlinto the specified DOM
    * element.
    * @param oRef the id or the DOM reference where to render the template
    * @param oContext The context to use to evaluate the Template. It will be applied as value for the
    * context property of the created control.
    * @param vPosition Describes the position where the control should be put into the container
    * @param bInline undefined
    * @returns the created control instance
    */
  def placeAt(oRef: String, oContext: js.Any, vPosition: String, bInline: Boolean): TemplateControl = js.native
  def placeAt(oRef: String, oContext: js.Any, vPosition: Double, bInline: Boolean): TemplateControl = js.native
  def placeAt(oRef: js.Any, oContext: js.Any, vPosition: String, bInline: Boolean): TemplateControl = js.native
  def placeAt(oRef: js.Any, oContext: js.Any, vPosition: Double, bInline: Boolean): TemplateControl = js.native
  /**
    * Sets a new value for property <code>content</code>.The Template definition as a String.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sContent New value for property <code>content</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContent(sContent: String): js.Any = js.native
}

