package typings.node

import typings.node.netMod.SocketConstructorOpts
import typings.node.nodeStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ttyMod {
  
  @JSImport("tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents the readable side of a TTY. In normal circumstances `process.stdin` will be the only `tty.ReadStream` instance in a Node.js
    * process and there should be no reason to create additional instances.
    * @since v0.5.8
    */
  @JSImport("tty", "ReadStream")
  @js.native
  open class ReadStream protected () extends StObject {
    def this(fd: Double) = this()
    def this(fd: Double, options: SocketConstructorOpts) = this()
    
    /**
      * A `boolean` that is `true` if the TTY is currently configured to operate as a
      * raw device. Defaults to `false`.
      * @since v0.7.7
      */
    var isRaw: Boolean = js.native
    
    /**
      * A `boolean` that is always `true` for `tty.ReadStream` instances.
      * @since v0.5.8
      */
    var isTTY: Boolean = js.native
    
    /**
      * Allows configuration of `tty.ReadStream` so that it operates as a raw device.
      *
      * When in raw mode, input is always available character-by-character, not
      * including modifiers. Additionally, all special processing of characters by the
      * terminal is disabled, including echoing input
      * characters. Ctrl+C will no longer cause a `SIGINT` when
      * in this mode.
      * @since v0.7.7
      * @param mode If `true`, configures the `tty.ReadStream` to operate as a raw device. If `false`, configures the `tty.ReadStream` to operate in its default mode. The `readStream.isRaw`
      * property will be set to the resulting mode.
      * @return The read stream instance.
      */
    def setRawMode(mode: Boolean): this.type = js.native
  }
  
  /**
    * Represents the writable side of a TTY. In normal circumstances,`process.stdout` and `process.stderr` will be the only`tty.WriteStream` instances created for a Node.js process and there
    * should be no reason to create additional instances.
    * @since v0.5.8
    */
  @JSImport("tty", "WriteStream")
  @js.native
  open class WriteStream protected () extends StObject {
    def this(fd: Double) = this()
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * `writeStream.clearLine()` clears the current line of this `WriteStream` in a
      * direction identified by `dir`.
      * @since v0.7.7
      * @param callback Invoked once the operation completes.
      * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
      */
    def clearLine(dir: Direction): Boolean = js.native
    def clearLine(dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
    
    /**
      * `writeStream.clearScreenDown()` clears this `WriteStream` from the current
      * cursor down.
      * @since v0.7.7
      * @param callback Invoked once the operation completes.
      * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
      */
    def clearScreenDown(): Boolean = js.native
    def clearScreenDown(callback: js.Function0[Unit]): Boolean = js.native
    
    /**
      * A `number` specifying the number of columns the TTY currently has. This property
      * is updated whenever the `'resize'` event is emitted.
      * @since v0.7.7
      */
    var columns: Double = js.native
    
    /**
      * `writeStream.cursorTo()` moves this `WriteStream`'s cursor to the specified
      * position.
      * @since v0.7.7
      * @param callback Invoked once the operation completes.
      * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
      */
    def cursorTo(x: Double): Boolean = js.native
    def cursorTo(x: Double, callback: js.Function0[Unit]): Boolean = js.native
    def cursorTo(x: Double, y: Double): Boolean = js.native
    def cursorTo(x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
    def cursorTo(x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_resize(event: resize): Boolean = js.native
    
    /**
      * Returns:
      *
      * * `1` for 2,
      * * `4` for 16,
      * * `8` for 256,
      * * `24` for 16,777,216 colors supported.
      *
      * Use this to determine what colors the terminal supports. Due to the nature of
      * colors in terminals it is possible to either have false positives or false
      * negatives. It depends on process information and the environment variables that
      * may lie about what terminal is used.
      * It is possible to pass in an `env` object to simulate the usage of a specific
      * terminal. This can be useful to check how specific environment settings behave.
      *
      * To enforce a specific color support, use one of the below environment settings.
      *
      * * 2 colors: `FORCE_COLOR = 0` (Disables colors)
      * * 16 colors: `FORCE_COLOR = 1`
      * * 256 colors: `FORCE_COLOR = 2`
      * * 16,777,216 colors: `FORCE_COLOR = 3`
      *
      * Disabling color support is also possible by using the `NO_COLOR` and`NODE_DISABLE_COLORS` environment variables.
      * @since v9.9.0
      * @param [env=process.env] An object containing the environment variables to check. This enables simulating the usage of a specific terminal.
      */
    def getColorDepth(): Double = js.native
    def getColorDepth(env: js.Object): Double = js.native
    
    /**
      * `writeStream.getWindowSize()` returns the size of the TTY
      * corresponding to this `WriteStream`. The array is of the type`[numColumns, numRows]` where `numColumns` and `numRows` represent the number
      * of columns and rows in the corresponding TTY.
      * @since v0.7.7
      */
    def getWindowSize(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns `true` if the `writeStream` supports at least as many colors as provided
      * in `count`. Minimum support is 2 (black and white).
      *
      * This has the same false positives and negatives as described in `writeStream.getColorDepth()`.
      *
      * ```js
      * process.stdout.hasColors();
      * // Returns true or false depending on if `stdout` supports at least 16 colors.
      * process.stdout.hasColors(256);
      * // Returns true or false depending on if `stdout` supports at least 256 colors.
      * process.stdout.hasColors({ TMUX: '1' });
      * // Returns true.
      * process.stdout.hasColors(2 ** 24, { TMUX: '1' });
      * // Returns false (the environment setting pretends to support 2 ** 8 colors).
      * ```
      * @since v11.13.0, v10.16.0
      * @param [count=16] The number of colors that are requested (minimum 2).
      * @param [env=process.env] An object containing the environment variables to check. This enables simulating the usage of a specific terminal.
      */
    def hasColors(): Boolean = js.native
    def hasColors(count: Double): Boolean = js.native
    def hasColors(count: Double, env: js.Object): Boolean = js.native
    def hasColors(env: js.Object): Boolean = js.native
    
    /**
      * A `boolean` that is always `true`.
      * @since v0.5.8
      */
    var isTTY: Boolean = js.native
    
    /**
      * `writeStream.moveCursor()` moves this `WriteStream`'s cursor _relative_ to its
      * current position.
      * @since v0.7.7
      * @param callback Invoked once the operation completes.
      * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
      */
    def moveCursor(dx: Double, dy: Double): Boolean = js.native
    def moveCursor(dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * A `number` specifying the number of rows the TTY currently has. This property
      * is updated whenever the `'resize'` event is emitted.
      * @since v0.7.7
      */
    var rows: Double = js.native
  }
  
  /**
    * The `tty.isatty()` method returns `true` if the given `fd` is associated with
    * a TTY and `false` if it is not, including whenever `fd` is not a non-negative
    * integer.
    * @since v0.5.8
    * @param fd A numeric file descriptor
    */
  inline def isatty(fd: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isatty")(fd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * -1 - to the left from cursor
    *  0 - the entire line
    *  1 - to the right from cursor
    */
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeInts.`-1`
    - typings.node.nodeInts.`0`
    - typings.node.nodeInts.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def `-1`: typings.node.nodeInts.`-1` = -1.asInstanceOf[typings.node.nodeInts.`-1`]
    
    inline def `0`: typings.node.nodeInts.`0` = 0.asInstanceOf[typings.node.nodeInts.`0`]
    
    inline def `1`: typings.node.nodeInts.`1` = 1.asInstanceOf[typings.node.nodeInts.`1`]
  }
}
