package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentSettings extends js.Object {
  
  /** Required. Create an individual segment file. The default is `false`. */
  var individualSegments: js.UndefOr[Boolean] = js.native
  
  /** Duration of the segments in seconds. The default is `"6.0s"`. */
  var segmentDuration: js.UndefOr[String] = js.native
}
object SegmentSettings {
  
  @scala.inline
  def apply(): SegmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSettings]
  }
  
  @scala.inline
  implicit class SegmentSettingsOps[Self <: SegmentSettings] (val x: Self) extends AnyVal {
    
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
    def setIndividualSegments(value: Boolean): Self = this.set("individualSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualSegments: Self = this.set("individualSegments", js.undefined)
    
    @scala.inline
    def setSegmentDuration(value: String): Self = this.set("segmentDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentDuration: Self = this.set("segmentDuration", js.undefined)
  }
}
