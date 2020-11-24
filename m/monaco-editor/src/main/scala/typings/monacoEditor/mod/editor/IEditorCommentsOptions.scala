package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorCommentsOptions extends js.Object {
  
  /**
    * Ignore empty lines when inserting line comments.
    * Defaults to true.
    */
  var ignoreEmptyLines: js.UndefOr[Boolean] = js.native
  
  /**
    * Insert a space after the line comment token and inside the block comments tokens.
    * Defaults to true.
    */
  var insertSpace: js.UndefOr[Boolean] = js.native
}
object IEditorCommentsOptions {
  
  @scala.inline
  def apply(): IEditorCommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorCommentsOptions]
  }
  
  @scala.inline
  implicit class IEditorCommentsOptionsOps[Self <: IEditorCommentsOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreEmptyLines(value: Boolean): Self = this.set("ignoreEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmptyLines: Self = this.set("ignoreEmptyLines", js.undefined)
    
    @scala.inline
    def setInsertSpace(value: Boolean): Self = this.set("insertSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpace: Self = this.set("insertSpace", js.undefined)
  }
}
