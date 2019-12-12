package typings.officeDashJs.Office

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Office.PlatformType.Android
import typings.officeDashJs.Office.PlatformType.Mac
import typings.officeDashJs.Office.PlatformType.OfficeOnline
import typings.officeDashJs.Office.PlatformType.PC
import typings.officeDashJs.Office.PlatformType.Universal
import typings.officeDashJs.Office.PlatformType.iOS
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlatformType with Double] = js.native
  /* 4 */ @js.native
  object Android extends TopLevel[Android with Double]
  
  /* 2 */ @js.native
  object Mac extends TopLevel[Mac with Double]
  
  /* 1 */ @js.native
  object OfficeOnline extends TopLevel[OfficeOnline with Double]
  
  /* 0 */ @js.native
  object PC extends TopLevel[PC with Double]
  
  /* 5 */ @js.native
  object Universal extends TopLevel[Universal with Double]
  
  /* 3 */ @js.native
  object iOS extends TopLevel[iOS with Double]
  
}

