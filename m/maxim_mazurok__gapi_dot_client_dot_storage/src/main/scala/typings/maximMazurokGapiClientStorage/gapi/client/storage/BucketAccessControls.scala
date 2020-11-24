package typings.maximMazurokGapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketAccessControls extends js.Object {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[BucketAccessControl]] = js.native
  
  /** The kind of item this is. For lists of bucket access control entries, this is always storage#bucketAccessControls. */
  var kind: js.UndefOr[String] = js.native
}
object BucketAccessControls {
  
  @scala.inline
  def apply(): BucketAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketAccessControls]
  }
  
  @scala.inline
  implicit class BucketAccessControlsOps[Self <: BucketAccessControls] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: BucketAccessControl*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[BucketAccessControl]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
