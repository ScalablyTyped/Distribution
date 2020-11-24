package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SampleFilter extends js.Object {
  
  /** Restricts the set of playable locations to just the [types](/maps/documentation/gaming/tt/types) that you want. */
  var includedTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the maximum number of playable locations to return. This value must not be greater than 1000. The default value is 100. Only the top-ranking playable locations are
    * returned.
    */
  var maxLocationCount: js.UndefOr[Double] = js.native
  
  /** A set of options that control the spacing between playable locations. By default the minimum distance between locations is 200m. */
  var spacing: js.UndefOr[GoogleMapsPlayablelocationsV3SampleSpacingOptions] = js.native
}
object GoogleMapsPlayablelocationsV3SampleFilter {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SampleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SampleFilter]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SampleFilterOps[Self <: GoogleMapsPlayablelocationsV3SampleFilter] (val x: Self) extends AnyVal {
    
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
    def setIncludedTypesVarargs(value: String*): Self = this.set("includedTypes", js.Array(value :_*))
    
    @scala.inline
    def setIncludedTypes(value: js.Array[String]): Self = this.set("includedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedTypes: Self = this.set("includedTypes", js.undefined)
    
    @scala.inline
    def setMaxLocationCount(value: Double): Self = this.set("maxLocationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLocationCount: Self = this.set("maxLocationCount", js.undefined)
    
    @scala.inline
    def setSpacing(value: GoogleMapsPlayablelocationsV3SampleSpacingOptions): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
}
