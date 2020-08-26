package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalClaim extends js.Object {
  /**
    * Additional properties of the claim. If a property exists in this collection, it modifies the behavior of the optional
    * claim specified in the name property.
    */
  var additionalProperties: js.UndefOr[js.Array[String]] = js.native
  /**
    * If the value is true, the claim specified by the client is necessary to ensure a smooth authorization experience for
    * the specific task requested by the end user. The default value is false.
    */
  var essential: js.UndefOr[Boolean] = js.native
  // The name of the optional claim.
  var name: js.UndefOr[String] = js.native
  /**
    * The source (directory object) of the claim. There are predefined claims and user-defined claims from extension
    * properties. If the source value is null, the claim is a predefined optional claim. If the source value is user, the
    * value in the name property is the extension property from the user object.
    */
  var source: js.UndefOr[String] = js.native
}

object OptionalClaim {
  @scala.inline
  def apply(): OptionalClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalClaim]
  }
  @scala.inline
  implicit class OptionalClaimOps[Self <: OptionalClaim] (val x: Self) extends AnyVal {
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
    def setAdditionalPropertiesVarargs(value: String*): Self = this.set("additionalProperties", js.Array(value :_*))
    @scala.inline
    def setAdditionalProperties(value: js.Array[String]): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setEssential(value: Boolean): Self = this.set("essential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEssential: Self = this.set("essential", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

