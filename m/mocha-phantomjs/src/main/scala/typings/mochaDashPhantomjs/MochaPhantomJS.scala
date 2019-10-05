package typings.mochaDashPhantomjs

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJS extends js.Object {
  var columns: Double
  var mochaStartWait: Double
  var output: js.Any
  var startTime: Date
  var url: String
  def customizeMocha(options: MochaPhantomJSOptions): Unit
  def run(): Unit
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
    val __obj = js.Dynamic.literal(columns = columns, customizeMocha = js.Any.fromFunction1(customizeMocha), mochaStartWait = mochaStartWait, output = output, run = js.Any.fromFunction0(run), startTime = startTime, url = url)
  
    __obj.asInstanceOf[MochaPhantomJS]
  }
}

@JSGlobal("mochaPhantomJS")
@js.native
object mochaPhantomJS extends TopLevel[MochaPhantomJS]

