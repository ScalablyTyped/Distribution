package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttontitle extends StObject {
  
  var button_title: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var headline: js.UndefOr[String] = js.undefined
}
object Buttontitle {
  
  inline def apply(): Buttontitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buttontitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buttontitle] (val x: Self) extends AnyVal {
    
    inline def setButton_title(value: String): Self = StObject.set(x, "button_title", value.asInstanceOf[js.Any])
    
    inline def setButton_titleUndefined: Self = StObject.set(x, "button_title", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
  }
}
