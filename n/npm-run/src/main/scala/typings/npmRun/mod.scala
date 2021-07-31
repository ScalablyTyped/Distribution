package typings.npmRun

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.anon.encodingBufferEncodingExe
import typings.node.anon.encodingbuffernullExecOpt
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ChildProcessByStdio
import typings.node.childProcessMod.ChildProcessWithoutNullStreams
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecOptions
import typings.node.childProcessMod.ExecSyncOptions
import typings.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childProcessMod.SpawnSyncReturns
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod.StdioPipe
import typings.node.fsMod.BaseEncodingOptions
import typings.npmRun.anon.Fn0
import typings.npmRun.anon.FnCall
import typings.npmRun.anon.FnCallCommandArgsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npm-run", JSImport.Namespace)
  @js.native
  val ^ : Runner = js.native
  
  @js.native
  trait ExecFunction extends StObject {
    
    // no `options` definitely means stdout/stderr are `string`.
    def apply(command: String): ChildProcess = js.native
    def apply(
      command: String,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
    ): ChildProcess = js.native
    // `options` without an `encoding` means stdout/stderr are definitely `string`.
    def apply(command: String, options: (BaseEncodingOptions & ExecOptions) | ExecOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: (BaseEncodingOptions & ExecOptions) | ExecOptions,
      callback: js.Function3[
          ExecException | Null, 
          Buffer | (/* stdout */ String), 
          Buffer | (/* stderr */ String), 
          Unit
        ]
    ): ChildProcess = js.native
    def apply(
      command: String,
      options: Null,
      callback: js.Function3[
          /* error */ ExecException | Null, 
          /* stdout */ String | Buffer, 
          /* stderr */ String | Buffer, 
          Unit
        ]
    ): ChildProcess = js.native
    def apply(
      command: String,
      options: Unit,
      callback: js.Function3[
          /* error */ ExecException | Null, 
          /* stdout */ String | Buffer, 
          /* stderr */ String | Buffer, 
          Unit
        ]
    ): ChildProcess = js.native
    // `options` with well known `encoding` means stdout/stderr are definitely `string`.
    def apply(command: String, options: encodingBufferEncodingExe): ChildProcess = js.native
    def apply(
      command: String,
      options: encodingBufferEncodingExe,
      callback: js.Function3[
          ExecException | Null, 
          Buffer | (/* stdout */ String), 
          Buffer | (/* stderr */ String), 
          Unit
        ]
    ): ChildProcess = js.native
    // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
    def apply(command: String, options: encodingbuffernullExecOpt): ChildProcess = js.native
    def apply(
      command: String,
      options: encodingbuffernullExecOpt,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): ChildProcess = js.native
  }
  
  @js.native
  trait Runner
    extends StObject
       with ExecFunction {
    
    var exec: ExecFunction = js.native
    
    def execSync(command: String): String = js.native
    def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
    def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
    def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
    @JSName("execSync")
    def execSync_Buffer(command: String): Buffer = js.native
    @JSName("execSync")
    var execSync_Original: FnCall = js.native
    
    def spawn(command: String): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
    def spawn(
      command: String,
      args: js.Array[String],
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
    def spawn(
      command: String,
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    
    def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def spawnSync(command: String, args: Unit, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: Unit, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: Unit, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    @JSName("spawnSync")
    var spawnSync_Original: FnCallCommandArgsOptions = js.native
    
    @JSName("spawn")
    var spawn_Original: Fn0 = js.native
    
    def sync(command: String): String = js.native
    def sync(command: String, options: ExecSyncOptions): Buffer = js.native
    def sync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
    def sync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
    @JSName("sync")
    def sync_Buffer(command: String): Buffer = js.native
    @JSName("sync")
    var sync_Original: FnCall = js.native
  }
  
  type _To = Runner
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Runner = ^
}
