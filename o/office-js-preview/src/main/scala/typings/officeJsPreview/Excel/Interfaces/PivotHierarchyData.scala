package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotHierarchy.toJSON()`. */
@js.native
trait PivotHierarchyData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.native
  /**
    *
    * Id of the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Name of the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.native
}

object PivotHierarchyData {
  @scala.inline
  def apply(): PivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyData]
  }
  @scala.inline
  implicit class PivotHierarchyDataOps[Self <: PivotHierarchyData] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: PivotFieldData*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[PivotFieldData]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

