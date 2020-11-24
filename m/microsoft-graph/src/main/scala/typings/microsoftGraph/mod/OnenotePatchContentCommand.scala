package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenotePatchContentCommand extends js.Object {
  
  // The action to perform on the target element. The possible values are: replace, append, delete, insert, or prepend.
  var action: js.UndefOr[OnenotePatchActionType] = js.native
  
  /**
    * A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary
    * data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
    */
  var content: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The location to add the supplied content, relative to the target element. The possible values are: after (default) or
    * before.
    */
  var position: js.UndefOr[NullableOption[OnenotePatchInsertPosition]] = js.native
  
  /**
    * The element to update. Must be the #&amp;lt;data-id&amp;gt; or the generated &amp;lt;id&amp;gt; of the element, or the
    * body or title keyword.
    */
  var target: js.UndefOr[String] = js.native
}
object OnenotePatchContentCommand {
  
  @scala.inline
  def apply(): OnenotePatchContentCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePatchContentCommand]
  }
  
  @scala.inline
  implicit class OnenotePatchContentCommandOps[Self <: OnenotePatchContentCommand] (val x: Self) extends AnyVal {
    
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
    def setAction(value: OnenotePatchActionType): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setContent(value: NullableOption[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setPosition(value: NullableOption[OnenotePatchInsertPosition]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
