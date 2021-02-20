package typings.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientPattern
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("expectedMessages$")
  var expectedMessages$: js.UndefOr[Double] = js.native
  
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.native
  
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.native
  
  @JSName("timeout$")
  var timeout$: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
}
object ClientPattern {
  
  @scala.inline
  def apply(topic: String): ClientPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPattern]
  }
  
  @scala.inline
  implicit class ClientPatternMutableBuilder[Self <: ClientPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedMessages$(value: Double): Self = StObject.set(x, "expectedMessages$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedMessages$Undefined: Self = StObject.set(x, "expectedMessages$", js.undefined)
    
    @scala.inline
    def setMaxMessages$(value: Double): Self = StObject.set(x, "maxMessages$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessages$Undefined: Self = StObject.set(x, "maxMessages$", js.undefined)
    
    @scala.inline
    def setPubsub$(value: Boolean): Self = StObject.set(x, "pubsub$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub$Undefined: Self = StObject.set(x, "pubsub$", js.undefined)
    
    @scala.inline
    def setTimeout$(value: Double): Self = StObject.set(x, "timeout$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout$Undefined: Self = StObject.set(x, "timeout$", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
