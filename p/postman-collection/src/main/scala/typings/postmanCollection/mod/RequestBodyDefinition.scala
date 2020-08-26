package typings.postmanCollection.mod

import typings.postmanCollection.anon.SrcString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestBodyDefinition extends PropertyBaseDefinition {
  var file: js.UndefOr[String | SrcString] = js.native
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.native
  var mode: String = js.native
  var raw: js.UndefOr[String] = js.native
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
}

object RequestBodyDefinition {
  @scala.inline
  def apply(mode: String): RequestBodyDefinition = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyDefinition]
  }
  @scala.inline
  implicit class RequestBodyDefinitionOps[Self <: RequestBodyDefinition] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String | SrcString): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFormdataVarargs(value: FormParamDefinition*): Self = this.set("formdata", js.Array(value :_*))
    @scala.inline
    def setFormdata(value: js.Array[FormParamDefinition] | PropertyList[FormParam]): Self = this.set("formdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormdata: Self = this.set("formdata", js.undefined)
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setUrlencodedVarargs(value: QueryParamDefinition*): Self = this.set("urlencoded", js.Array(value :_*))
    @scala.inline
    def setUrlencoded(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = this.set("urlencoded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlencoded: Self = this.set("urlencoded", js.undefined)
  }
  
}

