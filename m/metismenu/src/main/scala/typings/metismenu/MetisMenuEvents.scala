package typings.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.metismenu.metismenuStrings.showDotmetisMenu
  - typings.metismenu.metismenuStrings.shownDotmetisMenu
  - typings.metismenu.metismenuStrings.hideDotmetisMenu
  - typings.metismenu.metismenuStrings.hiddenDotmetisMenu
*/
trait MetisMenuEvents extends js.Object

object MetisMenuEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDotmetisMenu: typings.metismenu.metismenuStrings.hiddenDotmetisMenu = this.cast("hidden.metisMenu")
  @scala.inline
  def hideDotmetisMenu: typings.metismenu.metismenuStrings.hideDotmetisMenu = this.cast("hide.metisMenu")
  @scala.inline
  def showDotmetisMenu: typings.metismenu.metismenuStrings.showDotmetisMenu = this.cast("show.metisMenu")
  @scala.inline
  def shownDotmetisMenu: typings.metismenu.metismenuStrings.shownDotmetisMenu = this.cast("shown.metisMenu")
}

