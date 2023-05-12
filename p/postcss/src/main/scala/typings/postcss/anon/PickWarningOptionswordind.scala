package typings.postcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<postcss.postcss/lib/warning.WarningOptions, 'word' | 'index'> */
trait PickWarningOptionswordind extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var word: js.UndefOr[String] = js.undefined
}
object PickWarningOptionswordind {
  
  inline def apply(): PickWarningOptionswordind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickWarningOptionswordind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickWarningOptionswordind] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
