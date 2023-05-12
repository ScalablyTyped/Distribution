package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  /** @description The new content of the file. */
  var content: js.UndefOr[String] = js.undefined
  
  /** @description The new filename for the file. */
  var filename: js.UndefOr[String | Null] = js.undefined
}
object Filename {
  
  inline def apply(): Filename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
