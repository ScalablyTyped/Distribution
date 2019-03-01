package typings
package ngDashTableLib.srcCoreGroupingGroupingFuncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupingFunc[T] extends Grouping[T] {
  /**
    * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
    */
  var sortDirection: js.UndefOr[GroupSort] = js.native
  var title: js.UndefOr[java.lang.String] = js.native
  def apply(item: T): java.lang.String = js.native
}

