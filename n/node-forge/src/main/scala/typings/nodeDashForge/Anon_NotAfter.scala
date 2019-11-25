package typings.nodeDashForge

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotAfter extends js.Object {
  var notAfter: Date
  var notBefore: Date
}

object Anon_NotAfter {
  @scala.inline
  def apply(notAfter: Date, notBefore: Date): Anon_NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NotAfter]
  }
}

