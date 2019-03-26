package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchCondition")
@js.native
class SearchCondition ()
  extends mfilesLib.ISearchCondition {
  /* CompleteClass */
  override var ConditionType: MFConditionType = js.native
  /* CompleteClass */
  override var Expression: mfilesLib.IExpression = js.native
  /* CompleteClass */
  override var TypedValue: mfilesLib.ITypedValue = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISearchCondition = js.native
  /* CompleteClass */
  override def Set(
    Expression: mfilesLib.IExpression,
    ConditionType: MFConditionType,
    TypedValue: mfilesLib.ITypedValue
  ): scala.Unit = js.native
}

