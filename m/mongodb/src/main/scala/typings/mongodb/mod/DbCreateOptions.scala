package typings.mongodb.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbCreateOptions extends CommonOptions {
  
  /**
    * If the database authentication is dependent on another databaseName.
    */
  var authSource: js.UndefOr[String] = js.native
  
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a
    * working connection, default is -1 which is unlimited.
    */
  var bufferMaxEntries: js.UndefOr[scala.Double] = js.native
  
  /**
    * Default: false; Force server to create _id fields instead of client.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify if the BSON serializer should ignore undefined fields.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false; Use c++ bson parser.
    */
  var native_parser: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom primary key factory to generate _id values (see Custom primary keys).
    */
  var pkFactory: js.UndefOr[js.Object] = js.native
  
  /**
    * ES6 compatible promise constructor
    */
  var promiseLibrary: js.UndefOr[PromiseConstructor] = js.native
  
  /**
    * Default: false; Promotes Binary BSON values to native Node Buffers
    */
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true; Promotes Long values to number if they fit inside the 53 bits resolution.
    */
  var promoteLongs: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: true; Promotes BSON values to native types where possible, set to false to only receive wrapper types.
    */
  var promoteValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
    */
  var readConcern: js.UndefOr[ReadConcern | String] = js.native
  
  /**
    * the prefered read preference. use 'ReadPreference' class.
    */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
}
object DbCreateOptions {
  
  @scala.inline
  def apply(): DbCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCreateOptions]
  }
  
  @scala.inline
  implicit class DbCreateOptionsOps[Self <: DbCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthSource(value: String): Self = this.set("authSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSource: Self = this.set("authSource", js.undefined)
    
    @scala.inline
    def setBufferMaxEntries(value: scala.Double): Self = this.set("bufferMaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferMaxEntries: Self = this.set("bufferMaxEntries", js.undefined)
    
    @scala.inline
    def setForceServerObjectId(value: Boolean): Self = this.set("forceServerObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceServerObjectId: Self = this.set("forceServerObjectId", js.undefined)
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    
    @scala.inline
    def setNative_parser(value: Boolean): Self = this.set("native_parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNative_parser: Self = this.set("native_parser", js.undefined)
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = this.set("pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkFactory: Self = this.set("pkFactory", js.undefined)
    
    @scala.inline
    def setPromiseLibrary(value: PromiseConstructor): Self = this.set("promiseLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromiseLibrary: Self = this.set("promiseLibrary", js.undefined)
    
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = this.set("promoteBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteBuffers: Self = this.set("promoteBuffers", js.undefined)
    
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = this.set("promoteLongs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteLongs: Self = this.set("promoteLongs", js.undefined)
    
    @scala.inline
    def setPromoteValues(value: Boolean): Self = this.set("promoteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteValues: Self = this.set("promoteValues", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadConcern(value: ReadConcern | String): Self = this.set("readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadConcern: Self = this.set("readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
  }
}
