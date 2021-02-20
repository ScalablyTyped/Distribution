package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamFunSettings extends StObject {
  
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
  implicit class TeamFunSettingsMutableBuilder[Self <: TeamFunSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCustomMemes(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCustomMemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCustomMemesNull: Self = StObject.set(x, "allowCustomMemes", null)
    
    @scala.inline
    def setAllowCustomMemesUndefined: Self = StObject.set(x, "allowCustomMemes", js.undefined)
    
    @scala.inline
    def setAllowGiphy(value: NullableOption[Boolean]): Self = StObject.set(x, "allowGiphy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGiphyNull: Self = StObject.set(x, "allowGiphy", null)
    
    @scala.inline
    def setAllowGiphyUndefined: Self = StObject.set(x, "allowGiphy", js.undefined)
    
    @scala.inline
    def setAllowStickersAndMemes(value: NullableOption[Boolean]): Self = StObject.set(x, "allowStickersAndMemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowStickersAndMemesNull: Self = StObject.set(x, "allowStickersAndMemes", null)
    
    @scala.inline
    def setAllowStickersAndMemesUndefined: Self = StObject.set(x, "allowStickersAndMemes", js.undefined)
    
    @scala.inline
    def setGiphyContentRating(value: NullableOption[GiphyRatingType]): Self = StObject.set(x, "giphyContentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiphyContentRatingNull: Self = StObject.set(x, "giphyContentRating", null)
    
    @scala.inline
    def setGiphyContentRatingUndefined: Self = StObject.set(x, "giphyContentRating", js.undefined)
  }
}
