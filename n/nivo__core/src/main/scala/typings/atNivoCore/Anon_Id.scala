package typings.atNivoCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id
  extends /* key */ StringDictionary[js.Any] {
  var id: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Id]
  }
}

