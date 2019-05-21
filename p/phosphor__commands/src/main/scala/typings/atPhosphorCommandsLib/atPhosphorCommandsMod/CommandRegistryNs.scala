package typings
package atPhosphorCommandsLib.atPhosphorCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/commands", "CommandRegistry")
@js.native
object CommandRegistryNs extends js.Object {
  /**
    * An arguments object for the `commandChanged` signal.
    */
  trait ICommandChangedArgs extends js.Object {
    /**
      * The id of the associated command.
      *
      * This will be `undefined` when the type is `'many-changed'`.
      */
    val id: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Whether the command was added, removed, or changed.
      */
    val `type`: atPhosphorCommandsLib.atPhosphorCommandsLibStrings.added | atPhosphorCommandsLib.atPhosphorCommandsLibStrings.removed | atPhosphorCommandsLib.atPhosphorCommandsLibStrings.changed | atPhosphorCommandsLib.atPhosphorCommandsLibStrings.`many-changed`
  }
  
  /**
    * An arguments object for the `commandExecuted` signal.
    */
  trait ICommandExecutedArgs extends js.Object {
    /**
      * The arguments object passed to the command.
      */
    val args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
    /**
      * The id of the associated command.
      */
    val id: java.lang.String
    /**
      * The promise which resolves with the result of the command.
      */
    val result: js.Promise[_]
  }
  
