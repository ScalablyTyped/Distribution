package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GMLOptions extends js.Object {
  
  var curve: js.UndefOr[Boolean] = js.native
  
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
  
  var featureType: js.UndefOr[js.Array[String] | String] = js.native
  
  var multiCurve: js.UndefOr[Boolean] = js.native
  
  var multiSurface: js.UndefOr[Boolean] = js.native
  
  var schemaLocation: js.UndefOr[String] = js.native
  
  var srsName: String = js.native
  
  var surface: js.UndefOr[Boolean] = js.native
}
object GMLOptions {
  
  @scala.inline
  def apply(srsName: String): GMLOptions = {
    val __obj = js.Dynamic.literal(srsName = srsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GMLOptions]
  }
  
  @scala.inline
  implicit class GMLOptionsOps[Self <: GMLOptions] (val x: Self) extends AnyVal {
    
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
    def setSrsName(value: String): Self = this.set("srsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurve(value: Boolean): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    
    @scala.inline
    def setFeatureNS(value: StringDictionary[String] | String): Self = this.set("featureNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureNS: Self = this.set("featureNS", js.undefined)
    
    @scala.inline
    def setFeatureTypeVarargs(value: String*): Self = this.set("featureType", js.Array(value :_*))
    
    @scala.inline
    def setFeatureType(value: js.Array[String] | String): Self = this.set("featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureType: Self = this.set("featureType", js.undefined)
    
    @scala.inline
    def setMultiCurve(value: Boolean): Self = this.set("multiCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiCurve: Self = this.set("multiCurve", js.undefined)
    
    @scala.inline
    def setMultiSurface(value: Boolean): Self = this.set("multiSurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSurface: Self = this.set("multiSurface", js.undefined)
    
    @scala.inline
    def setSchemaLocation(value: String): Self = this.set("schemaLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaLocation: Self = this.set("schemaLocation", js.undefined)
    
    @scala.inline
    def setSurface(value: Boolean): Self = this.set("surface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
  }
}
