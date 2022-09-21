package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISequence extends StObject {
  
  @JSName("apply")
  def apply(slot: ISlot, attachment: IHasTextureRegion): Unit
  
  var id: Double
  
  var regions: js.Array[TextureRegion]
}
object ISequence {
  
  inline def apply(apply: (ISlot, IHasTextureRegion) => Unit, id: Double, regions: js.Array[TextureRegion]): ISequence = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), id = id.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISequence]
  }
  
  extension [Self <: ISequence](x: Self) {
    
    inline def setApply(value: (ISlot, IHasTextureRegion) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRegions(value: js.Array[TextureRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsVarargs(value: TextureRegion*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
