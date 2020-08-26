package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned from SODA collection.drop().
  */
@js.native
trait DropCollectionResult extends js.Object {
  /** If the drop operation succeeded, dropped will be true. If no collection was found, dropped will be false. */
  var dropped: Boolean = js.native
}

object DropCollectionResult {
  @scala.inline
  def apply(dropped: Boolean): DropCollectionResult = {
    val __obj = js.Dynamic.literal(dropped = dropped.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCollectionResult]
  }
  @scala.inline
  implicit class DropCollectionResultOps[Self <: DropCollectionResult] (val x: Self) extends AnyVal {
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
    def setDropped(value: Boolean): Self = this.set("dropped", value.asInstanceOf[js.Any])
  }
  
}

