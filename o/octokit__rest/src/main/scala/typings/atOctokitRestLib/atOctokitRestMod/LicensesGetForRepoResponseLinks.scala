package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetForRepoResponseLinks extends js.Object {
  var git: java.lang.String
  var html: java.lang.String
  var self: java.lang.String
}

object LicensesGetForRepoResponseLinks {
  @scala.inline
  def apply(git: java.lang.String, html: java.lang.String, self: java.lang.String): LicensesGetForRepoResponseLinks = {
    val __obj = js.Dynamic.literal(git = git, html = html, self = self)
  
    __obj.asInstanceOf[LicensesGetForRepoResponseLinks]
  }
}

