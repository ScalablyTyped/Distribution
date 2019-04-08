package typings
package musicmatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: Anon_Tracklist
  var header: Anon_Available
}

object Anon_Body {
  @scala.inline
  def apply(body: Anon_Tracklist, header: Anon_Available): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, header = header)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

