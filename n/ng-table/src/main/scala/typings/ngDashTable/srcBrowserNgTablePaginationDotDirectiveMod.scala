package typings.ngDashTable

import typings.angular.JQLite
import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.ICompileService
import typings.angular.angularMod.IController
import typings.angular.angularMod.IDirective
import typings.angular.angularMod.IDocumentService
import typings.angular.angularMod.IScope
import typings.ngDashTable.srcCoreMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTablePagination.directive", JSImport.Namespace)
@js.native
object srcBrowserNgTablePaginationDotDirectiveMod extends js.Object {
  def ngTablePagination[T]($compile: ICompileService, $document: IDocumentService, ngTableEventsChannel: NgTableEventsChannel): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}

