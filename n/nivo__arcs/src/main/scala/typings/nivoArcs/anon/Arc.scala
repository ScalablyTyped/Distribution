package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arc extends StObject {
  
  var arc: typings.nivoArcs.distTypesTypesMod.Arc
}
object Arc {
  
  inline def apply(arc: typings.nivoArcs.distTypesTypesMod.Arc): Arc = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arc] (val x: Self) extends AnyVal {
    
    inline def setArc(value: typings.nivoArcs.distTypesTypesMod.Arc): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
  }
}
