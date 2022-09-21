package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dest extends StObject {
  
  var dest: Any
  
  var destPos: js.UndefOr[Double] = js.undefined
  
  var height: Any
  
  var inverseDecode: js.UndefOr[Boolean] = js.undefined
  
  var src: Any
  
  var srcPos: js.UndefOr[Double] = js.undefined
  
  var width: Any
}
object Dest {
  
  inline def apply(dest: Any, height: Any, src: Any, width: Any): Dest = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dest]
  }
  
  extension [Self <: Dest](x: Self) {
    
    inline def setDest(value: Any): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestPos(value: Double): Self = StObject.set(x, "destPos", value.asInstanceOf[js.Any])
    
    inline def setDestPosUndefined: Self = StObject.set(x, "destPos", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInverseDecode(value: Boolean): Self = StObject.set(x, "inverseDecode", value.asInstanceOf[js.Any])
    
    inline def setInverseDecodeUndefined: Self = StObject.set(x, "inverseDecode", js.undefined)
    
    inline def setSrc(value: Any): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcPos(value: Double): Self = StObject.set(x, "srcPos", value.asInstanceOf[js.Any])
    
    inline def setSrcPosUndefined: Self = StObject.set(x, "srcPos", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
