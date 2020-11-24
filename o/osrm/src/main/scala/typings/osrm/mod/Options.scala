package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Limits the search to segments with given bearing in degrees towards true north in clockwise direction. Null or array with [{value},{range}]
    */
  var bearings: js.UndefOr[js.Array[Bearing] | Null] = js.native
  
  /**
    * The coordinates this request will use. Array with [{lon},{lat}] values, in decimal degrees.
    */
  var coordinates: js.UndefOr[js.Array[Coordinate]] = js.native
  
  /**
    * Adds a Hint to the response which can be used in subsequent requests, see hints parameter.
    */
  var generate_hints: js.UndefOr[Boolean] = js.native
  
  /**
    * Hint to derive position in street network. Base64 string
    */
  var hints: js.UndefOr[js.Array[Hint]] = js.native
  
  /**
    * Limits the search to given radius in meters. null or double >= 0 or unlimited (default)
    */
  var radiuses: js.UndefOr[js.Array[Radius] | Null] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBearingsVarargs(value: Bearing*): Self = this.set("bearings", js.Array(value :_*))
    
    @scala.inline
    def setBearings(value: js.Array[Bearing]): Self = this.set("bearings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearings: Self = this.set("bearings", js.undefined)
    
    @scala.inline
    def setBearingsNull: Self = this.set("bearings", null)
    
    @scala.inline
    def setCoordinatesVarargs(value: Coordinate*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[Coordinate]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setGenerate_hints(value: Boolean): Self = this.set("generate_hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerate_hints: Self = this.set("generate_hints", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: Hint*): Self = this.set("hints", js.Array(value :_*))
    
    @scala.inline
    def setHints(value: js.Array[Hint]): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setRadiusesVarargs(value: Radius*): Self = this.set("radiuses", js.Array(value :_*))
    
    @scala.inline
    def setRadiuses(value: js.Array[Radius]): Self = this.set("radiuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiuses: Self = this.set("radiuses", js.undefined)
    
    @scala.inline
    def setRadiusesNull: Self = this.set("radiuses", null)
  }
}
