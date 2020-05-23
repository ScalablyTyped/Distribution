package typings.muiDatatables.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup extends js.Object {
  var data: js.Array[Index]
  var lookup: NumberDictionary[Boolean]
}

object Lookup {
  @scala.inline
  def apply(data: js.Array[Index], lookup: NumberDictionary[Boolean]): Lookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup]
  }
}

