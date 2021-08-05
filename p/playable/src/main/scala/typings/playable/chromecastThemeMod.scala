package typings.playable

import typings.playable.anon.Disconnectedcolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast.theme", "default.chromecastButtonFill")
    @js.native
    def chromecastButtonFill: Disconnectedcolor = js.native
    inline def chromecastButtonFill_=(x: Disconnectedcolor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chromecastButtonFill")(x.asInstanceOf[js.Any])
  }
}
