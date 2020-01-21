package typings.ngTable.groupingFuncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupingFunc[T] extends js.Object {
  /**
    * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
    */
  var sortDirection: js.UndefOr[GroupSort] = js.native
  var title: js.UndefOr[String] = js.native
  def apply(item: T): String = js.native
}

