package typings.mongoose.mod

import typings.mongoose.anon.AutoIndexId
import typings.mongoose.anon.J
import typings.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOptions extends js.Object {
  
  /** defaults to true */
  var _id: js.UndefOr[Boolean] = js.native
  
  /**
    * When false, use the connection's autoCreate option
    * @default false
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
  
  /** defaults to false (which means use the connection's autoIndex option) */
  var autoIndex: js.UndefOr[Boolean] = js.native
  
  /** defaults to true */
  var bufferCommands: js.UndefOr[Boolean] = js.native
  
  /** defaults to false */
  var capped: js.UndefOr[Boolean | Double | AutoIndexId] = js.native
  
  /** Sets a default collation for every query and aggregation. */
  var collation: js.UndefOr[CollationOptions] = js.native
  
  /** no default */
  var collection: js.UndefOr[String] = js.native
  
  /** defaults to "__t" */
  var discriminatorKey: js.UndefOr[String] = js.native
  
  /** defaults to false. */
  var emitIndexErrors: js.UndefOr[Boolean] = js.native
  
  var excludeIndexes: js.UndefOr[js.Any] = js.native
  
  /** defaults to true */
  var id: js.UndefOr[Boolean] = js.native
  
  /** controls document#toObject behavior when called manually - defaults to true */
  var minimize: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[String] = js.native
  
  /** defaults to true. */
  var safe: js.UndefOr[Boolean | J] = js.native
  
  /**
    * By default, Mongoose will automatically
    * select() any populated paths.
    * To opt out, set selectPopulatedPaths to false.
    */
  var selectPopulatedPaths: js.UndefOr[Boolean] = js.native
  
  /** defaults to null */
  var shardKey: js.UndefOr[js.Object] = js.native
  
  /**
    * skipVersioning allows excluding paths from
    * versioning (the internal revision will not be
    * incremented even if these paths are updated).
    */
  var skipVersioning: js.UndefOr[js.Any] = js.native
  
  /**
    * Validation errors in a single nested schema are reported
    * both on the child and on the parent schema.
    * Set storeSubdocValidationError to false on the child schema
    * to make Mongoose only report the parent error.
    */
  var storeSubdocValidationError: js.UndefOr[Boolean] = js.native
  
  /** defaults to true */
  var strict: js.UndefOr[Boolean | `throw`] = js.native
  
  /** no default */
  var strictQuery: js.UndefOr[Boolean] = js.native
  
  /**
    * If set timestamps, mongoose assigns createdAt
    * and updatedAt fields to your schema, the type
    * assigned is Date.
    */
  var timestamps: js.UndefOr[Boolean | SchemaTimestampsConfig] = js.native
  
  /** no default */
  var toJSON: js.UndefOr[DocumentToObjectOptions] = js.native
  
  /** no default */
  var toObject: js.UndefOr[DocumentToObjectOptions] = js.native
  
  /** defaults to 'type' */
  var typeKey: js.UndefOr[String] = js.native
  
  /**
    * Determines whether a type set to a POJO becomes
    * a Mixed path or a Subdocument (defaults to true).
    */
  var typePojoToMixed: js.UndefOr[Boolean] = js.native
  
  /** defaults to false */
  var useNestedStrict: js.UndefOr[Boolean] = js.native
  
  /** defaults to false */
  var usePushEach: js.UndefOr[Boolean] = js.native
  
  /** defaults to true */
  var validateBeforeSave: js.UndefOr[Boolean] = js.native
  
  /** defaults to "__v" */
  var versionKey: js.UndefOr[String | Boolean] = js.native
  
  var writeConcern: js.UndefOr[WriteConcern] = js.native
}
object SchemaOptions {
  
  @scala.inline
  def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  @scala.inline
  implicit class SchemaOptionsOps[Self <: SchemaOptions] (val x: Self) extends AnyVal {
    
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
    def set_id(value: Boolean): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    
    @scala.inline
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
    
    @scala.inline
    def setAutoIndex(value: Boolean): Self = this.set("autoIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIndex: Self = this.set("autoIndex", js.undefined)
    
    @scala.inline
    def setBufferCommands(value: Boolean): Self = this.set("bufferCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferCommands: Self = this.set("bufferCommands", js.undefined)
    
    @scala.inline
    def setCapped(value: Boolean | Double | AutoIndexId): Self = this.set("capped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapped: Self = this.set("capped", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationOptions): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setDiscriminatorKey(value: String): Self = this.set("discriminatorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscriminatorKey: Self = this.set("discriminatorKey", js.undefined)
    
    @scala.inline
    def setEmitIndexErrors(value: Boolean): Self = this.set("emitIndexErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitIndexErrors: Self = this.set("emitIndexErrors", js.undefined)
    
    @scala.inline
    def setExcludeIndexes(value: js.Any): Self = this.set("excludeIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeIndexes: Self = this.set("excludeIndexes", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    
    @scala.inline
    def setRead(value: String): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean | J): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSelectPopulatedPaths(value: Boolean): Self = this.set("selectPopulatedPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectPopulatedPaths: Self = this.set("selectPopulatedPaths", js.undefined)
    
    @scala.inline
    def setShardKey(value: js.Object): Self = this.set("shardKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardKey: Self = this.set("shardKey", js.undefined)
    
    @scala.inline
    def setSkipVersioning(value: js.Any): Self = this.set("skipVersioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipVersioning: Self = this.set("skipVersioning", js.undefined)
    
    @scala.inline
    def setStoreSubdocValidationError(value: Boolean): Self = this.set("storeSubdocValidationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreSubdocValidationError: Self = this.set("storeSubdocValidationError", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean | `throw`): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setStrictQuery(value: Boolean): Self = this.set("strictQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictQuery: Self = this.set("strictQuery", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean | SchemaTimestampsConfig): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setToJSON(value: DocumentToObjectOptions): Self = this.set("toJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToJSON: Self = this.set("toJSON", js.undefined)
    
    @scala.inline
    def setToObject(value: DocumentToObjectOptions): Self = this.set("toObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToObject: Self = this.set("toObject", js.undefined)
    
    @scala.inline
    def setTypeKey(value: String): Self = this.set("typeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeKey: Self = this.set("typeKey", js.undefined)
    
    @scala.inline
    def setTypePojoToMixed(value: Boolean): Self = this.set("typePojoToMixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypePojoToMixed: Self = this.set("typePojoToMixed", js.undefined)
    
    @scala.inline
    def setUseNestedStrict(value: Boolean): Self = this.set("useNestedStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNestedStrict: Self = this.set("useNestedStrict", js.undefined)
    
    @scala.inline
    def setUsePushEach(value: Boolean): Self = this.set("usePushEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePushEach: Self = this.set("usePushEach", js.undefined)
    
    @scala.inline
    def setValidateBeforeSave(value: Boolean): Self = this.set("validateBeforeSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateBeforeSave: Self = this.set("validateBeforeSave", js.undefined)
    
    @scala.inline
    def setVersionKey(value: String | Boolean): Self = this.set("versionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionKey: Self = this.set("versionKey", js.undefined)
    
    @scala.inline
    def setWriteConcern(value: WriteConcern): Self = this.set("writeConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteConcern: Self = this.set("writeConcern", js.undefined)
  }
}
