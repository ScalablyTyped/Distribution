package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentSettings extends StObject {
  
  /** Required. Create an individual segment file. The default is `false`. */
  var individualSegments: js.UndefOr[Boolean] = js.undefined
  
  /** Duration of the segments in seconds. The default is `"6.0s"`. */
  var segmentDuration: js.UndefOr[String] = js.undefined
}
object SegmentSettings {
  
  @scala.inline
  def apply(): SegmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSettings]
  }
  
  @scala.inline
  implicit class SegmentSettingsMutableBuilder[Self <: SegmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndividualSegments(value: Boolean): Self = StObject.set(x, "individualSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualSegmentsUndefined: Self = StObject.set(x, "individualSegments", js.undefined)
    
    @scala.inline
    def setSegmentDuration(value: String): Self = StObject.set(x, "segmentDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDurationUndefined: Self = StObject.set(x, "segmentDuration", js.undefined)
  }
}
