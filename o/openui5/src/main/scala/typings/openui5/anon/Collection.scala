package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var collection: String
  
  var content: String | js.Array[String]
  
  var fontFamily: String
  
  var name: String
  
  var suppressMirroring: Boolean
  
  var uri: String
}
object Collection {
  
  inline def apply(
    collection: String,
    content: String | js.Array[String],
    fontFamily: String,
    name: String,
    suppressMirroring: Boolean,
    uri: String
  ): Collection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], suppressMirroring = suppressMirroring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSuppressMirroring(value: Boolean): Self = StObject.set(x, "suppressMirroring", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
