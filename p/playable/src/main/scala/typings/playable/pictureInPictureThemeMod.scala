package typings.playable

import typings.playable.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPictureThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture.theme", "default.pictureInPictureSvgFill")
    @js.native
    def pictureInPictureSvgFill: Fill = js.native
    @scala.inline
    def pictureInPictureSvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pictureInPictureSvgFill")(x.asInstanceOf[js.Any])
  }
}
