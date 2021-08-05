package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighAvailabilityOptions extends StObject {
  
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.undefined
}
object HighAvailabilityOptions {
  
  inline def apply(): HighAvailabilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighAvailabilityOptions]
  }
  
  extension [Self <: HighAvailabilityOptions](x: Self) {
    
    inline def setDomainsEnabled(value: Boolean): Self = StObject.set(x, "domainsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDomainsEnabledUndefined: Self = StObject.set(x, "domainsEnabled", js.undefined)
    
    inline def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    inline def setHaInterval(value: scala.Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
    
    inline def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
    
    inline def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceTags(value: js.Array[String]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
    
    inline def setReadPreferenceTagsVarargs(value: String*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
