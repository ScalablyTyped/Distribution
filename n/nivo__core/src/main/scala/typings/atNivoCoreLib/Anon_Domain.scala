package typings
package atNivoCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: stdLib.Partial[Anon_Line]
  var legend: stdLib.Partial[Anon_Text]
  var ticks: stdLib.Partial[Anon_LineText]
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: stdLib.Partial[Anon_Line],
    legend: stdLib.Partial[Anon_Text],
    ticks: stdLib.Partial[Anon_LineText]
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal(domain = domain, legend = legend, ticks = ticks)
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

