package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseItemVersion extends Entity {
  // Identity of the user which last modified the version. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  // Date and time the version was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Indicates the publication status of this particular version. Read-only.
  var publication: js.UndefOr[PublicationFacet] = js.native
}

object BaseItemVersion {
  @scala.inline
  def apply(): BaseItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItemVersion]
  }
  @scala.inline
  implicit class BaseItemVersionOps[Self <: BaseItemVersion] (val x: Self) extends AnyVal {
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
    def setLastModifiedBy(value: IdentitySet): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setPublication(value: PublicationFacet): Self = this.set("publication", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublication: Self = this.set("publication", js.undefined)
  }
  
}

