package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.mod.OneOf
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  /**
    * @description The description of the gist.
    * @example Example Ruby script
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description The gist files to be updated, renamed, or deleted. Each `key` must match the current filename
    * (including extension) of the targeted gist file. For example: `hello.py`.
    *
    * To delete a file, set the whole file to null. For example: `hello.py : null`.
    * @example {
    *   "hello.rb": {
    *     "content": "blah",
    *     "filename": "goodbye.rb"
    *   }
    * }
    */
  var files: js.UndefOr[
    StringDictionary[js.UndefOr[OneOf[js.Tuple2[Filename, Record[String, scala.Nothing]]]]]
  ] = js.undefined
}
object Files {
  
  inline def apply(): Files = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: StringDictionary[js.UndefOr[OneOf[js.Tuple2[Filename, Record[String, scala.Nothing]]]]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
  }
}
