package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOsOsapplicationMod {
  
  inline def apply(command: String): Unit = ^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/os/OSApplication", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OSApplication {
    def this(command: String) = this()
  }
  @JSImport("@nginstack/engine/lib/os/OSApplication", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/os/OSApplication", "HIDE")
  @js.native
  val HIDE: String = js.native
  
  @JSImport("@nginstack/engine/lib/os/OSApplication", "INFINITE_TIMEOUT")
  @js.native
  val INFINITE_TIMEOUT: Double = js.native
  
  @JSImport("@nginstack/engine/lib/os/OSApplication", "MAXIMIZE")
  @js.native
  val MAXIMIZE: String = js.native
  
  @JSImport("@nginstack/engine/lib/os/OSApplication", "MINIMIZE")
  @js.native
  val MINIMIZE: String = js.native
  
  @JSImport("@nginstack/engine/lib/os/OSApplication", "SHOW")
  @js.native
  val SHOW: String = js.native
  
  inline def startDetached(command: String, parameters: String, workingDirectory: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startDetached")(command.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], workingDirectory.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait OSApplication extends StObject {
    
    def getExitCode(): Double = js.native
    
    def getIsRunning(): Boolean = js.native
    
    def getLastErrorCode(): Double = js.native
    
    def getPid(): Double = js.native
    
    def redirectStdErrorOutput(outputErrorFileName: String): Unit = js.native
    
    def redirectStdInput(inputFileName: String): Unit = js.native
    
    def redirectStdOutput(outputFileName: String): Unit = js.native
    
    def start(parameters: String, commandShow: String): Boolean = js.native
    
    def startDetached(parameters: Any, commandShow: Any): Unit = js.native
    
    def terminate(): Boolean = js.native
    def terminate(opt_timeout: Double): Boolean = js.native
    
    def waitFor(): Boolean = js.native
    def waitFor(opt_timeout: Double): Boolean = js.native
    
    var workingDirectory: Any = js.native
  }
}
