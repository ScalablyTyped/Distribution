package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawCapture extends StObject {
  
  var rawCapture: Any
}
object RawCapture {
  
  inline def apply(rawCapture: Any): RawCapture = {
    val __obj = js.Dynamic.literal(rawCapture = rawCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCapture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawCapture] (val x: Self) extends AnyVal {
    
    inline def setRawCapture(value: Any): Self = StObject.set(x, "rawCapture", value.asInstanceOf[js.Any])
  }
}
