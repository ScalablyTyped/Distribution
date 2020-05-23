package typings.octokitPluginRestEndpointMethods.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointDecorations extends js.Object {
  var deprecated: js.UndefOr[String] = js.undefined
  var mapToData: js.UndefOr[String] = js.undefined
  var renamed: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var renamedParameters: js.UndefOr[StringDictionary[String]] = js.undefined
}

object EndpointDecorations {
  @scala.inline
  def apply(
    deprecated: String = null,
    mapToData: String = null,
    renamed: js.Tuple2[String, String] = null,
    renamedParameters: StringDictionary[String] = null
  ): EndpointDecorations = {
    val __obj = js.Dynamic.literal()
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (mapToData != null) __obj.updateDynamic("mapToData")(mapToData.asInstanceOf[js.Any])
    if (renamed != null) __obj.updateDynamic("renamed")(renamed.asInstanceOf[js.Any])
    if (renamedParameters != null) __obj.updateDynamic("renamedParameters")(renamedParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDecorations]
  }
}

