package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelParams extends js.Object {
  var name: java.lang.String
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesRemoveLabelParams {
  @scala.inline
  def apply(name: java.lang.String, number: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesRemoveLabelParams = {
    val __obj = js.Dynamic.literal(name = name, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesRemoveLabelParams]
  }
}

