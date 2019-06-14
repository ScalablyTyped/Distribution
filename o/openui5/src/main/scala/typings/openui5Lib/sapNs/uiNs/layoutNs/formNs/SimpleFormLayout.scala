package typings
package openui5Lib.sapNs.uiNs.layoutNs.formNs

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
  sealed trait GridLayout
    extends openui5Lib.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout
  
  @js.native
  sealed trait ResponsiveGridLayout
    extends openui5Lib.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout
  
  @js.native
  sealed trait ResponsiveLayout
    extends openui5Lib.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout
  
  /* 0 */ val GridLayout: GridLayout with scala.Double = js.native
  /* 1 */ val ResponsiveGridLayout: ResponsiveGridLayout with scala.Double = js.native
  /* 2 */ val ResponsiveLayout: ResponsiveLayout with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout with scala.Double] = js.native
}

