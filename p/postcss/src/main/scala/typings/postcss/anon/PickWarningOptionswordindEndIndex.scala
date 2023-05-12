package typings.postcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<postcss.postcss/lib/warning.WarningOptions, 'word' | 'index' | 'endIndex'> */
trait PickWarningOptionswordindEndIndex extends StObject {
  
  var endIndex: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var word: js.UndefOr[String] = js.undefined
}
object PickWarningOptionswordindEndIndex {
  
  inline def apply(): PickWarningOptionswordindEndIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickWarningOptionswordindEndIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickWarningOptionswordindEndIndex] (val x: Self) extends AnyVal {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
