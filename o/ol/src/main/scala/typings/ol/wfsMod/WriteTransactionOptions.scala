package typings.ol.wfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteTransactionOptions extends js.Object {
  var featureNS: String = js.native
  var featurePrefix: String = js.native
  var featureType: String = js.native
  var gmlOptions: js.UndefOr[typings.ol.gmlbaseMod.Options] = js.native
  var handle: js.UndefOr[String] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
  var nativeElements: js.Array[js.Object] = js.native
  var srsName: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object WriteTransactionOptions {
  @scala.inline
  def apply(featureNS: String, featurePrefix: String, featureType: String, nativeElements: js.Array[js.Object]): WriteTransactionOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTransactionOptions]
  }
  @scala.inline
  implicit class WriteTransactionOptionsOps[Self <: WriteTransactionOptions] (val x: Self) extends AnyVal {
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
    def setNativeElementsVarargs(value: js.Object*): Self = this.set("nativeElements", js.Array(value :_*))
    @scala.inline
    def setNativeElements(value: js.Array[js.Object]): Self = this.set("nativeElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setGmlOptions(value: typings.ol.gmlbaseMod.Options): Self = this.set("gmlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmlOptions: Self = this.set("gmlOptions", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    @scala.inline
    def setSrsName(value: String): Self = this.set("srsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrsName: Self = this.set("srsName", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

