package typings.node

import typings.node.netMod.SocketConstructorOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonttyMod {
  
  @JSImport("node:tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents the readable side of a TTY. In normal circumstances `process.stdin` will be the only `tty.ReadStream` instance in a Node.js
    * process and there should be no reason to create additional instances.
    * @since v0.5.8
    */
  @JSImport("node:tty", "ReadStream")
  @js.native
  open class ReadStream protected () extends StObject {
    def this(fd: Double) = this()
    def this(fd: Double, options: SocketConstructorOpts) = this()
  }
  
  /**
    * Represents the writable side of a TTY. In normal circumstances,`process.stdout` and `process.stderr` will be the only`tty.WriteStream` instances created for a Node.js process and there
    * should be no reason to create additional instances.
    * @since v0.5.8
    */
  @JSImport("node:tty", "WriteStream")
  @js.native
  open class WriteStream protected () extends StObject {
    def this(fd: Double) = this()
  }
  
  /**
    * The `tty.isatty()` method returns `true` if the given `fd` is associated with
    * a TTY and `false` if it is not, including whenever `fd` is not a non-negative
    * integer.
    * @since v0.5.8
    * @param fd A numeric file descriptor
    */
  inline def isatty(fd: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isatty")(fd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
