package typings.mochaPhantomjs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaPhantomJS extends js.Object {
  var columns: Double = js.native
  var mochaStartWait: Double = js.native
  var output: js.Any = js.native
  var startTime: Date = js.native
  var url: String = js.native
  def customizeMocha(options: MochaPhantomJSOptions): Unit = js.native
  def run(): Unit = js.native
}

object MochaPhantomJS {
  @scala.inline
  def apply(
    columns: Double,
    customizeMocha: MochaPhantomJSOptions => Unit,
    mochaStartWait: Double,
    output: js.Any,
    run: () => Unit,
    startTime: Date,
    url: String
  ): MochaPhantomJS = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], customizeMocha = js.Any.fromFunction1(customizeMocha), mochaStartWait = mochaStartWait.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), startTime = startTime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJS]
  }
  @scala.inline
  implicit class MochaPhantomJSOps[Self <: MochaPhantomJS] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomizeMocha(value: MochaPhantomJSOptions => Unit): Self = this.set("customizeMocha", js.Any.fromFunction1(value))
    @scala.inline
    def setMochaStartWait(value: Double): Self = this.set("mochaStartWait", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

