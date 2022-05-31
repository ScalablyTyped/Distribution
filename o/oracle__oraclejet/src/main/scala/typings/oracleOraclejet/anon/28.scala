package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28`[K, D] extends StObject {
  
  def renderer(context: NodeContentContext[K, D]): Insert
}
object `28` {
  
  inline def apply[K, D](renderer: NodeContentContext[K, D] => Insert): `28`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`28`[K, D]]
  }
  
  extension [Self <: `28`[?, ?], K, D](x: Self & (`28`[K, D])) {
    
    inline def setRenderer(value: NodeContentContext[K, D] => Insert): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
