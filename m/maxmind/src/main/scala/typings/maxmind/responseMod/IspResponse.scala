package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.maxmind.responseMod.Response because Already inherited */ @js.native
trait IspResponse extends AsnResponse {
  val isp: String = js.native
  val organization: String = js.native
}

object IspResponse {
  @scala.inline
  def apply(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[IspResponse]
  }
  @scala.inline
  implicit class IspResponseOps[Self <: IspResponse] (val x: Self) extends AnyVal {
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
    def setIsp(value: String): Self = this.set("isp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
  }
  
}

