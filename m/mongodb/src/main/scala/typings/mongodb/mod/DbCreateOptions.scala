package typings.mongodb.mod

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbCreateOptions
  extends StObject
     with CommonOptions {
  
  /**
    * If the database authentication is dependent on another databaseName.
    */
  var authSource: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a
    * working connection, default is -1 which is unlimited.
    */
  var bufferMaxEntries: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Default: false; Force server to create _id fields instead of client.
    */
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify if the BSON serializer should ignore undefined fields.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: false; Use c++ bson parser.
    */
  var native_parser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom primary key factory to generate _id values (see Custom primary keys).
    */
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  
  /**
    * ES6 compatible promise constructor
    */
  var promiseLibrary: js.UndefOr[PromiseConstructor] = js.undefined
  
  /**
    * Default: false; Promotes Binary BSON values to native Node Buffers
    */
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: true; Promotes Long values to number if they fit inside the 53 bits resolution.
    */
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default: true; Promotes BSON values to native types where possible, set to false to only receive wrapper types.
    */
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
    */
  var readConcern: js.UndefOr[ReadConcern | String] = js.undefined
  
  /**
    * the prefered read preference. use 'ReadPreference' class.
    */
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}
object DbCreateOptions {
  
  inline def apply(): DbCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCreateOptions]
  }
  
  extension [Self <: DbCreateOptions](x: Self) {
    
    inline def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
    
    inline def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
    
    inline def setBufferMaxEntries(value: scala.Double): Self = StObject.set(x, "bufferMaxEntries", value.asInstanceOf[js.Any])
    
    inline def setBufferMaxEntriesUndefined: Self = StObject.set(x, "bufferMaxEntries", js.undefined)
    
    inline def setForceServerObjectId(value: Boolean): Self = StObject.set(x, "forceServerObjectId", value.asInstanceOf[js.Any])
    
    inline def setForceServerObjectIdUndefined: Self = StObject.set(x, "forceServerObjectId", js.undefined)
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    inline def setNative_parser(value: Boolean): Self = StObject.set(x, "native_parser", value.asInstanceOf[js.Any])
    
    inline def setNative_parserUndefined: Self = StObject.set(x, "native_parser", js.undefined)
    
    inline def setPkFactory(value: js.Object): Self = StObject.set(x, "pkFactory", value.asInstanceOf[js.Any])
    
    inline def setPkFactoryUndefined: Self = StObject.set(x, "pkFactory", js.undefined)
    
    inline def setPromiseLibrary(value: PromiseConstructor): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
    
    inline def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
    
    inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
    
    inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
    
    inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
    
    inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReadConcern(value: ReadConcern | String): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
  }
}
