package typings.mediumEditor.MediumEditor

import org.scalablytyped.runtime.StringDictionary
import typings.mediumEditor.anon.Prop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonOptions extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var aria: js.UndefOr[String] = js.native
  
  var attrs: js.UndefOr[StringDictionary[String]] = js.native
  
  var classList: js.UndefOr[js.Array[String]] = js.native
  
  var contentDefault: js.UndefOr[String] = js.native
  
  var contentFA: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[Prop] = js.native
  
  var tagNames: js.UndefOr[js.Array[String]] = js.native
  
  var useQueryState: js.UndefOr[Boolean] = js.native
}
object ButtonOptions {
  
  @scala.inline
  def apply(): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOptions]
  }
  
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAria(value: String): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setAttrs(value: StringDictionary[String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setClassListVarargs(value: String*): Self = this.set("classList", js.Array(value :_*))
    
    @scala.inline
    def setClassList(value: js.Array[String]): Self = this.set("classList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassList: Self = this.set("classList", js.undefined)
    
    @scala.inline
    def setContentDefault(value: String): Self = this.set("contentDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDefault: Self = this.set("contentDefault", js.undefined)
    
    @scala.inline
    def setContentFA(value: String): Self = this.set("contentFA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFA: Self = this.set("contentFA", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStyle(value: Prop): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTagNamesVarargs(value: String*): Self = this.set("tagNames", js.Array(value :_*))
    
    @scala.inline
    def setTagNames(value: js.Array[String]): Self = this.set("tagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagNames: Self = this.set("tagNames", js.undefined)
    
    @scala.inline
    def setUseQueryState(value: Boolean): Self = this.set("useQueryState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseQueryState: Self = this.set("useQueryState", js.undefined)
  }
}
