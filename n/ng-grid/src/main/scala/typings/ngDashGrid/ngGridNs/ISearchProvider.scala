package typings.ngDashGrid.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProvider extends js.Object {
  var extFilter: Boolean
  var fieldMap: js.Any
  def evalFilter(): Unit
}

object ISearchProvider {
  @scala.inline
  def apply(evalFilter: () => Unit, extFilter: Boolean, fieldMap: js.Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = js.Any.fromFunction0(evalFilter), extFilter = extFilter, fieldMap = fieldMap)
  
    __obj.asInstanceOf[ISearchProvider]
  }
}

