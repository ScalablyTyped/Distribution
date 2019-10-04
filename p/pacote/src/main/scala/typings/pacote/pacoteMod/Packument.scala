package typings.pacote.pacoteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.Anon_Latest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packument
  extends /* key */ StringDictionary[js.Any] {
  var `dist-tags`: Anon_Latest with (Record[String, String])
  var name: String
  var versions: Record[String, PackageVersion]
}

object Packument {
  @scala.inline
  def apply(
    `dist-tags`: Anon_Latest with (Record[String, String]),
    name: String,
    versions: Record[String, PackageVersion],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Packument = {
    val __obj = js.Dynamic.literal(name = name, versions = versions)
    __obj.updateDynamic("dist-tags")(`dist-tags`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Packument]
  }
}

