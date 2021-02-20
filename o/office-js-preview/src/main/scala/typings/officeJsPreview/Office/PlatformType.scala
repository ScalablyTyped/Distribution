package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlatformType extends StObject
/**
  * Specifies the OS or other platform on which the Office host application is running.
  */
@JSGlobal("Office.PlatformType")
@js.native
object PlatformType extends StObject {
  
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
}
