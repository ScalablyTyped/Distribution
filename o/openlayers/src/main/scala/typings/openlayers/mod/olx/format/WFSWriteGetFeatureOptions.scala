package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.format.filter.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSWriteGetFeatureOptions extends StObject {
  
  var bbox: js.UndefOr[Extent_] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var featureNS: String
  
  var featurePrefix: String
  
  var featureTypes: js.Array[String]
  
  var filter: js.UndefOr[Filter] = js.undefined
  
  var geometryName: js.UndefOr[String] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var maxFeatures: js.UndefOr[Double] = js.undefined
  
  var outputFormat: js.UndefOr[String] = js.undefined
  
  var propertyNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var resultType: js.UndefOr[String] = js.undefined
  
  var srsName: js.UndefOr[String] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
}
object WFSWriteGetFeatureOptions {
  
  @scala.inline
  def apply(featureNS: String, featurePrefix: String, featureTypes: js.Array[String]): WFSWriteGetFeatureOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSWriteGetFeatureOptions]
  }
  
  @scala.inline
  implicit class WFSWriteGetFeatureOptionsMutableBuilder[Self <: WFSWriteGetFeatureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBbox(value: Extent_): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFeatureNS(value: String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturePrefix(value: String): Self = StObject.set(x, "featurePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypes(value: js.Array[String]): Self = StObject.set(x, "featureTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypesVarargs(value: String*): Self = StObject.set(x, "featureTypes", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setMaxFeatures(value: Double): Self = StObject.set(x, "maxFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFeaturesUndefined: Self = StObject.set(x, "maxFeatures", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    @scala.inline
    def setPropertyNames(value: js.Array[String]): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    
    @scala.inline
    def setPropertyNamesVarargs(value: String*): Self = StObject.set(x, "propertyNames", js.Array(value :_*))
    
    @scala.inline
    def setResultType(value: String): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
    
    @scala.inline
    def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
