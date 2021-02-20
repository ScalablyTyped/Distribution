package typings.playable

import typings.playable.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusSourceMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/root-container/utils/focus-source", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/root-container/utils/focus-source", "default.disengage")
    @js.native
    def disengage(): Unit = js.native
    @JSImport("playable/dist/src/modules/root-container/utils/focus-source", "default.disengage")
    @js.native
    def disengage_Fdefault: js.Function0[Unit] = js.native
    
    @scala.inline
    def disengage_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disengage")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/root-container/utils/focus-source", "default.engage")
    @js.native
    def engage(): Current = js.native
    @JSImport("playable/dist/src/modules/root-container/utils/focus-source", "default.engage")
    @js.native
    def engage_Fdefault: js.Function0[Current] = js.native
    
    @scala.inline
    def engage_Fdefault_=(x: js.Function0[Current]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("engage")(x.asInstanceOf[js.Any])
  }
}
