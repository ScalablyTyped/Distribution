package typings.mysql.mod

import typings.mysql.anon.UntypedFieldInfotypestrin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends js.Object {
  
  /**
    * Either a boolean or string. If true, tables will be nested objects. If string (e.g. '_'), tables will be
    * nested as tableName_fieldName
    */
  var nestTables: js.UndefOr[js.Any] = js.native
  
  /**
    * The SQL for the query
    */
  var sql: String = js.native
  
  /**
    * Every operation takes an optional inactivity timeout option. This allows you to specify appropriate timeouts for
    * operations. It is important to note that these timeouts are not part of the MySQL protocol, and rather timeout
    * operations through the client. This means that when a timeout is reached, the connection it occurred on will be
    * destroyed and no further operations can be performed.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
    * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
    *
    * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
    *
    * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
    *
    * field.string()
    * field.buffer()
    * field.geometry()
    *
    * are aliases for
    *
    * parser.parseLengthCodedString()
    * parser.parseLengthCodedBuffer()
    * parser.parseGeometryValue()
    *
    * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
    */
  var typeCast: js.UndefOr[TypeCast] = js.native
  
  /**
    * Values for template query
    */
  var values: js.UndefOr[js.Any] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(sql: String): QueryOptions = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
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
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestTables(value: js.Any): Self = this.set("nestTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestTables: Self = this.set("nestTables", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = this.set("typeCast", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeCast(value: TypeCast): Self = this.set("typeCast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeCast: Self = this.set("typeCast", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
