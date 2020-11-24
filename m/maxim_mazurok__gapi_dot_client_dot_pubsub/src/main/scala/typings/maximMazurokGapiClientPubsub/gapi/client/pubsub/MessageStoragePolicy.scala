package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStoragePolicy extends js.Object {
  
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
  implicit class MessageStoragePolicyOps[Self <: MessageStoragePolicy] (val x: Self) extends AnyVal {
    
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
    def setAllowedPersistenceRegionsVarargs(value: String*): Self = this.set("allowedPersistenceRegions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPersistenceRegions(value: js.Array[String]): Self = this.set("allowedPersistenceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPersistenceRegions: Self = this.set("allowedPersistenceRegions", js.undefined)
  }
}
