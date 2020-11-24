package typings.postmark.bounceFilteringParametersMod

import typings.postmark.filteringParametersMod.FilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceFilteringParameters")
@js.native
class BounceFilteringParameters protected () extends FilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    `type`: js.UndefOr[BounceType],
    inactive: js.UndefOr[Boolean],
    emailFilter: js.UndefOr[String],
    tag: js.UndefOr[String],
    messageID: js.UndefOr[String],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
  
  var emailFilter: js.UndefOr[String] = js.native
  
  var fromDate: js.UndefOr[String] = js.native
  
  var inactive: js.UndefOr[Boolean] = js.native
  
  var messageID: js.UndefOr[String] = js.native
  
  var messageStream: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var toDate: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[BounceType] = js.native
}
