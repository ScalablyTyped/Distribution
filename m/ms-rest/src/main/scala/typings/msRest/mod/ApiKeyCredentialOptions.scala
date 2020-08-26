package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyCredentialOptions extends js.Object {
  /**
    * @property {object} [inHeader]  A key value pair of the header parameters that need to be applied to the request.
    */
  var inHeader: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * @property {object} [inQuery]   A key value pair of the query parameters that need to be applied to the request.
    */
  var inQuery: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ApiKeyCredentialOptions {
  @scala.inline
  def apply(): ApiKeyCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyCredentialOptions]
  }
  @scala.inline
  implicit class ApiKeyCredentialOptionsOps[Self <: ApiKeyCredentialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInHeader(value: StringDictionary[js.Any]): Self = this.set("inHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInHeader: Self = this.set("inHeader", js.undefined)
    @scala.inline
    def setInQuery(value: StringDictionary[js.Any]): Self = this.set("inQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInQuery: Self = this.set("inQuery", js.undefined)
  }
  
}

