package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Debugger.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleProfileStartedEventDataType extends js.Object {
  var id: String = js.native
  /**
    * Location of console.profile().
    */
  var location: Location = js.native
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.native
}

object ConsoleProfileStartedEventDataType {
  @scala.inline
  def apply(id: String, location: Location): ConsoleProfileStartedEventDataType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileStartedEventDataType]
  }
  @scala.inline
  implicit class ConsoleProfileStartedEventDataTypeOps[Self <: ConsoleProfileStartedEventDataType] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

