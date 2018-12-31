package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.mvc.JSView")
@js.native
class JSView protected () extends View {
  /**
    * Constructor for a new mvc/JSView.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Flag for feature detection of asynchronous loading/rendering
    * @since 1.30
    */
  var asyncSupport: js.Any = js.native
  /**
    * A method to be implemented by JSViews, returning the View UI.While for declarative View types like
    * XMLView or JSONView the user interface definition is declared in a separate file,JSViews
    * programmatically construct the UI. This happens in the createContent method which every JSView needs
    * to implement.The View implementation can construct the complete UI in this method - or only return
    * the root control and create the rest of the UI lazily later on.
    * @returns a control or (typically) tree of controls representing the View user interface
    */
  def createContent(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * A method to be implemented by JSViews, returning the flag whether to prefixthe IDs of controls
    * automatically or not if the controls are created insidethe {@link
    * sap.ui.core.mvc.JSView#createContent} function. By default thisfeature is not activated.You can
    * overwrite this function and return true to activate the automaticprefixing.
    * @since 1.15.1
    * @returns true, if the controls IDs should be prefixed automatically
    */
  def getAutoPrefixId(): scala.Boolean = js.native
}

