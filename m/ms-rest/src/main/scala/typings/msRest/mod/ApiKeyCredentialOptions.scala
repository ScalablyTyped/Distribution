package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyCredentialOptions extends js.Object {
  /**
    * @property {object} [inHeader]  A key value pair of the header parameters that need to be applied to the request.
    */
  var inHeader: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * @property {object} [inQuery]   A key value pair of the query parameters that need to be applied to the request.
    */
  var inQuery: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ApiKeyCredentialOptions {
  @scala.inline
  def apply(inHeader: StringDictionary[js.Any] = null, inQuery: StringDictionary[js.Any] = null): ApiKeyCredentialOptions = {
    val __obj = js.Dynamic.literal()
    if (inHeader != null) __obj.updateDynamic("inHeader")(inHeader.asInstanceOf[js.Any])
    if (inQuery != null) __obj.updateDynamic("inQuery")(inQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyCredentialOptions]
  }
}

