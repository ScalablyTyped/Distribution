package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataIndex[D, K] extends StObject {
  
  var data: D = js.native
  
  var index: Double = js.native
  
  var key: K = js.native
}
object DataIndex {
  
  @scala.inline
  def apply[D, K](data: D, index: Double, key: K): DataIndex[D, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex[D, K]]
  }
  
  @scala.inline
  implicit class DataIndexMutableBuilder[Self <: DataIndex[_, _], D, K] (val x: Self with (DataIndex[D, K])) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
