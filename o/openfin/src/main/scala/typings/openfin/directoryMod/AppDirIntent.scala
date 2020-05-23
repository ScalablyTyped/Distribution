package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppDirIntent extends js.Object {
  /**
    * The context types that this intent supports. A context type is a namespaced name;
    * examples are given [here](https://fdc3.finos.org/docs/1.0/context-spec).
    */
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Custom configuration for the intent. Currently unused, reserved for future use.
    */
  var customConfig: js.UndefOr[js.Any] = js.undefined
  /**
    * A short, human-readable description of this intent.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The intent name.
    */
  var name: String
}

object AppDirIntent {
  @scala.inline
  def apply(
    name: String,
    contexts: js.Array[String] = null,
    customConfig: js.Any = null,
    displayName: String = null
  ): AppDirIntent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (customConfig != null) __obj.updateDynamic("customConfig")(customConfig.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDirIntent]
  }
}

