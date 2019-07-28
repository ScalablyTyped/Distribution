package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesResponseSource extends js.Object {
  var branch: String
  var directory: String
}

object ReposGetPagesResponseSource {
  @scala.inline
  def apply(branch: String, directory: String): ReposGetPagesResponseSource = {
    val __obj = js.Dynamic.literal(branch = branch, directory = directory)
  
    __obj.asInstanceOf[ReposGetPagesResponseSource]
  }
}

