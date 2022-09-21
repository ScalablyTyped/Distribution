package typings.node.childProcessMod

import typings.node.nodeStreamMod.Readable
import typings.node.nodeStreamMod.Writable
import typings.node.nodeStrings.close
import typings.node.nodeStrings.disconnect
import typings.node.nodeStrings.error
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.message
import typings.node.processMod.global.NodeJS.Signals
import typings.node.streamMod.Pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances of the `ChildProcess` represent spawned child processes.
  *
  * Instances of `ChildProcess` are not intended to be created directly. Rather,
  * use the {@link spawn}, {@link exec},{@link execFile}, or {@link fork} methods to create
  * instances of `ChildProcess`.
  * @since v2.2.0
  */
@JSImport("child_process", "ChildProcess")
@js.native
open class ChildProcess () extends StObject {
  
  /**
    * events.EventEmitter
    * 1. close
    * 2. disconnect
    * 3. error
    * 4. exit
    * 5. message
    * 6. spawn
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spawn(event: typings.node.nodeStrings.spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * The `subprocess.channel` property is a reference to the child's IPC channel. If
    * no IPC channel currently exists, this property is `undefined`.
    * @since v7.1.0
    */
  val channel: js.UndefOr[Pipe | Null] = js.native
  
  /**
    * The `subprocess.connected` property indicates whether it is still possible to
    * send and receive messages from a child process. When `subprocess.connected` is`false`, it is no longer possible to send or receive messages.
    * @since v0.7.2
    */
  val connected: Boolean = js.native
  
