package typings.nivoWaffle.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayerProps[RawDatum /* <: Datum */] extends StObject {
  
  var yay: js.UndefOr[RawDatum] = js.undefined
}
object CustomLayerProps {
  
  inline def apply[RawDatum /* <: Datum */](): CustomLayerProps[RawDatum] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLayerProps[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomLayerProps[?], RawDatum /* <: Datum */] (val x: Self & CustomLayerProps[RawDatum]) extends AnyVal {
    
    inline def setYay(value: RawDatum): Self = StObject.set(x, "yay", value.asInstanceOf[js.Any])
    
    inline def setYayUndefined: Self = StObject.set(x, "yay", js.undefined)
  }
}
