package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /**
    *   URL string containing either image data, the text
    *   contents of the file or a parsed object if file is
    *   JSON and p5.XML if XML
    */
  var data: Any
  
  /**
    *   Underlying File object. All normal File methods
    *   can be called on this.
    */
  var file: Any
  
  /**
    *   File name
    */
  var name: Any
  
  /**
    *   File size
    */
  var size: Any
  
  /**
    *   File subtype (usually the file extension jpg, png,
    *   xml, etc.)
    */
  var subtype: Any
  
  /**
    *   File type (image, text, etc.)
    */
  var `type`: Any
}
object File {
  
  inline def apply(data: Any, file: Any, name: Any, size: Any, subtype: Any, `type`: Any): File = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: Any): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
