package typings.openfin.registryInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryInfo extends js.Object {
  var data: js.Any
  var rootKey: String
  var subkey: String
  var `type`: String
  var value: String
}

object RegistryInfo {
  @scala.inline
  def apply(data: js.Any, rootKey: String, subkey: String, `type`: String, value: String): RegistryInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rootKey = rootKey.asInstanceOf[js.Any], subkey = subkey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryInfo]
  }
}

