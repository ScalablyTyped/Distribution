package typings.nodeSsh

import typings.node.Buffer
import typings.nodeSsh.nodeSshStrings.both
import typings.nodeSsh.nodeSshStrings.stderr
import typings.nodeSsh.nodeSshStrings.stdout
import typings.ssh2.mod.ExecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node-ssh.node-ssh.ExecOptions & {  stream :'both'} */
  trait ExecOptionsstreamboth extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
    
    var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
    
    var options: js.UndefOr[ExecOptions] = js.undefined
    
    var stdin: js.UndefOr[String] = js.undefined
    
    var stream: both
  }
  object ExecOptionsstreamboth {
    
    @scala.inline
    def apply(): ExecOptionsstreamboth = {
      val __obj = js.Dynamic.literal(stream = "both")
      __obj.asInstanceOf[ExecOptionsstreamboth]
    }
    
    @scala.inline
    implicit class ExecOptionsstreambothMutableBuilder[Self <: ExecOptionsstreamboth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setOnStderr(value: /* chunk */ Buffer => Unit): Self = StObject.set(x, "onStderr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStderrUndefined: Self = StObject.set(x, "onStderr", js.undefined)
      
      @scala.inline
      def setOnStdout(value: /* chunk */ Buffer => Unit): Self = StObject.set(x, "onStdout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStdoutUndefined: Self = StObject.set(x, "onStdout", js.undefined)
      
      @scala.inline
      def setOptions(value: ExecOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStdin(value: String): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStream(value: both): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined node-ssh.node-ssh.ExecOptions & {  stream :'stdout' | 'stderr' | undefined} */
  trait ExecOptionsstreamstdoutst extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
    
    var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
    
    var options: js.UndefOr[ExecOptions] = js.undefined
    
    var stdin: js.UndefOr[String] = js.undefined
    
    var stream: js.UndefOr[stdout | stderr] = js.undefined
  }
  object ExecOptionsstreamstdoutst {
    
    @scala.inline
    def apply(): ExecOptionsstreamstdoutst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptionsstreamstdoutst]
    }
    
    @scala.inline
    implicit class ExecOptionsstreamstdoutstMutableBuilder[Self <: ExecOptionsstreamstdoutst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setOnStderr(value: /* chunk */ Buffer => Unit): Self = StObject.set(x, "onStderr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStderrUndefined: Self = StObject.set(x, "onStderr", js.undefined)
      
      @scala.inline
      def setOnStdout(value: /* chunk */ Buffer => Unit): Self = StObject.set(x, "onStdout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStdoutUndefined: Self = StObject.set(x, "onStdout", js.undefined)
      
      @scala.inline
      def setOptions(value: ExecOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStdin(value: String): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStream(value: stdout | stderr): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait Local extends StObject {
    
    var local: String
    
    var remote: String
  }
  object Local {
    
    @scala.inline
    def apply(local: String, remote: String): Local = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[Local]
    }
    
    @scala.inline
    implicit class LocalMutableBuilder[Self <: Local] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
