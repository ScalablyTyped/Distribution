package typings.playable

import typings.playable.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/time/time.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/time/time.theme", "default.timeText")
    @js.native
    def timeText: Color = js.native
    @scala.inline
    def timeText_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeText")(x.asInstanceOf[js.Any])
  }
}
