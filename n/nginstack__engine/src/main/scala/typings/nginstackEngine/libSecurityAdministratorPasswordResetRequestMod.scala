package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityAdministratorPasswordResetRequestMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/AdministratorPasswordResetRequest", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AdministratorPasswordResetRequest {
    
    /* CompleteClass */
    override def authorize(privateKey: RSACryptoPKey): String = js.native
    
    /* CompleteClass */
    var dbName: String = js.native
    
    /* CompleteClass */
    var key: Double = js.native
    
    /* CompleteClass */
    var licenseeId: String = js.native
    
    /* CompleteClass */
    var licenseeName: String = js.native
    
    /* CompleteClass */
    var licenserKey: Double = js.native
    
    /* CompleteClass */
    var requesterKey: Double = js.native
    
    /* CompleteClass */
    var requesterName: String = js.native
    
    /* CompleteClass */
    var userKey: Double = js.native
    
    /* CompleteClass */
    var userName: String = js.native
    
    /* CompleteClass */
    var utcCreatedAt: js.Date = js.native
    
    /* CompleteClass */
    var utcExpiresAt: js.Date = js.native
    
    /* CompleteClass */
    var utcFinishedAt: js.Date = js.native
    
    /* CompleteClass */
    override def verifyAuthorization(authorizationCode: String): Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/security/AdministratorPasswordResetRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(data: String): AdministratorPasswordResetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(data.asInstanceOf[js.Any]).asInstanceOf[AdministratorPasswordResetRequest]
  
  trait AdministratorPasswordResetRequest extends StObject {
    
    def authorize(privateKey: RSACryptoPKey): String
    
    var dbName: String
    
    var key: Double
    
    var licenseeId: String
    
    var licenseeName: String
    
    var licenserKey: Double
    
    var requesterKey: Double
    
    var requesterName: String
    
    var userKey: Double
    
    var userName: String
    
    var utcCreatedAt: js.Date
    
    var utcExpiresAt: js.Date
    
    var utcFinishedAt: js.Date
    
    def verifyAuthorization(authorizationCode: String): Boolean
  }
  object AdministratorPasswordResetRequest {
    
    inline def apply(
      authorize: RSACryptoPKey => String,
      dbName: String,
      key: Double,
      licenseeId: String,
      licenseeName: String,
      licenserKey: Double,
      requesterKey: Double,
      requesterName: String,
      userKey: Double,
      userName: String,
      utcCreatedAt: js.Date,
      utcExpiresAt: js.Date,
      utcFinishedAt: js.Date,
      verifyAuthorization: String => Boolean
    ): AdministratorPasswordResetRequest = {
      val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction1(authorize), dbName = dbName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], licenseeId = licenseeId.asInstanceOf[js.Any], licenseeName = licenseeName.asInstanceOf[js.Any], licenserKey = licenserKey.asInstanceOf[js.Any], requesterKey = requesterKey.asInstanceOf[js.Any], requesterName = requesterName.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], utcCreatedAt = utcCreatedAt.asInstanceOf[js.Any], utcExpiresAt = utcExpiresAt.asInstanceOf[js.Any], utcFinishedAt = utcFinishedAt.asInstanceOf[js.Any], verifyAuthorization = js.Any.fromFunction1(verifyAuthorization))
      __obj.asInstanceOf[AdministratorPasswordResetRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdministratorPasswordResetRequest] (val x: Self) extends AnyVal {
      
      inline def setAuthorize(value: RSACryptoPKey => String): Self = StObject.set(x, "authorize", js.Any.fromFunction1(value))
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLicenseeId(value: String): Self = StObject.set(x, "licenseeId", value.asInstanceOf[js.Any])
      
      inline def setLicenseeName(value: String): Self = StObject.set(x, "licenseeName", value.asInstanceOf[js.Any])
      
      inline def setLicenserKey(value: Double): Self = StObject.set(x, "licenserKey", value.asInstanceOf[js.Any])
      
      inline def setRequesterKey(value: Double): Self = StObject.set(x, "requesterKey", value.asInstanceOf[js.Any])
      
      inline def setRequesterName(value: String): Self = StObject.set(x, "requesterName", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: Double): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUtcCreatedAt(value: js.Date): Self = StObject.set(x, "utcCreatedAt", value.asInstanceOf[js.Any])
      
      inline def setUtcExpiresAt(value: js.Date): Self = StObject.set(x, "utcExpiresAt", value.asInstanceOf[js.Any])
      
      inline def setUtcFinishedAt(value: js.Date): Self = StObject.set(x, "utcFinishedAt", value.asInstanceOf[js.Any])
      
      inline def setVerifyAuthorization(value: String => Boolean): Self = StObject.set(x, "verifyAuthorization", js.Any.fromFunction1(value))
    }
  }
  
  type RSACryptoPKey = typings.nginstackEngine.libCryptoRsacryptopkeyMod.^
}
