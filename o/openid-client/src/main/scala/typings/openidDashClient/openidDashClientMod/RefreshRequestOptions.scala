package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshRequestOptions extends js.Object {
  val clientAssertionPayload: js.UndefOr[StringDictionary[String]] = js.undefined
  val exchangeBody: js.UndefOr[StringDictionary[String]] = js.undefined
}

object RefreshRequestOptions {
  @scala.inline
  def apply(
    clientAssertionPayload: StringDictionary[String] = null,
    exchangeBody: StringDictionary[String] = null
  ): RefreshRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (clientAssertionPayload != null) __obj.updateDynamic("clientAssertionPayload")(clientAssertionPayload)
    if (exchangeBody != null) __obj.updateDynamic("exchangeBody")(exchangeBody)
    __obj.asInstanceOf[RefreshRequestOptions]
  }
}

