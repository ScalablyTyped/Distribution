package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFilter extends js.Object {
  
  /** The android:name value of the tag. */
  var actionNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The android:name value of the tag. */
  var categoryNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The android:mimeType value of the tag. */
  var mimeType: js.UndefOr[String] = js.native
}
object IntentFilter {
  
  @scala.inline
  def apply(): IntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentFilter]
  }
  
  @scala.inline
  implicit class IntentFilterOps[Self <: IntentFilter] (val x: Self) extends AnyVal {
    
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
    def setActionNamesVarargs(value: String*): Self = this.set("actionNames", js.Array(value :_*))
    
    @scala.inline
    def setActionNames(value: js.Array[String]): Self = this.set("actionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionNames: Self = this.set("actionNames", js.undefined)
    
    @scala.inline
    def setCategoryNamesVarargs(value: String*): Self = this.set("categoryNames", js.Array(value :_*))
    
    @scala.inline
    def setCategoryNames(value: js.Array[String]): Self = this.set("categoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryNames: Self = this.set("categoryNames", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
