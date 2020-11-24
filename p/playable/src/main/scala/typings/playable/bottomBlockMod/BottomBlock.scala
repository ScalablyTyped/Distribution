package typings.playable.bottomBlockMod

import typings.playable.bottomBlockTypesMod.IBottomBlock
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomBlock extends IBottomBlock {
  
  var _bindEvents: js.Any = js.native
  
  var _bindViewCallbacks: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _getControlElements: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _isBlockFocused: js.Any = js.native
  
  var _removeFocusState: js.Any = js.native
  
  var _setFocusState: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  def addControl(key: String, element: HTMLElement, options: IAddControllOptions): Unit = js.native
  
  /**
    * Method for hiding picture-in-picture control.
    * @example
    * player.hidePictureInPictureControl();
    */
  def hidePictureInPictureControl(): Unit = js.native
  
  @JSName("isFocused")
  def isFocused_MBottomBlock: Boolean = js.native
  
  var isHidden: Boolean = js.native
  
  /**
    * Method for showing picture-in-picture control.
    * @example
    * player.showPictureInPictureControl();
    */
  def showPictureInPictureControl(): Unit = js.native
  
  var view: typings.playable.bottomBlockViewMod.default = js.native
}
