package typings.mochaDashPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJsWindowOptions extends Window {
  var ended: Boolean
  var env: js.Any
  var failures: Double
  var started: Boolean
  def run(): Unit
}

object MochaPhantomJsWindowOptions {
  @scala.inline
  def apply(
    ended: Boolean,
    env: js.Any,
    failures: Double,
    mochaPhantomJS: () => MochaPhantomJsWindowOptions,
    run: () => Unit,
    started: Boolean
  ): MochaPhantomJsWindowOptions = {
    val __obj = js.Dynamic.literal(ended = ended, env = env, failures = failures, mochaPhantomJS = js.Any.fromFunction0(mochaPhantomJS), run = js.Any.fromFunction0(run), started = started)
  
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
}

