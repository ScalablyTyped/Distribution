package typings.miniprogram

import typings.miniprogram.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiLevelSelectArgs
  extends StObject
     with AsyncCallback[Result] {
  
  var list: js.Array[js.Any]
  
  var name: String
  
  var subList: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MultiLevelSelectArgs {
  
  @scala.inline
  def apply(list: js.Array[js.Any], name: String): MultiLevelSelectArgs = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectArgs]
  }
  
  @scala.inline
  implicit class MultiLevelSelectArgsMutableBuilder[Self <: MultiLevelSelectArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: js.Array[js.Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: js.Any*): Self = StObject.set(x, "list", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubList(value: js.Array[js.Any]): Self = StObject.set(x, "subList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubListUndefined: Self = StObject.set(x, "subList", js.undefined)
    
    @scala.inline
    def setSubListVarargs(value: js.Any*): Self = StObject.set(x, "subList", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
