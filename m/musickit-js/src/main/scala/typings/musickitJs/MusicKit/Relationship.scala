package typings.musickitJs.MusicKit

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A to-one or to-many relationship from one resource object to others.
  * https://developer.apple.com/documentation/applemusicapi/relationship
  */
trait Relationship[Data] extends StObject {
  
  var data: js.Array[Data]
  
  var href: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
}
object Relationship {
  
  inline def apply[Data](data: js.Array[Data]): Relationship[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship[Data]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Relationship[?], Data] (val x: Self & Relationship[Data]) extends AnyVal {
    
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
