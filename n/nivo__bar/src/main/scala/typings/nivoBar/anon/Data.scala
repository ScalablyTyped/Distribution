package typings.nivoBar.anon

import typings.nivoBar.distTypesTypesMod.ComputedDatum
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[RawDatum] extends StObject {
  
  var data: Partial[ComputedDatum[RawDatum]] & Hidden
}
object Data {
  
  inline def apply[RawDatum](data: Partial[ComputedDatum[RawDatum]] & Hidden): Data[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[RawDatum]]
  }
  
  extension [Self <: Data[?], RawDatum](x: Self & Data[RawDatum]) {
    
    inline def setData(value: Partial[ComputedDatum[RawDatum]] & Hidden): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
