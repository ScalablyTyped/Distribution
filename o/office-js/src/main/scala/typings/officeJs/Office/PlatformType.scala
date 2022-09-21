package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlatformType extends StObject
/**
  * Specifies the OS or other platform on which the Office host application is running.
  * 
  * @remarks
  * **Important**: In Outlook, this enum is available from Mailbox requirement set 1.5.
  */
@JSGlobal("Office.PlatformType")
@js.native
object PlatformType extends StObject {
  
  /**
    * The platform is an Android device.
    */
  @js.native
  sealed trait Android
    extends StObject
       with PlatformType
  
  /**
    * The platform is Mac.
    */
  @js.native
  sealed trait Mac
    extends StObject
       with PlatformType
  
  /**
    * The platform is Office on the web (in a browser).
    */
  @js.native
  sealed trait OfficeOnline
    extends StObject
       with PlatformType
  
  /**
    * The platform is PC (Windows).
    */
  @js.native
  sealed trait PC
    extends StObject
       with PlatformType
  
  /**
    * The platform is WinRT.
    */
  @js.native
  sealed trait Universal
    extends StObject
       with PlatformType
  
  /**
    * The platform is an iOS device.
    */
  @js.native
  sealed trait iOS
    extends StObject
       with PlatformType
}
