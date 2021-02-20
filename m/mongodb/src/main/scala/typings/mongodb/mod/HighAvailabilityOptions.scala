package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighAvailabilityOptions extends StObject {
  
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[scala.Double] = js.native
  
  /** The ReadPreference mode as listed here: http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  /** An object representing read preference tags, see: http://mongodb.github.io/node-mongodb-native/3.1/api/ReadPreference.html */
  var readPreferenceTags: js.UndefOr[js.Array[String]] = js.native
}
object HighAvailabilityOptions {
  
  @scala.inline
  def apply(): HighAvailabilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighAvailabilityOptions]
  }
  
  @scala.inline
  implicit class HighAvailabilityOptionsMutableBuilder[Self <: HighAvailabilityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainsEnabled(value: Boolean): Self = StObject.set(x, "domainsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsEnabledUndefined: Self = StObject.set(x, "domainsEnabled", js.undefined)
    
    @scala.inline
    def setHa(value: Boolean): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaInterval(value: scala.Double): Self = StObject.set(x, "haInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaIntervalUndefined: Self = StObject.set(x, "haInterval", js.undefined)
    
    @scala.inline
    def setHaUndefined: Self = StObject.set(x, "ha", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceTags(value: js.Array[String]): Self = StObject.set(x, "readPreferenceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceTagsUndefined: Self = StObject.set(x, "readPreferenceTags", js.undefined)
    
    @scala.inline
    def setReadPreferenceTagsVarargs(value: String*): Self = StObject.set(x, "readPreferenceTags", js.Array(value :_*))
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
