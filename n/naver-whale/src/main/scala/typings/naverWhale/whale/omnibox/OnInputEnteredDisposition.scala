package typings.naverWhale.whale.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naverWhale.naverWhaleStrings.currentTab
  - typings.naverWhale.naverWhaleStrings.newForegroundTab
  - typings.naverWhale.naverWhaleStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typings.naverWhale.naverWhaleStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typings.naverWhale.naverWhaleStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typings.naverWhale.naverWhaleStrings.newForegroundTab = this.cast("newForegroundTab")
}

