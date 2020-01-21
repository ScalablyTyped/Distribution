package typings.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils/lib/mem", JSImport.Default)
@js.native
class default () extends Mem {
  /* CompleteClass */
  override def free(): js.Promise[MemFreeInfo] = js.native
  /* CompleteClass */
  override def info(): js.Promise[MemInfo] = js.native
  /* CompleteClass */
  override def totalMem(): Double = js.native
  /* CompleteClass */
  override def used(): js.Promise[MemUsedInfo] = js.native
}

