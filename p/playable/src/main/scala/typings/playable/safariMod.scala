package typings.playable

import typings.playable.pictureInPictureTypesMod.IPictureInPictureHelper
import typings.std.EventListener
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/picture-in-picture/safari", JSImport.Namespace)
@js.native
object safariMod extends js.Object {
  
  val INLINE_MODE: /* "inline" */ String = js.native
  
  val PICTURE_IN_PICTURE_MODE: /* "picture-in-picture" */ String = js.native
  
  @js.native
  trait SafariPictureInPicture extends IPictureInPictureHelper {
    
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
  
  @js.native
  class default protected () extends SafariPictureInPicture {
    def this(elem: HTMLVideoElement, callback: EventListener) = this()
  }
}
