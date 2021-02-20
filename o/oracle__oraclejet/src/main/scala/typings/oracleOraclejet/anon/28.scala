package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28`[K, D] extends StObject {
  
  def renderer(context: NodeContentContext[K, D]): Insert = js.native
}
object `28` {
  
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => Insert): `28`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`28`[K, D]]
  }
  
  @scala.inline
  implicit class `28MutableBuilder`[Self <: `28`[_, _], K, D] (val x: Self with (`28`[K, D])) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: NodeContentContext[K, D] => Insert): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
