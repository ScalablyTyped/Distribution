package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of SODA operation.replaceOne();
  */
trait SodaReplaceOneResult extends js.Object {
  /** This attribute will be true if the document was successfully replaced, false otherwise. */
  var replaced: Boolean
}

object SodaReplaceOneResult {
  @scala.inline
  def apply(replaced: Boolean): SodaReplaceOneResult = {
    val __obj = js.Dynamic.literal(replaced = replaced.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SodaReplaceOneResult]
  }
}

