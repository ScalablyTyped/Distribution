package typings.officeUiFabricReact.documentCardTitleTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardTitleStyleProps extends js.Object {
  
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Is this a secondary title?
    */
  var showAsSecondaryTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}
object IDocumentCardTitleStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IDocumentCardTitleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleStyleProps]
  }
  
  @scala.inline
  implicit class IDocumentCardTitleStylePropsOps[Self <: IDocumentCardTitleStyleProps] (val x: Self) extends AnyVal {
    
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
    def setShowAsSecondaryTitle(value: Boolean): Self = this.set("showAsSecondaryTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAsSecondaryTitle: Self = this.set("showAsSecondaryTitle", js.undefined)
  }
}
