package typings.mrz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultDetails extends js.Object {
  
  /** Index of the end of the field in `line`. */
  var end: Double = js.native
  
  /** Name of the field in `result.fields`. */
  var field: /* import warning: importer.ImportType#apply Failed type conversion: 'format' | 'valid' | 'fields' | 'details'['fields'] */ js.Any = js.native
  
  /** Full english term for the field. */
  var label: String = js.native
  
  /** Index of the line where the field is located. */
  var line: Double = js.native
  
  /** Array of ranges that are necessary to compute this field. */
  var ranges: js.Array[Range] = js.native
  
  /** Index of the start of the field in `line`. */
  var start: Double = js.native
  
  var valid: Boolean = js.native
  
  /** Value of the field or `null`. */
  var value: String | Null = js.native
}
object ResultDetails {
  
  @scala.inline
  def apply(
    end: Double,
    field: /* import warning: importer.ImportType#apply Failed type conversion: 'format' | 'valid' | 'fields' | 'details'['fields'] */ js.Any,
    label: String,
    line: Double,
    ranges: js.Array[Range],
    start: Double,
    valid: Boolean
  ): ResultDetails = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultDetails]
  }
  
  @scala.inline
  implicit class ResultDetailsOps[Self <: ResultDetails] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'format' | 'valid' | 'fields' | 'details'['fields'] */ js.Any
    ): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: Range*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[Range]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
