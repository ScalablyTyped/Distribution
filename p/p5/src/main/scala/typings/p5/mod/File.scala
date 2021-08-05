package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /**
    *   URL string containing image data.
    */
  var data: js.Any
  
  /**
    *   Underlying File object. All normal File methods
    *   can be called on this.
    */
  var file: js.Any
  
  /**
    *   File name
    */
  var name: js.Any
  
  /**
    *   File size
    */
  var size: js.Any
  
  /**
    *   File subtype (usually the file extension jpg, png,
    *   xml, etc.)
    */
  var subtype: js.Any
  
  /**
    *   File type (image, text, etc.)
    */
  var `type`: js.Any
}
object File {
  
  inline def apply(data: js.Any, file: js.Any, name: js.Any, size: js.Any, subtype: js.Any, `type`: js.Any): File = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: js.Any): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
