package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var created: js.Array[java.lang.String]
  var deleted: js.Array[java.lang.String]
  var updated: js.Array[java.lang.String]
}

object Anon_Created {
  @scala.inline
  def apply(
    created: js.Array[java.lang.String],
    deleted: js.Array[java.lang.String],
    updated: js.Array[java.lang.String]
  ): Anon_Created = {
    val __obj = js.Dynamic.literal(created = created, deleted = deleted, updated = updated)
  
    __obj.asInstanceOf[Anon_Created]
  }
}

