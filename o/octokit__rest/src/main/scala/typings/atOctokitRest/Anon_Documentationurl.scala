package typings.atOctokitRest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Documentationurl extends js.Object {
  var documentation_url: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[Anon_Code]] = js.undefined
  var headers: StringDictionary[String]
  var status: Double
}

object Anon_Documentationurl {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    status: Double,
    documentation_url: String = null,
    errors: js.Array[Anon_Code] = null
  ): Anon_Documentationurl = {
    val __obj = js.Dynamic.literal(headers = headers, status = status)
    if (documentation_url != null) __obj.updateDynamic("documentation_url")(documentation_url)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Documentationurl]
  }
}

