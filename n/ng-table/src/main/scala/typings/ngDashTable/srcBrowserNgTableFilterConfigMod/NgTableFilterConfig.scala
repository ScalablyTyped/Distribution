package typings.ngDashTable.srcBrowserNgTableFilterConfigMod

import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterConfigValues
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterTemplateDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig")
@js.native
class NgTableFilterConfig protected () extends js.Object {
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
@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfig")
@js.native
object NgTableFilterConfig extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

