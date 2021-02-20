package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyCodeMod {
  
  @JSImport("ol/events/KeyCode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyCode with Double] = js.native
    
    /* 40 */ val DOWN: typings.ol.keyCodeMod.KeyCode.DOWN with Double = js.native
    
    /* 37 */ val LEFT: typings.ol.keyCodeMod.KeyCode.LEFT with Double = js.native
    
    /* 39 */ val RIGHT: typings.ol.keyCodeMod.KeyCode.RIGHT with Double = js.native
    
    /* 38 */ val UP: typings.ol.keyCodeMod.KeyCode.UP with Double = js.native
  }
  
  @js.native
  sealed trait KeyCode extends StObject
  @JSImport("ol/events/KeyCode", "KeyCode")
  @js.native
  object KeyCode extends StObject {
    
    @js.native
    sealed trait DOWN extends KeyCode
    
    @js.native
    sealed trait LEFT extends KeyCode
    
    @js.native
    sealed trait RIGHT extends KeyCode
    
    @js.native
    sealed trait UP extends KeyCode
  }
}
