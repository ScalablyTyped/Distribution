package typings.mongodb.anon

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errmsg extends StObject {
  
  var code: Double
  
  var errmsg: js.UndefOr[String] = js.undefined
  
  var index: Double
  
  var op: Document
}
object Errmsg {
  
  inline def apply(code: Double, index: Double, op: Document): Errmsg = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errmsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errmsg] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    inline def setErrmsgUndefined: Self = StObject.set(x, "errmsg", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOp(value: Document): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
