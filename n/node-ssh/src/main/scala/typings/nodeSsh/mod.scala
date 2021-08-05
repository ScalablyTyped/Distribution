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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ssh", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with SSH
  
  trait ConfigGiven extends StObject {
    
    var host: String
    
    var onKeyboardInteractive: js.UndefOr[js.Function0[Unit | Boolean]] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var username: String
  }
  object ConfigGiven {
    
    inline def apply(host: String, username: String): ConfigGiven = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigGiven]
    }
    
    extension [Self <: ConfigGiven](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOnKeyboardInteractive(value: () => Unit | Boolean): Self = StObject.set(x, "onKeyboardInteractive", js.Any.fromFunction0(value))
      
      inline def setOnKeyboardInteractiveUndefined: Self = StObject.set(x, "onKeyboardInteractive", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
    
    var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.undefined
    
    var options: js.UndefOr[typings.ssh2.mod.ExecOptions] = js.undefined
    
    var stdin: js.UndefOr[String] = js.undefined
  }
  object ExecOptions {
    
    inline def apply(): ExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptions]
    }
    
    extension [Self <: ExecOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setOnStderr(value: /* chunk */ Buffer => Unit): Self = StObject.set(x, "onStderr", js.Any.fromFunction1(value))
      
      inline def setOnStderrUndefined: Self = StObject.set(x, "onStderr", js.undefined)
      
      inline def setOnStdout(value: /* chunk */ Buffer => Unit): Self = StObject.set(x, "onStdout", js.Any.fromFunction1(value))
      
      inline def setOnStdoutUndefined: Self = StObject.set(x, "onStdout", js.undefined)
      
      inline def setOptions(value: typings.ssh2.mod.ExecOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStdin(value: String): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    }
  }
  
  trait ExecResult extends StObject {
    
    var code: Double
    
    var signal: js.UndefOr[String] = js.undefined
    
    var stderr: String
    
    var stdout: String
  }
  object ExecResult {
    
    inline def apply(code: Double, stderr: String, stdout: String): ExecResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecResult]
    }
    
    extension [Self <: ExecResult](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutDirectoryOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var sftp: js.UndefOr[SFTP] = js.undefined
    
    var sftpOptions: js.UndefOr[TransferOptions] = js.undefined
    
    var tick: js.UndefOr[
        js.Function3[
          /* localPath */ String, 
          /* remotePath */ String, 
          /* error */ js.UndefOr[Error | Null], 
          Unit
        ]
      ] = js.undefined
    
    var validate: js.UndefOr[js.Function1[/* localPath */ String, Boolean]] = js.undefined
  }
  object PutDirectoryOptions {
    
    inline def apply(): PutDirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDirectoryOptions]
    }
    
    extension [Self <: PutDirectoryOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setSftp(value: SFTP): Self = StObject.set(x, "sftp", value.asInstanceOf[js.Any])
      
      inline def setSftpOptions(value: TransferOptions): Self = StObject.set(x, "sftpOptions", value.asInstanceOf[js.Any])
      
      inline def setSftpOptionsUndefined: Self = StObject.set(x, "sftpOptions", js.undefined)
      
      inline def setSftpUndefined: Self = StObject.set(x, "sftp", js.undefined)
      
      inline def setTick(
        value: (/* localPath */ String, /* remotePath */ String, /* error */ js.UndefOr[Error | Null]) => Unit
      ): Self = StObject.set(x, "tick", js.Any.fromFunction3(value))
      
      inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
      
      inline def setValidate(value: /* localPath */ String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait PutFilesOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var sftp: js.UndefOr[SFTP] = js.undefined
    
    var sftpOptions: js.UndefOr[TransferOptions] = js.undefined
  }
  object PutFilesOptions {
    
    inline def apply(): PutFilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutFilesOptions]
    }
    
    extension [Self <: PutFilesOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setSftp(value: SFTP): Self = StObject.set(x, "sftp", value.asInstanceOf[js.Any])
      
      inline def setSftpOptions(value: TransferOptions): Self = StObject.set(x, "sftpOptions", value.asInstanceOf[js.Any])
      
      inline def setSftpOptionsUndefined: Self = StObject.set(x, "sftpOptions", js.undefined)
      
      inline def setSftpUndefined: Self = StObject.set(x, "sftp", js.undefined)
    }
  }
  
  type SFTP = SFTPWrapper
  
  @js.native
  trait SSH extends StObject {
    
    def connect(givenConfig: ConfigGiven): js.Promise[this.type] = js.native
    
    def dispose(): Unit = js.native
    
    def exec(command: String): js.Promise[String] = js.native
    def exec(command: String, parameters: js.Array[String]): js.Promise[String] = js.native
    def exec(command: String, parameters: js.Array[String], options: ExecOptionsstreamboth): js.Promise[ExecResult] = js.native
    def exec(command: String, parameters: js.Array[String], options: ExecOptionsstreamstdoutst): js.Promise[String] = js.native
    def exec(command: String, parameters: Unit, options: ExecOptionsstreamboth): js.Promise[ExecResult] = js.native
    def exec(command: String, parameters: Unit, options: ExecOptionsstreamstdoutst): js.Promise[String] = js.native
    
    def execCommand(givenCommand: String): js.Promise[ExecResult] = js.native
    def execCommand(givenCommand: String, options: ExecOptions): js.Promise[ExecResult] = js.native
    
    def getFile(localFile: String, remoteFile: String): js.Promise[Unit] = js.native
    def getFile(localFile: String, remoteFile: String, givenSftp: Unit, givenOpts: TransferOptions): js.Promise[Unit] = js.native
    def getFile(localFile: String, remoteFile: String, givenSftp: SFTP): js.Promise[Unit] = js.native
    def getFile(localFile: String, remoteFile: String, givenSftp: SFTP, givenOpts: TransferOptions): js.Promise[Unit] = js.native
    
    def mkdir(path: String): js.Promise[Unit] = js.native
    def mkdir(path: String, `type`: Unit, givenSftp: SFTP): js.Promise[Unit] = js.native
    @JSName("mkdir")
    def mkdir_exec(path: String, `type`: exec): js.Promise[Unit] = js.native
    @JSName("mkdir")
    def mkdir_sftp(path: String, `type`: sftp): js.Promise[Unit] = js.native
    @JSName("mkdir")
    def mkdir_sftp(path: String, `type`: sftp, givenSftp: SFTP): js.Promise[Unit] = js.native
    
    def putDirectory(localDirectory: String, remoteDirectory: String): js.Promise[Boolean] = js.native
    def putDirectory(localDirectory: String, remoteDirectory: String, givenConfig: PutDirectoryOptions): js.Promise[Boolean] = js.native
    
    def putFile(localFile: String, remoteFile: String): js.Promise[Unit] = js.native
    def putFile(localFile: String, remoteFile: String, givenSftp: Unit, givenOpts: TransferOptions): js.Promise[Unit] = js.native
    def putFile(localFile: String, remoteFile: String, givenSftp: SFTP): js.Promise[Unit] = js.native
    def putFile(localFile: String, remoteFile: String, givenSftp: SFTP, givenOpts: TransferOptions): js.Promise[Unit] = js.native
    
    def putFiles(files: js.Array[Local]): js.Promise[Unit] = js.native
    def putFiles(files: js.Array[Local], givenConfig: PutFilesOptions): js.Promise[Unit] = js.native
    
    def requestSFTP(): js.Promise[SFTP] = js.native
    
    def requestShell(): js.Promise[Shell] = js.native
  }
  
  type Shell = ClientChannel
}
