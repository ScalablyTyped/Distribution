package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCodespacenameExportid extends StObject {
  
  var path: CodespacenameExportid
}
object PathCodespacenameExportid {
  
  inline def apply(path: CodespacenameExportid): PathCodespacenameExportid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCodespacenameExportid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCodespacenameExportid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CodespacenameExportid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
