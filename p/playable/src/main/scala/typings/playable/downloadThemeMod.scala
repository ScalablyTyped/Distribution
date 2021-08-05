package typings.playable

import typings.playable.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/download/download.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/download/download.theme", "default.downloadSvgFill")
    @js.native
    def downloadSvgFill: Fill = js.native
    inline def downloadSvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("downloadSvgFill")(x.asInstanceOf[js.Any])
  }
}
