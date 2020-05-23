package typings.openfin.mainMod

import typings.openfin.directoryMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppIntent extends js.Object {
  /**
    * An array of applications that are associated with this intent.
    */
  var apps: js.Array[Application]
  /**
    * Descriptor of this intent.
    */
  var intent: IntentMetadata
}

object AppIntent {
  @scala.inline
  def apply(apps: js.Array[Application], intent: IntentMetadata): AppIntent = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntent]
  }
}

