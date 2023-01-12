package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojchartMod.ojChart.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  def renderer(context: TooltipContext): Insert | PreventDefault
}
object Renderer {
  
  inline def apply(renderer: TooltipContext => Insert | PreventDefault): Renderer = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    inline def setRenderer(value: TooltipContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
