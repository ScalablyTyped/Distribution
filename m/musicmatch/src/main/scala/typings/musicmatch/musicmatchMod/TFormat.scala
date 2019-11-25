package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.musicmatch.musicmatchStrings.json
  - typings.musicmatch.musicmatchStrings.xml
*/
trait TFormat extends js.Object

object TFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typings.musicmatch.musicmatchStrings.json = this.cast("json")
  @scala.inline
  def xml: typings.musicmatch.musicmatchStrings.xml = this.cast("xml")
}

