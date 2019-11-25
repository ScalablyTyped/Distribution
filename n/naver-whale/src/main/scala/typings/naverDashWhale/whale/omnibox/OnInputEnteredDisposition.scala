package typings.naverDashWhale.whale.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naverDashWhale.naverDashWhaleStrings.currentTab
  - typings.naverDashWhale.naverDashWhaleStrings.newForegroundTab
  - typings.naverDashWhale.naverDashWhaleStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typings.naverDashWhale.naverDashWhaleStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typings.naverDashWhale.naverDashWhaleStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typings.naverDashWhale.naverDashWhaleStrings.newForegroundTab = this.cast("newForegroundTab")
}

