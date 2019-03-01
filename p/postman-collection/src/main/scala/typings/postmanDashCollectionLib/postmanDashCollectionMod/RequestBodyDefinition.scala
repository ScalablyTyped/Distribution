package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBodyDefinition extends PropertyBaseDefinition {
  var file: js.UndefOr[java.lang.String | postmanDashCollectionLib.Anon_SrcString] = js.undefined
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.undefined
  var mode: java.lang.String
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String] = js.undefined
}

object RequestBodyDefinition {
  @scala.inline
  def apply(
    mode: java.lang.String,
    description: java.lang.String | DescriptionDefinition = null,
    file: java.lang.String | postmanDashCollectionLib.Anon_SrcString = null,
    formdata: js.Array[FormParamDefinition] | PropertyList[FormParam] = null,
    raw: java.lang.String = null,
    urlencoded: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String = null
  ): RequestBodyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (formdata != null) __obj.updateDynamic("formdata")(formdata.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (urlencoded != null) __obj.updateDynamic("urlencoded")(urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyDefinition]
  }
}

