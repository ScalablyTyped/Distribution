package typings.atNivoCore

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: Partial[Anon_Line]
  var legend: Partial[Anon_Text]
  var ticks: Partial[Anon_LineText]
}

object Anon_Domain {
  @scala.inline
  def apply(domain: Partial[Anon_Line], legend: Partial[Anon_Text], ticks: Partial[Anon_LineText]): Anon_Domain = {
    val __obj = js.Dynamic.literal(domain = domain, legend = legend, ticks = ticks)
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

