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
  
  val HTML: HTML with java.lang.String = js.native
  val JS: JS with java.lang.String = js.native
  val JSON: JSON with java.lang.String = js.native
  val Template: Template with java.lang.String = js.native
  val XML: XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs.mvcNs.ViewType with java.lang.String] = js.native
}

