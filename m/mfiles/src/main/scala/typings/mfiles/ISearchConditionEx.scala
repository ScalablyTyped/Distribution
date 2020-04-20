package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchConditionEx extends js.Object {
  var Enabled: Boolean
  var Ignored: Boolean
  var SearchCondition: ISearchCondition
  var SpecialNULL: Boolean
  def Clone(): ISearchConditionEx
  def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit
}

object ISearchConditionEx {
  @scala.inline
  def apply(
    Clone: () => ISearchConditionEx,
    Enabled: Boolean,
    Ignored: Boolean,
    SearchCondition: ISearchCondition,
    Set: (ISearchCondition, Boolean, Boolean, Boolean) => Unit,
    SpecialNULL: Boolean
  ): ISearchConditionEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Enabled = Enabled.asInstanceOf[js.Any], Ignored = Ignored.asInstanceOf[js.Any], SearchCondition = SearchCondition.asInstanceOf[js.Any], Set = js.Any.fromFunction4(Set), SpecialNULL = SpecialNULL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchConditionEx]
  }
}

