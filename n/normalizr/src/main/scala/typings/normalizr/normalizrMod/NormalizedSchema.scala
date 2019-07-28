package typings.normalizr.normalizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedSchema[E, R] extends js.Object {
  var entities: E
  var result: R
}

object NormalizedSchema {
  @scala.inline
  def apply[E, R](entities: E, result: R): NormalizedSchema[E, R] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizedSchema[E, R]]
  }
}

