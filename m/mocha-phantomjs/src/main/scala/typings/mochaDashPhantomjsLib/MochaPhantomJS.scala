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

