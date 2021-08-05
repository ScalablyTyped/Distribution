package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mongodbStrings.majority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.CommonOptions & {  bypassDocumentValidation :boolean | undefined} */
trait CommonOptionsbypassDocume extends StObject {
  
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.undefined
  
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}
object CommonOptionsbypassDocume {
  
  inline def apply(): CommonOptionsbypassDocume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptionsbypassDocume]
  }
  
  extension [Self <: CommonOptionsbypassDocume](x: Self) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setW(value: Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
