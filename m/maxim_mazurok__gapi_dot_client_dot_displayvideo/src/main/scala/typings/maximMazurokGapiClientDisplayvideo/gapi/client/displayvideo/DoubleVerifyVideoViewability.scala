package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerifyVideoViewability extends js.Object {
  
  /** Target inventory to maximize impressions with 400x300 or greater player size. */
  var playerImpressionRate: js.UndefOr[String] = js.native
  
  /** Target web inventory to maximize IAB viewable rate. */
  var videoIab: js.UndefOr[String] = js.native
  
  /** Target web inventory to maximize fully viewable rate. */
  var videoViewableRate: js.UndefOr[String] = js.native
}
object DoubleVerifyVideoViewability {
  
  @scala.inline
  def apply(): DoubleVerifyVideoViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyVideoViewability]
  }
  
  @scala.inline
  implicit class DoubleVerifyVideoViewabilityOps[Self <: DoubleVerifyVideoViewability] (val x: Self) extends AnyVal {
    
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
    def setPlayerImpressionRate(value: String): Self = this.set("playerImpressionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerImpressionRate: Self = this.set("playerImpressionRate", js.undefined)
    
    @scala.inline
    def setVideoIab(value: String): Self = this.set("videoIab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoIab: Self = this.set("videoIab", js.undefined)
    
    @scala.inline
    def setVideoViewableRate(value: String): Self = this.set("videoViewableRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoViewableRate: Self = this.set("videoViewableRate", js.undefined)
  }
}
