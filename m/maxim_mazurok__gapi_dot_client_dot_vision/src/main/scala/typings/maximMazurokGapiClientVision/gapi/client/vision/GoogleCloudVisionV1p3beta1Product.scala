package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1Product extends js.Object {
  
  /** User-provided metadata to be stored with this product. Must be at most 4096 characters long. */
  var description: js.UndefOr[String] = js.native
  
  /** The user-provided name for this Product. Must not be empty. Must be at most 4096 characters long. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The resource name of the product. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. This field is ignored when creating a product. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Immutable. The category for the product identified by the reference image. This should be one of "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1" or "general-v1". The
    * legacy categories "homegoods", "apparel", and "toys" are still supported, but these should not be used for new products.
    */
  var productCategory: js.UndefOr[String] = js.native
  
  /**
    * Key-value pairs that can be attached to a product. At query time, constraints can be specified based on the product_labels. Note that integer values can be provided as strings, e.g.
    * "1199". Only strings with integer values can match a range-based restriction which is to be supported soon. Multiple values can be assigned to the same key. One product may have up
    * to 500 product_labels. Notice that the total number of distinct product_labels over all products in one ProductSet cannot exceed 1M, otherwise the product search pipeline will
    * refuse to work for that ProductSet.
    */
  var productLabels: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1ProductKeyValue]] = js.native
}
object GoogleCloudVisionV1p3beta1Product {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1Product]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1ProductOps[Self <: GoogleCloudVisionV1p3beta1Product] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProductCategory(value: String): Self = this.set("productCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCategory: Self = this.set("productCategory", js.undefined)
    
    @scala.inline
    def setProductLabelsVarargs(value: GoogleCloudVisionV1p3beta1ProductKeyValue*): Self = this.set("productLabels", js.Array(value :_*))
    
    @scala.inline
    def setProductLabels(value: js.Array[GoogleCloudVisionV1p3beta1ProductKeyValue]): Self = this.set("productLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductLabels: Self = this.set("productLabels", js.undefined)
  }
}
