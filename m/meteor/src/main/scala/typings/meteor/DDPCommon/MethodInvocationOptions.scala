package typings.meteor.DDPCommon

import typings.meteor.Meteor.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodInvocationOptions extends js.Object {
  var connection: Connection = js.native
  var isSimulation: Boolean = js.native
  var randomSeed: String = js.native
  var setUserId: js.UndefOr[js.Function1[/* newUserId */ String, Unit]] = js.native
  var userId: String | Null = js.native
}

object MethodInvocationOptions {
  @scala.inline
  def apply(connection: Connection, isSimulation: Boolean, randomSeed: String): MethodInvocationOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSimulation = isSimulation.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodInvocationOptions]
  }
  @scala.inline
  implicit class MethodInvocationOptionsOps[Self <: MethodInvocationOptions] (val x: Self) extends AnyVal {
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
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSimulation(value: Boolean): Self = this.set("isSimulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRandomSeed(value: String): Self = this.set("randomSeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetUserId(value: /* newUserId */ String => Unit): Self = this.set("setUserId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUserId: Self = this.set("setUserId", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserIdNull: Self = this.set("userId", null)
  }
  
}

