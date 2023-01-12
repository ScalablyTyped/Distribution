package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.RowAxisLabelRendererContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[K2, D2] extends StObject {
  
  def renderer(context: RowAxisLabelRendererContext[K2, D2]): InsertElement
}
object `7` {
  
  inline def apply[K2, D2](renderer: RowAxisLabelRendererContext[K2, D2] => InsertElement): `7`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`7`[K2, D2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`[?, ?], K2, D2] (val x: Self & (`7`[K2, D2])) extends AnyVal {
    
    inline def setRenderer(value: RowAxisLabelRendererContext[K2, D2] => InsertElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
