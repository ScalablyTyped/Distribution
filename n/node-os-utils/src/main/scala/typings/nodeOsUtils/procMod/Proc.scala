package typings.nodeOsUtils.procMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proc extends js.Object {
  def totalProcesses(): js.Promise[Double | String] = js.native
  def zombieProcesses(): js.Promise[Double | String] = js.native
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
  @scala.inline
  implicit class ProcOps[Self <: Proc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTotalProcesses(value: () => js.Promise[Double | String]): Self = this.set("totalProcesses", js.Any.fromFunction0(value))
    @scala.inline
    def setZombieProcesses(value: () => js.Promise[Double | String]): Self = this.set("zombieProcesses", js.Any.fromFunction0(value))
  }
  
}

