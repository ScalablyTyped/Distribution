package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[K, D] extends StObject {
  
  def renderer(context: RootNodeContext[K, D]): Insert
}
object `18` {
  
  inline def apply[K, D](renderer: RootNodeContext[K, D] => Insert): `18`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`18`[K, D]]
  }
  
  extension [Self <: `18`[?, ?], K, D](x: Self & (`18`[K, D])) {
    
    inline def setRenderer(value: RootNodeContext[K, D] => Insert): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
