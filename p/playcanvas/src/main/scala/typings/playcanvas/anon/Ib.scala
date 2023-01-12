package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ib extends StObject {
  
  var ib: Double
  
  var tex: Double
  
  var texAsset: Double
  
  var texLightmap: Double
  
  var texShadow: Double
  
  var ub: Double
  
  var vb: Double
}
object Ib {
  
  inline def apply(
    ib: Double,
    tex: Double,
    texAsset: Double,
    texLightmap: Double,
    texShadow: Double,
    ub: Double,
    vb: Double
  ): Ib = {
    val __obj = js.Dynamic.literal(ib = ib.asInstanceOf[js.Any], tex = tex.asInstanceOf[js.Any], texAsset = texAsset.asInstanceOf[js.Any], texLightmap = texLightmap.asInstanceOf[js.Any], texShadow = texShadow.asInstanceOf[js.Any], ub = ub.asInstanceOf[js.Any], vb = vb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ib]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ib] (val x: Self) extends AnyVal {
    
    inline def setIb(value: Double): Self = StObject.set(x, "ib", value.asInstanceOf[js.Any])
    
    inline def setTex(value: Double): Self = StObject.set(x, "tex", value.asInstanceOf[js.Any])
    
    inline def setTexAsset(value: Double): Self = StObject.set(x, "texAsset", value.asInstanceOf[js.Any])
    
    inline def setTexLightmap(value: Double): Self = StObject.set(x, "texLightmap", value.asInstanceOf[js.Any])
    
    inline def setTexShadow(value: Double): Self = StObject.set(x, "texShadow", value.asInstanceOf[js.Any])
    
    inline def setUb(value: Double): Self = StObject.set(x, "ub", value.asInstanceOf[js.Any])
    
    inline def setVb(value: Double): Self = StObject.set(x, "vb", value.asInstanceOf[js.Any])
  }
}
