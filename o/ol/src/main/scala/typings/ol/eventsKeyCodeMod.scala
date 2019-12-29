package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/KeyCode", JSImport.Namespace)
@js.native
object eventsKeyCodeMod extends js.Object {
  @js.native
  sealed trait KeyCode extends js.Object
  
  @js.native
  object KeyCode extends js.Object {
    @js.native
    sealed trait DOWN extends KeyCode
    
    @js.native
    sealed trait LEFT extends KeyCode
    
    @js.native
    sealed trait RIGHT extends KeyCode
    
    @js.native
    sealed trait UP extends KeyCode
    
  }
  
  @js.native
  object default extends js.Object {
    /* 40 */ val DOWN: typings.ol.eventsKeyCodeMod.KeyCode.DOWN with Double = js.native
    /* 37 */ val LEFT: typings.ol.eventsKeyCodeMod.KeyCode.LEFT with Double = js.native
    /* 39 */ val RIGHT: typings.ol.eventsKeyCodeMod.KeyCode.RIGHT with Double = js.native
    /* 38 */ val UP: typings.ol.eventsKeyCodeMod.KeyCode.UP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyCode with Double] = js.native
  }
  
}

