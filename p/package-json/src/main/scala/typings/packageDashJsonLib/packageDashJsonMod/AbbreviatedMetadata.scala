package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbbreviatedMetadata
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  val `dist-tags`: DistTags
  val modified: java.lang.String
  val name: java.lang.String
  val versions: org.scalablytyped.runtime.StringDictionary[AbbreviatedVersion]
}

object AbbreviatedMetadata {
  @scala.inline
  def apply(
    `dist-tags`: DistTags,
    modified: java.lang.String,
    name: java.lang.String,
    versions: org.scalablytyped.runtime.StringDictionary[AbbreviatedVersion],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AbbreviatedMetadata = {
    val __obj = js.Dynamic.literal(modified = modified, name = name, versions = versions)
    __obj.updateDynamic("dist-tags")(`dist-tags`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AbbreviatedMetadata]
  }
}

