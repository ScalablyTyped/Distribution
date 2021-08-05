package typings.playable

import typings.playable.anon.Engine
import typings.playable.pictureInPictureTypesMod.IPictureInPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPictureMod {
  
  @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PictureInPicture {
    def this(hasEventEmitterEngine: Engine) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disablePictureInPicture(): Unit = js.native
    
    /* CompleteClass */
    override def enablePictureInPicture(): Unit = js.native
    
    /* CompleteClass */
    override def enterPictureInPicture(): Unit = js.native
    
    /* CompleteClass */
    override def exitPictureInPicture(): Unit = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isInPictureInPicture: Boolean = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/picture-in-picture/picture-in-picture", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PictureInPicture
    extends StObject
       with IPictureInPicture {
    
    /* private */ var _eventEmitter: js.Any = js.native
    
    /* private */ var _helper: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /* private */ var _onChange: js.Any = js.native
    
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
