package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/charset/
trait Charset extends StObject {
  
  def concat(charsets: Charset*): Charset
  
  def intersect(charsets: Charset*): Charset
}
object Charset {
  
  inline def apply(concat: /* repeated */ Charset => Charset, intersect: /* repeated */ Charset => Charset): Charset = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), intersect = js.Any.fromFunction1(intersect))
    __obj.asInstanceOf[Charset]
  }
  
  extension [Self <: Charset](x: Self) {
    
    inline def setConcat(value: /* repeated */ Charset => Charset): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setIntersect(value: /* repeated */ Charset => Charset): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
  }
}
