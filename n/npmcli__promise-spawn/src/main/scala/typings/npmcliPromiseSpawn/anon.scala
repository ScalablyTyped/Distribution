package typings.npmcliPromiseSpawn

import typings.node.AbortSignal
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ChildProcessByStdio
import typings.node.childProcessMod.ChildProcessWithoutNullStreams
import typings.node.childProcessMod.IOType
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod.StdioOptions
import typings.node.childProcessMod.StdioPipe
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeStrings.ipc
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args[Output] extends StObject {
    
    var args: js.Array[String]
    
    var cmd: String
    
    var code: Double
    
    var signal: Signals | Null
    
    var stderr: Output
    
    var stdout: Output
  }
  object Args {
    
    inline def apply[Output](args: js.Array[String], cmd: String, code: Double, stderr: Output, stdout: Output): Args[Output] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], signal = null)
      __obj.asInstanceOf[Args[Output]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args[?], Output] (val x: Self & Args[Output]) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setStderr(value: Output): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: Output): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(command: String): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
    def apply(
      command: String,
      args: js.Array[String],
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, options: SpawnOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def apply(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  }
  
  /* Inlined @npmcli/promise-spawn.@npmcli/promise-spawn.PromiseSpawnOptions & {  command :string | undefined} */
  trait PromiseSpawnOptionscomman extends StObject {
    
    var argv0: js.UndefOr[String] = js.undefined
    
    var command: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var detached: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      * The signal value to be used when the spawned process will be killed by the abort signal.
      * @default 'SIGTERM'
      */
    var killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    /**
      * Specify the kind of serialization used for sending messages between processes.
      * @default 'json'
      */
    var serialization: js.UndefOr[SerializationType] = js.undefined
    
    var shell: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Can be set to 'pipe', 'inherit', 'overlapped', or 'ignore', or an array of these strings.
      * If passed as an array, the first element is used for `stdin`, the second for
      * `stdout`, and the third for `stderr`. A fourth element can be used to
      * specify the `stdio` behavior beyond the standard streams. See
      * {@link ChildProcess.stdio} for more information.
      *
      * @default 'pipe'
      */
    var stdio: js.UndefOr[StdioOptions] = js.undefined
    
    var stdioString: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 0
      */
    /**
      * In milliseconds the maximum amount of time the process is allowed to run.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    /**
      * @default false
      */
    var windowsHide: js.UndefOr[Boolean] = js.undefined
    
    var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object PromiseSpawnOptionscomman {
    
    inline def apply(): PromiseSpawnOptionscomman = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromiseSpawnOptionscomman]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseSpawnOptionscomman] (val x: Self) extends AnyVal {
      
      inline def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      inline def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioString(value: Boolean): Self = StObject.set(x, "stdioString", value.asInstanceOf[js.Any])
      
      inline def setStdioStringUndefined: Self = StObject.set(x, "stdioString", js.undefined)
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
}
