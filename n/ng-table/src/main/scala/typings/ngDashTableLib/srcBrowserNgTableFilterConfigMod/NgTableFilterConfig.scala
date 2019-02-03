package typings
package ngDashTableLib.srcBrowserNgTableFilterConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig")
@js.native
class NgTableFilterConfig protected () extends js.Object {
  def this(/**
    * Readonly copy of the final values used to configure the service.
    */
  config: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IFilterConfigValues) = this()
  /**
    * Readonly copy of the final values used to configure the service.
    */
  val config: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IFilterConfigValues = js.native
  /**
    * Return the url of the html filter template for the supplied definition and key.
    * For more information see the documentation for {@link IFilterTemplateMap}
    */
  def getTemplateUrl(filterDef: java.lang.String): java.lang.String = js.native
  def getTemplateUrl(filterDef: java.lang.String, filterKey: java.lang.String): java.lang.String = js.native
  def getTemplateUrl(filterDef: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IFilterTemplateDef): java.lang.String = js.native
  def getTemplateUrl(
    filterDef: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IFilterTemplateDef,
    filterKey: java.lang.String
  ): java.lang.String = js.native
  /**
    * Return the url of the html filter template registered with the alias supplied
    */
  def getUrlForAlias(aliasName: java.lang.String): java.lang.String = js.native
  def getUrlForAlias(aliasName: java.lang.String, filterKey: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig")
@js.native
object NgTableFilterConfig extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

