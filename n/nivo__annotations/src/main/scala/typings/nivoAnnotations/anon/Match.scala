package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.ListIterateeCustom
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match[Datum] extends StObject {
  
  var `match`: ListIterateeCustom[Datum, Boolean]
  
  var offset: js.UndefOr[Double] = js.undefined
}
object Match {
  
  inline def apply[Datum](`match`: ListIterateeCustom[Datum, Boolean]): Match[Datum] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Match[?], Datum] (val x: Self & Match[Datum]) extends AnyVal {
    
    inline def setMatch(value: ListIterateeCustom[Datum, Boolean]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchFunction3(value: (Datum, /* index */ Double, /* collection */ ArrayLike[Datum]) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction3(value))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
