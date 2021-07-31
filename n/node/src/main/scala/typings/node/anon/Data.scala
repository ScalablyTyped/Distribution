package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Array[Double]
  
  var `type`: typings.node.nodeStrings.Buffer
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[Double]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Buffer")
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.node.nodeStrings.Buffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
