package typings.playable

import typings.playable.anon.FrameSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesConstantsMod {
  
  @JSImport("playable/dist/src/stories/constants", "DEFAULT_URLS")
  @js.native
  val DEFAULT_URLS: js.Any = js.native
  
  object DEFAUTL_CONFIG {
    
    @JSImport("playable/dist/src/stories/constants", "DEFAUTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/stories/constants", "DEFAUTL_CONFIG.framesCount")
    @js.native
    def framesCount: Double = js.native
    @scala.inline
    def framesCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framesCount")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/stories/constants", "DEFAUTL_CONFIG.qualities")
    @js.native
    def qualities: js.Array[FrameSize] = js.native
    @scala.inline
    def qualities_=(x: js.Array[FrameSize]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qualities")(x.asInstanceOf[js.Any])
  }
  
  object MODE_OPTIONS {
    
    @JSImport("playable/dist/src/stories/constants", "MODE_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/stories/constants", "MODE_OPTIONS.PREVIEW")
    @js.native
    def PREVIEW: String = js.native
    @scala.inline
    def PREVIEW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREVIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/stories/constants", "MODE_OPTIONS.REGULAR")
    @js.native
    def REGULAR: String = js.native
    @scala.inline
    def REGULAR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/stories/constants", "RGB_HEX")
  @js.native
  val RGB_HEX: js.Any = js.native
}
