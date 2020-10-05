package typings.node.http2Mod

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends js.Object {
  var createConnection: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ this.type, Duplex]] = js.native
  var maxDeflateDynamicTableSize: js.UndefOr[Double] = js.native
  var maxHeaderListPairs: js.UndefOr[Double] = js.native
  var maxOutstandingPings: js.UndefOr[Double] = js.native
  var maxSendHeaderBlockLength: js.UndefOr[Double] = js.native
  var maxSessionMemory: js.UndefOr[Double] = js.native
  var paddingStrategy: js.UndefOr[Double] = js.native
  var peerMaxConcurrentStreams: js.UndefOr[Double] = js.native
  var selectPadding: js.UndefOr[js.Function2[/* frameLen */ Double, /* maxFrameLen */ Double, Double]] = js.native
  var settings: js.UndefOr[Settings] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
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
    def setCreateConnection(value: (/* authority */ URL_, SessionOptions) => Duplex): Self = this.set("createConnection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateConnection: Self = this.set("createConnection", js.undefined)
    @scala.inline
    def setMaxDeflateDynamicTableSize(value: Double): Self = this.set("maxDeflateDynamicTableSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeflateDynamicTableSize: Self = this.set("maxDeflateDynamicTableSize", js.undefined)
    @scala.inline
    def setMaxHeaderListPairs(value: Double): Self = this.set("maxHeaderListPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeaderListPairs: Self = this.set("maxHeaderListPairs", js.undefined)
    @scala.inline
    def setMaxOutstandingPings(value: Double): Self = this.set("maxOutstandingPings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOutstandingPings: Self = this.set("maxOutstandingPings", js.undefined)
    @scala.inline
    def setMaxSendHeaderBlockLength(value: Double): Self = this.set("maxSendHeaderBlockLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSendHeaderBlockLength: Self = this.set("maxSendHeaderBlockLength", js.undefined)
    @scala.inline
    def setMaxSessionMemory(value: Double): Self = this.set("maxSessionMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSessionMemory: Self = this.set("maxSessionMemory", js.undefined)
    @scala.inline
    def setPaddingStrategy(value: Double): Self = this.set("paddingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingStrategy: Self = this.set("paddingStrategy", js.undefined)
    @scala.inline
    def setPeerMaxConcurrentStreams(value: Double): Self = this.set("peerMaxConcurrentStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerMaxConcurrentStreams: Self = this.set("peerMaxConcurrentStreams", js.undefined)
    @scala.inline
    def setSelectPadding(value: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double): Self = this.set("selectPadding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelectPadding: Self = this.set("selectPadding", js.undefined)
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

