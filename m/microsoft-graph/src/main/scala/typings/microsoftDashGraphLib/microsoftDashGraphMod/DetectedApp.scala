package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedApp extends Entity {
  // The number of devices that have installed this application
  var deviceCount: js.UndefOr[scala.Double] = js.undefined
  // Name of the discovered application. Read-only
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // The devices that have the discovered application installed
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.undefined
  // Discovered application size in bytes. Read-only
  var sizeInByte: js.UndefOr[scala.Double] = js.undefined
  // Version of the discovered application. Read-only
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object DetectedApp {
  @scala.inline
  def apply(
    deviceCount: scala.Int | scala.Double = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    managedDevices: js.Array[ManagedDevice] = null,
    sizeInByte: scala.Int | scala.Double = null,
    version: java.lang.String = null
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

