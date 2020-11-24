package typings.playable

import typings.playable.pictureInPictureTypesMod.IPictureInPictureHelper
import typings.std.Document
import typings.std.Element
import typings.std.EventListener
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/picture-in-picture/chrome", JSImport.Namespace)
@js.native
object chromeMod extends js.Object {
  
  @js.native
  trait ChromeDocument extends Document {
    
    def exitPictureInPicture(): js.Promise[Unit] = js.native
    
    var pictureInPictureElement: js.UndefOr[Element] = js.native
    
    var pictureInPictureEnabled: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait ChromePictureInPicture extends IPictureInPictureHelper {
    
    @JSName("_$elem")
    var _$elem: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _enterWhenHasMetaData: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var catchException: js.Any = js.native
    
    def isAPIEnabled: Boolean = js.native
    
    def isAPIExist: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MChromePictureInPicture: Boolean = js.native
    
    @JSName("isInPictureInPicture")
    def isInPictureInPicture_MChromePictureInPicture: Boolean = js.native
  }
  
  @js.native
  trait ChromeWebkitHTMLVideo extends HTMLVideoElement {
    
    def requestPictureInPicture(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends ChromePictureInPicture {
    def this(elem: HTMLVideoElement, callback: EventListener) = this()
  }
}
