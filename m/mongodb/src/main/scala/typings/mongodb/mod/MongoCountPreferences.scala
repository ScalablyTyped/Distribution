package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoCountPreferences extends StObject {
  
  /**
    * An index name hint for the query.
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * The limit of documents to count.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Number of miliseconds to wait before aborting the query.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The preferred read preference
    */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  /**
    * Optional session to use for this operation
    */
  var session: js.UndefOr[ClientSession] = js.undefined
  
  /**
    * The number of documents to skip for the count.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
}
object MongoCountPreferences {
  
  inline def apply(): MongoCountPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoCountPreferences]
  }
  
  extension [Self <: MongoCountPreferences](x: Self) {
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
