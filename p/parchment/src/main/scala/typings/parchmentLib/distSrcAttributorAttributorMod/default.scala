package typings
package parchmentLib.distSrcAttributorAttributorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/attributor", JSImport.Default)
@js.native
class default protected () extends Attributor {
  def this(attrName: java.lang.String, keyName: java.lang.String) = this()
  def this(attrName: java.lang.String, keyName: java.lang.String, options: AttributorOptions) = this()
  /* CompleteClass */
  override var attrName: java.lang.String = js.native
  /* CompleteClass */
  override var keyName: java.lang.String = js.native
  /* CompleteClass */
  override var scope: parchmentLib.distSrcRegistryMod.Scope = js.native
  /* CompleteClass */
  override var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.native
  /* CompleteClass */
  override def add(node: stdLib.HTMLElement, value: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def canAdd(node: stdLib.HTMLElement, value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def remove(node: stdLib.HTMLElement): scala.Unit = js.native
  /* CompleteClass */
  override def value(node: stdLib.HTMLElement): java.lang.String = js.native
}

@JSImport("parchment/dist/src/attributor/attributor", JSImport.Default)
@js.native
object default extends js.Object {
  def keys(node: stdLib.HTMLElement): js.Array[java.lang.String] = js.native
}

