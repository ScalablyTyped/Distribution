package typings.nivoArcs.anon

import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typings.nivoArcs.distTypesTypesMod.DatumWithArc
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeExtraProps[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */] extends StObject {
  
  var computeExtraProps: js.UndefOr[js.Function1[/* datum */ ArcLinkWithDatum[Datum], ExtraProps]] = js.undefined
  
  var data: js.Array[Datum]
  
  var diagonalLength: Double
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var skipAngle: js.UndefOr[Double] = js.undefined
  
  var straightLength: Double
}
object ComputeExtraProps {
  
  inline def apply[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](data: js.Array[Datum], diagonalLength: Double, straightLength: Double): ComputeExtraProps[Datum, ExtraProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], diagonalLength = diagonalLength.asInstanceOf[js.Any], straightLength = straightLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeExtraProps[Datum, ExtraProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeExtraProps[?, ?], Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */] (val x: Self & (ComputeExtraProps[Datum, ExtraProps])) extends AnyVal {
    
    inline def setComputeExtraProps(value: /* datum */ ArcLinkWithDatum[Datum] => ExtraProps): Self = StObject.set(x, "computeExtraProps", js.Any.fromFunction1(value))
    
    inline def setComputeExtraPropsUndefined: Self = StObject.set(x, "computeExtraProps", js.undefined)
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDiagonalLength(value: Double): Self = StObject.set(x, "diagonalLength", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSkipAngle(value: Double): Self = StObject.set(x, "skipAngle", value.asInstanceOf[js.Any])
    
    inline def setSkipAngleUndefined: Self = StObject.set(x, "skipAngle", js.undefined)
    
    inline def setStraightLength(value: Double): Self = StObject.set(x, "straightLength", value.asInstanceOf[js.Any])
  }
}
