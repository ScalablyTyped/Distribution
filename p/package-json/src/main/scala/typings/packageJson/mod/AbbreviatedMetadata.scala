package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbbreviatedMetadata
  extends /* key */ StringDictionary[js.Any] {
  val `dist-tags`: DistTags = js.native
  val modified: String = js.native
  val name: String = js.native
  val versions: StringDictionary[AbbreviatedVersion] = js.native
}

object AbbreviatedMetadata {
  @scala.inline
  def apply(
    `dist-tags`: DistTags,
    modified: String,
    name: String,
    versions: StringDictionary[AbbreviatedVersion]
  ): AbbreviatedMetadata = {
    val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbreviatedMetadata]
  }
  @scala.inline
  implicit class AbbreviatedMetadataOps[Self <: AbbreviatedMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setDist-tags`(value: DistTags): Self = this.set("dist-tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersions(value: StringDictionary[AbbreviatedVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}

