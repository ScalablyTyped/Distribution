package typings.phosphorCommands.mod.CommandRegistry

import typings.phosphorCommands.phosphorCommandsStrings.`many-changed`
import typings.phosphorCommands.phosphorCommandsStrings.added
import typings.phosphorCommands.phosphorCommandsStrings.changed
import typings.phosphorCommands.phosphorCommandsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `commandChanged` signal.
  */
trait ICommandChangedArgs extends js.Object {
  /**
    * The id of the associated command.
    *
    * This will be `undefined` when the type is `'many-changed'`.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * Whether the command was added, removed, or changed.
    */
  val `type`: added | removed | changed | `many-changed`
}

object ICommandChangedArgs {
  @scala.inline
  def apply(`type`: added | removed | changed | `many-changed`, id: String = null): ICommandChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandChangedArgs]
  }
}

