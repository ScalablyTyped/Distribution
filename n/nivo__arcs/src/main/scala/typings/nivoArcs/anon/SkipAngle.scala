package typings.nivoArcs.anon

import typings.nivoArcs.typesTypesMod.DatumWithArc
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipAngle[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */] extends StObject {
  
  var computeExtraProps: js.UndefOr[js.Function1[/* datum */ Datum, ExtraProps]] = js.undefined
  
  var data: js.Array[Datum]
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var skipAngle: js.UndefOr[Double] = js.undefined
}
object SkipAngle {
  
  inline def apply[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](data: js.Array[Datum]): SkipAngle[Datum, ExtraProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipAngle[Datum, ExtraProps]]
  }
  
  extension [Self <: SkipAngle[?, ?], Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](x: Self & (SkipAngle[Datum, ExtraProps])) {
    
    inline def setComputeExtraProps(value: /* datum */ Datum => ExtraProps): Self = StObject.set(x, "computeExtraProps", js.Any.fromFunction1(value))
    
    inline def setComputeExtraPropsUndefined: Self = StObject.set(x, "computeExtraProps", js.undefined)
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSkipAngle(value: Double): Self = StObject.set(x, "skipAngle", value.asInstanceOf[js.Any])
    
    inline def setSkipAngleUndefined: Self = StObject.set(x, "skipAngle", js.undefined)
  }
}
