package typings.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerPattern
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.undefined
  
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.undefined
  
  var topic: String
}
object ServerPattern {
  
  inline def apply(topic: String): ServerPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerPattern] (val x: Self) extends AnyVal {
    
    inline def setMaxMessages$(value: Double): Self = StObject.set(x, "maxMessages$", value.asInstanceOf[js.Any])
    
    inline def setMaxMessages$Undefined: Self = StObject.set(x, "maxMessages$", js.undefined)
    
    inline def setPubsub$(value: Boolean): Self = StObject.set(x, "pubsub$", value.asInstanceOf[js.Any])
    
    inline def setPubsub$Undefined: Self = StObject.set(x, "pubsub$", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
