package typings.namedRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptions extends js.Object {
  var caseSensitive: Boolean = js.native
  var name: String = js.native
  var recursiveWildcard: Boolean = js.native
  var wildcardInPairs: Boolean = js.native
}

object RouteOptions {
  @scala.inline
  def apply(caseSensitive: Boolean, name: String, recursiveWildcard: Boolean, wildcardInPairs: Boolean): RouteOptions = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursiveWildcard = recursiveWildcard.asInstanceOf[js.Any], wildcardInPairs = wildcardInPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptions]
  }
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecursiveWildcard(value: Boolean): Self = this.set("recursiveWildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def setWildcardInPairs(value: Boolean): Self = this.set("wildcardInPairs", value.asInstanceOf[js.Any])
  }
  
}

