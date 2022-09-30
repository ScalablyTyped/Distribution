package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoCredentialsOptions extends StObject {
  
  var db: js.UndefOr[String] = js.undefined
  
  var mechanism: js.UndefOr[AuthMechanism] = js.undefined
  
  var mechanismProperties: AuthMechanismProperties
  
  var password: String
  
  var source: String
  
  var username: String
}
object MongoCredentialsOptions {
  
  inline def apply(mechanismProperties: AuthMechanismProperties, password: String, source: String, username: String): MongoCredentialsOptions = {
    val __obj = js.Dynamic.literal(mechanismProperties = mechanismProperties.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoCredentialsOptions]
  }
  
  extension [Self <: MongoCredentialsOptions](x: Self) {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    inline def setMechanism(value: AuthMechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
    
    inline def setMechanismProperties(value: AuthMechanismProperties): Self = StObject.set(x, "mechanismProperties", value.asInstanceOf[js.Any])
    
    inline def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
