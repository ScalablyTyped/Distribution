package typings.nexpect

import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: String): IChain = js.native
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: String, options: ISpawnOptions): IChain = js.native
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: String, params: js.UndefOr[scala.Nothing], options: ISpawnOptions): IChain = js.native
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: String, params: js.Array[_]): IChain = js.native
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: String, params: js.Array[_], options: ISpawnOptions): IChain = js.native
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: js.Array[String]): IChain = js.native
  @JSImport("nexpect", "spawn")
  @js.native
  def spawn(command: js.Array[String], options: ISpawnOptions): IChain = js.native
  
  @js.native
  trait IChain extends StObject {
    
    def expect(expectation: String): IChain = js.native
    def expect(expectation: RegExp): IChain = js.native
    
    def run(
      callback: js.Function3[/* err */ Error, /* output */ js.Array[String], /* exit */ String | Double, Unit]
    ): ChildProcess = js.native
    
    def sendEof(): IChain = js.native
    
    def sendline(line: String): IChain = js.native
    
    def wait(expectation: String): IChain = js.native
    def wait(expectation: RegExp): IChain = js.native
  }
  
  @js.native
  trait ISpawnOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[js.Any] = js.native
    
    var ignoreCase: js.UndefOr[js.Any] = js.native
    
    var stream: js.UndefOr[js.Any] = js.native
    
    var stripColors: js.UndefOr[js.Any] = js.native
    
    var verbose: js.UndefOr[js.Any] = js.native
  }
  object ISpawnOptions {
    
    @scala.inline
    def apply(): ISpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpawnOptions]
    }
    
    @scala.inline
    implicit class ISpawnOptionsMutableBuilder[Self <: ISpawnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: js.Any): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStripColors(value: js.Any): Self = StObject.set(x, "stripColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripColorsUndefined: Self = StObject.set(x, "stripColors", js.undefined)
      
      @scala.inline
      def setVerbose(value: js.Any): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
