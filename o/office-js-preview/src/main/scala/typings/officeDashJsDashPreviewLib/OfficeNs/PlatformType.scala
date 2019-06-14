package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlatformType extends js.Object

/**
  * Specifies the OS or other platform on which the Office host application is running.
  */
@JSGlobal("Office.PlatformType")
@js.native
object PlatformType extends js.Object {
  /**
    * The platform is an Android device.
    */
  @js.native
  sealed trait Android
    extends officeDashJsDashPreviewLib.OfficeNs.PlatformType
  
  /**
    * The platform is Mac.
    */
  @js.native
  sealed trait Mac
    extends officeDashJsDashPreviewLib.OfficeNs.PlatformType
  
  /**
    * The platform is Office Online.
    */
  @js.native
  sealed trait OfficeOnline
    extends officeDashJsDashPreviewLib.OfficeNs.PlatformType
  
  /**
    * The platform is PC (Windows).
    */
  @js.native
  sealed trait PC
    extends officeDashJsDashPreviewLib.OfficeNs.PlatformType
  
  /**
    * The platform is WinRT.
    */
  @js.native
  sealed trait Universal
    extends officeDashJsDashPreviewLib.OfficeNs.PlatformType
  
  /**
    * The platform an iOS device.
    */
  @js.native
  sealed trait iOS
    extends officeDashJsDashPreviewLib.OfficeNs.PlatformType
  
  /* 4 */ val Android: Android with scala.Double = js.native
  /* 2 */ val Mac: Mac with scala.Double = js.native
  /* 1 */ val OfficeOnline: OfficeOnline with scala.Double = js.native
  /* 0 */ val PC: PC with scala.Double = js.native
  /* 5 */ val Universal: Universal with scala.Double = js.native
  /* 3 */ val iOS: iOS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.PlatformType with scala.Double] = js.native
}

