package typings.ngTable.ngTableSelectFilterDsDirectiveMod

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableSelectFilterDs.directive", "ngTableSelectFilterDs")
@js.native
object ngTableSelectFilterDs extends js.Object {
  /**
    * Takes the array returned by $column.filterData and makes it available as `$selectData` on the `$scope`.
    *
    * The resulting `$selectData` array will contain an extra item that is suitable to represent the user
    * "deselecting" an item from a `<select>` tag
    *
    * This directive is is focused on providing a datasource to an `ngOptions` directive
    */
  def apply(): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}

