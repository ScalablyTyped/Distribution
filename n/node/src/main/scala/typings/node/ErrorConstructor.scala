package typings.node

import typings.node.NodeJSNs.CallSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Declare "static" methods in Error
@js.native
trait ErrorConstructor extends js.Object {
  /**
    * Optional override for formatting stack traces
    *
    * @see https://github.com/v8/v8/wiki/Stack%20Trace%20API#customizing-stack-traces
    */
  var prepareStackTrace: js.UndefOr[js.Function2[/* err */ Error, /* stackTraces */ js.Array[CallSite], _]] = js.native
  var stackTraceLimit: Double = js.native
  /** Create .stack property on a target object */
  def captureStackTrace(targetObject: js.Object): Unit = js.native
  def captureStackTrace(targetObject: js.Object, constructorOpt: js.Function): Unit = js.native
}

