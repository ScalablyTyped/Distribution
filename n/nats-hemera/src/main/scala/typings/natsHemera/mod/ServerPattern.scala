package typings.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerPattern
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.native
  
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.native
  
  var topic: String = js.native
}
object ServerPattern {
  
  @scala.inline
  def apply(topic: String): ServerPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerPattern]
  }
  
  @scala.inline
  implicit class ServerPatternMutableBuilder[Self <: ServerPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxMessages$(value: Double): Self = StObject.set(x, "maxMessages$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessages$Undefined: Self = StObject.set(x, "maxMessages$", js.undefined)
    
    @scala.inline
    def setPubsub$(value: Boolean): Self = StObject.set(x, "pubsub$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub$Undefined: Self = StObject.set(x, "pubsub$", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
