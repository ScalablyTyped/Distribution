package typings.officeDashJsDashPreview.OfficeNs

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
  sealed trait Android extends PlatformType
  
  /**
    * The platform is Mac.
    */
  @js.native
  sealed trait Mac extends PlatformType
  
  /**
    * The platform is Office on the web (in a browser).
    */
  @js.native
  sealed trait OfficeOnline extends PlatformType
  
  /**
    * The platform is PC (Windows).
    */
  @js.native
  sealed trait PC extends PlatformType
  
  /**
    * The platform is WinRT.
    */
  @js.native
  sealed trait Universal extends PlatformType
  
  /**
    * The platform an iOS device.
    */
  @js.native
  sealed trait iOS extends PlatformType
  
  /* 4 */ val Android: typings.officeDashJsDashPreview.OfficeNs.PlatformType.Android with Double = js.native
  /* 2 */ val Mac: typings.officeDashJsDashPreview.OfficeNs.PlatformType.Mac with Double = js.native
  /* 1 */ val OfficeOnline: typings.officeDashJsDashPreview.OfficeNs.PlatformType.OfficeOnline with Double = js.native
  /* 0 */ val PC: typings.officeDashJsDashPreview.OfficeNs.PlatformType.PC with Double = js.native
  /* 5 */ val Universal: typings.officeDashJsDashPreview.OfficeNs.PlatformType.Universal with Double = js.native
  /* 3 */ val iOS: typings.officeDashJsDashPreview.OfficeNs.PlatformType.iOS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlatformType with Double] = js.native
}

