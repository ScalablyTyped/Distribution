package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26`[K] extends StObject {
  
  def renderer(context: TooltipContext[K]): Insert | PreventDefault
}
object `26` {
  
  inline def apply[K](renderer: TooltipContext[K] => Insert | PreventDefault): `26`[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`26`[K]]
  }
  
  extension [Self <: `26`[?], K](x: Self & `26`[K]) {
    
    inline def setRenderer(value: TooltipContext[K] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
