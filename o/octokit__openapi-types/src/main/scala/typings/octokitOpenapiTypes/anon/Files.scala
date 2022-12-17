package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  /**
    * @description Description of the gist
    * @example Example Ruby script
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description Names of files to be updated
    * @example {
    *   "hello.rb": {
    *     "content": "blah",
    *     "filename": "goodbye.rb"
    *   }
    * }
    */
  var files: js.UndefOr[StringDictionary[Partial[StringDictionary[Any]]]] = js.undefined
}
object Files {
  
  inline def apply(): Files = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: StringDictionary[Partial[StringDictionary[Any]]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
  }
}
