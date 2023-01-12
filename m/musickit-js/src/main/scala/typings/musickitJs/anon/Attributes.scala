package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: Title
  
  var data: js.Array[typings.musickitJs.MusicKit.Albums]
  
  var href: js.UndefOr[String] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
}
object Attributes {
  
  inline def apply(attributes: Title, data: js.Array[typings.musickitJs.MusicKit.Albums]): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Title): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: typings.musickitJs.MusicKit.Albums*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
