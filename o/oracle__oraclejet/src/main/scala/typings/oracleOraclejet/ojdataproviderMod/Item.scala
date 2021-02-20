package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item[K, D] extends StObject {
  
  var data: D = js.native
  
  var metadata: ItemMetadata[K] = js.native
}
object Item {
  
  @scala.inline
  def apply[K, D](data: D, metadata: ItemMetadata[K]): Item[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[K, D]]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item[_, _], K, D] (val x: Self with (Item[K, D])) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ItemMetadata[K]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
