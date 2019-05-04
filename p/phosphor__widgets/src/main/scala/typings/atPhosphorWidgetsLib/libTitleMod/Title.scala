package typings
package atPhosphorWidgetsLib.libTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/title", "Title")
@js.native
class Title[T] protected () extends js.Object {
  /**
    * Construct a new title.
    *
    * @param options - The options for initializing the title.
    */
  def this(options: atPhosphorWidgetsLib.libTitleMod.TitleNs.IOptions[T]) = this()
  var _caption: js.Any = js.native
  var _changed: js.Any = js.native
  var _className: js.Any = js.native
  var _closable: js.Any = js.native
  var _dataset: js.Any = js.native
  var _iconClass: js.Any = js.native
  var _iconLabel: js.Any = js.native
  var _label: js.Any = js.native
  var _mnemonic: js.Any = js.native
  /**
    * Get the caption for the title.
    *
    * #### Notes
    * The default value is an empty string.
    */
  /**
    * Set the caption for the title.
    */
  var caption: java.lang.String = js.native
  /**
    * A signal emitted when the state of the title changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Get the extra class name for the title.
    *
    * #### Notes
    * The default value is an empty string.
    */
  /**
    * Set the extra class name for the title.
    *
    * #### Notes
    * Multiple class names can be separated with whitespace.
    */
  var className: java.lang.String = js.native
  /**
    * Get the closable state for the title.
    *
    * #### Notes
    * The default value is `false`.
    */
  /**
    * Set the closable state for the title.
    *
    * #### Notes
    * This controls the presence of a close icon when applicable.
    */
  var closable: scala.Boolean = js.native
  /**
    * Get the dataset for the title.
    *
    * #### Notes
    * The default value is an empty dataset.
    */
  /**
    * Set the dataset for the title.
    *
    * #### Notes
    * This controls the data attributes when applicable.
    */
  var dataset: atPhosphorWidgetsLib.libTitleMod.TitleNs.Dataset = js.native
  /**
    * @deprecated Use `iconClass` instead.
    */
  /**
    * @deprecated Use `iconClass` instead.
    */
  var icon: java.lang.String = js.native
  /**
    * Get the icon class name for the title.
    *
    * #### Notes
    * The default value is an empty string.
    */
  /**
    * Set the icon class name for the title.
    *
    * #### Notes
    * Multiple class names can be separated with whitespace.
    */
  var iconClass: java.lang.String = js.native
  /**
    * Get the icon label for the title.
    *
    * #### Notes
    * The default value is an empty string.
    */
  /**
    * Set the icon label for the title.
    *
    * #### Notes
    * Multiple class names can be separated with whitespace.
    */
  var iconLabel: java.lang.String = js.native
  /**
    * Get the label for the title.
    *
    * #### Notes
    * The default value is an empty string.
    */
  /**
    * Set the label for the title.
    */
  var label: java.lang.String = js.native
  /**
    * Get the mnemonic index for the title.
    *
    * #### Notes
    * The default value is `-1`.
    */
  /**
    * Set the mnemonic index for the title.
    */
  var mnemonic: scala.Double = js.native
  /**
    * The object which owns the title.
    */
  val owner: T = js.native
}

