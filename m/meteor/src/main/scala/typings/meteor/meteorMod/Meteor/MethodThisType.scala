package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Error **/
/** Method **/
@js.native
trait MethodThisType extends js.Object {
  var connection: Connection | Null = js.native
  var isSimulation: Boolean = js.native
  var userId: String | Null = js.native
  def setUserId(userId: String): Unit = js.native
  def unblock(): Unit = js.native
}

object MethodThisType {
  @scala.inline
  def apply(isSimulation: Boolean, setUserId: String => Unit, unblock: () => Unit): MethodThisType = {
    val __obj = js.Dynamic.literal(isSimulation = isSimulation.asInstanceOf[js.Any], setUserId = js.Any.fromFunction1(setUserId), unblock = js.Any.fromFunction0(unblock))
    __obj.asInstanceOf[MethodThisType]
  }
  @scala.inline
  implicit class MethodThisTypeOps[Self <: MethodThisType] (val x: Self) extends AnyVal {
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
    def setIsSimulation(value: Boolean): Self = this.set("isSimulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetUserId(value: String => Unit): Self = this.set("setUserId", js.Any.fromFunction1(value))
    @scala.inline
    def setUnblock(value: () => Unit): Self = this.set("unblock", js.Any.fromFunction0(value))
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionNull: Self = this.set("connection", null)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
  }
  
}

