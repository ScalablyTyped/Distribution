package typings.maximMazurokGapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassificationCategory extends js.Object {
  
  /** The classifier's confidence of the category. Number represents how certain the classifier is that this category represents the given text. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** The name of the category representing the document, from the [predefined taxonomy](https://cloud.google.com/natural-language/docs/categories). */
  var name: js.UndefOr[String] = js.native
}
object ClassificationCategory {
  
  @scala.inline
  def apply(): ClassificationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationCategory]
  }
  
  @scala.inline
  implicit class ClassificationCategoryOps[Self <: ClassificationCategory] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
