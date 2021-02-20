package typings.prefixfree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var PrefixFree: typings.prefixfree.PrefixFree = js.native
  
  var StyleFix: typings.prefixfree.StyleFix = js.native
}
object Window {
  
  @scala.inline
  def apply(PrefixFree: PrefixFree, StyleFix: StyleFix): Window = {
    val __obj = js.Dynamic.literal(PrefixFree = PrefixFree.asInstanceOf[js.Any], StyleFix = StyleFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixFree(value: PrefixFree): Self = StObject.set(x, "PrefixFree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFix(value: StyleFix): Self = StObject.set(x, "StyleFix", value.asInstanceOf[js.Any])
  }
}
