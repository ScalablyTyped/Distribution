package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSet extends js.Object {
  
  /** The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet. */
  var indexError: js.UndefOr[Status] = js.native
  
  /**
    * Output only. The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp
    * is the default value "1970-01-01T00:00:00Z". This field is ignored when creating a ProductSet.
    */
  var indexTime: js.UndefOr[String] = js.native
  
  /** The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet. */
  var name: js.UndefOr[String] = js.native
}
object ProductSet {
  
  @scala.inline
  def apply(): ProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSet]
  }
  
  @scala.inline
  implicit class ProductSetOps[Self <: ProductSet] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setIndexError(value: Status): Self = this.set("indexError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexError: Self = this.set("indexError", js.undefined)
    
    @scala.inline
    def setIndexTime(value: String): Self = this.set("indexTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexTime: Self = this.set("indexTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
