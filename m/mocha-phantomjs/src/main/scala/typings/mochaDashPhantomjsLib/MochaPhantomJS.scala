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
    customizeMocha: MochaPhantomJSOptions => scala.Unit,
    mochaStartWait: scala.Double,
    output: js.Any,
    run: () => scala.Unit,
    startTime: stdLib.Date,
    url: java.lang.String
  ): MochaPhantomJS = {
    val __obj = js.Dynamic.literal(columns = columns, customizeMocha = js.Any.fromFunction1(customizeMocha), mochaStartWait = mochaStartWait, output = output, run = js.Any.fromFunction0(run), startTime = startTime, url = url)
  
    __obj.asInstanceOf[MochaPhantomJS]
  }
}

