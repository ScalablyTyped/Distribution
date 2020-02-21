package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkingMetadata extends js.Object {
  /**
    * The entity ID returned in the connect reply as entity_guid
    */
  @JSName("entity.guid")
  var entityDotguid: js.UndefOr[String] = js.undefined
  /**
    * The application name specified in the connect request as
    * app_name. If multiple application names are specified this will only be
    * the first name
    */
  @JSName("entity.name")
  var entityDotname: String
  /**
    * The string "SERVICE"
    */
  @JSName("entity.type")
  var entityDottype: String
  /**
    * The hostname as specified in the connect request as
    * utilization.full_hostname. If utilization.full_hostname is null or empty,
    * this will be the hostname specified in the connect request as host.
    */
  var hostname: String
  /**
    * The current span ID
    */
  @JSName("span.id")
  var spanDotid: js.UndefOr[String] = js.undefined
  /**
    * The current trace ID
    */
  @JSName("trace.id")
  var traceDotid: js.UndefOr[String] = js.undefined
}

object LinkingMetadata {
  @scala.inline
  def apply(
    entityDotname: String,
    entityDottype: String,
    hostname: String,
    entityDotguid: String = null,
    spanDotid: String = null,
    traceDotid: String = null
  ): LinkingMetadata = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.updateDynamic("entity.name")(entityDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("entity.type")(entityDottype.asInstanceOf[js.Any])
    if (entityDotguid != null) __obj.updateDynamic("entity.guid")(entityDotguid.asInstanceOf[js.Any])
    if (spanDotid != null) __obj.updateDynamic("span.id")(spanDotid.asInstanceOf[js.Any])
    if (traceDotid != null) __obj.updateDynamic("trace.id")(traceDotid.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkingMetadata]
  }
}

