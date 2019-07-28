package typings.openui5.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("sap.ui.core.mvc.View.mvc.ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait HTML extends ViewType
  
  @js.native
  sealed trait JS extends ViewType
  
  @js.native
  sealed trait JSON extends ViewType
  
  @js.native
  sealed trait Template extends ViewType
  
  @js.native
  sealed trait XML extends ViewType
  
  /* 0 */ val HTML: typings.openui5.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType.HTML with Double = js.native
  /* 1 */ val JS: typings.openui5.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType.JS with Double = js.native
  /* 2 */ val JSON: typings.openui5.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType.JSON with Double = js.native
  /* 3 */ val Template: typings.openui5.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType.Template with Double = js.native
  /* 4 */ val XML: typings.openui5.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewType with Double] = js.native
}

