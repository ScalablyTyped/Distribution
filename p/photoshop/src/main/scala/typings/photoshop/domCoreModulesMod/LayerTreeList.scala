package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerTreeList extends StObject {
  
  var list: js.Array[LayerTreeInfo]
}
object LayerTreeList {
  
  inline def apply(list: js.Array[LayerTreeInfo]): LayerTreeList = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerTreeList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerTreeList] (val x: Self) extends AnyVal {
    
    inline def setList(value: js.Array[LayerTreeInfo]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: LayerTreeInfo*): Self = StObject.set(x, "list", js.Array(value*))
  }
}
