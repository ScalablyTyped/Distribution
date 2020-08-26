package typings.pgPromise.mod

import typings.pgPromise.anon.Binary
import typings.pgPromise.pgSubsetMod.IColumn
import typings.pgPromise.pgSubsetMod.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResultExt extends IResult {
  // Property 'duration' exists only in the following context:
  //  - for single-query events 'receive'
  //  - for method Database.result
  var duration: js.UndefOr[Double] = js.native
}

object IResultExt {
  @scala.inline
  def apply(
    _parsers: js.Array[js.Function],
    _types: Binary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_]
  ): IResultExt = {
    val __obj = js.Dynamic.literal(_parsers = _parsers.asInstanceOf[js.Any], _types = _types.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResultExt]
  }
  @scala.inline
  implicit class IResultExtOps[Self <: IResultExt] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

