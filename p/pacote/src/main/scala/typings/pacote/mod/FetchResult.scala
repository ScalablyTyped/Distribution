package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchResult extends js.Object {
  /**
    * A normalized form of the spec passed in as an argument.
    */
  var from: String
  /**
    * The integrity value for the package artifact.
    */
  var integrity: String
  /**
    * The tarball url or file path where the package artifact can be found.
    */
  var resolved: String
}

object FetchResult {
  @scala.inline
  def apply(from: String, integrity: String, resolved: String): FetchResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResult]
  }
}

