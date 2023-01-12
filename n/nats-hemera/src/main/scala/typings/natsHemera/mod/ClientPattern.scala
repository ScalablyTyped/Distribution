package typings.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPattern
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("expectedMessages$")
  var expectedMessages$: js.UndefOr[Double] = js.undefined
  
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.undefined
  
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.undefined
  
  @JSName("timeout$")
  var timeout$: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object ClientPattern {
  
  inline def apply(topic: String): ClientPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientPattern] (val x: Self) extends AnyVal {
    
    inline def setExpectedMessages$(value: Double): Self = StObject.set(x, "expectedMessages$", value.asInstanceOf[js.Any])
    
    inline def setExpectedMessages$Undefined: Self = StObject.set(x, "expectedMessages$", js.undefined)
    
    inline def setMaxMessages$(value: Double): Self = StObject.set(x, "maxMessages$", value.asInstanceOf[js.Any])
    
    inline def setMaxMessages$Undefined: Self = StObject.set(x, "maxMessages$", js.undefined)
    
    inline def setPubsub$(value: Boolean): Self = StObject.set(x, "pubsub$", value.asInstanceOf[js.Any])
    
    inline def setPubsub$Undefined: Self = StObject.set(x, "pubsub$", js.undefined)
    
    inline def setTimeout$(value: Double): Self = StObject.set(x, "timeout$", value.asInstanceOf[js.Any])
    
    inline def setTimeout$Undefined: Self = StObject.set(x, "timeout$", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
