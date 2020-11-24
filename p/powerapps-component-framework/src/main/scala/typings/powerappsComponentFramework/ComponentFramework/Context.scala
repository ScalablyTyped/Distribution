package typings.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entire property bag interface available to control via Context Object
  */
@js.native
trait Context[TInputs] extends js.Object {
  
  var client: Client = js.native
  
  var device: Device = js.native
  
  var factory: Factory = js.native
  
  var formatting: Formatting = js.native
  
  var mode: Mode = js.native
  
  var navigation: Navigation = js.native
  
  var parameters: TInputs = js.native
  
  var resources: Resources = js.native
  
  var updatedProperties: js.Array[String] = js.native
  
  var userSettings: UserSettings = js.native
  
  var utils: Utility = js.native
  
  var webAPI: WebApi = js.native
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
  implicit class ContextOps[Self <: Context[_], TInputs] (val x: Self with Context[TInputs]) extends AnyVal {
    
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
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: Factory): Self = this.set("factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatting(value: Formatting): Self = this.set("formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: Navigation): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: TInputs): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: Resources): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedPropertiesVarargs(value: String*): Self = this.set("updatedProperties", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedProperties(value: js.Array[String]): Self = this.set("updatedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = this.set("userSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: Utility): Self = this.set("utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAPI(value: WebApi): Self = this.set("webAPI", value.asInstanceOf[js.Any])
  }
}
