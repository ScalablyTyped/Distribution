package typings.parse.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var as: String
  
  var from: String
  
  var let: js.UndefOr[Record[String, Any]] = js.undefined
  
  var pipeline: Record[String, Any]
}
object From {
  
  inline def apply(as: String, from: String, pipeline: Record[String, Any]): From = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLet(value: Record[String, Any]): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setPipeline(value: Record[String, Any]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