  /**
    * Closes the IPC channel between parent and child, allowing the child to exit
    * gracefully once there are no other connections keeping it alive. After calling
    * this method the `subprocess.connected` and `process.connected` properties in
    * both the parent and child (respectively) will be set to `false`, and it will be
    * no longer possible to pass messages between the processes.
    *
    * The `'disconnect'` event will be emitted when there are no messages in the
    * process of being received. This will most often be triggered immediately after
    * calling `subprocess.disconnect()`.
    *
    * When the child process is a Node.js instance (e.g. spawned using {@link fork}), the `process.disconnect()` method can be invoked
    * within the child process to close the IPC channel as well.
    * @since v0.7.2
    */
  def disconnect(): Unit = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close, code: Double, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close, code: Null, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: disconnect): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Null, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, message: Serializable, sendHandle: SendHandle): Boolean = js.native
  @JSName("emit")
  def emit_spawn(event: typings.node.nodeStrings.spawn, listener: js.Function0[Unit]): Boolean = js.native
  
  /**
    * The `subprocess.exitCode` property indicates the exit code of the child process.
    * If the child process is still running, the field will be `null`.
    */
  val exitCode: Double | Null = js.native
  
  /**
    * The `subprocess.kill()` method sends a signal to the child process. If no
    * argument is given, the process will be sent the `'SIGTERM'` signal. See [`signal(7)`](http://man7.org/linux/man-pages/man7/signal.7.html) for a list of available signals. This function
    * returns `true` if [`kill(2)`](http://man7.org/linux/man-pages/man2/kill.2.html) succeeds, and `false` otherwise.
    *
    * ```js
    * const { spawn } = require('child_process');
    * const grep = spawn('grep', ['ssh']);
    *
    * grep.on('close', (code, signal) => {
    *   console.log(
    *     `child process terminated due to receipt of signal ${signal}`);
    * });
    *
    * // Send SIGHUP to process.
    * grep.kill('SIGHUP');
    * ```
    *
    * The `ChildProcess` object may emit an `'error'` event if the signal
    * cannot be delivered. Sending a signal to a child process that has already exited
    * is not an error but may have unforeseen consequences. Specifically, if the
    * process identifier (PID) has been reassigned to another process, the signal will
    * be delivered to that process instead which can have unexpected results.
    *
    * While the function is called `kill`, the signal delivered to the child process
    * may not actually terminate the process.
    *
    * See [`kill(2)`](http://man7.org/linux/man-pages/man2/kill.2.html) for reference.
    *
    * On Windows, where POSIX signals do not exist, the `signal` argument will be
    * ignored, and the process will be killed forcefully and abruptly (similar to`'SIGKILL'`).
    * See `Signal Events` for more details.
    *
    * On Linux, child processes of child processes will not be terminated
    * when attempting to kill their parent. This is likely to happen when running a
    * new process in a shell or with the use of the `shell` option of `ChildProcess`:
    *
    * ```js
    * 'use strict';
    * const { spawn } = require('child_process');
    *
    * const subprocess = spawn(
    *   'sh',
    *   [
    *     '-c',
    *     `node -e "setInterval(() => {
    *       console.log(process.pid, 'is alive')
    *     }, 500);"`,
    *   ], {
    *     stdio: ['inherit', 'inherit', 'inherit']
    *   }
    * );
    *
    * setTimeout(() => {
    *   subprocess.kill(); // Does not terminate the Node.js process in the shell.
    * }, 2000);
    * ```
    * @since v0.1.90
    */
  def kill(): Boolean = js.native
  def kill(signal: Double): Boolean = js.native
  def kill(signal: Signals): Boolean = js.native
  
  /**
    * The `subprocess.killed` property indicates whether the child process
    * successfully received a signal from `subprocess.kill()`. The `killed` property
    * does not indicate that the child process has been terminated.
    * @since v0.5.10
    */
  val killed: Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_spawn(event: typings.node.nodeStrings.spawn, listener: js.Function0[Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spawn(event: typings.node.nodeStrings.spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Returns the process identifier (PID) of the child process. If the child process
    * fails to spawn due to errors, then the value is `undefined` and `error` is
    * emitted.
    *
    * ```js
    * const { spawn } = require('child_process');
    * const grep = spawn('grep', ['ssh']);
    *
    * console.log(`Spawned child pid: ${grep.pid}`);
    * grep.stdin.end();
    * ```
    * @since v0.1.90
    */
  val pid: js.UndefOr[Double] = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_spawn(event: typings.node.nodeStrings.spawn, listener: js.Function0[Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_spawn(event: typings.node.nodeStrings.spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Calling `subprocess.ref()` after making a call to `subprocess.unref()` will
    * restore the removed reference count for the child process, forcing the parent
    * to wait for the child to exit before exiting itself.
    *
    * ```js
    * const { spawn } = require('child_process');
    *
    * const subprocess = spawn(process.argv[0], ['child_program.js'], {
    *   detached: true,
    *   stdio: 'ignore'
    * });
    *
    * subprocess.unref();
    * subprocess.ref();
    * ```
    * @since v0.7.10
    */
  def ref(): Unit = js.native
  
  /**
    * When an IPC channel has been established between the parent and child (
    * i.e. when using {@link fork}), the `subprocess.send()` method can
    * be used to send messages to the child process. When the child process is a
    * Node.js instance, these messages can be received via the `'message'` event.
    *
    * The message goes through serialization and parsing. The resulting
    * message might not be the same as what is originally sent.
    *
    * For example, in the parent script:
    *
    * ```js
    * const cp = require('child_process');
    * const n = cp.fork(`${__dirname}/sub.js`);
    *
    * n.on('message', (m) => {
    *   console.log('PARENT got message:', m);
    * });
    *
    * // Causes the child to print: CHILD got message: { hello: 'world' }
    * n.send({ hello: 'world' });
    * ```
    *
    * And then the child script, `'sub.js'` might look like this:
    *
    * ```js
    * process.on('message', (m) => {
    *   console.log('CHILD got message:', m);
    * });
    *
    * // Causes the parent to print: PARENT got message: { foo: 'bar', baz: null }
    * process.send({ foo: 'bar', baz: NaN });
    * ```
    *
    * Child Node.js processes will have a `process.send()` method of their own
    * that allows the child to send messages back to the parent.
    *
    * There is a special case when sending a `{cmd: 'NODE_foo'}` message. Messages
    * containing a `NODE_` prefix in the `cmd` property are reserved for use within
    * Node.js core and will not be emitted in the child's `'message'` event. Rather, such messages are emitted using the`'internalMessage'` event and are consumed internally by Node.js.
    * Applications should avoid using such messages or listening for`'internalMessage'` events as it is subject to change without notice.
    *
    * The optional `sendHandle` argument that may be passed to `subprocess.send()` is
    * for passing a TCP server or socket object to the child process. The child will
    * receive the object as the second argument passed to the callback function
    * registered on the `'message'` event. Any data that is received
    * and buffered in the socket will not be sent to the child.
    *
    * The optional `callback` is a function that is invoked after the message is
    * sent but before the child may have received it. The function is called with a
    * single argument: `null` on success, or an `Error` object on failure.
    *
    * If no `callback` function is provided and the message cannot be sent, an`'error'` event will be emitted by the `ChildProcess` object. This can
    * happen, for instance, when the child process has already exited.
    *
    * `subprocess.send()` will return `false` if the channel has closed or when the
    * backlog of unsent messages exceeds a threshold that makes it unwise to send
    * more. Otherwise, the method returns `true`. The `callback` function can be
    * used to implement flow control.
    *
    * #### Example: sending a server object
    *
    * The `sendHandle` argument can be used, for instance, to pass the handle of
    * a TCP server object to the child process as illustrated in the example below:
    *
    * ```js
    * const subprocess = require('child_process').fork('subprocess.js');
    *
    * // Open up the server object and send the handle.
    * const server = require('net').createServer();
    * server.on('connection', (socket) => {
    *   socket.end('handled by parent');
    * });
    * server.listen(1337, () => {
    *   subprocess.send('server', server);
    * });
    * ```
    *
    * The child would then receive the server object as:
    *
    * ```js
    * process.on('message', (m, server) => {
    *   if (m === 'server') {
    *     server.on('connection', (socket) => {
    *       socket.end('handled by child');
    *     });
    *   }
    * });
    * ```
    *
    * Once the server is now shared between the parent and child, some connections
    * can be handled by the parent and some by the child.
    *
    * While the example above uses a server created using the `net` module, `dgram`module servers use exactly the same workflow with the exceptions of listening on
    * a `'message'` event instead of `'connection'` and using `server.bind()` instead
    * of `server.listen()`. This is, however, currently only supported on Unix
    * platforms.
    *
    * #### Example: sending a socket object
    *
    * Similarly, the `sendHandler` argument can be used to pass the handle of a
    * socket to the child process. The example below spawns two children that each
    * handle connections with "normal" or "special" priority:
    *
    * ```js
    * const { fork } = require('child_process');
    * const normal = fork('subprocess.js', ['normal']);
    * const special = fork('subprocess.js', ['special']);
    *
    * // Open up the server and send sockets to child. Use pauseOnConnect to prevent
    * // the sockets from being read before they are sent to the child process.
    * const server = require('net').createServer({ pauseOnConnect: true });
    * server.on('connection', (socket) => {
    *
    *   // If this is special priority...
    *   if (socket.remoteAddress === '74.125.127.100') {
    *     special.send('socket', socket);
    *     return;
    *   }
    *   // This is normal priority.
    *   normal.send('socket', socket);
    * });
    * server.listen(1337);
    * ```
    *
    * The `subprocess.js` would receive the socket handle as the second argument
    * passed to the event callback function:
    *
    * ```js
    * process.on('message', (m, socket) => {
    *   if (m === 'socket') {
    *     if (socket) {
    *       // Check that the client socket exists.
    *       // It is possible for the socket to be closed between the time it is
    *       // sent and the time it is received in the child process.
    *       socket.end(`Request handled with ${process.argv[2]} priority`);
    *     }
    *   }
    * });
    * ```
    *
    * Do not use `.maxConnections` on a socket that has been passed to a subprocess.
    * The parent cannot track when the socket is destroyed.
    *
    * Any `'message'` handlers in the subprocess should verify that `socket` exists,
    * as the connection may have been closed during the time it takes to send the
    * connection to the child.
    * @since v0.5.9
    * @param options The `options` argument, if present, is an object used to parameterize the sending of certain types of handles. `options` supports the following properties:
    */
  def send(message: Serializable): Boolean = js.native
  def send(message: Serializable, callback: js.Function1[/* error */ js.Error | Null, Unit]): Boolean = js.native
  def send(message: Serializable, sendHandle: Unit, callback: js.Function1[/* error */ js.Error | Null, Unit]): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: Unit,
    options: Unit,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: Unit, options: MessageOptions): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: Unit,
    options: MessageOptions,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: SendHandle): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    options: Unit,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: SendHandle, options: MessageOptions): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    options: MessageOptions,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  
  /**
    * The `subprocess.signalCode` property indicates the signal received by
    * the child process if any, else `null`.
    */
  val signalCode: Signals | Null = js.native
  
  /**
    * The `subprocess.spawnargs` property represents the full list of command-line
    * arguments the child process was launched with.
    */
  val spawnargs: js.Array[String] = js.native
  
  /**
    * The `subprocess.spawnfile` property indicates the executable file name of
    * the child process that is launched.
    *
    * For {@link fork}, its value will be equal to `process.execPath`.
    * For {@link spawn}, its value will be the name of
    * the executable file.
    * For {@link exec},  its value will be the name of the shell
    * in which the child process is launched.
    */
  val spawnfile: String = js.native
  
  /**
    * A `Readable Stream` that represents the child process's `stderr`.
    *
    * If the child was spawned with `stdio[2]` set to anything other than `'pipe'`,
    * then this will be `null`.
    *
    * `subprocess.stderr` is an alias for `subprocess.stdio[2]`. Both properties will
    * refer to the same value.
    *
    * The `subprocess.stderr` property can be `null` if the child process could
    * not be successfully spawned.
    * @since v0.1.90
    */
  var stderr: Readable | Null = js.native
  
  /**
    * A `Writable Stream` that represents the child process's `stdin`.
    *
    * If a child process waits to read all of its input, the child will not continue
    * until this stream has been closed via `end()`.
    *
    * If the child was spawned with `stdio[0]` set to anything other than `'pipe'`,
    * then this will be `null`.
    *
    * `subprocess.stdin` is an alias for `subprocess.stdio[0]`. Both properties will
    * refer to the same value.
    *
    * The `subprocess.stdin` property can be `undefined` if the child process could
    * not be successfully spawned.
    * @since v0.1.90
    */
  var stdin: Writable | Null = js.native
  
  /**
    * A sparse array of pipes to the child process, corresponding with positions in
    * the `stdio` option passed to {@link spawn} that have been set
    * to the value `'pipe'`. `subprocess.stdio[0]`, `subprocess.stdio[1]`, and`subprocess.stdio[2]` are also available as `subprocess.stdin`,`subprocess.stdout`, and `subprocess.stderr`,
    * respectively.
    *
    * In the following example, only the child's fd `1` (stdout) is configured as a
    * pipe, so only the parent's `subprocess.stdio[1]` is a stream, all other values
    * in the array are `null`.
    *
    * ```js
    * const assert = require('assert');
    * const fs = require('fs');
    * const child_process = require('child_process');
    *
    * const subprocess = child_process.spawn('ls', {
    *   stdio: [
    *     0, // Use parent's stdin for child.
    *     'pipe', // Pipe child's stdout to parent.
    *     fs.openSync('err.out', 'w'), // Direct child's stderr to a file.
    *   ]
    * });
    *
    * assert.strictEqual(subprocess.stdio[0], null);
    * assert.strictEqual(subprocess.stdio[0], subprocess.stdin);
    *
    * assert(subprocess.stdout);
    * assert.strictEqual(subprocess.stdio[1], subprocess.stdout);
    *
    * assert.strictEqual(subprocess.stdio[2], null);
    * assert.strictEqual(subprocess.stdio[2], subprocess.stderr);
    * ```
    *
    * The `subprocess.stdio` property can be `undefined` if the child process could
    * not be successfully spawned.
    * @since v0.7.10
    */
  val stdio: js.Tuple5[
    Writable | Null, 
    (// stdin
  Readable) | Null, 
    (// stdout
  Readable) | Null, 
    js.UndefOr[(// stderr
  Readable) | Writable | Null], 
    js.UndefOr[(// extra
  Readable) | Writable | Null]
  ] = js.native
  
  /**
    * A `Readable Stream` that represents the child process's `stdout`.
    *
    * If the child was spawned with `stdio[1]` set to anything other than `'pipe'`,
    * then this will be `null`.
    *
    * `subprocess.stdout` is an alias for `subprocess.stdio[1]`. Both properties will
    * refer to the same value.
    *
    * ```js
    * const { spawn } = require('child_process');
    *
    * const subprocess = spawn('ls');
    *
    * subprocess.stdout.on('data', (data) => {
    *   console.log(`Received chunk ${data}`);
    * });
    * ```
    *
    * The `subprocess.stdout` property can be `null` if the child process could
    * not be successfully spawned.
    * @since v0.1.90
    */
  var stdout: Readable | Null = js.native
  
  /**
    * By default, the parent will wait for the detached child to exit. To prevent the
    * parent from waiting for a given `subprocess` to exit, use the`subprocess.unref()` method. Doing so will cause the parent's event loop to not
    * include the child in its reference count, allowing the parent to exit
    * independently of the child, unless there is an established IPC channel between
    * the child and the parent.
    *
    * ```js
    * const { spawn } = require('child_process');
    *
    * const subprocess = spawn(process.argv[0], ['child_program.js'], {
    *   detached: true,
    *   stdio: 'ignore'
    * });
    *
    * subprocess.unref();
    * ```
    * @since v0.7.10
    */
  def unref(): Unit = js.native
}
