package typings.playable

import typings.playable.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress.theme", "default.progressPlayed")
    @js.native
    def progressPlayed: BackgroundColor = js.native
    @scala.inline
    def progressPlayed_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressPlayed")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress.theme", "default.progressSeekBtn")
    @js.native
    def progressSeekBtn: BackgroundColor = js.native
    @scala.inline
    def progressSeekBtn_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressSeekBtn")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress.theme", "default.progressSeekTo")
    @js.native
    def progressSeekTo: BackgroundColor = js.native
    @scala.inline
    def progressSeekTo_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressSeekTo")(x.asInstanceOf[js.Any])
  }
}
