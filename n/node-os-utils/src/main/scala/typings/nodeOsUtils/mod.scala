package typings.nodeOsUtils

import typings.nodeOsUtils.cpuMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-os-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-os-utils", "cpu")
  @js.native
  val cpu: default = js.native
  
  @JSImport("node-os-utils", "drive")
  @js.native
  val drive: typings.nodeOsUtils.driveMod.default = js.native
  
  inline def exec(command: String): js.Function0[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[String]]]
  
  inline def isNotSupported(res: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotSupported")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("node-os-utils", "mem")
  @js.native
  val mem: typings.nodeOsUtils.memMod.default = js.native
  
  @JSImport("node-os-utils", "netstat")
  @js.native
  val netstat: typings.nodeOsUtils.netstatMod.default = js.native
  
  @JSImport("node-os-utils", "openfiles")
  @js.native
  val openfiles: typings.nodeOsUtils.openfilesMod.default = js.native
  
  object options {
    
    @JSImport("node-os-utils", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-os-utils", "options.INTERVAL")
    @js.native
    def INTERVAL: Double = js.native
    inline def INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-os-utils", "options.NOT_SUPPORTED_VALUE")
    @js.native
    def NOT_SUPPORTED_VALUE: String = js.native
    inline def NOT_SUPPORTED_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_VALUE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-os-utils", "os")
  @js.native
  val os: typings.nodeOsUtils.osMod.default = js.native
  
  @JSImport("node-os-utils", "oscmd")
  @js.native
  val oscmd: typings.nodeOsUtils.oscmdMod.default = js.native
  
  @JSImport("node-os-utils", "proc")
  @js.native
  val proc: typings.nodeOsUtils.procMod.default = js.native
  
  @JSImport("node-os-utils", "users")
  @js.native
  val users: typings.nodeOsUtils.usersMod.default = js.native
  
  inline def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapExec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Function0[js.Promise[String]]]]
}
