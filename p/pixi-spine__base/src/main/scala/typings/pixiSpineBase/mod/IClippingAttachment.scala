package typings.pixiSpineBase.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClippingAttachment
  extends StObject
     with IVertexAttachment[ISlot] {
  
  var endSlot: js.UndefOr[ISlotData] = js.undefined
}
object IClippingAttachment {
  
  inline def apply(
    computeWorldVertices: (ISlot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (ISlot, ArrayLike[Double]) => Unit,
    id: Double,
    name: String,
    `type`: AttachmentType,
    worldVerticesLength: Double
  ): IClippingAttachment = {
    val __obj = js.Dynamic.literal(computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClippingAttachment]
  }
  
  extension [Self <: IClippingAttachment](x: Self) {
    
    inline def setEndSlot(value: ISlotData): Self = StObject.set(x, "endSlot", value.asInstanceOf[js.Any])
    
    inline def setEndSlotUndefined: Self = StObject.set(x, "endSlot", js.undefined)
  }
}
