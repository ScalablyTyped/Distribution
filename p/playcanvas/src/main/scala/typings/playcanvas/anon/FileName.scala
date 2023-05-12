package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  var fileName: String
  
  var name: Any
  
  var refName: String
}
object FileName {
  
  inline def apply(fileName: String, name: Any, refName: String): FileName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefName(value: String): Self = StObject.set(x, "refName", value.asInstanceOf[js.Any])
  }
}
