package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemporarySearchView extends js.Object {
  val BaseSearchConditions: ISearchConditions
  var SearchCriteria: ISearchCriteria
  val View: IView
}

object ITemporarySearchView {
  @scala.inline
  def apply(BaseSearchConditions: ISearchConditions, SearchCriteria: ISearchCriteria, View: IView): ITemporarySearchView = {
    val __obj = js.Dynamic.literal(BaseSearchConditions = BaseSearchConditions, SearchCriteria = SearchCriteria, View = View)
  
    __obj.asInstanceOf[ITemporarySearchView]
  }
}

