package typings.nodeDashSass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var end: Double
  var entry: String
  var includedFiles: js.Array[String]
  var start: Double
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, end = end, entry = entry, includedFiles = includedFiles, start = start)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

