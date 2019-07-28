package typings.parchment.distSrcAttributorAttributorMod

import typings.parchment.distSrcRegistryMod.Scope
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/attributor", JSImport.Default)
@js.native
class default protected () extends Attributor {
  def this(attrName: String, keyName: String) = this()
  def this(attrName: String, keyName: String, options: AttributorOptions) = this()
  /* CompleteClass */
  override var attrName: String = js.native
  /* CompleteClass */
  override var keyName: String = js.native
  /* CompleteClass */
  override var scope: Scope = js.native
  /* CompleteClass */
  override def add(node: HTMLElement, value: String): Boolean = js.native
  /* CompleteClass */
  override def canAdd(node: HTMLElement, value: js.Any): Boolean = js.native
  /* CompleteClass */
  override def remove(node: HTMLElement): Unit = js.native
  /* CompleteClass */
  override def value(node: HTMLElement): String = js.native
}

/* static members */
@JSImport("parchment/dist/src/attributor/attributor", JSImport.Default)
@js.native
object default extends js.Object {
  def keys(node: HTMLElement): js.Array[String] = js.native
}

