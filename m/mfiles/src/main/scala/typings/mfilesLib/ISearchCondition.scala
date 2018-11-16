package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISearchCondition extends js.Object {
  var ConditionType: mfilesLib.MFilesNs.MFConditionType
  var Expression: IExpression
  var TypedValue: ITypedValue
  def Clone(): ISearchCondition
  def Set(
    Expression: IExpression,
    ConditionType: mfilesLib.MFilesNs.MFConditionType,
    TypedValue: ITypedValue
  ): scala.Unit
}

