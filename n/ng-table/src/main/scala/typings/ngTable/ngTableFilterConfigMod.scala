package typings.ngTable

import typings.angular.mod.IServiceProvider
import typings.angular.mod.auto.IInjectorService
import typings.ngTable.publicInterfacesMod.IFilterConfigValues
import typings.ngTable.publicInterfacesMod.IFilterTemplateDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableFilterConfigMod {
  
  @JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig")
  @js.native
  class NgTableFilterConfig protected () extends StObject {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
    
    /**
      * Readonly copy of the final values used to configure the service.
      */
    val config: IFilterConfigValues = js.native
    
    /**
      * Return the url of the html filter template for the supplied definition and key.
      * For more information see the documentation for {@link IFilterTemplateMap}
      */
    def getTemplateUrl(filterDef: String): String = js.native
    def getTemplateUrl(filterDef: String, filterKey: String): String = js.native
    def getTemplateUrl(filterDef: IFilterTemplateDef): String = js.native
    def getTemplateUrl(filterDef: IFilterTemplateDef, filterKey: String): String = js.native
    
    /**
      * Return the url of the html filter template registered with the alias supplied
      */
    def getUrlForAlias(aliasName: String): String = js.native
    def getUrlForAlias(aliasName: String, filterKey: String): String = js.native
  }
  /* static members */
  object NgTableFilterConfig {
    
    @JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider")
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends StObject
       with IServiceProvider {
    def this($injector: IInjectorService) = this()
    
    /* CompleteClass */
    @JSName("$get")
    var $get: js.Any = js.native
    @JSName("$get")
    def $get_MNgTableFilterConfigProvider(): NgTableFilterConfig = js.native
    
    var config: js.Any = js.native
    
    var defaultConfig: js.Any = js.native
    
    /**
      * Reset back to factory defaults the config values that `NgTableFilterConfig` service will use
      */
    def resetConfigs(): Unit = js.native
    
    /**
      * Set the config values used by `NgTableFilterConfig` service
      */
    def setConfig(customConfig: IFilterConfigValues): Unit = js.native
  }
  /* static members */
  object NgTableFilterConfigProvider {
    
    @JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
}
