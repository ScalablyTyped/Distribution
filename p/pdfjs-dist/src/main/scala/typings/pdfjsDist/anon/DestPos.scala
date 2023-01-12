package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestPos extends StObject {
  
  var destPos: Double
  
  var srcPos: Double
}
object DestPos {
  
  inline def apply(destPos: Double, srcPos: Double): DestPos = {
    val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], srcPos = srcPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestPos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestPos] (val x: Self) extends AnyVal {
    
    inline def setDestPos(value: Double): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
    
    inline def setSrcPos(value: Double): Self = StObject.set(x, "srcPos", value.asInstanceOf[js.Any])
  }
}
