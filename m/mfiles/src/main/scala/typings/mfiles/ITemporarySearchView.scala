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
    val __obj = js.Dynamic.literal(BaseSearchConditions = BaseSearchConditions.asInstanceOf[js.Any], SearchCriteria = SearchCriteria.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemporarySearchView]
  }
}

