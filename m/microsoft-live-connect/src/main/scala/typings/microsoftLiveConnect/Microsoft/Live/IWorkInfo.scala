package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains work information for one employer.
  */
@js.native
trait IWorkInfo extends js.Object {
  /**
    * Info about the user's employer.
    */
  var employer: Name = js.native
  /**
    * Info about the user's work position.
    */
  var position: Name = js.native
}

object IWorkInfo {
  @scala.inline
  def apply(employer: Name, position: Name): IWorkInfo = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkInfo]
  }
  @scala.inline
  implicit class IWorkInfoOps[Self <: IWorkInfo] (val x: Self) extends AnyVal {
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
    def setEmployer(value: Name): Self = this.set("employer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Name): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

