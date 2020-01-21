package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.AnonLatest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packument_
  extends /* key */ StringDictionary[js.Any] {
  var `dist-tags`: AnonLatest with (Record[String, String])
  var name: String
  var versions: Record[String, PackageVersion]
}

object Packument_ {
  @scala.inline
  def apply(
    `dist-tags`: AnonLatest with (Record[String, String]),
    name: String,
    versions: Record[String, PackageVersion],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Packument_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Packument_]
  }
}

