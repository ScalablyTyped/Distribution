package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  
  /**
    * Name of the index on the last-modified column.
    *
    * The value of this component is the name of a nonunique index on the last-modified time-stamp column.
    * The index is created if a name is specified. This index can improve the performance of read and write
    * operations that are driven by last-modified time stamps.
    *
    * Only SODA for REST provides such an operation (operation GET collection with time-stamp parameters since
    * and until). Other implementations do not use this component, since they do not provide any read or write
    * operations that are driven by last-modified time stamps. Even for SODA for REST, it is typically better
    * not to set this component if you are sure that your application does not use any read or write operations
    * that are driven by time stamps, because creating and maintaining an index carries a cost.
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * Name of the column that stores the last-modified time stamp of the document.
    *
    * @default LAST_MODIFIED
    */
  var name: js.UndefOr[String] = js.native
}
object Index {
  
  @scala.inline
  def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
