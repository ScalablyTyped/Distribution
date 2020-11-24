package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.format.filter.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WFSWriteGetFeatureOptions extends js.Object {
  
  var bbox: js.UndefOr[Extent_] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var featureNS: String = js.native
  
  var featurePrefix: String = js.native
  
  var featureTypes: js.Array[String] = js.native
  
  var filter: js.UndefOr[Filter] = js.native
  
  var geometryName: js.UndefOr[String] = js.native
  
  var handle: js.UndefOr[String] = js.native
  
  var maxFeatures: js.UndefOr[Double] = js.native
  
  var outputFormat: js.UndefOr[String] = js.native
  
  var propertyNames: js.UndefOr[js.Array[String]] = js.native
  
  var resultType: js.UndefOr[String] = js.native
  
  var srsName: js.UndefOr[String] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
}
object WFSWriteGetFeatureOptions {
  
  @scala.inline
  def apply(featureNS: String, featurePrefix: String, featureTypes: js.Array[String]): WFSWriteGetFeatureOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteGetFeatureOptions]
  }
  
  @scala.inline
  implicit class WFSWriteGetFeatureOptionsOps[Self <: WFSWriteGetFeatureOptions] (val x: Self) extends AnyVal {
    
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
    def setFeatureTypesVarargs(value: String*): Self = this.set("featureTypes", js.Array(value :_*))
    
    @scala.inline
    def setFeatureTypes(value: js.Array[String]): Self = this.set("featureTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: Extent_): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = this.set("geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryName: Self = this.set("geometryName", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setMaxFeatures(value: Double): Self = this.set("maxFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFeatures: Self = this.set("maxFeatures", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    
    @scala.inline
    def setPropertyNamesVarargs(value: String*): Self = this.set("propertyNames", js.Array(value :_*))
    
    @scala.inline
    def setPropertyNames(value: js.Array[String]): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyNames: Self = this.set("propertyNames", js.undefined)
    
    @scala.inline
    def setResultType(value: String): Self = this.set("resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
    
    @scala.inline
    def setSrsName(value: String): Self = this.set("srsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrsName: Self = this.set("srsName", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