  /**
    * An options object for creating a command.
    *
    * #### Notes
    * A command is an abstract representation of code to be executed along
    * with metadata for describing how the command should be displayed in
    * a visual representation.
    *
    * A command is a collection of functions, *not* methods. The command
    * registry will always invoke the command functions with a `thisArg`
    * which is `undefined`.
    */
  @js.native
  trait ICommandOptions extends js.Object {
    /**
      * The caption for the command.
      *
      * #### Notes
      * This should be a simple one line description of the command. It
      * is used by some visual representations to show quick info about
      * the command.
      *
      * This can be a string literal, or a function which returns the
      * caption based on the provided command arguments.
      *
      * The default value is an empty string.
      */
    var caption: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * The general class name for the command.
      *
      * #### Notes
      * This class name will be added to the primary node for the visual
      * representation of the command.
      *
      * Multiple class names can be separated with white space.
      *
      * This can be a string literal, or a function which returns the
      * class name based on the provided command arguments.
      *
      * The default value is an empty string.
      */
    var className: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * The dataset for the command.
      *
      * #### Notes
      * The dataset values will be added to the primary node for the
      * visual representation of the command.
      *
      * This can be a dataset object, or a function which returns the
      * dataset object based on the provided command arguments.
      *
      * The default value is an empty dataset.
      */
    var dataset: js.UndefOr[Dataset | CommandFunc[Dataset]] = js.native
    /**
      * The function to invoke when the command is executed.
      *
      * #### Notes
      * This should return the result of the command (if applicable) or
      * a promise which yields the result. The result is resolved as a
      * promise and that promise is returned to the code which executed
      * the command.
      *
      * This may be invoked even when `isEnabled` returns `false`.
      */
    @JSName("execute")
    var execute_Original: CommandFunc[_ | js.Promise[_]] = js.native
    /**
      * @deprecated Use `iconClass` instead.
      */
    var icon: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * The icon class for the command.
      *
      * #### Notes
      * This class name will be added to the icon node for the visual
      * representation of the command.
      *
      * Multiple class names can be separated with white space.
      *
      * This can be a string literal, or a function which returns the
      * icon based on the provided command arguments.
      *
      * The default value is an empty string.
      */
    var iconClass: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * The icon label for the command.
      *
      * #### Notes
      * This label will be added as text to the icon node for the visual
      * representation of the command.
      *
      * This can be a string literal, or a function which returns the
      * label based on the provided command arguments.
      *
      * The default value is an empty string.
      */
    var iconLabel: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * A function which indicates whether the command is enabled.
      *
      * #### Notes
      * Visual representations may use this value to display a disabled
      * command as grayed-out or in some other non-interactive fashion.
      *
      * The default value is `() => true`.
      */
    var isEnabled: js.UndefOr[CommandFunc[scala.Boolean]] = js.native
    /**
      * A function which indicates whether the command is toggled.
      *
      * #### Notes
      * Visual representations may use this value to display a toggled
      * command in a different form, such as a check mark icon for a
      * menu item or a depressed state for a toggle button.
      *
      * The default value is `() => false`.
      */
    var isToggled: js.UndefOr[CommandFunc[scala.Boolean]] = js.native
    /**
      * A function which indicates whether the command is visible.
      *
      * #### Notes
      * Visual representations may use this value to hide or otherwise
      * not display a non-visible command.
      *
      * The default value is `() => true`.
      */
    var isVisible: js.UndefOr[CommandFunc[scala.Boolean]] = js.native
    /**
      * The label for the command.
      *
      * #### Notes
      * This can be a string literal, or a function which returns the
      * label based on the provided command arguments.
      *
      * The label is often used as the primary text for the command.
      *
      * The default value is an empty string.
      */
    var label: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * The index of the mnemonic character in the command's label.
      *
      * #### Notes
      * This can be an index literal, or a function which returns the
      * mnemonic index based on the provided command arguments.
      *
      * The mnemonic character is often used by menus to provide easy
      * single-key keyboard access for triggering a menu item. It is
      * typically rendered as an underlined character in the label.
      *
      * The default value is `-1`.
      */
    var mnemonic: js.UndefOr[scala.Double | CommandFunc[scala.Double]] = js.native
    /**
      * The usage text for the command.
      *
      * #### Notes
      * This should be a full description of the command, which includes
      * information about the structure of the arguments and the type of
      * the return value. It is used by some visual representations when
      * displaying complete help info about the command.
      *
      * This can be a string literal, or a function which returns the
      * usage text based on the provided command arguments.
      *
      * The default value is an empty string.
      */
    var usage: js.UndefOr[java.lang.String | CommandFunc[java.lang.String]] = js.native
    /**
      * The function to invoke when the command is executed.
      *
      * #### Notes
      * This should return the result of the command (if applicable) or
      * a promise which yields the result. The result is resolved as a
      * promise and that promise is returned to the code which executed
      * the command.
      *
      * This may be invoked even when `isEnabled` returns `false`.
      */
    def execute(args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): js.Any | js.Promise[_] = js.native
  }
  
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
    val args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
    /**
      * The command executed when the binding is matched.
      */
    val command: java.lang.String
    /**
      * The key sequence for the binding.
      */
    val keys: js.Array[java.lang.String]
    /**
      * The CSS selector for the binding.
      */
    val selector: java.lang.String
  }
  
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
    val `type`: atPhosphorCommandsLib.atPhosphorCommandsLibStrings.added | atPhosphorCommandsLib.atPhosphorCommandsLibStrings.removed
  }
  
  /**
    * An options object for creating a key binding.
    */
  trait IKeyBindingOptions extends js.Object {
    /**
      * The arguments for the command, if necessary.
      *
      * The default value is an empty object.
      */
    var args: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
    /**
      * The id of the command to execute when the binding is matched.
      */
    var command: java.lang.String
    /**
      * The default key sequence for the key binding.
      *
      * A key sequence is composed of one or more keystrokes, where each
      * keystroke is a combination of modifiers and a primary key.
      *
      * Most key sequences will contain a single keystroke. Key sequences
      * with multiple keystrokes are called "chords", and are useful for
      * implementing modal input (ala Vim).
      *
      * Each keystroke in the sequence should be of the form:
      *   `[<modifier 1> [<modifier 2> [<modifier N> ]]]<primary key>`
      *
      * The supported modifiers are: `Accel`, `Alt`, `Cmd`, `Ctrl`, and
      * `Shift`. The `Accel` modifier is translated to `Cmd` on Mac and
      * `Ctrl` on all other platforms. The `Cmd` modifier is ignored on
      * non-Mac platforms.
      *
      * Keystrokes are case sensitive.
      *
      * **Examples:** `['Accel C']`, `['Shift F11']`, `['D', 'D']`
      */
    var keys: js.Array[java.lang.String]
    /**
      * The key sequence to use when running on Linux.
      *
      * If provided, this will override `keys` on Linux platforms.
      */
    var linuxKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * The key sequence to use when running on Mac.
      *
      * If provided, this will override `keys` on Mac platforms.
      */
    var macKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * The CSS selector for the key binding.
      *
      * The key binding will only be invoked when the selector matches a
      * node on the propagation path of the keydown event. This allows
      * the key binding to be restricted to user-defined contexts.
      *
      * The selector must not contain commas.
      */
    var selector: java.lang.String
    /**
      * The key sequence to use when running on Windows.
      *
      * If provided, this will override `keys` on Windows platforms.
      */
    var winKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  /**
    * An object which holds the results of parsing a keystroke.
    */
  trait IKeystrokeParts extends js.Object {
    /**
      * Whether `'Alt'` appears in the keystroke.
      */
    var alt: scala.Boolean
    /**
      * Whether `'Cmd'` appears in the keystroke.
      */
    var cmd: scala.Boolean
    /**
      * Whether `'Ctrl'` appears in the keystroke.
      */
    var ctrl: scala.Boolean
    /**
      * The primary key for the keystroke.
      */
    var key: java.lang.String
    /**
      * Whether `'Shift'` appears in the keystroke.
      */
    var shift: scala.Boolean
  }
  
  /**
    * Format a keystroke for display on the local system.
    */
  def formatKeystroke(keystroke: java.lang.String): java.lang.String = js.native
  /**
    * Create a normalized keystroke for a `'keydown'` event.
    *
    * @param event - The event object for a `'keydown'` event.
    *
    * @returns A normalized keystroke, or an empty string if the event
    *   does not represent a valid keystroke for the given layout.
    */
  def keystrokeForKeydownEvent(event: stdLib.KeyboardEvent): java.lang.String = js.native
  /**
    * Normalize a keystroke into a canonical representation.
    *
    * @param keystroke - The keystroke of interest.
    *
    * @returns The normalized representation of the keystroke.
    *
    * #### Notes
    * This normalizes the keystroke by removing duplicate modifiers and
    * extra primary keys, and assembling the parts in a canonical order.
    *
    * The `Cmd` modifier is ignored on non-Mac platforms.
    */
  def normalizeKeystroke(keystroke: java.lang.String): java.lang.String = js.native
  /**
    * Parse a keystroke into its constituent components.
    *
    * @param keystroke - The keystroke of interest.
    *
    * @returns The parsed components of the keystroke.
    *
    * #### Notes
    * The keystroke should be of the form:
    *   `[<modifier 1> [<modifier 2> [<modifier N> ]]]<primary key>`
    *
    * The supported modifiers are: `Accel`, `Alt`, `Cmd`, `Ctrl`, and
    * `Shift`. The `Accel` modifier is translated to `Cmd` on Mac and
    * `Ctrl` on all other platforms.
    *
    * The parsing is tolerant and will not throw exceptions. Notably:
    *   - Duplicate modifiers are ignored.
    *   - Extra primary keys are ignored.
    *   - The order of modifiers and primary key is irrelevant.
    *   - The keystroke parts should be separated by whitespace.
    *   - The keystroke is case sensitive.
    */
  def parseKeystroke(keystroke: java.lang.String): IKeystrokeParts = js.native
  /**
    * A type alias for a user-defined command function.
    */
  type CommandFunc[T] = js.Function1[/* args */ atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject, T]
  /**
    * A type alias for a simple immutable string dataset.
    */
  type Dataset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

