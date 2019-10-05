package typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a key binding.
  *
  * #### Notes
  * A key binding is an immutable object created by a registry.
  */
trait IKeyBinding extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject
  /**
    * The command executed when the binding is matched.
    */
  val command: String
  /**
    * The key sequence for the binding.
    */
  val keys: js.Array[String]
  /**
    * The CSS selector for the binding.
    */
  val selector: String
}

object IKeyBinding {
  @scala.inline
  def apply(args: ReadonlyJSONObject, command: String, keys: js.Array[String], selector: String): IKeyBinding = {
    val __obj = js.Dynamic.literal(args = args, command = command, keys = keys, selector = selector)
  
    __obj.asInstanceOf[IKeyBinding]
  }
}

