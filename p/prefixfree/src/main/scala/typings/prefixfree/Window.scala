package typings.prefixfree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var PrefixFree: typings.prefixfree.PrefixFree
  
  var StyleFix: typings.prefixfree.StyleFix
}
object Window {
  
  inline def apply(PrefixFree: PrefixFree, StyleFix: StyleFix): Window = {
    val __obj = js.Dynamic.literal(PrefixFree = PrefixFree.asInstanceOf[js.Any], StyleFix = StyleFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setPrefixFree(value: PrefixFree): Self = StObject.set(x, "PrefixFree", value.asInstanceOf[js.Any])
    
    inline def setStyleFix(value: StyleFix): Self = StObject.set(x, "StyleFix", value.asInstanceOf[js.Any])
  }
}
