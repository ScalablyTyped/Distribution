package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entire property bag interface available to control via Context Object
  */
trait Context[TInputs] extends StObject {
  
  var client: Client
  
  var device: Device
  
  var factory: Factory
  
  var formatting: Formatting
  
  var mode: Mode
  
  var navigation: Navigation
  
  var parameters: TInputs
  
  var resources: Resources
  
  var updatedProperties: js.Array[String]
  
  var userSettings: UserSettings
  
  var utils: Utility
  
  var webAPI: WebApi
}
object Context {
  
  @scala.inline
  def apply[TInputs](
    client: Client,
    device: Device,
    factory: Factory,
    formatting: Formatting,
    mode: Mode,
    navigation: Navigation,
    parameters: TInputs,
    resources: Resources,
    updatedProperties: js.Array[String],
    userSettings: UserSettings,
    utils: Utility,
    webAPI: WebApi
  ): Context[TInputs] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], formatting = formatting.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], updatedProperties = updatedProperties.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], webAPI = webAPI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TInputs]]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context[?], TInputs] (val x: Self & Context[TInputs]) extends AnyVal {
    
    @scala.inline
    def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatting(value: Formatting): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: Navigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: TInputs): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedProperties(value: js.Array[String]): Self = StObject.set(x, "updatedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedPropertiesVarargs(value: String*): Self = StObject.set(x, "updatedProperties", js.Array(value :_*))
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: Utility): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAPI(value: WebApi): Self = StObject.set(x, "webAPI", value.asInstanceOf[js.Any])
  }
}
