package typings.namedRoutes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<named-routes.named-routes.RouteOptions> */
@js.native
trait PartialRouteOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var recursiveWildcard: js.UndefOr[Boolean] = js.native
  var wildcardInPairs: js.UndefOr[Boolean] = js.native
}

object PartialRouteOptions {
  @scala.inline
  def apply(): PartialRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouteOptions]
  }
  @scala.inline
  implicit class PartialRouteOptionsOps[Self <: PartialRouteOptions] (val x: Self) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRecursiveWildcard(value: Boolean): Self = this.set("recursiveWildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursiveWildcard: Self = this.set("recursiveWildcard", js.undefined)
    @scala.inline
    def setWildcardInPairs(value: Boolean): Self = this.set("wildcardInPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWildcardInPairs: Self = this.set("wildcardInPairs", js.undefined)
  }
  
}

