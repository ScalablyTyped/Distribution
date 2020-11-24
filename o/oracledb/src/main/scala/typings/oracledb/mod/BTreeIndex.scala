package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure to configure the properties of a B-Tree Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
@js.native
trait BTreeIndex extends js.Object {
  
  /** Each object targets a field in the indexed documents that has a scalar JSON value. */
  var fields: js.Array[BTreeIndexField] = js.native
  
  /**
    * Specifies whether or not to index NULL values for the selected columns (by appending the numeric value 1 to the list of columns to index).
    *
    * @default false
    */
  var indexNulls: js.UndefOr[Boolean] = js.native
  
  /** Name of the index. */
  var name: String = js.native
  
  /**
    * Specifies whether or not the index is unique.
    *
    * @default false
    */
  var unique: js.UndefOr[Boolean] = js.native
}
object BTreeIndex {
  
  @scala.inline
  def apply(fields: js.Array[BTreeIndexField], name: String): BTreeIndex = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndex]
  }
  
  @scala.inline
  implicit class BTreeIndexOps[Self <: BTreeIndex] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: BTreeIndexField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[BTreeIndexField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNulls(value: Boolean): Self = this.set("indexNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexNulls: Self = this.set("indexNulls", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
