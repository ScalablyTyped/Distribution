package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: `false` | Annotation
}
object Map {
  
  inline def apply(map: `false` | Annotation): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setMap(value: `false` | Annotation): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
