package typings.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "OutboundMessageTrackingFilteringParameters")
@js.native
class OutboundMessageTrackingFilteringParameters protected ()
  extends typings.postmark.messageFilteringParametersMod.OutboundMessageTrackingFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    recipient: js.UndefOr[String],
    tag: js.UndefOr[String],
    client_name: js.UndefOr[String],
    client_company: js.UndefOr[String],
    client_family: js.UndefOr[String],
    os_name: js.UndefOr[String],
    os_family: js.UndefOr[String],
    os_company: js.UndefOr[String],
    platform: js.UndefOr[String],
    country: js.UndefOr[String],
    region: js.UndefOr[String],
    city: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}
