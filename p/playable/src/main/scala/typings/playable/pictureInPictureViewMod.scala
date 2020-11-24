package typings.playable

import typings.playable.controlsPictureInPictureTypesMod.IPictureInPictureViewConfig
import typings.playable.controlsPictureInPictureTypesMod.IPictureInPictureViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture.view", JSImport.Namespace)
@js.native
object pictureInPictureViewMod extends js.Object {
  
  @js.native
  trait PictureInPictureView
    extends typings.playable.stylableMod.default[IPictureInPictureViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$togglePictureInPictureControl")
    var _$togglePictureInPictureControl: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPictureInPictureState(isPictureInPicture: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class default protected () extends PictureInPictureView {
    def this(config: IPictureInPictureViewConfig) = this()
  }
}
