package typings.ngTable

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IParseService
import typings.angular.mod.IQService
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableDotdirectiveMod {
  
  @JSImport("ng-table/src/browser/ngTable.directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngTable($q: IQService, $parse: IParseService): IDirective[IScope, JQLite, IAttributes, IController] = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTable")($q.asInstanceOf[js.Any], $parse.asInstanceOf[js.Any])).asInstanceOf[IDirective[IScope, JQLite, IAttributes, IController]]
}
