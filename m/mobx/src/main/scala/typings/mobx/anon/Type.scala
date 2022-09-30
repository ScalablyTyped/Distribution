package typings.mobx.anon

import typings.mobx.mobxStrings.reaction
import typings.mobx.spyMod._PureSpyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with _PureSpyEvent {
  
  var name: String
  
  var `type`: reaction
}
object Type {
  
  inline def apply(name: String): Type = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reaction")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: reaction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
