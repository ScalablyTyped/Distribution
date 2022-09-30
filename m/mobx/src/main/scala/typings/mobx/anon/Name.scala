package typings.mobx.anon

import typings.mobx.mobxStrings.`scheduled-reaction`
import typings.mobx.spyMod._PureSpyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name
  extends StObject
     with _PureSpyEvent {
  
  var name: String
  
  var `type`: `scheduled-reaction`
}
object Name {
  
  inline def apply(name: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("scheduled-reaction")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `scheduled-reaction`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
