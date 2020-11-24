package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Included in the result of a query execution to describe details of the columns involved.
  */
@js.native
trait Metadata[T] extends js.Object {
  
  /**
    * Database byte size. This is only set for DB_TYPE_VARCHAR, DB_TYPE_CHAR and DB_TYPE_RAW column types.
    */
  var byteSize: js.UndefOr[Double] = js.native
  
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsdbtype
    */
  var dbType: js.UndefOr[Double] = js.native
  
  /**
    * The class associated with the database type. This is only set if the database type is an object type.
    */
  var dbTypeClass: js.UndefOr[DBObjectClass[T]] = js.native
  
  /**
    * Name of the database type, such as “NUMBER” or “VARCHAR2”. For object types, this will be the object name.
    */
  var dbTypeName: js.UndefOr[String] = js.native
  
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsnodbtype
    */
  var fetchType: js.UndefOr[Double] = js.native
  
  /**
    * The column name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    */
  var name: String = js.native
  
  /**
    * Indicates whether NULL values are permitted for this column.
    */
  var nullable: js.UndefOr[Boolean] = js.native
  
  /**
    * Set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Set only for DB_TYPE_NUMBER columns.
    */
  var scale: js.UndefOr[Double] = js.native
}
object Metadata {
  
  @scala.inline
  def apply[T](name: String): Metadata[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata[T]]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata[_], T] (val x: Self with Metadata[T]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteSize(value: Double): Self = this.set("byteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteSize: Self = this.set("byteSize", js.undefined)
    
    @scala.inline
    def setDbType(value: Double): Self = this.set("dbType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbType: Self = this.set("dbType", js.undefined)
    
    @scala.inline
    def setDbTypeClass(value: DBObjectClass[T]): Self = this.set("dbTypeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbTypeClass: Self = this.set("dbTypeClass", js.undefined)
    
    @scala.inline
    def setDbTypeName(value: String): Self = this.set("dbTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbTypeName: Self = this.set("dbTypeName", js.undefined)
    
    @scala.inline
    def setFetchType(value: Double): Self = this.set("fetchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchType: Self = this.set("fetchType", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
