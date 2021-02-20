package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameData
  extends /* key */ StringDictionary[js.Any] {
  
  var data: js.Object = js.native
  
  var id: js.Any = js.native
  
  var itemData: js.Object = js.native
}
object DictpropNameData {
  
  @scala.inline
  def apply(data: js.Object, id: js.Any, itemData: js.Object): DictpropNameData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameData]
  }
  
  @scala.inline
  implicit class DictpropNameDataMutableBuilder[Self <: DictpropNameData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
  }
}
