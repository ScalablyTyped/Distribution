package typings.node

import typings.node.NodeJS.Global
import typings.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var console: Console_ = js.native
  @JSName("__dirname")
  var dirname: java.lang.String = js.native
  // Same as module.exports
  var exports: js.Any = js.native
  @JSName("__filename")
  var filename: java.lang.String = js.native
  var global: Global = js.native
  var module: NodeModule = js.native
  var process: Process = js.native
  var require: NodeRequire = js.native
}

