package typings.playable

import typings.playable.pictureInPictureTypesMod.IPictureInPictureHelper
import typings.std.EventListener
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safariMod {
  
  @JSImport("playable/dist/src/modules/picture-in-picture/safari", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with SafariPictureInPicture {
    def this(elem: HTMLVideoElement, callback: EventListener) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def exit(): Unit = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isInPictureInPicture: Boolean = js.native
    
    /* CompleteClass */
    override def request(): Unit = js.native
  }
  
  @JSImport("playable/dist/src/modules/picture-in-picture/safari", "INLINE_MODE")
  @js.native
  val INLINE_MODE: /* "inline" */ String = js.native
  
  @JSImport("playable/dist/src/modules/picture-in-picture/safari", "PICTURE_IN_PICTURE_MODE")
  @js.native
  val PICTURE_IN_PICTURE_MODE: /* "picture-in-picture" */ String = js.native
  
  @js.native
  trait SafariPictureInPicture
    extends StObject
       with IPictureInPictureHelper {
    
    @JSName("_$elem")
    var _$elem: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _enterWhenHasMetaData: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def isAPIExist: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MSafariPictureInPicture: Boolean = js.native
    
    @JSName("isInPictureInPicture")
    def isInPictureInPicture_MSafariPictureInPicture: Boolean = js.native
  }
}
