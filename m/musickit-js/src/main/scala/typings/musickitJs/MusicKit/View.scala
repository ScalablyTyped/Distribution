package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Title
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A to-one or to-many relationship view from one resource object to others representing interesting associations.
  * https://developer.apple.com/documentation/applemusicapi/view
  */
trait View[Data] extends StObject {
  
  var attributes: js.UndefOr[Title] = js.undefined
  
  var data: js.Array[Data]
  
  var href: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
}
object View {
  
  inline def apply[Data](data: js.Array[Data]): View[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[View[Data]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: View[?], Data] (val x: Self & View[Data]) extends AnyVal {
    
    inline def setAttributes(value: Title): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
