package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighAvailabilityOptions extends js.Object {
  
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
  implicit class HighAvailabilityOptionsOps[Self <: HighAvailabilityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainsEnabled(value: Boolean): Self = this.set("domainsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainsEnabled: Self = this.set("domainsEnabled", js.undefined)
    
    @scala.inline
    def setHa(value: Boolean): Self = this.set("ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHa: Self = this.set("ha", js.undefined)
    
    @scala.inline
    def setHaInterval(value: scala.Double): Self = this.set("haInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaInterval: Self = this.set("haInterval", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setReadPreferenceTagsVarargs(value: String*): Self = this.set("readPreferenceTags", js.Array(value :_*))
    
    @scala.inline
    def setReadPreferenceTags(value: js.Array[String]): Self = this.set("readPreferenceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreferenceTags: Self = this.set("readPreferenceTags", js.undefined)
  }
}
