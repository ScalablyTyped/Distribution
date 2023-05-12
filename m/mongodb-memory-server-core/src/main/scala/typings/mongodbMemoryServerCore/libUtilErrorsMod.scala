package typings.mongodbMemoryServerCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilErrorsMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "AssertionFallbackError")
  @js.native
  open class AssertionFallbackError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "AuthNotObjectError")
  @js.native
  open class AuthNotObjectError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "BinaryNotFoundError")
  @js.native
  open class BinaryNotFoundError protected ()
    extends StObject
       with Error {
    def this(path: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var path: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "EnsureInstanceError")
  @js.native
  open class EnsureInstanceError protected ()
    extends StObject
       with Error {
    def this(isRunning: Boolean) = this()
    
    var isRunning: Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "GenericMMSError")
  @js.native
  open class GenericMMSError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "InstanceInfoError")
  @js.native
  open class InstanceInfoError protected ()
    extends StObject
       with Error {
    def this(where: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var where: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "InsufficientPermissionsError")
  @js.native
  open class InsufficientPermissionsError protected ()
    extends StObject
       with Error {
    def this(path: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var path: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "KeyFileMissingError")
  @js.native
  open class KeyFileMissingError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "KnownVersionIncompatibilityError")
  @js.native
  open class KnownVersionIncompatibilityError protected ()
    extends StObject
       with Error {
    def this(dist: String, requested_version: String, available_versions: String) = this()
    def this(dist: String, requested_version: String, available_versions: String, extra: String) = this()
    
    var available_versions: String = js.native
    
    var dist: String = js.native
    
    var extra: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var requested_version: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "Md5CheckFailedError")
  @js.native
  open class Md5CheckFailedError protected ()
    extends StObject
       with Error {
    def this(binarymd5: String, checkfilemd5: String) = this()
    
    var binarymd5: String = js.native
    
    var checkfilemd5: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "NoRegexMatchError")
  @js.native
  open class NoRegexMatchError protected ()
    extends StObject
       with Error {
    def this(name: String) = this()
    def this(name: String, extra: String) = this()
    
    var extra: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "NoSystemBinaryFoundError")
  @js.native
  open class NoSystemBinaryFoundError protected ()
    extends StObject
       with Error {
    def this(binaryPath: String) = this()
    
    var binaryPath: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "ParseArchiveRegexError")
  @js.native
  open class ParseArchiveRegexError protected ()
    extends StObject
       with Error {
    def this(key: String) = this()
    
    var key: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "ReplsetCountLowError")
  @js.native
  open class ReplsetCountLowError protected ()
    extends StObject
       with Error {
    def this(count: Double) = this()
    
    var count: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "StartBinaryFailedError")
  @js.native
  open class StartBinaryFailedError protected ()
    extends StObject
       with Error {
    def this(binary: String) = this()
    
    var binary: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "StateError")
  @js.native
  open class StateError protected ()
    extends StObject
       with Error {
    def this(wantedStates: js.Array[String], gotState: String) = this()
    
    var gotState: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var wantedStates: js.Array[String] = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "StdoutInstanceError")
  @js.native
  open class StdoutInstanceError protected ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "UnableToUnlockLockfileError")
  @js.native
  open class UnableToUnlockLockfileError protected ()
    extends StObject
       with Error {
    def this(thisInstance: Boolean, file: String) = this()
    
    var file: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var thisInstance: Boolean = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "UnexpectedCloseError")
  @js.native
  open class UnexpectedCloseError ()
    extends StObject
       with Error {
    def this(code: Double) = this()
    def this(code: Double, signal: String) = this()
    def this(code: Null, signal: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "UnknownArchitectureError")
  @js.native
  open class UnknownArchitectureError protected ()
    extends StObject
       with Error {
    def this(arch: String) = this()
    def this(arch: String, platform: String) = this()
    
    var arch: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var platform: js.UndefOr[String] = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "UnknownLockfileStatusError")
  @js.native
  open class UnknownLockfileStatusError protected ()
    extends StObject
       with Error {
    def this(status: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "UnknownPlatformError")
  @js.native
  open class UnknownPlatformError protected ()
    extends StObject
       with Error {
    def this(platform: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var platform: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "UnknownVersionError")
  @js.native
  open class UnknownVersionError protected ()
    extends StObject
       with Error {
    def this(version: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var version: String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/errors", "WaitForPrimaryTimeoutError")
  @js.native
  open class WaitForPrimaryTimeoutError protected ()
    extends StObject
       with Error {
    def this(timeout: Double) = this()
    def this(timeout: Double, where: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var timeout: Double = js.native
    
    var where: js.UndefOr[String] = js.native
  }
}
