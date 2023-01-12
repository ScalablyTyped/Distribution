package typings.nivoBar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProps[RawDatum /* <: BarDatum */] extends StObject {
  
  var data: js.Array[RawDatum]
}
object DataProps {
  
  inline def apply[RawDatum /* <: BarDatum */](data: js.Array[RawDatum]): DataProps[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProps[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataProps[?], RawDatum /* <: BarDatum */] (val x: Self & DataProps[RawDatum]) extends AnyVal {
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
