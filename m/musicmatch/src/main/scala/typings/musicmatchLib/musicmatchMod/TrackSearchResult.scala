package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSearchResult extends js.Object {
  var message: musicmatchLib.Anon_Body
}

object TrackSearchResult {
  @scala.inline
  def apply(message: musicmatchLib.Anon_Body): TrackSearchResult = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[TrackSearchResult]
  }
}

