package typings.mithril.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mithril.mithril.JsonpOptions & {  url :string} */
@js.native
trait JsonpOptionsurlstring extends js.Object {
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.native
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[js.Any] = js.native
  /** The name of the querystring parameter name that specifies the callback name. */
  var callbackKey: js.UndefOr[String] = js.native
  /** The name of the function that will be called as the callback. */
  var callbackName: js.UndefOr[String] = js.native
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.native
  var url: String = js.native
}

object JsonpOptionsurlstring {
  @scala.inline
  def apply(url: String): JsonpOptionsurlstring = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpOptionsurlstring]
  }
  @scala.inline
  implicit class JsonpOptionsurlstringOps[Self <: JsonpOptionsurlstring] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCallbackKey(value: String): Self = this.set("callbackKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackKey: Self = this.set("callbackKey", js.undefined)
    @scala.inline
    def setCallbackName(value: String): Self = this.set("callbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackName: Self = this.set("callbackName", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setType(value: Instantiable1[/* o */ js.Any, js.Any]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

