package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReusableConfig extends StObject {
  
  /** Output only. The time at which this ReusableConfig was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. A human-readable description of scenarios these ReusableConfigValues may be compatible with. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.ReusableConfig with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The resource path for this ReusableConfig in the format `projects/∗/locations/∗/reusableConfigs/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this ReusableConfig was updated. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** Required. The config values. */
  var values: js.UndefOr[ReusableConfigValues] = js.native
}
object ReusableConfig {
  
  @scala.inline
  def apply(): ReusableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReusableConfig]
  }
  
  @scala.inline
  implicit class ReusableConfigMutableBuilder[Self <: ReusableConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.ReusableConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setValues(value: ReusableConfigValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
