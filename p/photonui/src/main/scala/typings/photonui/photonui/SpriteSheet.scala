package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSheet
  extends StObject
     with Base {
  
  def addIcon(iconName: String, x: Double, y: Double): Unit
  
  def getIconCSS(iconName: String): String
  
  def getIconPosition(iconName: String): X
  
  var icons: StringDictionary[js.Array[Double]]
  
  var imageUrl: String
  
  var name: String
  
  def removeIcon(iconName: String): Unit
  
  var size: String
}
object SpriteSheet {
  
  inline def apply(
    addIcon: (String, Double, Double) => Unit,
    destroy: () => Unit,
    getIconCSS: String => String,
    getIconPosition: String => X,
    icons: StringDictionary[js.Array[Double]],
    imageUrl: String,
    name: String,
    registerCallback: (String, String, js.Function, Any) => Unit,
    removeCallback: String => Unit,
    removeIcon: String => Unit,
    size: String
  ): SpriteSheet = {
    val __obj = js.Dynamic.literal(addIcon = js.Any.fromFunction3(addIcon), destroy = js.Any.fromFunction0(destroy), getIconCSS = js.Any.fromFunction1(getIconCSS), getIconPosition = js.Any.fromFunction1(getIconPosition), icons = icons.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), removeIcon = js.Any.fromFunction1(removeIcon), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteSheet] (val x: Self) extends AnyVal {
    
    inline def setAddIcon(value: (String, Double, Double) => Unit): Self = StObject.set(x, "addIcon", js.Any.fromFunction3(value))
    
    inline def setGetIconCSS(value: String => String): Self = StObject.set(x, "getIconCSS", js.Any.fromFunction1(value))
    
    inline def setGetIconPosition(value: String => X): Self = StObject.set(x, "getIconPosition", js.Any.fromFunction1(value))
    
    inline def setIcons(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveIcon(value: String => Unit): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
