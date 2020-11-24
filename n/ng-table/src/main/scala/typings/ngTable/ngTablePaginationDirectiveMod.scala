package typings.ngTable

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.ICompileService
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IDocumentService
import typings.angular.mod.IScope
import typings.ngTable.coreMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/browser/ngTablePagination.directive", JSImport.Namespace)
@js.native
object ngTablePaginationDirectiveMod extends js.Object {
  
  def ngTablePagination[T]($compile: ICompileService, $document: IDocumentService, ngTableEventsChannel: NgTableEventsChannel): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}
