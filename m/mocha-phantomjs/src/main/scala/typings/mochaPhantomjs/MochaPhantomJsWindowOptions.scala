package typings.mochaPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaPhantomJsWindowOptions extends Window {
  var ended: Boolean = js.native
  var env: js.Any = js.native
  var failures: Double = js.native
  var started: Boolean = js.native
  def run(): Unit = js.native
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
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], mochaPhantomJS = js.Any.fromFunction0(mochaPhantomJS), run = js.Any.fromFunction0(run), started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
  @scala.inline
  implicit class MochaPhantomJsWindowOptionsOps[Self <: MochaPhantomJsWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnded(value: Boolean): Self = this.set("ended", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def setStarted(value: Boolean): Self = this.set("started", value.asInstanceOf[js.Any])
  }
  
}

