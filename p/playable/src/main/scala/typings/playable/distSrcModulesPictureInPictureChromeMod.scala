package typings.playable

import typings.playable.distSrcModulesPictureInPictureTypesMod.IPictureInPictureHelper
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Element
import typings.std.EventListener
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPictureInPictureChromeMod {
  
  @JSImport("playable/dist/src/modules/picture-in-picture/chrome", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ChromePictureInPicture {
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
  
  @js.native
  trait ChromeDocument
    extends StObject
       with Document {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    @JSName("pictureInPictureElement")
    var pictureInPictureElement_ChromeDocument: Element = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  @js.native
  trait ChromePictureInPicture
    extends StObject
       with IPictureInPictureHelper {
    
    /* private */ @JSName("_$elem")
    var _$elem: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _enterWhenHasMetaData: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* private */ var catchException: Any = js.native
    
    def isAPIEnabled: Boolean = js.native
    
    def isAPIExist: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MChromePictureInPicture: Boolean = js.native
    
    @JSName("isInPictureInPicture")
    def isInPictureInPicture_MChromePictureInPicture: Boolean = js.native
  }
  
  @js.native
  trait ChromeWebkitHTMLVideo
    extends StObject
       with HTMLVideoElement {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
