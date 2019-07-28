package typings.microsoftDashGraph.microsoftDashGraphMod

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
    deviceCount: Int | Double = null,
    displayName: String = null,
    id: String = null,
    managedDevices: js.Array[ManagedDevice] = null,
    sizeInByte: Int | Double = null,
    version: String = null
  ): DetectedApp = {
    val __obj = js.Dynamic.literal()
    if (deviceCount != null) __obj.updateDynamic("deviceCount")(deviceCount.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (managedDevices != null) __obj.updateDynamic("managedDevices")(managedDevices)
    if (sizeInByte != null) __obj.updateDynamic("sizeInByte")(sizeInByte.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DetectedApp]
  }
}

