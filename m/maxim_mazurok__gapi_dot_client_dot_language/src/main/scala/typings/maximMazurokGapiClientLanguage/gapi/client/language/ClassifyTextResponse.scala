package typings.maximMazurokGapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifyTextResponse extends js.Object {
  
  /** Categories representing the input document. */
  var categories: js.UndefOr[js.Array[ClassificationCategory]] = js.native
}
object ClassifyTextResponse {
  
  @scala.inline
  def apply(): ClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyTextResponse]
  }
  
  @scala.inline
  implicit class ClassifyTextResponseOps[Self <: ClassifyTextResponse] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: ClassificationCategory*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[ClassificationCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
  }
}
