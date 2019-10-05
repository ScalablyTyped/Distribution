package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Desktop: typings.openui5.sap.m.ScreenSize.Desktop with Double = js.native
  /* 1 */ val Large: typings.openui5.sap.m.ScreenSize.Large with Double = js.native
  /* 2 */ val Medium: typings.openui5.sap.m.ScreenSize.Medium with Double = js.native
  /* 3 */ val Phone: typings.openui5.sap.m.ScreenSize.Phone with Double = js.native
  /* 4 */ val Small: typings.openui5.sap.m.ScreenSize.Small with Double = js.native
  /* 5 */ val Tablet: typings.openui5.sap.m.ScreenSize.Tablet with Double = js.native
  /* 6 */ val XLarge: typings.openui5.sap.m.ScreenSize.XLarge with Double = js.native
  /* 7 */ val XSmall: typings.openui5.sap.m.ScreenSize.XSmall with Double = js.native
  /* 8 */ val XXLarge: typings.openui5.sap.m.ScreenSize.XXLarge with Double = js.native
  /* 9 */ val XXSmall: typings.openui5.sap.m.ScreenSize.XXSmall with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSize with Double] = js.native
}

