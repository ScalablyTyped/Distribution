package typings.nodeOsUtils.procMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proc extends js.Object {
  def totalProcesses(): js.Promise[Double | String]
  def zombieProcesses(): js.Promise[Double | String]
}

object Proc {
  @scala.inline
  def apply(
    totalProcesses: () => js.Promise[Double | String],
    zombieProcesses: () => js.Promise[Double | String]
  ): Proc = {
    val __obj = js.Dynamic.literal(totalProcesses = js.Any.fromFunction0(totalProcesses), zombieProcesses = js.Any.fromFunction0(zombieProcesses))
  
    __obj.asInstanceOf[Proc]
  }
}

