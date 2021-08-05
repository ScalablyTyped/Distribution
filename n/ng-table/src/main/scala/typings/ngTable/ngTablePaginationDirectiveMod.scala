package typings.ngTable

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.ICompileService
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IDocumentService
import typings.angular.mod.IScope
import typings.ngTable.coreMod.NgTableEventsChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTablePaginationDirectiveMod {
  
  @JSImport("ng-table/src/browser/ngTablePagination.directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngTablePagination[T]($compile: ICompileService, $document: IDocumentService, ngTableEventsChannel: NgTableEventsChannel): IDirective[IScope, JQLite, IAttributes, IController] = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTablePagination")($compile.asInstanceOf[js.Any], $document.asInstanceOf[js.Any], ngTableEventsChannel.asInstanceOf[js.Any])).asInstanceOf[IDirective[IScope, JQLite, IAttributes, IController]]
}
