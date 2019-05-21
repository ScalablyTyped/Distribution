package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Build extends js.Object {
  var build: Anon_Revision
  var status: Anon_Arch
}

object Anon_Build {
  @scala.inline
  def apply(build: Anon_Revision, status: Anon_Arch): Anon_Build = {
    val __obj = js.Dynamic.literal(build = build, status = status)
  
    __obj.asInstanceOf[Anon_Build]
  }
}

