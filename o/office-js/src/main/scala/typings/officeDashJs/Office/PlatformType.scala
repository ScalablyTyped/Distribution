package typings.officeDashJs.Office

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
  
  /* 4 */ val Android: typings.officeDashJs.Office.PlatformType.Android with Double = js.native
  /* 2 */ val Mac: typings.officeDashJs.Office.PlatformType.Mac with Double = js.native
  /* 1 */ val OfficeOnline: typings.officeDashJs.Office.PlatformType.OfficeOnline with Double = js.native
  /* 0 */ val PC: typings.officeDashJs.Office.PlatformType.PC with Double = js.native
  /* 5 */ val Universal: typings.officeDashJs.Office.PlatformType.Universal with Double = js.native
  /* 3 */ val iOS: typings.officeDashJs.Office.PlatformType.iOS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlatformType with Double] = js.native
}

