package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightGroup extends StObject {
  
  /** The Active View video viewability metric configuration for the Floodlight group. */
  var activeViewConfig: js.UndefOr[ActiveViewVideoViewabilityMetricConfig] = js.undefined
  
  /**
    * User-defined custom variables owned by the Floodlight group. Use custom Floodlight variables to create reporting data that is tailored to your unique business needs. Custom
    * Floodlight variables use the keys `U1=`, `U2=`, and so on, and can take any values that you choose to pass to them. You can use them to track virtually any type of data that you
    * collect about your customers, such as the genre of movie that a customer purchases, the country to which the item is shipped, and so on. Custom Floodlight variables may not be used
    * to pass any data that could be used or recognized as personally identifiable information (PII). Example: `custom_variables { fields { "U1": value { number_value: 123.4 }, "U2":
    * value { string_value: "MyVariable2" }, "U3": value { string_value: "MyVariable3" } } }` Acceptable values for keys are "U1" through "U100", inclusive. String values must be less
    * than 64 characters long, and cannot contain the following characters: `"<>`.
    */
  var customVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Required. The display name of the Floodlight group. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the Floodlight group. Assigned by the system. */
  var floodlightGroupId: js.UndefOr[String] = js.undefined
  
  /** Required. The lookback window for the Floodlight group. Both click_days and impression_days are required. Acceptable values for both are `0` to `90`, inclusive. */
  var lookbackWindow: js.UndefOr[LookbackWindow] = js.undefined
  
  /** Output only. The resource name of the Floodlight group. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The web tag type enabled for the Floodlight group. */
  var webTagType: js.UndefOr[String] = js.undefined
}
object FloodlightGroup {
  
  inline def apply(): FloodlightGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightGroup]
  }
  
  extension [Self <: FloodlightGroup](x: Self) {
    
    inline def setActiveViewConfig(value: ActiveViewVideoViewabilityMetricConfig): Self = StObject.set(x, "activeViewConfig", value.asInstanceOf[js.Any])
    
    inline def setActiveViewConfigUndefined: Self = StObject.set(x, "activeViewConfig", js.undefined)
    
    inline def setCustomVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "customVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomVariablesUndefined: Self = StObject.set(x, "customVariables", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFloodlightGroupId(value: String): Self = StObject.set(x, "floodlightGroupId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightGroupIdUndefined: Self = StObject.set(x, "floodlightGroupId", js.undefined)
    
    inline def setLookbackWindow(value: LookbackWindow): Self = StObject.set(x, "lookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setLookbackWindowUndefined: Self = StObject.set(x, "lookbackWindow", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWebTagType(value: String): Self = StObject.set(x, "webTagType", value.asInstanceOf[js.Any])
    
    inline def setWebTagTypeUndefined: Self = StObject.set(x, "webTagType", js.undefined)
  }
}
