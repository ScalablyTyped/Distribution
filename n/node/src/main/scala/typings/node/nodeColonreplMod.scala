package typings.node

import typings.node.anon.Options
import typings.node.replMod.REPLWriter
import typings.node.replMod.ReplOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonreplMod {
  
  @JSImport("node:repl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of `repl.REPLServer` are created using the {@link start} method
    * or directly using the JavaScript `new` keyword.
    *
    * ```js
    * const repl = require('node:repl');
    *
    * const options = { useColors: true };
    *
    * const firstInstance = repl.start(options);
    * const secondInstance = new repl.REPLServer(options);
    * ```
    * @since v0.1.91
    */
  @JSImport("node:repl", "REPLServer")
  @js.native
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of `repl.REPLServer` are created using the `repl.start()` method and
    * > _should not_ be created directly using the JavaScript `new` keyword.
    *
    * `REPLServer` cannot be subclassed due to implementation specifics in NodeJS.
    *
    * @see https://nodejs.org/dist/latest-v20.x/docs/api/repl.html#repl_class_replserver
    */
  /* private */ open class REPLServer () extends StObject
  
  /**
    * A flag passed in the REPL options. Evaluates expressions in sloppy mode.
    */
  @JSImport("node:repl", "REPL_MODE_SLOPPY")
  @js.native
  val REPL_MODE_SLOPPY: js.Symbol = js.native
  
  /**
    * A flag passed in the REPL options. Evaluates expressions in strict mode.
    * This is equivalent to prefacing every repl statement with `'use strict'`.
    */
  @JSImport("node:repl", "REPL_MODE_STRICT")
  @js.native
  val REPL_MODE_STRICT: js.Symbol = js.native
  
  /**
    * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
    *
    * @see https://nodejs.org/dist/latest-v20.x/docs/api/repl.html#repl_recoverable_errors
    */
  @JSImport("node:repl", "Recoverable")
  @js.native
  open class Recoverable protected ()
    extends typings.node.replMod.Recoverable {
    def this(err: js.Error) = this()
  }
  
  /**
    * The `repl.start()` method creates and starts a {@link REPLServer} instance.
    *
    * If `options` is a string, then it specifies the input prompt:
    *
    * ```js
    * const repl = require('node:repl');
    *
    * // a Unix style prompt
    * repl.start('$ ');
    * ```
    * @since v0.1.91
    */
  inline def start(): typings.node.replMod.REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[typings.node.replMod.REPLServer]
  inline def start(options: String): typings.node.replMod.REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.replMod.REPLServer]
  inline def start(options: ReplOptions): typings.node.replMod.REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.replMod.REPLServer]
  
  /**
    * This is the default "writer" value, if none is passed in the REPL options,
    * and it can be overridden by custom print functions.
    */
  @JSImport("node:repl", "writer")
  @js.native
  val writer: REPLWriter & Options = js.native
}
