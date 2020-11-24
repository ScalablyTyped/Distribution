package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResult[T] extends js.Object {
  
  var output: StringDictionary[js.Any] = js.native
  
  var recordset: IRecordSet[T] = js.native
  
  var recordsets: js.Array[IRecordSet[T]] = js.native
  
  var rowsAffected: js.Array[Double] = js.native
}
object IResult {
  
  @scala.inline
  def apply[T](
    output: StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    rowsAffected: js.Array[Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  
  @scala.inline
  implicit class IResultOps[Self <: IResult[_], T] (val x: Self with IResult[T]) extends AnyVal {
    
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
    def setOutput(value: StringDictionary[js.Any]): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordset(value: IRecordSet[T]): Self = this.set("recordset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsetsVarargs(value: IRecordSet[T]*): Self = this.set("recordsets", js.Array(value :_*))
    
    @scala.inline
    def setRecordsets(value: js.Array[IRecordSet[T]]): Self = this.set("recordsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsAffectedVarargs(value: Double*): Self = this.set("rowsAffected", js.Array(value :_*))
    
    @scala.inline
    def setRowsAffected(value: js.Array[Double]): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
  }
}
