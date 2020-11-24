package typings.officeUiFabricReact.ratingTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRatingStyles extends js.Object {
  
  var labelText: IStyle = js.native
  
  var ratingButton: IStyle = js.native
  
  var ratingFocusZone: IStyle = js.native
  
  var ratingStar: IStyle = js.native
  
  var ratingStarBack: IStyle = js.native
  
  var ratingStarFront: IStyle = js.native
  
  var ratingStarIsLarge: IStyle = js.native
  
  var ratingStarIsSmall: IStyle = js.native
  
  var root: IStyle = js.native
  
  var rootIsLarge: IStyle = js.native
  
  var rootIsSmall: IStyle = js.native
}
object IRatingStyles {
  
  @scala.inline
  def apply(): IRatingStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingStyles]
  }
  
  @scala.inline
  implicit class IRatingStylesOps[Self <: IRatingStyles] (val x: Self) extends AnyVal {
    
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
    def setLabelText(value: IStyle): Self = this.set("labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelText: Self = this.set("labelText", js.undefined)
    
    @scala.inline
    def setLabelTextNull: Self = this.set("labelText", null)
    
    @scala.inline
    def setRatingButton(value: IStyle): Self = this.set("ratingButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingButton: Self = this.set("ratingButton", js.undefined)
    
    @scala.inline
    def setRatingButtonNull: Self = this.set("ratingButton", null)
    
    @scala.inline
    def setRatingFocusZone(value: IStyle): Self = this.set("ratingFocusZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingFocusZone: Self = this.set("ratingFocusZone", js.undefined)
    
    @scala.inline
    def setRatingFocusZoneNull: Self = this.set("ratingFocusZone", null)
    
    @scala.inline
    def setRatingStar(value: IStyle): Self = this.set("ratingStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingStar: Self = this.set("ratingStar", js.undefined)
    
    @scala.inline
    def setRatingStarNull: Self = this.set("ratingStar", null)
    
    @scala.inline
    def setRatingStarBack(value: IStyle): Self = this.set("ratingStarBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingStarBack: Self = this.set("ratingStarBack", js.undefined)
    
    @scala.inline
    def setRatingStarBackNull: Self = this.set("ratingStarBack", null)
    
    @scala.inline
    def setRatingStarFront(value: IStyle): Self = this.set("ratingStarFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingStarFront: Self = this.set("ratingStarFront", js.undefined)
    
    @scala.inline
    def setRatingStarFrontNull: Self = this.set("ratingStarFront", null)
    
    @scala.inline
    def setRatingStarIsLarge(value: IStyle): Self = this.set("ratingStarIsLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingStarIsLarge: Self = this.set("ratingStarIsLarge", js.undefined)
    
    @scala.inline
    def setRatingStarIsLargeNull: Self = this.set("ratingStarIsLarge", null)
    
    @scala.inline
    def setRatingStarIsSmall(value: IStyle): Self = this.set("ratingStarIsSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingStarIsSmall: Self = this.set("ratingStarIsSmall", js.undefined)
    
    @scala.inline
    def setRatingStarIsSmallNull: Self = this.set("ratingStarIsSmall", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setRootIsLarge(value: IStyle): Self = this.set("rootIsLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootIsLarge: Self = this.set("rootIsLarge", js.undefined)
    
    @scala.inline
    def setRootIsLargeNull: Self = this.set("rootIsLarge", null)
    
    @scala.inline
    def setRootIsSmall(value: IStyle): Self = this.set("rootIsSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootIsSmall: Self = this.set("rootIsSmall", js.undefined)
    
    @scala.inline
    def setRootIsSmallNull: Self = this.set("rootIsSmall", null)
  }
}
