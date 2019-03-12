package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchProvider extends js.Object {
  var extFilter: scala.Boolean
  var fieldMap: js.Any
  def evalFilter(): scala.Unit
}

object ISearchProvider {
  @scala.inline
  def apply(evalFilter: () => scala.Unit, extFilter: scala.Boolean, fieldMap: js.Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = js.Any.fromFunction0(evalFilter), extFilter = extFilter, fieldMap = fieldMap)
  
    __obj.asInstanceOf[ISearchProvider]
  }
}

