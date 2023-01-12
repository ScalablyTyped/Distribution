package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamFunSettings extends StObject {
  
  // If set to true, enables users to include custom memes.
  var allowCustomMemes: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, enables Giphy use.
  var allowGiphy: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, enables users to include stickers and memes.
  var allowStickersAndMemes: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Giphy content rating. Possible values are: moderate, strict.
  var giphyContentRating: js.UndefOr[NullableOption[GiphyRatingType]] = js.undefined
}
object TeamFunSettings {
  
  inline def apply(): TeamFunSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamFunSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamFunSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowCustomMemes(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCustomMemes", value.asInstanceOf[js.Any])
    
    inline def setAllowCustomMemesNull: Self = StObject.set(x, "allowCustomMemes", null)
    
    inline def setAllowCustomMemesUndefined: Self = StObject.set(x, "allowCustomMemes", js.undefined)
    
    inline def setAllowGiphy(value: NullableOption[Boolean]): Self = StObject.set(x, "allowGiphy", value.asInstanceOf[js.Any])
    
    inline def setAllowGiphyNull: Self = StObject.set(x, "allowGiphy", null)
    
    inline def setAllowGiphyUndefined: Self = StObject.set(x, "allowGiphy", js.undefined)
    
    inline def setAllowStickersAndMemes(value: NullableOption[Boolean]): Self = StObject.set(x, "allowStickersAndMemes", value.asInstanceOf[js.Any])
    
    inline def setAllowStickersAndMemesNull: Self = StObject.set(x, "allowStickersAndMemes", null)
    
    inline def setAllowStickersAndMemesUndefined: Self = StObject.set(x, "allowStickersAndMemes", js.undefined)
    
    inline def setGiphyContentRating(value: NullableOption[GiphyRatingType]): Self = StObject.set(x, "giphyContentRating", value.asInstanceOf[js.Any])
    
    inline def setGiphyContentRatingNull: Self = StObject.set(x, "giphyContentRating", null)
    
    inline def setGiphyContentRatingUndefined: Self = StObject.set(x, "giphyContentRating", js.undefined)
  }
}
