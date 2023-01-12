package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilenameDefinition extends StObject {
  
  /** The extension of the file. It may be a boolean: `true` will use the `name` property as the full file name (including the extension),
    `false` will keep the extension of the downloaded file.
    
    (default:false) */
  var ext: js.UndefOr[String | Boolean] = js.undefined
  
  var name: String
}
object FilenameDefinition {
  
  inline def apply(name: String): FilenameDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilenameDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilenameDefinition] (val x: Self) extends AnyVal {
    
    inline def setExt(value: String | Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
