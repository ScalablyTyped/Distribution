package typings.packageDashJson.packageDashJsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbbreviatedMetadata
  extends /* key */ StringDictionary[js.Any] {
  val `dist-tags`: DistTags
  val modified: String
  val name: String
  val versions: StringDictionary[AbbreviatedVersion]
}

object AbbreviatedMetadata {
  @scala.inline
  def apply(
    `dist-tags`: DistTags,
    modified: String,
    name: String,
    versions: StringDictionary[AbbreviatedVersion],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AbbreviatedMetadata = {
    val __obj = js.Dynamic.literal(modified = modified, name = name, versions = versions)
    __obj.updateDynamic("dist-tags")(`dist-tags`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AbbreviatedMetadata]
  }
}

