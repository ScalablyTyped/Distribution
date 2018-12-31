package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var bodySize: scala.Double
  var contentType: java.lang.String
  var headers: js.Array[phantomLib.Anon_Value]
  var id: java.lang.String
  var redirectURL: java.lang.String
  var stage: phantomLib.phantomLibStrings.start | phantomLib.phantomLibStrings.end
  var status: scala.Double
  var statusText: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

