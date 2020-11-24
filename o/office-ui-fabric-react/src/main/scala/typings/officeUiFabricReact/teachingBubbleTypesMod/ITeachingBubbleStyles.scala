package typings.officeUiFabricReact.teachingBubbleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITeachingBubbleStyles extends js.Object {
  
  var body: IStyle = js.native
  
  var bodyContent: IStyle = js.native
  
  var closeButton: IStyle = js.native
  
  var content: IStyle = js.native
  
  var footer: IStyle = js.native
  
  var header: IStyle = js.native
  
  var headline: IStyle = js.native
  
  var imageContent: IStyle = js.native
  
  var primaryButton: IStyle = js.native
  
  var root: IStyle = js.native
  
  var secondaryButton: IStyle = js.native
  
  var subComponentStyles: js.UndefOr[ITeachingBubbleSubComponentStyles] = js.native
  
  var subText: IStyle = js.native
}
object ITeachingBubbleStyles {
  
  @scala.inline
  def apply(): ITeachingBubbleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleStyles]
  }
  
  @scala.inline
  implicit class ITeachingBubbleStylesOps[Self <: ITeachingBubbleStyles] (val x: Self) extends AnyVal {
    
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
    def setBody(value: IStyle): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setBodyContent(value: IStyle): Self = this.set("bodyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyContent: Self = this.set("bodyContent", js.undefined)
    
    @scala.inline
    def setBodyContentNull: Self = this.set("bodyContent", null)
    
    @scala.inline
    def setCloseButton(value: IStyle): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setCloseButtonNull: Self = this.set("closeButton", null)
    
    @scala.inline
    def setContent(value: IStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setFooter(value: IStyle): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterNull: Self = this.set("footer", null)
    
    @scala.inline
    def setHeader(value: IStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    
    @scala.inline
    def setHeadline(value: IStyle): Self = this.set("headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    
    @scala.inline
    def setHeadlineNull: Self = this.set("headline", null)
    
    @scala.inline
    def setImageContent(value: IStyle): Self = this.set("imageContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageContent: Self = this.set("imageContent", js.undefined)
    
    @scala.inline
    def setImageContentNull: Self = this.set("imageContent", null)
    
    @scala.inline
    def setPrimaryButton(value: IStyle): Self = this.set("primaryButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryButton: Self = this.set("primaryButton", js.undefined)
    
    @scala.inline
    def setPrimaryButtonNull: Self = this.set("primaryButton", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSecondaryButton(value: IStyle): Self = this.set("secondaryButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryButton: Self = this.set("secondaryButton", js.undefined)
    
    @scala.inline
    def setSecondaryButtonNull: Self = this.set("secondaryButton", null)
    
    @scala.inline
    def setSubComponentStyles(value: ITeachingBubbleSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubComponentStyles: Self = this.set("subComponentStyles", js.undefined)
    
    @scala.inline
    def setSubText(value: IStyle): Self = this.set("subText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubText: Self = this.set("subText", js.undefined)
    
    @scala.inline
    def setSubTextNull: Self = this.set("subText", null)
  }
}
