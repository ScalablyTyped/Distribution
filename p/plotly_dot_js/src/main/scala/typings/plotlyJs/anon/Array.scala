package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  var array: js.Array[Datum]
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.undefined
  var `type`: data
}

object Array {
  @scala.inline
  def apply(array: js.Array[Datum], `type`: data, arrayminus: js.Array[Datum] = null): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (arrayminus != null) __obj.updateDynamic("arrayminus")(arrayminus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
}

