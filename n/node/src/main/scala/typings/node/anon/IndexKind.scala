package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexKind extends StObject {
  
  var index: Double
  
  var kind: "option-terminator"
}
object IndexKind {
  
  inline def apply(index: Double): IndexKind = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "option-terminator")
    __obj.asInstanceOf[IndexKind]
  }
  
  extension [Self <: IndexKind](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKind(value: "option-terminator"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
