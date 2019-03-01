package typings
package mochaDashPhantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJS extends js.Object {
  var columns: scala.Double
  var mochaStartWait: scala.Double
  var output: js.Any
  var startTime: stdLib.Date
  var url: java.lang.String
  def customizeMocha(options: MochaPhantomJSOptions): scala.Unit
  def run(): scala.Unit
}

object MochaPhantomJS {
  @scala.inline
  def apply(
    columns: scala.Double,
    customizeMocha: js.Function1[MochaPhantomJSOptions, scala.Unit],
    mochaStartWait: scala.Double,
    output: js.Any,
    run: js.Function0[scala.Unit],
    startTime: stdLib.Date,
    url: java.lang.String
  ): MochaPhantomJS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("customizeMocha")(customizeMocha)
    __obj.updateDynamic("mochaStartWait")(mochaStartWait)
    __obj.updateDynamic("output")(output)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MochaPhantomJS]
  }
}

