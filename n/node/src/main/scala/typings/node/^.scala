package typings.node

import typings.node.NodeJS.Global
import typings.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var __dirname: java.lang.String = js.native
  var __filename: java.lang.String = js.native
  var console: Console = js.native
  // Same as module.exports
  var exports: js.Any = js.native
  var global: Global = js.native
  var module: NodeModule = js.native
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  var process: Process = js.native
  var require: NodeRequire = js.native
}

