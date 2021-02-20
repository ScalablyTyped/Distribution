package typings.oracleOraclejet.ojvalidationBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Converter[V] extends StObject {
  
  def format(value: V): String | Null = js.native
  
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.native
  
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.native
  
  def parse(value: String): V | Null = js.native
  
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.native
}
object Converter {
  
  @scala.inline
  def apply[V](format: V => String | Null, parse: String => V | Null): Converter[V] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Converter[V]]
  }
  
  @scala.inline
  implicit class ConverterMutableBuilder[Self <: Converter[_], V] (val x: Self with Converter[V]) extends AnyVal {
    
    @scala.inline
    def setFormat(value: V => String | Null): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHint(value: () => String | Null): Self = StObject.set(x, "getHint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHintUndefined: Self = StObject.set(x, "getHint", js.undefined)
    
    @scala.inline
    def setGetOptions(value: () => js.Object): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionsUndefined: Self = StObject.set(x, "getOptions", js.undefined)
    
    @scala.inline
    def setParse(value: String => V | Null): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolvedOptions(value: () => js.Object): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolvedOptionsUndefined: Self = StObject.set(x, "resolvedOptions", js.undefined)
  }
}
