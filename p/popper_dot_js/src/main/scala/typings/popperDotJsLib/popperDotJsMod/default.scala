package typings
package popperDotJsLib.popperDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popper.js", JSImport.Default)
@js.native
class default protected () extends Popper {
  def this(reference: ReferenceObject, popper: stdLib.Element) = this()
  def this(reference: stdLib.Element, popper: stdLib.Element) = this()
  def this(reference: ReferenceObject, popper: stdLib.Element, options: PopperOptions) = this()
  def this(reference: stdLib.Element, popper: stdLib.Element, options: PopperOptions) = this()
  /* CompleteClass */
  override var options: PopperOptions = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def disableEventListeners(): scala.Unit = js.native
  /* CompleteClass */
  override def enableEventListeners(): scala.Unit = js.native
  /* CompleteClass */
  override def scheduleUpdate(): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

@JSImport("popper.js", JSImport.Default)
@js.native
object default extends js.Object {
  var Defaults: popperDotJsLib.popperDotJsMod.PopperOptions = js.native
  var modifiers: js.Array[popperDotJsLib.popperDotJsMod.BaseModifier with popperDotJsLib.Anon_Name] = js.native
  var placements: js.Array[popperDotJsLib.popperDotJsMod.Placement] = js.native
}

