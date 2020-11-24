package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScreenSize extends js.Object
/**
  * Breakpoint names for different screen sizes.
  */
@JSGlobal("sap.m.ScreenSize")
@js.native
object ScreenSize extends js.Object {
  
  @js.native
  sealed trait Desktop extends ScreenSize
  
  @js.native
  sealed trait Large extends ScreenSize
  
  @js.native
  sealed trait Medium extends ScreenSize
  
  @js.native
  sealed trait Phone extends ScreenSize
  
  @js.native
  sealed trait Small extends ScreenSize
  
  @js.native
  sealed trait Tablet extends ScreenSize
  
  @js.native
  sealed trait XLarge extends ScreenSize
  
  @js.native
  sealed trait XSmall extends ScreenSize
  
  @js.native
  sealed trait XXLarge extends ScreenSize
  
  @js.native
  sealed trait XXSmall extends ScreenSize
}
