package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoDistinctPreferences extends StObject {
  
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
}
object MongoDistinctPreferences {
  
  @scala.inline
  def apply(): MongoDistinctPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoDistinctPreferences]
  }
  
  @scala.inline
  implicit class MongoDistinctPreferencesMutableBuilder[Self <: MongoDistinctPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
