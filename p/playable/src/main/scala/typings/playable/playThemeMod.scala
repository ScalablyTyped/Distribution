package typings.playable

import typings.playable.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/play/play.theme", "default.playSvgFill")
    @js.native
    def playSvgFill: Fill = js.native
    @scala.inline
    def playSvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playSvgFill")(x.asInstanceOf[js.Any])
  }
}
