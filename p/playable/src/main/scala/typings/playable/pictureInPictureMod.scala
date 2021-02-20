package typings.playable

import typings.playable.anon.Engine
import typings.playable.pictureInPictureTypesMod.IPictureInPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPictureMod {
  
  @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", JSImport.Default)
  @js.native
  class default protected () extends PictureInPicture {
    def this(hasEventEmitterEngine: Engine) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
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
}
