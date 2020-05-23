package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallerOptions extends js.Object {
  var defaultPlatform: String
  var normalizeNames: Boolean
  var normalizeNamesAs: NormalizeNamesAs
  var normalizeValues: Boolean
  var percentsToInts: Boolean
  var portraitUrlTemplate: String
  var requestOptions: RequestOptions
}

object CallerOptions {
  @scala.inline
  def apply(
    defaultPlatform: String,
    normalizeNames: Boolean,
    normalizeNamesAs: NormalizeNamesAs,
    normalizeValues: Boolean,
    percentsToInts: Boolean,
    portraitUrlTemplate: String,
    requestOptions: RequestOptions
  ): CallerOptions = {
    val __obj = js.Dynamic.literal(defaultPlatform = defaultPlatform.asInstanceOf[js.Any], normalizeNames = normalizeNames.asInstanceOf[js.Any], normalizeNamesAs = normalizeNamesAs.asInstanceOf[js.Any], normalizeValues = normalizeValues.asInstanceOf[js.Any], percentsToInts = percentsToInts.asInstanceOf[js.Any], portraitUrlTemplate = portraitUrlTemplate.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerOptions]
  }
}

