package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedApp extends Entity {
  // The number of devices that have installed this application
  var deviceCount: js.UndefOr[Double] = js.undefined
  // Name of the discovered application. Read-only
  var displayName: js.UndefOr[String] = js.undefined
  // The devices that have the discovered application installed
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.undefined
  // Discovered application size in bytes. Read-only
  var sizeInByte: js.UndefOr[Double] = js.undefined
  // Version of the discovered application. Read-only
  var version: js.UndefOr[String] = js.undefined
}

object DetectedApp {
  @scala.inline
  def apply(
    deviceCount: js.UndefOr[Double] = js.undefined,
    displayName: String = null,
    id: String = null,
    managedDevices: js.Array[ManagedDevice] = null,
    sizeInByte: js.UndefOr[Double] = js.undefined,
    version: String = null
  ): DetectedApp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceCount)) __obj.updateDynamic("deviceCount")(deviceCount.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (managedDevices != null) __obj.updateDynamic("managedDevices")(managedDevices.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInByte)) __obj.updateDynamic("sizeInByte")(sizeInByte.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedApp]
  }
}

