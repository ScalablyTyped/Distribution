package typings.playable

import typings.playable.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionTypeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/root-container/utils/interaction-type", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/root-container/utils/interaction-type", "default.disengage")
    @js.native
    def disengage(): Unit = js.native
    @JSImport("playable/dist/src/modules/root-container/utils/interaction-type", "default.disengage")
    @js.native
    def disengage_Fdefault: js.Function0[Unit] = js.native
    
    @scala.inline
    def disengage_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disengage")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/root-container/utils/interaction-type", "default.engage")
    @js.native
    def engage(): Get = js.native
    @JSImport("playable/dist/src/modules/root-container/utils/interaction-type", "default.engage")
    @js.native
    def engage_Fdefault: js.Function0[Get] = js.native
    
    @scala.inline
    def engage_Fdefault_=(x: js.Function0[Get]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engage")(x.asInstanceOf[js.Any])
  }
}
