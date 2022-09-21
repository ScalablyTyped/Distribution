package typings.nginstackEngine

import typings.nginstackEngine.anon.Expiration
import typings.nginstackEngine.anon.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/license/LicenseManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LicenseManager
  @JSImport("@nginstack/engine/lib/license/LicenseManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): LicenseManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[LicenseManager]
  
  @js.native
  trait LicenseManager extends StObject {
    
    def addLicense(license: String, administratorPassword: String): Unit = js.native
    
    def createLicense(licenseInfo: Expiration, userId: String, password: String): String = js.native
    
    def decryptLicensedData(data: String, product: Double): String = js.native
    def decryptLicensedData(data: String, product: Double, opt_extension: Double): String = js.native
    
    def encryptLicensedData(data: String, requirements: Extension, productPrivateKey: String): String = js.native
    
    def getIssuableLicenses(userKey: Double): js.Array[Any] = js.native
    
    def getUsedProductsByUser(userKey: Double): js.Array[Any] = js.native
    
    def isLicensed(product: Double): Boolean = js.native
    def isLicensed(product: Double, opt_extension: Double): Boolean = js.native
    
    def setIssuableLicenses(userKey: Double, productKeys: js.Array[Any], passwords: js.Array[Any]): Unit = js.native
  }
}
