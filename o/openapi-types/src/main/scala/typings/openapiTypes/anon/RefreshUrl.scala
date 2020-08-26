package typings.openapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshUrl extends js.Object {
  var refreshUrl: js.UndefOr[String] = js.native
  var scopes: StringDictionary[String] = js.native
  var tokenUrl: String = js.native
}

object RefreshUrl {
  @scala.inline
  def apply(scopes: StringDictionary[String], tokenUrl: String): RefreshUrl = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshUrl]
  }
  @scala.inline
  implicit class RefreshUrlOps[Self <: RefreshUrl] (val x: Self) extends AnyVal {
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
    def setScopes(value: StringDictionary[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshUrl(value: String): Self = this.set("refreshUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshUrl: Self = this.set("refreshUrl", js.undefined)
  }
  
}

