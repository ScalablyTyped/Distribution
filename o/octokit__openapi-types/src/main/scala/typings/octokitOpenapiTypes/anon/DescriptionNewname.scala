package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionNewname extends StObject {
  
  /** @description The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`. */
  var color: js.UndefOr[String] = js.undefined
  
  /** @description A short description of the label. Must be 100 characters or fewer. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see "[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet)." */
  var new_name: js.UndefOr[String] = js.undefined
}
object DescriptionNewname {
  
  inline def apply(): DescriptionNewname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionNewname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionNewname] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNew_name(value: String): Self = StObject.set(x, "new_name", value.asInstanceOf[js.Any])
    
    inline def setNew_nameUndefined: Self = StObject.set(x, "new_name", js.undefined)
  }
}
