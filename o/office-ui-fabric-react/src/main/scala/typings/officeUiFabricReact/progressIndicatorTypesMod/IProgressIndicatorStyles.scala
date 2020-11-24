package typings.officeUiFabricReact.progressIndicatorTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressIndicatorStyles extends js.Object {
  
  var itemDescription: IStyle = js.native
  
  var itemName: IStyle = js.native
  
  var itemProgress: IStyle = js.native
  
  var progressBar: IStyle = js.native
  
  var progressTrack: IStyle = js.native
  
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
}
object IProgressIndicatorStyles {
  
  @scala.inline
  def apply(): IProgressIndicatorStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicatorStyles]
  }
  
  @scala.inline
  implicit class IProgressIndicatorStylesOps[Self <: IProgressIndicatorStyles] (val x: Self) extends AnyVal {
    
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
    def setItemDescription(value: IStyle): Self = this.set("itemDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemDescription: Self = this.set("itemDescription", js.undefined)
    
    @scala.inline
    def setItemDescriptionNull: Self = this.set("itemDescription", null)
    
    @scala.inline
    def setItemName(value: IStyle): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemName: Self = this.set("itemName", js.undefined)
    
    @scala.inline
    def setItemNameNull: Self = this.set("itemName", null)
    
    @scala.inline
    def setItemProgress(value: IStyle): Self = this.set("itemProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProgress: Self = this.set("itemProgress", js.undefined)
    
    @scala.inline
    def setItemProgressNull: Self = this.set("itemProgress", null)
    
    @scala.inline
    def setProgressBar(value: IStyle): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    
    @scala.inline
    def setProgressBarNull: Self = this.set("progressBar", null)
    
    @scala.inline
    def setProgressTrack(value: IStyle): Self = this.set("progressTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressTrack: Self = this.set("progressTrack", js.undefined)
    
    @scala.inline
    def setProgressTrackNull: Self = this.set("progressTrack", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
