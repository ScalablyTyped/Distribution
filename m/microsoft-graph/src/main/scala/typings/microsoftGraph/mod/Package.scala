package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Package extends js.Object {
  /**
    * A string indicating the type of package. While oneNote is the only currently defined value, you should expect other
    * package types to be returned and handle them accordingly.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Package {
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

