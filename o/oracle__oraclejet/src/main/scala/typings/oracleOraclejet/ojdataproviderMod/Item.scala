package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item[K, D] extends StObject {
  
  var data: D
  
  var metadata: ItemMetadata[K]
}
object Item {
  
  inline def apply[K, D](data: D, metadata: ItemMetadata[K]): Item[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[K, D]]
  }
  
  extension [Self <: Item[?, ?], K, D](x: Self & (Item[K, D])) {
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ItemMetadata[K]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
