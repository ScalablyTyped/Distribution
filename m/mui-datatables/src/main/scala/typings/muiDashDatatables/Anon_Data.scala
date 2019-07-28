package typings.muiDashDatatables

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[Anon_DataIndex]
  var lookup: NumberDictionary[Boolean]
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[Anon_DataIndex], lookup: NumberDictionary[Boolean]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, lookup = lookup)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

