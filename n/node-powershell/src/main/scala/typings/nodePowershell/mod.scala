package typings.nodePowershell

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.nodePowershell.nodePowershellStrings.Bypass
import typings.nodePowershell.nodePowershellStrings.end
import typings.nodePowershell.nodePowershellStrings.err
import typings.nodePowershell.nodePowershellStrings.output
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-powershell", JSImport.Namespace)
  @js.native
  /**
    * Creates a new Shell instance.
    * By default this starts a {@link https://docs.microsoft.com/en-us/powershell/scripting/overview?view=powershell-5.1 powershell v5.1} process on Windows,
    * and a {@link https://docs.microsoft.com/en-us/powershell/scripting/overview?view=powershell-7.1 PowerShell Core (pwsh) (>= v7)} process on Linux and macOS.
    *
    * @remark For the best PowerShell performance **on Windows** it is recommended to set `pwsh` to true and install PowerShell Core
    */
  open class ^ ()
    extends StObject
       with NodePowershell {
    def this(options: NodePowershellShellOptions) = this()
    
    /**
      * Adds an argument to the last added command.
      * @param argument The argument to add to the last command
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host');
      * await ps.addParameter({ ForegroundColor: 'Cyan' });
      * await ps.addArgument('Node-PowerShell is pretty cool!');
      * ```
      */
    /* CompleteClass */
    override def addArgument(argument: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Adds a command to the end of the pipeline of the shell object.
      * @param command A PowerShell command or a path to a PowerShell script.
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host "Node-Powershell is pretty cool!"')
      * ```
      * @example
      * ```ts
      * await ps.addCommand('New-Item -ItemType Directory -Force -Path C:\\NodePowerShell | Out-Null')
      * ```
      */
    /* CompleteClass */
    override def addCommand(command: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Adds a parameter to the last added command.
      * @param parameter The parameter to add to the last command.
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host');
      * await ps.addParameter({ ForegroundColor: 'Cyan' });
      * ```
      */
    /* CompleteClass */
    override def addParameter(parameter: NodeShellParameter): js.Promise[js.Array[String]] = js.native
    
    /**
      * Adds multiple parameters to the last added command.
      * @param parameters The parameters array to add to the last command
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host "Node-PowerShell is pretty cool!"');
      * await powershell.addParameters([
      *     { name: "ForegroundColor", value: "Red" },
      *     { name: "BackgroundColor", value: "DarkGray" },
      *     { name: "NoNewLine", value: true },
      * ]);
      * ```
      */
    /* CompleteClass */
    override def addParameters(parameters: js.Array[NodeShellParameter]): js.Promise[js.Array[String]] = js.native
    
    /**
      * Empty the commands array.
      * @returns A promise that fulfills with an empty array of commands.
      */
    /* CompleteClass */
    override def clear(): js.Promise[js.Array[Any]] = js.native
    
    /**
      * An array containing the commands that currently in the pipeline (before invoke() called).
      */
    /* CompleteClass */
    var commands: js.Array[String] = js.native
    
    /**
      * Releases all resources used by the shell object and closes the PowerShell `child_process`.
      * @returns A promise that fulfills with the exit code of the child_process, or rejects with an error.
      */
    /* CompleteClass */
    override def dispose(): js.Promise[String] = js.native
    
    /**
      * An array containing the commands ever invoked in the shell, and their results.
      */
    /* CompleteClass */
    var history: js.Array[Any] = js.native
    
    /**
      * A string representing the execution state of the current PowerShell instance
      *
      * Read more: {@link https://docs.microsoft.com/en-us/dotnet/api/system.management.automation.psinvocationstate?view=powershellsdk-1.1.0}
      */
    /* CompleteClass */
    var invocationStateInfo: String = js.native
    
    /**
      * Runs the commands currently in the shell object pipeline.
      * @returns A promise that fulfills with the output of all the commands that were in the pipeline before the call to this function, or rejects with an error.
      */
    /* CompleteClass */
    override def invoke(): js.Promise[String] = js.native
    
    /**
      * Listens to events emitted from the shell.
      * @param eventName required - Possible events:
      * - `output` - Emits when shell has an output.
      * - `err` - Emits when shell has an error.
      * - `end` - Emits when shell ends.
      * @param callback required - Callback function to be called when the event emits.
      */
    /* CompleteClass */
    override def on(eventName: output | err | end, callback: js.Function1[/* output */ String, Unit]): Unit = js.native
    
    /**
      * A number representing the process id the PowerShell instance got.
      */
    /* CompleteClass */
    var pid: Double = js.native
    
    /**
      * An object containing the {@link https://nodejs.org/api/child_process.html#child_process_child_stderr sdtio (in, out, err)}
      * {@link https://nodejs.org/api/stream.html#stream_class_stream_readable [stream.Readable]} of the PowerShell Instance.
      */
    /* CompleteClass */
    var streams: NodePowerShellStream = js.native
    
    /**
      * A boolean determines whether to log verbose to the console.
      */
    /* CompleteClass */
    var verbose: Boolean = js.native
  }
  
  trait NodePowerShellStream extends StObject {
    
    var err: ReadableStream
    
    var stdin: WritableStream
    
    var stdout: ReadableStream
  }
  object NodePowerShellStream {
    
    inline def apply(err: ReadableStream, stdin: WritableStream, stdout: ReadableStream): NodePowerShellStream = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodePowerShellStream]
    }
    
    extension [Self <: NodePowerShellStream](x: Self) {
      
      inline def setErr(value: ReadableStream): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setStdin(value: WritableStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: ReadableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodePowershell extends StObject {
    
    /**
      * Adds an argument to the last added command.
      * @param argument The argument to add to the last command
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host');
      * await ps.addParameter({ ForegroundColor: 'Cyan' });
      * await ps.addArgument('Node-PowerShell is pretty cool!');
      * ```
      */
    def addArgument(argument: String): js.Promise[js.Array[String]]
    
    /**
      * Adds a command to the end of the pipeline of the shell object.
      * @param command A PowerShell command or a path to a PowerShell script.
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host "Node-Powershell is pretty cool!"')
      * ```
      * @example
      * ```ts
      * await ps.addCommand('New-Item -ItemType Directory -Force -Path C:\\NodePowerShell | Out-Null')
      * ```
      */
    def addCommand(command: String): js.Promise[js.Array[String]]
    
    /**
      * Adds a parameter to the last added command.
      * @param parameter The parameter to add to the last command.
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host');
      * await ps.addParameter({ ForegroundColor: 'Cyan' });
      * ```
      */
    def addParameter(parameter: NodeShellParameter): js.Promise[js.Array[String]]
    
    /**
      * Adds multiple parameters to the last added command.
      * @param parameters The parameters array to add to the last command
      * @returns A promise that fulfills with the array of commands currently in the pipeline, or rejects with an error.
      * @example
      * ```ts
      * await ps.addCommand('Write-Host "Node-PowerShell is pretty cool!"');
      * await powershell.addParameters([
      *     { name: "ForegroundColor", value: "Red" },
      *     { name: "BackgroundColor", value: "DarkGray" },
      *     { name: "NoNewLine", value: true },
      * ]);
      * ```
      */
    def addParameters(parameters: js.Array[NodeShellParameter]): js.Promise[js.Array[String]]
    
    /**
      * Empty the commands array.
      * @returns A promise that fulfills with an empty array of commands.
      */
    def clear(): js.Promise[js.Array[Any]]
    
    /**
      * An array containing the commands that currently in the pipeline (before invoke() called).
      */
    var commands: js.Array[String]
    
    /**
      * Releases all resources used by the shell object and closes the PowerShell `child_process`.
      * @returns A promise that fulfills with the exit code of the child_process, or rejects with an error.
      */
    def dispose(): js.Promise[String]
    
    /**
      * An array containing the commands ever invoked in the shell, and their results.
      */
    var history: js.Array[Any]
    
    /**
      * A string representing the execution state of the current PowerShell instance
      *
      * Read more: {@link https://docs.microsoft.com/en-us/dotnet/api/system.management.automation.psinvocationstate?view=powershellsdk-1.1.0}
      */
    var invocationStateInfo: String
    
    /**
      * Runs the commands currently in the shell object pipeline.
      * @returns A promise that fulfills with the output of all the commands that were in the pipeline before the call to this function, or rejects with an error.
      */
    def invoke(): js.Promise[String]
    
    /**
      * Listens to events emitted from the shell.
      * @param eventName required - Possible events:
      * - `output` - Emits when shell has an output.
      * - `err` - Emits when shell has an error.
      * - `end` - Emits when shell ends.
      * @param callback required - Callback function to be called when the event emits.
      */
    def on(eventName: output | err | end, callback: js.Function1[/* output */ String, Unit]): Unit
    
    /**
      * A number representing the process id the PowerShell instance got.
      */
    var pid: Double
    
    /**
      * An object containing the {@link https://nodejs.org/api/child_process.html#child_process_child_stderr sdtio (in, out, err)}
      * {@link https://nodejs.org/api/stream.html#stream_class_stream_readable [stream.Readable]} of the PowerShell Instance.
      */
    var streams: NodePowerShellStream
    
    /**
      * A boolean determines whether to log verbose to the console.
      */
    var verbose: Boolean
  }
  object NodePowershell {
    
    inline def apply(
      addArgument: String => js.Promise[js.Array[String]],
      addCommand: String => js.Promise[js.Array[String]],
      addParameter: NodeShellParameter => js.Promise[js.Array[String]],
      addParameters: js.Array[NodeShellParameter] => js.Promise[js.Array[String]],
      clear: () => js.Promise[js.Array[Any]],
      commands: js.Array[String],
      dispose: () => js.Promise[String],
      history: js.Array[Any],
      invocationStateInfo: String,
      invoke: () => js.Promise[String],
      on: (output | err | end, js.Function1[/* output */ String, Unit]) => Unit,
      pid: Double,
      streams: NodePowerShellStream,
      verbose: Boolean
    ): NodePowershell = {
      val __obj = js.Dynamic.literal(addArgument = js.Any.fromFunction1(addArgument), addCommand = js.Any.fromFunction1(addCommand), addParameter = js.Any.fromFunction1(addParameter), addParameters = js.Any.fromFunction1(addParameters), clear = js.Any.fromFunction0(clear), commands = commands.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), history = history.asInstanceOf[js.Any], invocationStateInfo = invocationStateInfo.asInstanceOf[js.Any], invoke = js.Any.fromFunction0(invoke), on = js.Any.fromFunction2(on), pid = pid.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodePowershell]
    }
    
    extension [Self <: NodePowershell](x: Self) {
      
      inline def setAddArgument(value: String => js.Promise[js.Array[String]]): Self = StObject.set(x, "addArgument", js.Any.fromFunction1(value))
      
      inline def setAddCommand(value: String => js.Promise[js.Array[String]]): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
      
      inline def setAddParameter(value: NodeShellParameter => js.Promise[js.Array[String]]): Self = StObject.set(x, "addParameter", js.Any.fromFunction1(value))
      
      inline def setAddParameters(value: js.Array[NodeShellParameter] => js.Promise[js.Array[String]]): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => js.Promise[js.Array[Any]]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCommands(value: js.Array[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: String*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDispose(value: () => js.Promise[String]): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setInvocationStateInfo(value: String): Self = StObject.set(x, "invocationStateInfo", value.asInstanceOf[js.Any])
      
      inline def setInvoke(value: () => js.Promise[String]): Self = StObject.set(x, "invoke", js.Any.fromFunction0(value))
      
      inline def setOn(value: (output | err | end, js.Function1[/* output */ String, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setStreams(value: NodePowerShellStream): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodePowershellShellOptions extends StObject {
    
    /**
      * Determines whether to log verbose to the console.
      */
    var debugMsg: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the default execution policy for the current shell session
      */
    var executionPolicy: js.UndefOr[Bypass] = js.undefined
    
    /**
      * Sets the input encoding for the current shell.
      * @default 'utf8'
      */
    var inputEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * Determines whether to load the Windows PS profile
      */
    var noProfile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the output encoding for the current shell.
      * @default 'utf8'
      */
    var outputEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * Instructs the Shell the use pwsh as the PowerShell runspace
      * @default false
      */
    var pwsh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Instruct the Shell to use pwsh-preview as the PowerShell runspace.
      * @default true
      */
    var pwshPrev: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether to log verbose to the console.
      * @default true
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object NodePowershellShellOptions {
    
    inline def apply(): NodePowershellShellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodePowershellShellOptions]
    }
    
    extension [Self <: NodePowershellShellOptions](x: Self) {
      
      inline def setDebugMsg(value: Boolean): Self = StObject.set(x, "debugMsg", value.asInstanceOf[js.Any])
      
      inline def setDebugMsgUndefined: Self = StObject.set(x, "debugMsg", js.undefined)
      
      inline def setExecutionPolicy(value: Bypass): Self = StObject.set(x, "executionPolicy", value.asInstanceOf[js.Any])
      
      inline def setExecutionPolicyUndefined: Self = StObject.set(x, "executionPolicy", js.undefined)
      
      inline def setInputEncoding(value: String): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
      
      inline def setInputEncodingUndefined: Self = StObject.set(x, "inputEncoding", js.undefined)
      
      inline def setNoProfile(value: Boolean): Self = StObject.set(x, "noProfile", value.asInstanceOf[js.Any])
      
      inline def setNoProfileUndefined: Self = StObject.set(x, "noProfile", js.undefined)
      
      inline def setOutputEncoding(value: String): Self = StObject.set(x, "outputEncoding", value.asInstanceOf[js.Any])
      
      inline def setOutputEncodingUndefined: Self = StObject.set(x, "outputEncoding", js.undefined)
      
      inline def setPwsh(value: Boolean): Self = StObject.set(x, "pwsh", value.asInstanceOf[js.Any])
      
      inline def setPwshPrev(value: Boolean): Self = StObject.set(x, "pwshPrev", value.asInstanceOf[js.Any])
      
      inline def setPwshPrevUndefined: Self = StObject.set(x, "pwshPrev", js.undefined)
      
      inline def setPwshUndefined: Self = StObject.set(x, "pwsh", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /**
    * Structure for a single Shell parameter
    */
  trait NodeShellParameter
    extends StObject
       with /**
    * The name of the parameter with the value as its direct value
    * @remark for switches this should be `''` (empty string), or `undefined`
    */
  /* key */ StringDictionary[
          js.UndefOr[String | Double | Boolean | js.Array[Any] | (Record[PropertyKey, Any]) | js.Date]
        ] {
    
    /**
      * The name of the parameter
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The value of the parameter
      * @remark for switches this should be `''` (empty string), or `undefined`
      */
    var value: js.UndefOr[String | Double | Boolean | js.Array[Any] | (Record[PropertyKey, Any]) | js.Date] = js.undefined
  }
  object NodeShellParameter {
    
    inline def apply(): NodeShellParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeShellParameter]
    }
    
    extension [Self <: NodeShellParameter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: String | Double | Boolean | js.Array[Any] | (Record[PropertyKey, Any]) | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type PowerShellStream = NodePowerShellStream
  
  type ShellOptions = NodePowershellShellOptions
  
  type ShellParameter = NodeShellParameter
}
