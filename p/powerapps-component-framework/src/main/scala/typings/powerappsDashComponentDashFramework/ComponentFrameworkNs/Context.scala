package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The entire property bag interface available to control via Context Object
	 */
trait Context[TInputs] extends js.Object {
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
    val __obj = js.Dynamic.literal(client = client, device = device, factory = factory, formatting = formatting, mode = mode, navigation = navigation, parameters = parameters.asInstanceOf[js.Any], resources = resources, updatedProperties = updatedProperties, userSettings = userSettings, utils = utils, webAPI = webAPI)
  
    __obj.asInstanceOf[Context[TInputs]]
  }
}

