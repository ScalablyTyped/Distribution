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
  open class default protected ()
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
    
    /* private */ @JSName("_$elem")
    var _$elem: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _enterWhenHasMetaData: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def isAPIExist: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MSafariPictureInPicture: Boolean = js.native
    
    @JSName("isInPictureInPicture")
    def isInPictureInPicture_MSafariPictureInPicture: Boolean = js.native
  }
}
