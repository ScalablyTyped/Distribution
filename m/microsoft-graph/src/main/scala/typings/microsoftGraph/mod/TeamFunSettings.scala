package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamFunSettings extends js.Object {
  
  // If set to true, enables users to include custom memes.
  var allowCustomMemes: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, enables Giphy use.
  var allowGiphy: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // If set to true, enables users to include stickers and memes.
  var allowStickersAndMemes: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Giphy content rating. Possible values are: moderate, strict.
  var giphyContentRating: js.UndefOr[NullableOption[GiphyRatingType]] = js.native
}
object TeamFunSettings {
  
  @scala.inline
  def apply(): TeamFunSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamFunSettings]
  }
  
  @scala.inline
  implicit class TeamFunSettingsOps[Self <: TeamFunSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowCustomMemes(value: NullableOption[Boolean]): Self = this.set("allowCustomMemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCustomMemes: Self = this.set("allowCustomMemes", js.undefined)
    
    @scala.inline
    def setAllowCustomMemesNull: Self = this.set("allowCustomMemes", null)
    
    @scala.inline
    def setAllowGiphy(value: NullableOption[Boolean]): Self = this.set("allowGiphy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGiphy: Self = this.set("allowGiphy", js.undefined)
    
    @scala.inline
    def setAllowGiphyNull: Self = this.set("allowGiphy", null)
    
    @scala.inline
    def setAllowStickersAndMemes(value: NullableOption[Boolean]): Self = this.set("allowStickersAndMemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowStickersAndMemes: Self = this.set("allowStickersAndMemes", js.undefined)
    
    @scala.inline
    def setAllowStickersAndMemesNull: Self = this.set("allowStickersAndMemes", null)
    
    @scala.inline
    def setGiphyContentRating(value: NullableOption[GiphyRatingType]): Self = this.set("giphyContentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiphyContentRating: Self = this.set("giphyContentRating", js.undefined)
    
    @scala.inline
    def setGiphyContentRatingNull: Self = this.set("giphyContentRating", null)
  }
}
