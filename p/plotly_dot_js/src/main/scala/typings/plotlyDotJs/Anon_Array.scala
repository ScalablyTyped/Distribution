package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Datum
import typings.plotlyDotJs.plotlyDotJsStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var array: js.Array[Datum]
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.undefined
  var `type`: data
}

object Anon_Array {
  @scala.inline
  def apply(array: js.Array[Datum], `type`: data, arrayminus: js.Array[Datum] = null): Anon_Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (arrayminus != null) __obj.updateDynamic("arrayminus")(arrayminus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Array]
  }
}

