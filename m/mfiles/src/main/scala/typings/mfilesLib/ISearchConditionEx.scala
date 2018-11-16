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

