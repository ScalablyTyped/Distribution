package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Public extends StObject {
  
  /**
    * @description Description of the gist
    * @example Example Ruby script
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description Names and content for the files that make up the gist
    * @example {
    *   "hello.rb": {
    *     "content": "puts \"Hello, World!\""
    *   }
    * }
    */
  var files: StringDictionary[ContentString]
  
  var public: js.UndefOr[Boolean] = js.undefined
}
object Public {
  
  inline def apply(files: StringDictionary[ContentString]): Public = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Public]
  }
  
  extension [Self <: Public](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: StringDictionary[ContentString]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
  }
}
