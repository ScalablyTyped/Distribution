package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleInfo extends js.Object {
  // A name representing the user's locale in natural language, for example, 'English (United States)'.
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * A locale representation for the user, which includes the user's preferred language and country/region. For example,
    * 'en-us'. The language component follows 2-letter codes as defined in ISO 639-1, and the country component follows
    * 2-letter codes as defined in ISO 3166-1 alpha-2.
    */
  var locale: js.UndefOr[String] = js.undefined
}

object LocaleInfo {
  @scala.inline
  def apply(displayName: String = null, locale: String = null): LocaleInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[LocaleInfo]
  }
}

