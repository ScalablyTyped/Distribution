package typings.node

import typings.node.wasiMod.WASIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeWasiMod {
  
  /**
    * The `WASI` class provides the WASI system call API and additional convenience
    * methods for working with WASI-based applications. Each `WASI` instance
    * represents a distinct sandbox environment. For security purposes, each `WASI`instance must have its command-line arguments, environment variables, and
    * sandbox directory structure configured explicitly.
    * @since v13.3.0, v12.16.0
    */
  @JSImport("node:wasi", "WASI")
  @js.native
  open class WASI ()
    extends typings.node.wasiMod.WASI {
    def this(options: WASIOptions) = this()
  }
}
