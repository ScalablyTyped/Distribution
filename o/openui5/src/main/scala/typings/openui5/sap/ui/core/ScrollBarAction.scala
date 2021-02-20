package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollBarAction extends StObject
/**
  * Actions are: Click on track, button, drag of thumb, or mouse wheel click
  */
@JSGlobal("sap.ui.core.ScrollBarAction")
@js.native
object ScrollBarAction extends StObject {
  
  @js.native
  sealed trait Drag extends ScrollBarAction
  
  @js.native
  sealed trait MouseWheel extends ScrollBarAction
  
  @js.native
  sealed trait Page extends ScrollBarAction
  
  @js.native
  sealed trait Step extends ScrollBarAction
}
