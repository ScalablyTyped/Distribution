package typings.playable

import typings.playable.anon.Engine
import typings.playable.pictureInPictureTypesMod.IPictureInPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", JSImport.Namespace)
@js.native
object pictureInPictureMod extends js.Object {
  
  @js.native
  trait PictureInPicture extends IPictureInPicture {
    
    var _eventEmitter: js.Any = js.native
    
    var _helper: js.Any = js.native
    
    var _isEnabled: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    @JSName("isEnabled")
    def isEnabled_MPictureInPicture: Boolean = js.native
    
    /**
      * Return true if player is in picture in picture mode
      * @example
      * console.log(player.isInPictureInPicture); // false
      */
    @JSName("isInPictureInPicture")
    def isInPictureInPicture_MPictureInPicture: Boolean = js.native
  }
  
  @js.native
  class default protected () extends PictureInPicture {
    def this(hasEventEmitterEngine: Engine) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
