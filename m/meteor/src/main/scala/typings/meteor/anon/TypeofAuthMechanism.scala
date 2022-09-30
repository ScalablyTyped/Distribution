package typings.meteor.anon

import typings.meteor.meteorStrings.DEFAULT
import typings.meteor.meteorStrings.GSSAPI
import typings.meteor.meteorStrings.PLAIN
import typings.meteor.meteorStrings.`MONGODB-AWS`
import typings.meteor.meteorStrings.`MONGODB-CR`
import typings.meteor.meteorStrings.`MONGODB-X509`
import typings.meteor.meteorStrings.`SCRAM-SHA-1`
import typings.meteor.meteorStrings.`SCRAM-SHA-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAuthMechanism extends StObject {
  
  val MONGODB_AWS: `MONGODB-AWS`
  
  val MONGODB_CR: `MONGODB-CR`
  
  val MONGODB_DEFAULT: DEFAULT
  
  val MONGODB_GSSAPI: GSSAPI
  
  val MONGODB_PLAIN: PLAIN
  
  val MONGODB_SCRAM_SHA1: `SCRAM-SHA-1`
  
  val MONGODB_SCRAM_SHA256: `SCRAM-SHA-256`
  
  val MONGODB_X509: `MONGODB-X509`
}
object TypeofAuthMechanism {
  
  inline def apply(): TypeofAuthMechanism = {
    val __obj = js.Dynamic.literal(MONGODB_AWS = "MONGODB-AWS", MONGODB_CR = "MONGODB-CR", MONGODB_DEFAULT = "DEFAULT", MONGODB_GSSAPI = "GSSAPI", MONGODB_PLAIN = "PLAIN", MONGODB_SCRAM_SHA1 = "SCRAM-SHA-1", MONGODB_SCRAM_SHA256 = "SCRAM-SHA-256", MONGODB_X509 = "MONGODB-X509")
    __obj.asInstanceOf[TypeofAuthMechanism]
  }
  
  extension [Self <: TypeofAuthMechanism](x: Self) {
    
    inline def setMONGODB_AWS(value: `MONGODB-AWS`): Self = StObject.set(x, "MONGODB_AWS", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_CR(value: `MONGODB-CR`): Self = StObject.set(x, "MONGODB_CR", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_DEFAULT(value: DEFAULT): Self = StObject.set(x, "MONGODB_DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_GSSAPI(value: GSSAPI): Self = StObject.set(x, "MONGODB_GSSAPI", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_PLAIN(value: PLAIN): Self = StObject.set(x, "MONGODB_PLAIN", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_SCRAM_SHA1(value: `SCRAM-SHA-1`): Self = StObject.set(x, "MONGODB_SCRAM_SHA1", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_SCRAM_SHA256(value: `SCRAM-SHA-256`): Self = StObject.set(x, "MONGODB_SCRAM_SHA256", value.asInstanceOf[js.Any])
    
    inline def setMONGODB_X509(value: `MONGODB-X509`): Self = StObject.set(x, "MONGODB_X509", value.asInstanceOf[js.Any])
  }
}
