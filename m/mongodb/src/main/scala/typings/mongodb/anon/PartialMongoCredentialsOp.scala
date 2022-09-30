package typings.mongodb.anon

import typings.mongodb.mod.AuthMechanism
import typings.mongodb.mod.AuthMechanismProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mongodb.mongodb.MongoCredentialsOptions> */
trait PartialMongoCredentialsOp extends StObject {
  
  var db: js.UndefOr[String] = js.undefined
  
  var mechanism: js.UndefOr[AuthMechanism] = js.undefined
  
  var mechanismProperties: js.UndefOr[AuthMechanismProperties] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object PartialMongoCredentialsOp {
  
  inline def apply(): PartialMongoCredentialsOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMongoCredentialsOp]
  }
  
  extension [Self <: PartialMongoCredentialsOp](x: Self) {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    inline def setMechanism(value: AuthMechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
    
    inline def setMechanismProperties(value: AuthMechanismProperties): Self = StObject.set(x, "mechanismProperties", value.asInstanceOf[js.Any])
    
    inline def setMechanismPropertiesUndefined: Self = StObject.set(x, "mechanismProperties", js.undefined)
    
    inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
