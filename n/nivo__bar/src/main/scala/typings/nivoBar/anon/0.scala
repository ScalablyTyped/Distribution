package typings.nivoBar.anon

import typings.nivoBar.distTypesTypesMod.ComputedDatum
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[RawDatum] extends StObject {
  
  var data: Partial[ComputedDatum[RawDatum]] & Hidden
}
object `0` {
  
  inline def apply[RawDatum](data: Partial[ComputedDatum[RawDatum]] & Hidden): `0`[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[RawDatum]]
  }
  
  extension [Self <: `0`[?], RawDatum](x: Self & `0`[RawDatum]) {
    
    inline def setData(value: Partial[ComputedDatum[RawDatum]] & Hidden): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
