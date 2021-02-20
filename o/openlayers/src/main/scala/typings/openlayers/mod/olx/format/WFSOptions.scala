package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.format.GMLBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WFSOptions extends StObject {
  
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
  
  var featureType: js.UndefOr[js.Array[String] | String] = js.native
  
  var gmlFormat: js.UndefOr[GMLBase] = js.native
  
  var schemaLocation: js.UndefOr[String] = js.native
}
object WFSOptions {
  
  @scala.inline
  def apply(): WFSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WFSOptions]
  }
  
  @scala.inline
  implicit class WFSOptionsMutableBuilder[Self <: WFSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
    
    @scala.inline
    def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    @scala.inline
    def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value :_*))
    
    @scala.inline
    def setGmlFormat(value: GMLBase): Self = StObject.set(x, "gmlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmlFormatUndefined: Self = StObject.set(x, "gmlFormat", js.undefined)
    
    @scala.inline
    def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
  }
}
