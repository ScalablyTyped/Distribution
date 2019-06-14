package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("sap.ui.core.mvc.View.mvc.ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait HTML
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType
  
  @js.native
  sealed trait JS
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType
  
  @js.native
  sealed trait JSON
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType
  
  @js.native
  sealed trait Template
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType
  
  @js.native
  sealed trait XML
    extends openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType
  
  /* 0 */ val HTML: HTML with scala.Double = js.native
  /* 1 */ val JS: JS with scala.Double = js.native
  /* 2 */ val JSON: JSON with scala.Double = js.native
  /* 3 */ val Template: Template with scala.Double = js.native
  /* 4 */ val XML: XML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType with scala.Double] = js.native
}

