package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.RequiredAutomaticAuth
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.AutomaticAuth
import typings.mongodbMemoryServerCore.libUtilGetosMod.LinuxOS
import typings.node.childProcessMod.ChildProcess
import typings.node.fsMod.Stats
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilUtilsMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("mongodb-memory-server-core/lib/util/utils", "ManagerAdvanced")
  @js.native
  open class ManagerAdvanced () extends ManagerBase {
    
    def cleanup(cleanup: Cleanup): js.Promise[Unit] = js.native
    /** @deprecated replace argument with `Cleanup` interface object */
    def cleanup(force: Boolean): js.Promise[Unit] = js.native
    
    def getUri(): String = js.native
    def getUri(otherDB: String): String = js.native
    def getUri(otherDB: Boolean): String = js.native
  }
  
  /* note: abstract class */ @JSImport("mongodb-memory-server-core/lib/util/utils", "ManagerBase")
  @js.native
  open class ManagerBase () extends StObject {
    
    def start(): js.Promise[Unit] = js.native
    def start(forceSamePort: Boolean): js.Promise[Unit] = js.native
    
    /** @deprecated replace argument with `Cleanup` interface object */
    def stop(cleanup: Boolean): js.Promise[Boolean] = js.native
    def stop(cleanup: Cleanup): js.Promise[Boolean] = js.native
  }
  
  inline def assertion(cond: Any): /* asserts cond */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(cond.asInstanceOf[js.Any]).asInstanceOf[/* asserts cond */ Boolean]
  inline def assertion(cond: Any, error: js.Error): /* asserts cond */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(cond.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[/* asserts cond */ Boolean]
  
  inline def authDefault(opts: AutomaticAuth): RequiredAutomaticAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("authDefault")(opts.asInstanceOf[js.Any]).asInstanceOf[RequiredAutomaticAuth]
  
  inline def checkBinaryPermissions(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBinaryPermissions")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def ensureAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureAsync")().asInstanceOf[js.Promise[Unit]]
  
  inline def errorWithCode(err: Any): /* is mongodb-memory-server-core.mongodb-memory-server-core/lib/util/utils.ErrorWithCode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("errorWithCode")(err.asInstanceOf[js.Any]).asInstanceOf[/* is mongodb-memory-server-core.mongodb-memory-server-core/lib/util/utils.ErrorWithCode */ Boolean]
  
  inline def generateDbName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDbName")().asInstanceOf[String]
  inline def generateDbName(dbName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDbName")(dbName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHost(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHost")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAlive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlive")().asInstanceOf[Boolean]
  inline def isAlive(pid: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlive")(pid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndefined(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def killProcess(childprocess: ChildProcess, name: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("killProcess")(childprocess.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def killProcess(childprocess: ChildProcess, name: String, mongodPort: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("killProcess")(childprocess.asInstanceOf[js.Any], name.asInstanceOf[js.Any], mongodPort.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def mkdir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def pathExists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def statPath(path: String): js.Promise[js.UndefOr[Stats]] = ^.asInstanceOf[js.Dynamic].applyDynamic("statPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Stats]]]
  
  inline def tryReleaseFile(path: String, parser: js.Function1[/* output */ String, js.UndefOr[LinuxOS]]): js.Promise[js.UndefOr[LinuxOS]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryReleaseFile")(path.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[LinuxOS]]]
  
  inline def uriTemplate(host: String, port: Double, dbName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTemplate")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def uriTemplate(host: String, port: Double, dbName: String, query: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTemplate")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def uriTemplate(host: String, port: Unit, dbName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTemplate")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def uriTemplate(host: String, port: Unit, dbName: String, query: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTemplate")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Cleanup extends StObject {
    
    /**
      * Setting this to `true` will activate cleanup
      * @default true
      */
    var doCleanup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to `true` will cleanup the directory even if it is *not* a temporary directory
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object Cleanup {
    
    inline def apply(): Cleanup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cleanup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cleanup] (val x: Self) extends AnyVal {
      
      inline def setDoCleanup(value: Boolean): Self = StObject.set(x, "doCleanup", value.asInstanceOf[js.Any])
      
      inline def setDoCleanupUndefined: Self = StObject.set(x, "doCleanup", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  /**
    * This is here, because NodeJS does not have a FSError type
    */
  trait ErrorWithCode_
    extends StObject
       with Error {
    
    var code: String
  }
  object ErrorWithCode_ {
    
    inline def apply(code: String, message: String, name: String): ErrorWithCode_ = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithCode_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorWithCode_] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
