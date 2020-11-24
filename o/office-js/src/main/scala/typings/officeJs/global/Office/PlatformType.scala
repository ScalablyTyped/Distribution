package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the OS or other platform on which the Office host application is running.
  */
@JSGlobal("Office.PlatformType")
@js.native
object PlatformType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.PlatformType with Double] = js.native
  
  /* 4 */ val Android: typings.officeJs.Office.PlatformType.Android with Double = js.native
  
  /* 2 */ val Mac: typings.officeJs.Office.PlatformType.Mac with Double = js.native
  
  /* 1 */ val OfficeOnline: typings.officeJs.Office.PlatformType.OfficeOnline with Double = js.native
  
  /* 0 */ val PC: typings.officeJs.Office.PlatformType.PC with Double = js.native
  
  /* 5 */ val Universal: typings.officeJs.Office.PlatformType.Universal with Double = js.native
  
  /* 3 */ val iOS: typings.officeJs.Office.PlatformType.iOS with Double = js.native
}
