package typings.ol.wfsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
  
  var featureType: js.UndefOr[js.Array[String] | String] = js.native
  
  var gmlFormat: js.UndefOr[typings.ol.gmlbaseMod.default] = js.native
  
  var schemaLocation: js.UndefOr[String] = js.native
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
    def setGmlFormat(value: typings.ol.gmlbaseMod.default): Self = this.set("gmlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmlFormat: Self = this.set("gmlFormat", js.undefined)
    
    @scala.inline
    def setSchemaLocation(value: String): Self = this.set("schemaLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaLocation: Self = this.set("schemaLocation", js.undefined)
  }
}
