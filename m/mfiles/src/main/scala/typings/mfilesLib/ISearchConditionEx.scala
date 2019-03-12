package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchConditionEx extends js.Object {
  var Enabled: scala.Boolean
  var Ignored: scala.Boolean
  var SearchCondition: ISearchCondition
  var SpecialNULL: scala.Boolean
  def Clone(): ISearchConditionEx
  def Set(
    SearchCondition: ISearchCondition,
    Enabled: scala.Boolean,
    SpecialNULL: scala.Boolean,
    Ignored: scala.Boolean
  ): scala.Unit
}

object ISearchConditionEx {
  @scala.inline
  def apply(
    Clone: () => ISearchConditionEx,
    Enabled: scala.Boolean,
    Ignored: scala.Boolean,
    SearchCondition: ISearchCondition,
    Set: (ISearchCondition, scala.Boolean, scala.Boolean, scala.Boolean) => scala.Unit,
    SpecialNULL: scala.Boolean
  ): ISearchConditionEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Enabled = Enabled, Ignored = Ignored, SearchCondition = SearchCondition, Set = js.Any.fromFunction4(Set), SpecialNULL = SpecialNULL)
  
    __obj.asInstanceOf[ISearchConditionEx]
  }
}

