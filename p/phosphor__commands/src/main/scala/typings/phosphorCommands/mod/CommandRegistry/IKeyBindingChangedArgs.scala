package typings.phosphorCommands.mod.CommandRegistry

import typings.phosphorCommands.phosphorCommandsStrings.added
import typings.phosphorCommands.phosphorCommandsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `keyBindingChanged` signal.
  */
trait IKeyBindingChangedArgs extends js.Object {
  /**
    * The key binding which was changed.
    */
  val binding: IKeyBinding
  /**
    * Whether the key binding was added or removed.
    */
  val `type`: added | removed
}

object IKeyBindingChangedArgs {
  @scala.inline
  def apply(binding: IKeyBinding, `type`: added | removed): IKeyBindingChangedArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBindingChangedArgs]
  }
}

