package typings.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.metismenu.metismenuStrings.showDOTmetisMenu
  - typings.metismenu.metismenuStrings.shownDOTmetisMenu
  - typings.metismenu.metismenuStrings.hideDOTmetisMenu
  - typings.metismenu.metismenuStrings.hiddenDOTmetisMenu
*/
trait MetisMenuEvents extends js.Object

object MetisMenuEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenDOTmetisMenu: typings.metismenu.metismenuStrings.hiddenDOTmetisMenu = this.cast("hidden.metisMenu")
  @scala.inline
  def hideDOTmetisMenu: typings.metismenu.metismenuStrings.hideDOTmetisMenu = this.cast("hide.metisMenu")
  @scala.inline
  def showDOTmetisMenu: typings.metismenu.metismenuStrings.showDOTmetisMenu = this.cast("show.metisMenu")
  @scala.inline
  def shownDOTmetisMenu: typings.metismenu.metismenuStrings.shownDOTmetisMenu = this.cast("shown.metisMenu")
}

