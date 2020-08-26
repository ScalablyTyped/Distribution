package typings.nodeSsdp.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsdpHeaders
  extends /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | js.Symbol]] {
  /**
    * Available while handling an SSDP response. A URL where the service description can be found.
    */
  var LOCATION: js.UndefOr[String] = js.native
  var ST: js.UndefOr[String] = js.native
  /**
    * Available while handling an SSDP response. The Unique Service Name (USN) of the responding device.
    */
  var USN: js.UndefOr[String] = js.native
}

object SsdpHeaders {
  @scala.inline
  def apply(): SsdpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsdpHeaders]
  }
  @scala.inline
  implicit class SsdpHeadersOps[Self <: SsdpHeaders] (val x: Self) extends AnyVal {
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
    def setLOCATION(value: String): Self = this.set("LOCATION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLOCATION: Self = this.set("LOCATION", js.undefined)
    @scala.inline
    def setST(value: String): Self = this.set("ST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteST: Self = this.set("ST", js.undefined)
    @scala.inline
    def setUSN(value: String): Self = this.set("USN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUSN: Self = this.set("USN", js.undefined)
  }
  
}

