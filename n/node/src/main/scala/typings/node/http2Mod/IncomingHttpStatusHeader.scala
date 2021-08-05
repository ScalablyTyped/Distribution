package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingHttpStatusHeader extends StObject {
  
  @JSName(":status")
  var Colonstatus: js.UndefOr[Double] = js.undefined
}
object IncomingHttpStatusHeader {
  
  inline def apply(): IncomingHttpStatusHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpStatusHeader]
  }
  
  extension [Self <: IncomingHttpStatusHeader](x: Self) {
    
    inline def setColonstatus(value: Double): Self = StObject.set(x, ":status", value.asInstanceOf[js.Any])
    
    inline def setColonstatusUndefined: Self = StObject.set(x, ":status", js.undefined)
  }
}
