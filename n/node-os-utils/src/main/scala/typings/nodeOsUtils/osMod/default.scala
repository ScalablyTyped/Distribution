package typings.nodeOsUtils.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils/lib/os", JSImport.Default)
@js.native
class default () extends Os {
  /* CompleteClass */
  override def arch(): String = js.native
  /* CompleteClass */
  override def hostname(): String = js.native
  /* CompleteClass */
  override def ip(): String = js.native
  /* CompleteClass */
  override def oos(): js.Function0[js.Promise[String]] = js.native
  /* CompleteClass */
  override def platform(): Platform = js.native
  /* CompleteClass */
  override def `type`(): String = js.native
  /* CompleteClass */
  override def uptime(): Double = js.native
}

