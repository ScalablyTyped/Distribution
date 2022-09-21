package typings.mfiles.global.MFiles

import typings.mfiles.ILicenseStatus
import typings.mfiles.IServerLicenseManagementOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ServerLicenseManagementOperations")
@js.native
open class ServerLicenseManagementOperations ()
  extends StObject
     with IServerLicenseManagementOperations {
  
  /* CompleteClass */
  override def GetLicenseStatus(): ILicenseStatus = js.native
  
  /* CompleteClass */
  override def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit = js.native
}
