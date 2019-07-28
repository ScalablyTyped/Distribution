package typings.openui5.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleFormLayout extends js.Object

/**
  * Available <code>FormLayouts</code> used to render a <code>SimpleForm</code>.
  */
@JSGlobal("sap.ui.layout.form.SimpleFormLayout")
@js.native
object SimpleFormLayout extends js.Object {
  @js.native
  sealed trait GridLayout extends SimpleFormLayout
  
  @js.native
  sealed trait ResponsiveGridLayout extends SimpleFormLayout
  
  @js.native
  sealed trait ResponsiveLayout extends SimpleFormLayout
  
  /* 0 */ val GridLayout: typings.openui5.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout.GridLayout with Double = js.native
  /* 1 */ val ResponsiveGridLayout: typings.openui5.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout.ResponsiveGridLayout with Double = js.native
  /* 2 */ val ResponsiveLayout: typings.openui5.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout.ResponsiveLayout with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleFormLayout with Double] = js.native
}

