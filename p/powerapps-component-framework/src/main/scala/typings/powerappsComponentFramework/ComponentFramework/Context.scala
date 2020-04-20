package typings.powerappsComponentFramework.ComponentFramework

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
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], formatting = formatting.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], updatedProperties = updatedProperties.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], webAPI = webAPI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TInputs]]
  }
}

