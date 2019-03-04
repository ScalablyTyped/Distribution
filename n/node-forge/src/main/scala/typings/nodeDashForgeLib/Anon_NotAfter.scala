package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotAfter extends js.Object {
  var notAfter: stdLib.Date
  var notBefore: stdLib.Date
}

object Anon_NotAfter {
  @scala.inline
  def apply(notAfter: stdLib.Date, notBefore: stdLib.Date): Anon_NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter, notBefore = notBefore)
  
    __obj.asInstanceOf[Anon_NotAfter]
  }
}

