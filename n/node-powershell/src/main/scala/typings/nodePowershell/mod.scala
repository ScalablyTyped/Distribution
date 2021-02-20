package typings.nodePowershell

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-powershell", JSImport.Namespace)
  @js.native
  class ^ protected () extends NodePowershell {
    /**
      * Creates a new Shell instance.
      */
    def this(options: ShellOptions) = this()
  }
  
  @js.native
  trait NodePowershell extends StObject {
    
    /**
      * Adds a command to the end of the pipeline of the shell object.
      * @param {string} required - PowerShell command - PowerShell script
      * @param {array} optional - {name: ‘’, value: ‘’} - {name: value} - ‘switch’
      * @returns Every command currently in the pipeline.
      */
    def addCommand(command: String): js.Promise[js.Array[String]] = js.native
    def addCommand(command: String, params: js.Array[String | StringDictionary[String]]): js.Promise[js.Array[String]] = js.native
    
    /**
      * Releases all resources used by the shell object and closes the PowerShell child_process.
      * @returns Promise with the error message.
      */
    def dispose(): js.Promise[String] = js.native
    
    /**
      * An array containing the command history ever added to the shell instance.
      */
    var history: js.Array[String] = js.native
    
    /**
      * Runs the commands of the shell object pipeline.
      * @returns Promise with the command output.
      */
    def invoke(): js.Promise[String] = js.native
    
    /**
      * Listens to events emitted from the shell.
      * @param eventName required - Possible events:
      *  'output' - Emits when shell has an output.
      *  'err' - Emits when shell has an error.
      *  'end' - Emits when shell ends.
      * @param callback required - Callback function to be called when the event emits.
      */
    def on(eventName: String, callback: js.Function1[/* output */ String, Unit]): Unit = js.native
    
    /**
      * An object containing the sdtio (in,out,err) [stream.Readable] of the PowerShell Instance.
      */
    var streams: ShellStream = js.native
  }
  
  @js.native
  trait ShellOptions extends StObject {
    
    /**
      * Determines whether to log verbose to the console.
      */
    var debugMsg: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the default execution policy for the current shell session
      */
    var executionPolicy: js.UndefOr[String] = js.native
    
    /**
      * Sets the input encoding for the current shell.
      */
    var inputEncoding: js.UndefOr[String] = js.native
    
    /**
      * Determines whether to load the Windows PS profile
      */
    var noProfile: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the output encoding for the current shell.
      */
    var outputEncoding: js.UndefOr[String] = js.native
    
    /**
      * Instructs the Shell the use pwsh as the PowerShell runspace
      */
    var pwsh: js.UndefOr[Boolean] = js.native
    
    /**
      * Instruct the Shell to use pwsh-preview as the PowerShell runspace.
      */
    var pwshPrev: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines whether to log verbose to the console.
      */
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object ShellOptions {
    
    @scala.inline
    def apply(): ShellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellOptions]
    }
    
    @scala.inline
    implicit class ShellOptionsMutableBuilder[Self <: ShellOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebugMsg(value: Boolean): Self = StObject.set(x, "debugMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugMsgUndefined: Self = StObject.set(x, "debugMsg", js.undefined)
      
      @scala.inline
      def setExecutionPolicy(value: String): Self = StObject.set(x, "executionPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionPolicyUndefined: Self = StObject.set(x, "executionPolicy", js.undefined)
      
      @scala.inline
      def setInputEncoding(value: String): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputEncodingUndefined: Self = StObject.set(x, "inputEncoding", js.undefined)
      
      @scala.inline
      def setNoProfile(value: Boolean): Self = StObject.set(x, "noProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoProfileUndefined: Self = StObject.set(x, "noProfile", js.undefined)
      
      @scala.inline
      def setOutputEncoding(value: String): Self = StObject.set(x, "outputEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputEncodingUndefined: Self = StObject.set(x, "outputEncoding", js.undefined)
      
      @scala.inline
      def setPwsh(value: Boolean): Self = StObject.set(x, "pwsh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPwshPrev(value: Boolean): Self = StObject.set(x, "pwshPrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPwshPrevUndefined: Self = StObject.set(x, "pwshPrev", js.undefined)
      
      @scala.inline
      def setPwshUndefined: Self = StObject.set(x, "pwsh", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait ShellStream extends StObject {
    
    var err: ReadableStream = js.native
    
    var stdin: WritableStream = js.native
    
    var stdout: ReadableStream = js.native
  }
  object ShellStream {
    
    @scala.inline
    def apply(err: ReadableStream, stdin: WritableStream, stdout: ReadableStream): ShellStream = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellStream]
    }
    
    @scala.inline
    implicit class ShellStreamMutableBuilder[Self <: ShellStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: ReadableStream): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdin(value: WritableStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: ReadableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
