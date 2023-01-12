package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Converter[V] extends StObject {
  
  def format(value: V): String | Null
  
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  
  def parse(value: String): V | Null
  
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
}
object Converter {
  
  inline def apply[V](format: V => String | Null, parse: String => V | Null): Converter[V] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Converter[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Converter[?], V] (val x: Self & Converter[V]) extends AnyVal {
    
    inline def setFormat(value: V => String | Null): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setGetHint(value: () => String | Null): Self = StObject.set(x, "getHint", js.Any.fromFunction0(value))
    
    inline def setGetHintUndefined: Self = StObject.set(x, "getHint", js.undefined)
    
    inline def setGetOptions(value: () => js.Object): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    inline def setGetOptionsUndefined: Self = StObject.set(x, "getOptions", js.undefined)
    
    inline def setParse(value: String => V | Null): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setResolvedOptions(value: () => js.Object): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    
    inline def setResolvedOptionsUndefined: Self = StObject.set(x, "resolvedOptions", js.undefined)
  }
}
