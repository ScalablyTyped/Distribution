package typings.nexpect

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nexpect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spawn(command: String): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[IChain]
  inline def spawn(command: String, options: ISpawnOptions): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IChain]
  inline def spawn(command: String, params: js.Array[Any]): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[IChain]
  inline def spawn(command: String, params: js.Array[Any], options: ISpawnOptions): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IChain]
  inline def spawn(command: String, params: Unit, options: ISpawnOptions): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IChain]
  inline def spawn(command: js.Array[String]): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[IChain]
  inline def spawn(command: js.Array[String], options: ISpawnOptions): IChain = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IChain]
  
  @js.native
  trait IChain extends StObject {
    
    def expect(expectation: String): IChain = js.native
    def expect(expectation: js.RegExp): IChain = js.native
    
    def run(
      callback: js.Function3[/* err */ js.Error, /* output */ js.Array[String], /* exit */ String | Double, Unit]
    ): ChildProcess = js.native
    
    def sendEof(): IChain = js.native
    
    def sendline(line: String): IChain = js.native
    
    def wait(expectation: String): IChain = js.native
    def wait(expectation: js.RegExp): IChain = js.native
  }
  
  trait ISpawnOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[Any] = js.undefined
    
    var ignoreCase: js.UndefOr[Any] = js.undefined
    
    var stream: js.UndefOr[Any] = js.undefined
    
    var stripColors: js.UndefOr[Any] = js.undefined
    
    var verbose: js.UndefOr[Any] = js.undefined
  }
  object ISpawnOptions {
    
    inline def apply(): ISpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpawnOptions]
    }
    
    extension [Self <: ISpawnOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setIgnoreCase(value: Any): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setStream(value: Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStripColors(value: Any): Self = StObject.set(x, "stripColors", value.asInstanceOf[js.Any])
      
      inline def setStripColorsUndefined: Self = StObject.set(x, "stripColors", js.undefined)
      
      inline def setVerbose(value: Any): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
