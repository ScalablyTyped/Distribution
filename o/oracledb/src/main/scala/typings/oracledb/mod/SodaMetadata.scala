package typings.oracledb.mod

import typings.oracledb.anon.AssignmentMethod
import typings.oracledb.anon.Cache
import typings.oracledb.anon.Index
import typings.oracledb.anon.Method
import typings.oracledb.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata specifying various details about the collection, such as its database storage, whether it should
  * track version and time stamp document components, how such components are generated, and what document
  * types are.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-collection-metadata-components-reference.html#GUID-46E36926-7E6C-4561-A19F-01C09428C56D
  */
@js.native
trait SodaMetadata extends js.Object {
  
  /** Object containing information related to the content column. */
  var contentColumn: js.UndefOr[Cache] = js.native
  
  /** Object containing information related to the creation time column. */
  var creationTimeColumn: js.UndefOr[Name] = js.native
  
  /** Object containing information related to the key column. */
  var keyColumn: js.UndefOr[AssignmentMethod] = js.native
  
  /** Object containing information related to the last modified column. */
  var lastModifiedColumn: js.UndefOr[Index] = js.native
  
  /** Object containing information related to the media type column. */
  var mediaTypeColumn: js.UndefOr[Name] = js.native
  
  /** Specifies whether or not the collection is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Name of the Oracle Database schema that owns the table or view to which the collection is mapped. */
  var schemaName: js.UndefOr[String] = js.native
  
  /** Name of the table to which the collection is mapped. */
  var tableName: js.UndefOr[String] = js.native
  
  /** Object containing information related to the version column. */
  var versionColumn: js.UndefOr[Method] = js.native
  
  /** Name of the view to which the collection is mapped. */
  var viewName: js.UndefOr[String] = js.native
}
object SodaMetadata {
  
  @scala.inline
  def apply(): SodaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaMetadata]
  }
  
  @scala.inline
  implicit class SodaMetadataOps[Self <: SodaMetadata] (val x: Self) extends AnyVal {
    
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
    def setContentColumn(value: Cache): Self = this.set("contentColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentColumn: Self = this.set("contentColumn", js.undefined)
    
    @scala.inline
    def setCreationTimeColumn(value: Name): Self = this.set("creationTimeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeColumn: Self = this.set("creationTimeColumn", js.undefined)
    
    @scala.inline
    def setKeyColumn(value: AssignmentMethod): Self = this.set("keyColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyColumn: Self = this.set("keyColumn", js.undefined)
    
    @scala.inline
    def setLastModifiedColumn(value: Index): Self = this.set("lastModifiedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedColumn: Self = this.set("lastModifiedColumn", js.undefined)
    
    @scala.inline
    def setMediaTypeColumn(value: Name): Self = this.set("mediaTypeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaTypeColumn: Self = this.set("mediaTypeColumn", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setVersionColumn(value: Method): Self = this.set("versionColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionColumn: Self = this.set("versionColumn", js.undefined)
    
    @scala.inline
    def setViewName(value: String): Self = this.set("viewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewName: Self = this.set("viewName", js.undefined)
  }
}
