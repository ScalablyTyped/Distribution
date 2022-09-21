package typings.miniprogram

import typings.miniprogram.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiLevelSelectArgs
  extends StObject
     with AsyncCallback[Result] {
  
  var list: js.Array[Any]
  
  var name: String
  
  var subList: js.UndefOr[js.Array[Any]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MultiLevelSelectArgs {
  
  inline def apply(list: js.Array[Any], name: String): MultiLevelSelectArgs = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectArgs]
  }
  
  extension [Self <: MultiLevelSelectArgs](x: Self) {
    
    inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubList(value: js.Array[Any]): Self = StObject.set(x, "subList", value.asInstanceOf[js.Any])
    
    inline def setSubListUndefined: Self = StObject.set(x, "subList", js.undefined)
    
    inline def setSubListVarargs(value: Any*): Self = StObject.set(x, "subList", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
