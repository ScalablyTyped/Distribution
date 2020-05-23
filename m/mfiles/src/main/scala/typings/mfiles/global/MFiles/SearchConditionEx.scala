package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ISearchCondition
import typings.mfiles.ISearchConditionEx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchConditionEx")
@js.native
class SearchConditionEx () extends ISearchConditionEx {
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var Ignored: Boolean = js.native
  /* CompleteClass */
  override var SearchCondition: ISearchCondition = js.native
  /* CompleteClass */
  override var SpecialNULL: Boolean = js.native
  /* CompleteClass */
  override def Clone(): ISearchConditionEx = js.native
  /* CompleteClass */
  override def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit = js.native
}

@JSGlobal("MFiles.SearchConditionEx")
@js.native
object SearchConditionEx extends Instantiable0[ISearchConditionEx]

