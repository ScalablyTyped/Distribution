package typings.node.anon

import typings.node.nodeStrings.`option-terminator`
import typings.node.utilMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with Token {
  
  var index: Double
  
  var kind: `option-terminator`
}
object Kind {
  
  inline def apply(index: Double): Kind = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "option-terminator")
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `option-terminator`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
