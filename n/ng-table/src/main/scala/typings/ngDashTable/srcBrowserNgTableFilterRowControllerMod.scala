package typings.ngDashTable

import typings.angular.angularMod.IScope
import typings.ngDashTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfig
import typings.ngDashTable.srcBrowserNgTableFilterRowControllerMod.IScopeExtensions
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterTemplateDef
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterTemplateDefMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableFilterRowController", JSImport.Namespace)
@js.native
object srcBrowserNgTableFilterRowControllerMod extends js.Object {
  @js.native
  trait IScopeExtensions extends js.Object {
    def getFilterPlaceholderValue(filterDef: String): String = js.native
    def getFilterPlaceholderValue(filterDef: String, filterKey: String): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef, filterKey: String): String = js.native
  }
  
  @js.native
  class NgTableFilterRowController protected () extends js.Object {
    def this($scope: IScope with IScopeExtensions, ngTableFilterConfig: NgTableFilterConfig) = this()
    var config: NgTableFilterConfig = js.native
    def getFilterCellCss(filter: IFilterTemplateDefMap, layout: String): String = js.native
    def getFilterPlaceholderValue(filterDef: String): String = js.native
    def getFilterPlaceholderValue(filterDef: String, filterKey: String): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef, filterKey: String): String = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterRowController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
}

