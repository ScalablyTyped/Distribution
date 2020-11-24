package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information regarding the outcome of a successful connection.execute().
  */
@js.native
trait Result[T] extends js.Object {
  
  /**
    * This property will be defined if the executed statement returned Implicit Results. Depending on the value of resultSet it will either be an array,
    * each element containing an array of rows from one query, or an array of ResultSets each corresponding to a query.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#implicitresults
    * @since 4.0
    */
  var implicitResults: js.UndefOr[js.Array[js.Array[T] | ResultSet[T]]] = js.native
  
  /**
    * ROWID of a row affected by an INSERT, UPDATE, DELETE or MERGE statement. For other statements,
    * or if no row was affected, it is not set. If more than one row was affected, only the ROWID of the last row is returned.
    * 
    * @since 4.2
    */
  val lastRowid: js.UndefOr[String] = js.native
  
  /**
    * For SELECT statements, this contains an array of objects describing details of columns for the select list.
    * For non queries, this property is undefined.
    *
    * Each column’s name is always given. If the oracledb.extendedMetaData or execute() option extendedMetaData
    * are true then additional information is included.
    */
  var metaData: js.UndefOr[js.Array[Metadata[T]]] = js.native
  
  /**
    * This contains the output values of OUT and IN OUT binds. If bindParams is passed as an array,
    * then outBinds is returned as an array. If bindParams is passed as an object,
    * then outBinds is returned as an object. If there are no OUT or IN OUT binds, the value is undefined.
    */
  var outBinds: js.UndefOr[T] = js.native
  
  /**
    * For SELECT statements when the resultSet option is true, use the resultSet object to fetch rows.
    *
    * When using this option, resultSet.close() must be called when the ResultSet is no longer needed.
    * This is true whether or not rows have been fetched from the ResultSet.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsetclass
    * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsethandling
    */
  var resultSet: js.UndefOr[ResultSet[T]] = js.native
  
  /**
    * For SELECT statements using direct fetches, rows contains an array of fetched rows.
    * It will be NULL if there is an error or the SQL statement was not a SELECT statement.
    * By default, the rows are in an array of column value arrays, but this can be changed to arrays
    * of objects by setting outFormat to oracledb.OBJECT. If a single row is fetched,
    * then rows is an array that contains one single row.
    *
    * The number of rows returned is limited by oracledb.maxRows or the maxRows option in an execute() call.
    * If maxRows is 0, then the number of rows is limited by Node.js memory constraints.
    */
  var rows: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * For DML statements (including SELECT FOR UPDATE) this contains the number of rows affected,
    * for example the number of rows inserted. For non-DML statements such as queries and PL/SQL statements,
    * rowsAffected is undefined.
    */
  var rowsAffected: js.UndefOr[Double] = js.native
}
object Result {
  
  @scala.inline
  def apply[T](): Result[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result[T]]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result[_], T] (val x: Self with Result[T]) extends AnyVal {
    
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
    def setImplicitResultsVarargs(value: (js.Array[T] | ResultSet[T])*): Self = this.set("implicitResults", js.Array(value :_*))
    
    @scala.inline
    def setImplicitResults(value: js.Array[js.Array[T] | ResultSet[T]]): Self = this.set("implicitResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitResults: Self = this.set("implicitResults", js.undefined)
    
    @scala.inline
    def setLastRowid(value: String): Self = this.set("lastRowid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRowid: Self = this.set("lastRowid", js.undefined)
    
    @scala.inline
    def setMetaDataVarargs(value: Metadata[T]*): Self = this.set("metaData", js.Array(value :_*))
    
    @scala.inline
    def setMetaData(value: js.Array[Metadata[T]]): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    
    @scala.inline
    def setOutBinds(value: T): Self = this.set("outBinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutBinds: Self = this.set("outBinds", js.undefined)
    
    @scala.inline
    def setResultSet(value: ResultSet[T]): Self = this.set("resultSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSet: Self = this.set("resultSet", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: T*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[T]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRowsAffected(value: Double): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsAffected: Self = this.set("rowsAffected", js.undefined)
  }
}
