package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGetResponse extends StObject {
  
  var data: GetResponse
}
object DataGetResponse {
  
  inline def apply(data: GetResponse): DataGetResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataGetResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: GetResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
