package typings.pgPromise.pgSubsetMod

import typings.pgPromise.anon.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResult extends js.Object {
  
  var _parsers: js.Array[js.Function] = js.native
  
  var _types: Binary = js.native
  
  var command: String = js.native
  
  var fields: js.Array[IColumn] = js.native
  
  // properties below are not available within Native Bindings:
  var rowAsArray: Boolean = js.native
  
  var rowCount: Double = js.native
  
  var rows: js.Array[_] = js.native
}
object IResult {
  
  @scala.inline
  def apply(
    _parsers: js.Array[js.Function],
    _types: Binary,
    command: String,
    fields: js.Array[IColumn],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[_]
  ): IResult = {
    val __obj = js.Dynamic.literal(_parsers = _parsers.asInstanceOf[js.Any], _types = _types.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    
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
    def set_parsersVarargs(value: js.Function*): Self = this.set("_parsers", js.Array(value :_*))
    
    @scala.inline
    def set_parsers(value: js.Array[js.Function]): Self = this.set("_parsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_types(value: Binary): Self = this.set("_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: IColumn*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[IColumn]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAsArray(value: Boolean): Self = this.set("rowAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
}
