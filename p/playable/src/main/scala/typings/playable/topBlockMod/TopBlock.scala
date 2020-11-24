package typings.playable.topBlockMod

import typings.playable.topBlockTypesMod.ITopBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopBlock extends ITopBlock {
  
  var _bindViewCallbacks: js.Any = js.native
  
  var _getElements: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _isBlockFocused: js.Any = js.native
  
  var _removeFocusState: js.Any = js.native
  
  var _setFocusState: js.Any = js.native
  
  @JSName("isFocused")
  def isFocused_MTopBlock: Boolean = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typings.playable.topBlockViewMod.default = js.native
}
