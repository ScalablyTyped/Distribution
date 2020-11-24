package typings.maximMazurokGapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Objects extends js.Object {
  
  /** The list of items. */
  // tslint:disable-next-line:ban-types
  var items: js.UndefOr[js.Array[Object]] = js.native
  
  /** The kind of item this is. For lists of objects, this is always storage#objects. */
  var kind: js.UndefOr[String] = js.native
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of prefixes of objects matching-but-not-listed up to and including the requested delimiter. */
  var prefixes: js.UndefOr[js.Array[String]] = js.native
}
object Objects {
  
  @scala.inline
  def apply(): Objects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Objects]
  }
  
  @scala.inline
  implicit class ObjectsOps[Self <: Objects] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Object*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPrefixesVarargs(value: String*): Self = this.set("prefixes", js.Array(value :_*))
    
    @scala.inline
    def setPrefixes(value: js.Array[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixes: Self = this.set("prefixes", js.undefined)
  }
}
