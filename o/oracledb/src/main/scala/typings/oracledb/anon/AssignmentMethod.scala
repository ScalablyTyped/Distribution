package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentMethod extends js.Object {
  
  /**
    * Method used to assign keys to objects that are inserted into the collection.
    *
    * @default UUID
    */
  var assignmentMethod: js.UndefOr[String] = js.native
  
  /**
    * Maximum length of the key column in bytes. This component applies only to keys of type VARCHAR2.
    *
    * @default 255
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * Name of the column that stores the document key.
    *
    * @default ID
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of the database sequence that generates keys for documents that are inserted into a collection if
    * the key assignment method is SEQUENCE.
    *
    * If you specify the key assignment method as SEQUENCE then you must also specify the name of that sequence.
    * If the specified sequence does not exist then SODA creates it.
    */
  var sequenceName: js.UndefOr[String] = js.native
  
  /**
    * SQL data type of the column that stores the document key.
    *
    * @default VARCHAR2
    */
  var sqlType: js.UndefOr[String] = js.native
}
object AssignmentMethod {
  
  @scala.inline
  def apply(): AssignmentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignmentMethod]
  }
  
  @scala.inline
  implicit class AssignmentMethodOps[Self <: AssignmentMethod] (val x: Self) extends AnyVal {
    
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
    def setAssignmentMethod(value: String): Self = this.set("assignmentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignmentMethod: Self = this.set("assignmentMethod", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSequenceName(value: String): Self = this.set("sequenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceName: Self = this.set("sequenceName", js.undefined)
    
    @scala.inline
    def setSqlType(value: String): Self = this.set("sqlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlType: Self = this.set("sqlType", js.undefined)
  }
}
