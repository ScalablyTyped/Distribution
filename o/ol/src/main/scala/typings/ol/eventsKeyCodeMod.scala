package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsKeyCodeMod {
  
  @JSImport("ol/events/KeyCode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyCode & Double] = js.native
    
    /* 40 */ val DOWN: typings.ol.eventsKeyCodeMod.KeyCode.DOWN & Double = js.native
    
    /* 37 */ val LEFT: typings.ol.eventsKeyCodeMod.KeyCode.LEFT & Double = js.native
    
    /* 39 */ val RIGHT: typings.ol.eventsKeyCodeMod.KeyCode.RIGHT & Double = js.native
    
    /* 38 */ val UP: typings.ol.eventsKeyCodeMod.KeyCode.UP & Double = js.native
  }
  
  @js.native
  sealed trait KeyCode extends StObject
  @JSImport("ol/events/KeyCode", "KeyCode")
  @js.native
  object KeyCode extends StObject {
    
    @js.native
    sealed trait DOWN
      extends StObject
         with KeyCode
    
    @js.native
    sealed trait LEFT
      extends StObject
         with KeyCode
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with KeyCode
    
    @js.native
    sealed trait UP
      extends StObject
         with KeyCode
  }
}
