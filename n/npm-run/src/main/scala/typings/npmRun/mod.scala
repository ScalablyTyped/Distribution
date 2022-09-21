package typings.npmRun

import org.scalablytyped.runtime.Shortcut
import typings.node.anon.encodingBufferEncodingExe
import typings.node.anon.encodingbuffernullExecOpt
import typings.node.bufferMod.global.Buffer
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
import typings.node.fsMod.ObjectEncodingOptions
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
    
    /**
      * Spawns a shell then executes the `command` within that shell, buffering any
      * generated output. The `command` string passed to the exec function is processed
      * directly by the shell and special characters (vary based on [shell](https://en.wikipedia.org/wiki/List_of_command-line_interpreters))
      * need to be dealt with accordingly:
      *
      * ```js
      * const { exec } = require('child_process');
      *
      * exec('"/path/to/test file/test.sh" arg1 arg2');
      * // Double quotes are used so that the space in the path is not interpreted as
      * // a delimiter of multiple arguments.
      *
      * exec('echo "The \\$HOME variable is $HOME"');
      * // The $HOME variable is escaped in the first instance, but not in the second.
      * ```
      *
      * **Never pass unsanitized user input to this function. Any input containing shell**
      * **metacharacters may be used to trigger arbitrary command execution.**
      *
      * If a `callback` function is provided, it is called with the arguments`(error, stdout, stderr)`. On success, `error` will be `null`. On error,`error` will be an instance of `Error`. The
      * `error.code` property will be
      * the exit code of the process. By convention, any exit code other than `0`indicates an error. `error.signal` will be the signal that terminated the
      * process.
      *
      * The `stdout` and `stderr` arguments passed to the callback will contain the
      * stdout and stderr output of the child process. By default, Node.js will decode
      * the output as UTF-8 and pass strings to the callback. The `encoding` option
      * can be used to specify the character encoding used to decode the stdout and
      * stderr output. If `encoding` is `'buffer'`, or an unrecognized character
      * encoding, `Buffer` objects will be passed to the callback instead.
      *
      * ```js
      * const { exec } = require('child_process');
      * exec('cat *.js missing_file | wc -l', (error, stdout, stderr) => {
      *   if (error) {
      *     console.error(`exec error: ${error}`);
      *     return;
      *   }
      *   console.log(`stdout: ${stdout}`);
      *   console.error(`stderr: ${stderr}`);
      * });
      * ```
      *
      * If `timeout` is greater than `0`, the parent will send the signal
      * identified by the `killSignal` property (the default is `'SIGTERM'`) if the
      * child runs longer than `timeout` milliseconds.
      *
      * Unlike the [`exec(3)`](http://man7.org/linux/man-pages/man3/exec.3.html) POSIX system call, `child_process.exec()` does not replace
      * the existing process and uses a shell to execute the command.
      *
      * If this method is invoked as its `util.promisify()` ed version, it returns
      * a `Promise` for an `Object` with `stdout` and `stderr` properties. The returned`ChildProcess` instance is attached to the `Promise` as a `child` property. In
      * case of an error (including any error resulting in an exit code other than 0), a
      * rejected promise is returned, with the same `error` object given in the
      * callback, but with two additional properties `stdout` and `stderr`.
      *
      * ```js
      * const util = require('util');
      * const exec = util.promisify(require('child_process').exec);
      *
      * async function lsExample() {
      *   const { stdout, stderr } = await exec('ls');
      *   console.log('stdout:', stdout);
      *   console.error('stderr:', stderr);
      * }
      * lsExample();
      * ```
      *
      * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
      * the error passed to the callback will be an `AbortError`:
      *
      * ```js
      * const { exec } = require('child_process');
      * const controller = new AbortController();
      * const { signal } = controller;
      * const child = exec('grep ssh', { signal }, (error) => {
      *   console.log(error); // an AbortError
      * });
      * controller.abort();
      * ```
      * @since v0.1.90
      * @param command The command to run, with space-separated arguments.
      * @param callback called with the output when process terminates.
      */
    def apply(command: String): ChildProcess = js.native
    def apply(
      command: String,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
    ): ChildProcess = js.native
    // `options` without an `encoding` means stdout/stderr are definitely `string`.
    def apply(command: String, options: (ObjectEncodingOptions & ExecOptions) | ExecOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: (ObjectEncodingOptions & ExecOptions) | ExecOptions,
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
    
    def execSync(command: String): String | Buffer = js.native
    def execSync(command: String, options: ExecSyncOptions): String | Buffer = js.native
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
    
    def spawnSync(command: String): SpawnSyncReturns[String | Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[String | Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[String | Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def spawnSync(command: String, args: Unit, options: SpawnSyncOptions): SpawnSyncReturns[String | Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[String | Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    @JSName("spawnSync")
    var spawnSync_Original: FnCallCommandArgsOptions = js.native
    
    @JSName("spawn")
    var spawn_Original: Fn0 = js.native
    
    def sync(command: String): String | Buffer = js.native
    def sync(command: String, options: ExecSyncOptions): String | Buffer = js.native
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
