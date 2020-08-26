package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INewLightsResponse extends /* key */ StringDictionary[String | Name] {
  var lastscan: String = js.native
}

object INewLightsResponse {
  @scala.inline
  def apply(lastscan: String): INewLightsResponse = {
    val __obj = js.Dynamic.literal(lastscan = lastscan.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewLightsResponse]
  }
  @scala.inline
  implicit class INewLightsResponseOps[Self <: INewLightsResponse] (val x: Self) extends AnyVal {
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
    def setLastscan(value: String): Self = this.set("lastscan", value.asInstanceOf[js.Any])
  }
  
}

