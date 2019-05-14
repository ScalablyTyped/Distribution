package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned from SODA collection.drop().
  */
trait DropCollectionResult extends js.Object {
  /** If the drop operation succeeded, dropped will be true. If no collection was found, dropped will be false. */
  var dropped: scala.Boolean
}

object DropCollectionResult {
  @scala.inline
  def apply(dropped: scala.Boolean): DropCollectionResult = {
    val __obj = js.Dynamic.literal(dropped = dropped)
  
    __obj.asInstanceOf[DropCollectionResult]
  }
}

