package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStatus extends StObject {
  
  val data: Null
  
  val status: loading
}
object DataStatus {
  
  inline def apply(data: Null): DataStatus = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = "loading")
    __obj.asInstanceOf[DataStatus]
  }
  
  extension [Self <: DataStatus](x: Self) {
    
    inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: loading): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
