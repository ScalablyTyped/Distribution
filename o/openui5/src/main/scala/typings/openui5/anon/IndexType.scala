package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexType extends StObject {
  
  var index: int
  
  var `type`: String
}
object IndexType {
  
  inline def apply(index: int, `type`: String): IndexType = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexType] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: int): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
