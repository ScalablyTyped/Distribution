package typings.octokitRest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentationurl extends js.Object {
  var documentation_url: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[AnonCode]] = js.undefined
  var headers: StringDictionary[String]
  var status: Double
}

object AnonDocumentationurl {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    status: Double,
    documentation_url: String = null,
    errors: js.Array[AnonCode] = null
  ): AnonDocumentationurl = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (documentation_url != null) __obj.updateDynamic("documentation_url")(documentation_url.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentationurl]
  }
}

