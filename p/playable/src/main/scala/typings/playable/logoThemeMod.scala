package typings.playable

import typings.playable.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo.theme", "default.logoButtonSvgFill")
    @js.native
    def logoButtonSvgFill: Fill = js.native
    @scala.inline
    def logoButtonSvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoButtonSvgFill")(x.asInstanceOf[js.Any])
  }
}
