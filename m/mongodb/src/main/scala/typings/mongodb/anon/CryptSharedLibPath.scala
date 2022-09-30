package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptSharedLibPath extends StObject {
  
  /**
    * Full path to a MongoDB Crypt shared library to be used (instead of mongocryptd).
    *
    * This needs to be the path to the file itself, not a directory.
    * It can be an absolute or relative path. If the path is relative and
    * its first component is `$ORIGIN`, it will be replaced by the directory
    * containing the mongodb-client-encryption native addon file. Otherwise,
    * the path will be interpreted relative to the current working directory.
    *
    * Currently, loading different MongoDB Crypt shared library files from different
    * MongoClients in the same process is not supported.
    *
    * If this option is provided and no MongoDB Crypt shared library could be loaded
    * from the specified location, creating the MongoClient will fail.
    *
    * If this option is not provided and `cryptSharedLibRequired` is not specified,
    * the AutoEncrypter will attempt to spawn and/or use mongocryptd according
    * to the mongocryptd-specific `extraOptions` options.
    *
    * Specifying a path prevents mongocryptd from being used as a fallback.
    *
    * Requires the MongoDB Crypt shared library, available in MongoDB 6.0 or higher.
    */
  var cryptSharedLibPath: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, never use mongocryptd and instead fail when the MongoDB Crypt
    * shared library could not be loaded.
    *
    * This is always true when `cryptSharedLibPath` is specified.
    *
    * Requires the MongoDB Crypt shared library, available in MongoDB 6.0 or higher.
    */
  var cryptSharedLibRequired: js.UndefOr[Boolean] = js.undefined
  
  /** If true, autoEncryption will not attempt to spawn a mongocryptd before connecting  */
  var mongocryptdBypassSpawn: js.UndefOr[Boolean] = js.undefined
  
  /** Command line arguments to use when auto-spawning a mongocryptd */
  var mongocryptdSpawnArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The path to the mongocryptd executable on the system */
  var mongocryptdSpawnPath: js.UndefOr[String] = js.undefined
  
  /**
    * A local process the driver communicates with to determine how to encrypt values in a command.
    * Defaults to "mongodb://%2Fvar%2Fmongocryptd.sock" if domain sockets are available or "mongodb://localhost:27020" otherwise
    */
  var mongocryptdURI: js.UndefOr[String] = js.undefined
}
object CryptSharedLibPath {
  
  inline def apply(): CryptSharedLibPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptSharedLibPath]
  }
  
  extension [Self <: CryptSharedLibPath](x: Self) {
    
    inline def setCryptSharedLibPath(value: String): Self = StObject.set(x, "cryptSharedLibPath", value.asInstanceOf[js.Any])
    
    inline def setCryptSharedLibPathUndefined: Self = StObject.set(x, "cryptSharedLibPath", js.undefined)
    
    inline def setCryptSharedLibRequired(value: Boolean): Self = StObject.set(x, "cryptSharedLibRequired", value.asInstanceOf[js.Any])
    
    inline def setCryptSharedLibRequiredUndefined: Self = StObject.set(x, "cryptSharedLibRequired", js.undefined)
    
    inline def setMongocryptdBypassSpawn(value: Boolean): Self = StObject.set(x, "mongocryptdBypassSpawn", value.asInstanceOf[js.Any])
    
    inline def setMongocryptdBypassSpawnUndefined: Self = StObject.set(x, "mongocryptdBypassSpawn", js.undefined)
    
    inline def setMongocryptdSpawnArgs(value: js.Array[String]): Self = StObject.set(x, "mongocryptdSpawnArgs", value.asInstanceOf[js.Any])
    
    inline def setMongocryptdSpawnArgsUndefined: Self = StObject.set(x, "mongocryptdSpawnArgs", js.undefined)
    
    inline def setMongocryptdSpawnArgsVarargs(value: String*): Self = StObject.set(x, "mongocryptdSpawnArgs", js.Array(value*))
    
    inline def setMongocryptdSpawnPath(value: String): Self = StObject.set(x, "mongocryptdSpawnPath", value.asInstanceOf[js.Any])
    
    inline def setMongocryptdSpawnPathUndefined: Self = StObject.set(x, "mongocryptdSpawnPath", js.undefined)
    
    inline def setMongocryptdURI(value: String): Self = StObject.set(x, "mongocryptdURI", value.asInstanceOf[js.Any])
    
    inline def setMongocryptdURIUndefined: Self = StObject.set(x, "mongocryptdURI", js.undefined)
  }
}
