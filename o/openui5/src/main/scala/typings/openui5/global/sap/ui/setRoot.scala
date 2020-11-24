package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.base.Interface
import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.setRoot")
@js.native
object setRoot extends js.Object {
  
  /**
    * Displays the control tree with the given root inside the area of the givenDOM reference (or inside
    * the DOM node with the given ID) or in the given Control.Example:<pre>  &lt;div
    * id="SAPUI5UiArea">&lt;/div>  &lt;script type="text/javascript">    var oRoot = new
    * sap.ui.commons.Label();    oRoot.setText("Hello world!");    sap.ui.setRoot("SAPUI5UiArea", oRoot); 
    * &lt;/script></pre><p>This is a shortcut for <code>sap.ui.getCore().setRoot()</code>.Internally, if a
    * string is given that does not identify an UIArea or a controlthen implicitly a new
    * <code>UIArea</code> is created for the given DOM referenceand the given control is added.
    * @param oDomRef a DOM Element or Id String of the UIArea
    * @param oControl the Control that should be added to the <code>UIArea</code>.
    */
  def apply(oDomRef: String, oControl: Interface): Unit = js.native
  def apply(oDomRef: String, oControl: Control): Unit = js.native
  def apply(oDomRef: Control, oControl: Interface): Unit = js.native
  def apply(oDomRef: Control, oControl: Control): Unit = js.native
  def apply(oDomRef: Element, oControl: Interface): Unit = js.native
  def apply(oDomRef: Element, oControl: Control): Unit = js.native
}
