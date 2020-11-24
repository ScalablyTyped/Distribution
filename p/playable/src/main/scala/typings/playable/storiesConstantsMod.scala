package typings.playable

import typings.playable.anon.FrameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/stories/constants", JSImport.Namespace)
@js.native
object storiesConstantsMod extends js.Object {
  
  val DEFAULT_URLS: js.Any = js.native
  
  val RGB_HEX: js.Any = js.native
  
  @js.native
  object DEFAUTL_CONFIG extends js.Object {
    
    var framesCount: Double = js.native
    
    var qualities: js.Array[FrameSize] = js.native
  }
  
  @js.native
  object MODE_OPTIONS extends js.Object {
    
    var PREVIEW: String = js.native
    
    var REGULAR: String = js.native
  }
}
