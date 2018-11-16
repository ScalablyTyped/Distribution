package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollBarAction extends js.Object

/**
       * Actions are: Click on track, button, drag of thumb, or mouse wheel click
      */
@JSGlobal("sap.ui.core.ScrollBarAction")
@js.native
object ScrollBarAction extends js.Object {
  @js.native
  sealed trait Drag
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  @js.native
  sealed trait MouseWheel
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  @js.native
  sealed trait Page
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  @js.native
  sealed trait Step
    extends openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction
  
  val Drag: Drag with java.lang.String = js.native
  val MouseWheel: MouseWheel with java.lang.String = js.native
  val Page: Page with java.lang.String = js.native
  val Step: Step with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.ScrollBarAction with java.lang.String] = js.native
}

