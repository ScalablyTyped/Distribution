package typings.ngTable

import typings.angular.mod.IScope
import typings.ngTable.srcBrowserNgTableFilterConfigMod.NgTableFilterConfig
import typings.ngTable.srcBrowserPublicInterfacesMod.IFilterTemplateDef
import typings.ngTable.srcBrowserPublicInterfacesMod.IFilterTemplateDefMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableFilterRowControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableFilterRowController", "NgTableFilterRowController")
  @js.native
  open class NgTableFilterRowController protected () extends StObject {
    def this($scope: IScope & IScopeExtensions, ngTableFilterConfig: NgTableFilterConfig) = this()
    
    var config: NgTableFilterConfig = js.native
    
    def getFilterCellCss(filter: IFilterTemplateDefMap, layout: String): String = js.native
    
    def getFilterPlaceholderValue(filterDef: String): String = js.native
    def getFilterPlaceholderValue(filterDef: String, filterKey: String): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef, filterKey: String): String = js.native
  }
  /* static members */
  object NgTableFilterRowController {
    
    @JSImport("ng-table/src/browser/ngTableFilterRowController", "NgTableFilterRowController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableFilterRowController", "NgTableFilterRowController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IScopeExtensions extends StObject {
    
    def getFilterPlaceholderValue(filterDef: String): String = js.native
    def getFilterPlaceholderValue(filterDef: String, filterKey: String): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef): String = js.native
    def getFilterPlaceholderValue(filterDef: IFilterTemplateDef, filterKey: String): String = js.native
  }
}
