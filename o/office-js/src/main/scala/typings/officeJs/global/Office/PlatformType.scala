package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the OS or other platform on which the Office host application is running.
  * 
  * @remarks
  * **Important**: In Outlook, this enum is available from Mailbox requirement set 1.5.
  */
@JSGlobal("Office.PlatformType")
@js.native
object PlatformType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.PlatformType & Double] = js.native
  
  /* 4 */ val Android: typings.officeJs.Office.PlatformType.Android & Double = js.native
  
  /* 2 */ val Mac: typings.officeJs.Office.PlatformType.Mac & Double = js.native
  
  /* 1 */ val OfficeOnline: typings.officeJs.Office.PlatformType.OfficeOnline & Double = js.native
  
  /* 0 */ val PC: typings.officeJs.Office.PlatformType.PC & Double = js.native
  
  /* 5 */ val Universal: typings.officeJs.Office.PlatformType.Universal & Double = js.native
  
  /* 3 */ val iOS: typings.officeJs.Office.PlatformType.iOS & Double = js.native
}
