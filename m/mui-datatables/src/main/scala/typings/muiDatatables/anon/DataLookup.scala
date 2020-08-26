package typings.muiDatatables.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLookup extends js.Object {
  var data: js.Array[DataIndex] = js.native
  var lookup: NumberDictionary[Boolean] = js.native
}

object DataLookup {
  @scala.inline
  def apply(data: js.Array[DataIndex], lookup: NumberDictionary[Boolean]): DataLookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLookup]
  }
  @scala.inline
  implicit class DataLookupOps[Self <: DataLookup] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: DataIndex*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DataIndex]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookup(value: NumberDictionary[Boolean]): Self = this.set("lookup", value.asInstanceOf[js.Any])
  }
  
}

