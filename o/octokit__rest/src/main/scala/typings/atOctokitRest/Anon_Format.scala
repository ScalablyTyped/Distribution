package typings.atOctokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  /**
    * `json` by default. Can be `raw`, `text`, `html`, `full`, `diff`, `patch`, `sha`, `base64`. Depending on endpoint
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Custom media type names of {@link https://developer.github.com/v3/media/|API Previews} without the `-preview` suffix.
    * Example for single preview: `['squirrel-girl']`.
    * Example for multiple previews: `['squirrel-girl', 'mister-fantastic']`.
    */
  var previews: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: String = null, previews: js.Array[String] = null): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (previews != null) __obj.updateDynamic("previews")(previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

