package typings.officeUiFabricReact.documentCardPreviewTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardPreviewStyleProps extends js.Object {
  
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Is it a list of files rather than a preview image?
    */
  var isFileList: js.UndefOr[Boolean] = js.native
  
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}
object IDocumentCardPreviewStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IDocumentCardPreviewStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewStyleProps]
  }
  
  @scala.inline
  implicit class IDocumentCardPreviewStylePropsOps[Self <: IDocumentCardPreviewStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIsFileList(value: Boolean): Self = this.set("isFileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFileList: Self = this.set("isFileList", js.undefined)
  }
}
