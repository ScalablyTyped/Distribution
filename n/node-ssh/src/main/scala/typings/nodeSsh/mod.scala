package typings.nodeSsh

import typings.node.Buffer
import typings.nodeSsh.anon.ExecOptionsstreamboth
import typings.nodeSsh.anon.ExecOptionsstreamstdoutst
import typings.nodeSsh.anon.Local
import typings.nodeSsh.nodeSshStrings.exec
import typings.nodeSsh.nodeSshStrings.sftp
import typings.ssh2.mod.ClientChannel
import typings.ssh2.mod.SFTPWrapper
import typings.ssh2Streams.mod.TransferOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ssh", JSImport.Namespace)
  @js.native
  class ^ () extends SSH
  
  @js.native
  trait ConfigGiven extends StObject {
    
    var host: String = js.native
    
    var onKeyboardInteractive: js.UndefOr[js.Function0[Unit | Boolean]] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var privateKey: js.UndefOr[String] = js.native
    
    var username: String = js.native
  }
  object ConfigGiven {
    
    @scala.inline
    def apply(host: String, username: String): ConfigGiven = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigGiven]
    }
    
    @scala.inline
    implicit class ConfigGivenMutableBuilder[Self <: ConfigGiven] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyboardInteractive(value: () => Unit | Boolean): Self = StObject.set(x, "onKeyboardInteractive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnKeyboardInteractiveUndefined: Self = StObject.set(x, "onKeyboardInteractive", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.native
    
    var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.native
    
    var options: js.UndefOr[typings.ssh2.mod.ExecOptions] = js.native
    
    var stdin: js.UndefOr[String] = js.native
  }
  object ExecOptions {
    
    @scala.inline
    def apply(): ExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptions]
    }
    
    @scala.inline
    implicit class ExecOptionsMutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
      
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
      def setOptions(value: typings.ssh2.mod.ExecOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStdin(value: String): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    }
  }
  
  @js.native
  trait ExecResult extends StObject {
    
    var code: Double = js.native
    
    var signal: js.UndefOr[String] = js.native
    
    var stderr: String = js.native
    
    var stdout: String = js.native
  }
  object ExecResult {
    
    @scala.inline
    def apply(code: Double, stderr: String, stdout: String): ExecResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecResult]
    }
    
    @scala.inline
    implicit class ExecResultMutableBuilder[Self <: ExecResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PutDirectoryOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var recursive: js.UndefOr[Boolean] = js.native
    
    var sftp: js.UndefOr[SFTP] = js.native
    
    var sftpOptions: js.UndefOr[TransferOptions] = js.native
    
    var tick: js.UndefOr[
        js.Function3[
          /* localPath */ String, 
          /* remotePath */ String, 
          /* error */ js.UndefOr[Error | Null], 
          Unit
        ]
      ] = js.native
    
    var validate: js.UndefOr[js.Function1[/* localPath */ String, Boolean]] = js.native
  }
  object PutDirectoryOptions {
    
    @scala.inline
    def apply(): PutDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDirectoryOptions]
    }
    
    @scala.inline
    implicit class PutDirectoryOptionsMutableBuilder[Self <: PutDirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setSftp(value: SFTP): Self = StObject.set(x, "sftp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSftpOptions(value: TransferOptions): Self = StObject.set(x, "sftpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSftpOptionsUndefined: Self = StObject.set(x, "sftpOptions", js.undefined)
      
      @scala.inline
      def setSftpUndefined: Self = StObject.set(x, "sftp", js.undefined)
      
      @scala.inline
      def setTick(
        value: (/* localPath */ String, /* remotePath */ String, /* error */ js.UndefOr[Error | Null]) => Unit
      ): Self = StObject.set(x, "tick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
      
      @scala.inline
      def setValidate(value: /* localPath */ String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait PutFilesOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var sftp: js.UndefOr[SFTP] = js.native
    
    var sftpOptions: js.UndefOr[TransferOptions] = js.native
  }
  object PutFilesOptions {
    
    @scala.inline
    def apply(): PutFilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutFilesOptions]
    }
    
    @scala.inline
    implicit class PutFilesOptionsMutableBuilder[Self <: PutFilesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setSftp(value: SFTP): Self = StObject.set(x, "sftp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSftpOptions(value: TransferOptions): Self = StObject.set(x, "sftpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSftpOptionsUndefined: Self = StObject.set(x, "sftpOptions", js.undefined)
      
      @scala.inline
      def setSftpUndefined: Self = StObject.set(x, "sftp", js.undefined)
    }
  }
  
  type SFTP = SFTPWrapper
  
  @js.native
  trait SSH extends StObject {
    
    def connect(givenConfig: ConfigGiven): js.Promise[this.type] = js.native
    
    def dispose(): Unit = js.native
    
    def exec(command: String): js.Promise[String] = js.native
    def exec(command: String, parameters: js.UndefOr[scala.Nothing], options: ExecOptionsstreamboth): js.Promise[ExecResult] = js.native
    def exec(command: String, parameters: js.UndefOr[scala.Nothing], options: ExecOptionsstreamstdoutst): js.Promise[String] = js.native
    def exec(command: String, parameters: js.Array[String]): js.Promise[String] = js.native
    def exec(command: String, parameters: js.Array[String], options: ExecOptionsstreamboth): js.Promise[ExecResult] = js.native
    def exec(command: String, parameters: js.Array[String], options: ExecOptionsstreamstdoutst): js.Promise[String] = js.native
    
    def execCommand(givenCommand: String): js.Promise[ExecResult] = js.native
    def execCommand(givenCommand: String, options: ExecOptions): js.Promise[ExecResult] = js.native
    
    def getFile(localFile: String, remoteFile: String): js.Promise[Unit] = js.native
    def getFile(
      localFile: String,
      remoteFile: String,
      givenSftp: js.UndefOr[scala.Nothing],
      givenOpts: TransferOptions
    ): js.Promise[Unit] = js.native
    def getFile(localFile: String, remoteFile: String, givenSftp: SFTP): js.Promise[Unit] = js.native
    def getFile(localFile: String, remoteFile: String, givenSftp: SFTP, givenOpts: TransferOptions): js.Promise[Unit] = js.native
    
    def mkdir(path: String): js.Promise[Unit] = js.native
    def mkdir(path: String, `type`: js.UndefOr[scala.Nothing], givenSftp: SFTP): js.Promise[Unit] = js.native
    @JSName("mkdir")
    def mkdir_exec(path: String, `type`: exec): js.Promise[Unit] = js.native
    @JSName("mkdir")
    def mkdir_sftp(path: String, `type`: sftp): js.Promise[Unit] = js.native
    @JSName("mkdir")
    def mkdir_sftp(path: String, `type`: sftp, givenSftp: SFTP): js.Promise[Unit] = js.native
    
    def putDirectory(localDirectory: String, remoteDirectory: String): js.Promise[Boolean] = js.native
    def putDirectory(localDirectory: String, remoteDirectory: String, givenConfig: PutDirectoryOptions): js.Promise[Boolean] = js.native
    
    def putFile(localFile: String, remoteFile: String): js.Promise[Unit] = js.native
    def putFile(
      localFile: String,
      remoteFile: String,
      givenSftp: js.UndefOr[scala.Nothing],
      givenOpts: TransferOptions
    ): js.Promise[Unit] = js.native
    def putFile(localFile: String, remoteFile: String, givenSftp: SFTP): js.Promise[Unit] = js.native
    def putFile(localFile: String, remoteFile: String, givenSftp: SFTP, givenOpts: TransferOptions): js.Promise[Unit] = js.native
    
    def putFiles(files: js.Array[Local]): js.Promise[Unit] = js.native
    def putFiles(files: js.Array[Local], givenConfig: PutFilesOptions): js.Promise[Unit] = js.native
    
    def requestSFTP(): js.Promise[SFTP] = js.native
    
    def requestShell(): js.Promise[Shell] = js.native
  }
  
  type Shell = ClientChannel
}
