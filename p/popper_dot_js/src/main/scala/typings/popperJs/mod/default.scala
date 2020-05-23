package typings.popperJs.mod

import typings.popperJs.anon.BaseModifiernamestring
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popper.js", JSImport.Default)
@js.native
class default protected () extends Popper {
  def this(reference: ReferenceObject, popper: Element) = this()
  def this(reference: Element, popper: Element) = this()
  def this(reference: ReferenceObject, popper: Element, options: PopperOptions) = this()
  def this(reference: Element, popper: Element, options: PopperOptions) = this()
  /* CompleteClass */
  override var options: PopperOptions = js.native
  /* CompleteClass */
  override var popper: Element = js.native
  /* CompleteClass */
  override var reference: Element | ReferenceObject = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def disableEventListeners(): Unit = js.native
  /* CompleteClass */
  override def enableEventListeners(): Unit = js.native
  /* CompleteClass */
  override def scheduleUpdate(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

/* static members */
@JSImport("popper.js", JSImport.Default)
@js.native
object default extends js.Object {
  var Defaults: PopperOptions = js.native
  var modifiers: js.Array[BaseModifiernamestring] = js.native
  var placements: js.Array[Placement] = js.native
}

