package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Desktop
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait Large
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait Medium
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait Phone
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait Small
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait Tablet
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait XLarge
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait XSmall
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait XXLarge
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  @js.native
  sealed trait XXSmall
    extends openui5Lib.sapNs.mNs.ScreenSize
  
  /* 0 */ val Desktop: Desktop with scala.Double = js.native
  /* 1 */ val Large: Large with scala.Double = js.native
  /* 2 */ val Medium: Medium with scala.Double = js.native
  /* 3 */ val Phone: Phone with scala.Double = js.native
  /* 4 */ val Small: Small with scala.Double = js.native
  /* 5 */ val Tablet: Tablet with scala.Double = js.native
  /* 6 */ val XLarge: XLarge with scala.Double = js.native
  /* 7 */ val XSmall: XSmall with scala.Double = js.native
  /* 8 */ val XXLarge: XXLarge with scala.Double = js.native
  /* 9 */ val XXSmall: XXSmall with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ScreenSize with scala.Double] = js.native
}

