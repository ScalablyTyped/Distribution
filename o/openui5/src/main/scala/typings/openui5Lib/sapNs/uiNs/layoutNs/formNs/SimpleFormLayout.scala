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
  
  val GridLayout: GridLayout with java.lang.String = js.native
  val ResponsiveGridLayout: ResponsiveGridLayout with java.lang.String = js.native
  val ResponsiveLayout: ResponsiveLayout with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.layoutNs.formNs.SimpleFormLayout with java.lang.String] = js.native
}

