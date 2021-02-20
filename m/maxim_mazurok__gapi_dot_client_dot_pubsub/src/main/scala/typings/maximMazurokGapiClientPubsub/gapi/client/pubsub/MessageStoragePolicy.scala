package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStoragePolicy extends StObject {
  
  /**
    * A list of IDs of GCP regions where messages that are published to the topic may be persisted in storage. Messages published by publishers running in non-allowed GCP regions (or
    * running outside of GCP altogether) will be routed for storage in one of the allowed regions. An empty list means that no regions are allowed, and is not a valid configuration.
    */
  var allowedPersistenceRegions: js.UndefOr[js.Array[String]] = js.native
}
object MessageStoragePolicy {
  
  @scala.inline
  def apply(): MessageStoragePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageStoragePolicy]
  }
  
  @scala.inline
  implicit class MessageStoragePolicyMutableBuilder[Self <: MessageStoragePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPersistenceRegions(value: js.Array[String]): Self = StObject.set(x, "allowedPersistenceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPersistenceRegionsUndefined: Self = StObject.set(x, "allowedPersistenceRegions", js.undefined)
    
    @scala.inline
    def setAllowedPersistenceRegionsVarargs(value: String*): Self = StObject.set(x, "allowedPersistenceRegions", js.Array(value :_*))
  }
}
