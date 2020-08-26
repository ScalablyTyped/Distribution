package typings.openlayers.mod.olx.format

import typings.openlayers.mod.GlobalObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFSWriteTransactionOptions extends js.Object {
  var featureNS: String = js.native
  var featurePrefix: String = js.native
  var featureType: String = js.native
  var gmlOptions: js.UndefOr[GMLOptions] = js.native
  var handle: js.UndefOr[String] = js.native
  var nativeElements: js.Array[GlobalObject] = js.native
  var srsName: js.UndefOr[String] = js.native
}

object WFSWriteTransactionOptions {
  @scala.inline
  def apply(
    featureNS: String,
    featurePrefix: String,
    featureType: String,
    nativeElements: js.Array[GlobalObject]
  ): WFSWriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteTransactionOptions]
  }
  @scala.inline
  implicit class WFSWriteTransactionOptionsOps[Self <: WFSWriteTransactionOptions] (val x: Self) extends AnyVal {
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
    def setFeatureNS(value: String): Self = this.set("featureNS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeaturePrefix(value: String): Self = this.set("featurePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatureType(value: String): Self = this.set("featureType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeElementsVarargs(value: GlobalObject*): Self = this.set("nativeElements", js.Array(value :_*))
    @scala.inline
    def setNativeElements(value: js.Array[GlobalObject]): Self = this.set("nativeElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setGmlOptions(value: GMLOptions): Self = this.set("gmlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmlOptions: Self = this.set("gmlOptions", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setSrsName(value: String): Self = this.set("srsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrsName: Self = this.set("srsName", js.undefined)
  }
  
}

