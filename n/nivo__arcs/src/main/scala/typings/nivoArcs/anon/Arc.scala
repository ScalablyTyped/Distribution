package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arc extends StObject {
  
  var arc: typings.nivoArcs.typesTypesMod.Arc
}
object Arc {
  
  inline def apply(arc: typings.nivoArcs.typesTypesMod.Arc): Arc = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  
  extension [Self <: Arc](x: Self) {
    
    inline def setArc(value: typings.nivoArcs.typesTypesMod.Arc): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
  }
}
