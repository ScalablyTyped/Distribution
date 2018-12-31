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
  
  val Desktop: Desktop with java.lang.String = js.native
  val Large: Large with java.lang.String = js.native
  val Medium: Medium with java.lang.String = js.native
  val Phone: Phone with java.lang.String = js.native
  val Small: Small with java.lang.String = js.native
  val Tablet: Tablet with java.lang.String = js.native
  val XLarge: XLarge with java.lang.String = js.native
  val XSmall: XSmall with java.lang.String = js.native
  val XXLarge: XXLarge with java.lang.String = js.native
  val XXSmall: XXSmall with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ScreenSize with java.lang.String] = js.native
}

