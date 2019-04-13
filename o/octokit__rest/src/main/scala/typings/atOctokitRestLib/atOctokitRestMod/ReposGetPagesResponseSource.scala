package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesResponseSource extends js.Object {
  var branch: java.lang.String
  var directory: java.lang.String
}

object ReposGetPagesResponseSource {
  @scala.inline
  def apply(branch: java.lang.String, directory: java.lang.String): ReposGetPagesResponseSource = {
    val __obj = js.Dynamic.literal(branch = branch, directory = directory)
  
    __obj.asInstanceOf[ReposGetPagesResponseSource]
  }
}

