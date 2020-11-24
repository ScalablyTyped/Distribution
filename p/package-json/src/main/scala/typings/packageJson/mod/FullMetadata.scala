package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.packageJson.anon.Dictversion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullMetadata
  extends AbbreviatedMetadata
     with HoistedData {
  
  val _id: String = js.native
  
  val _rev: String = js.native
  
  val time: Dictversion = js.native
  
  val users: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  @JSName("versions")
  val versions_FullMetadata: StringDictionary[FullVersion] = js.native
}
object FullMetadata {
  
  @scala.inline
  def apply(
    _id: String,
    _rev: String,
    `dist-tags`: DistTags,
    modified: String,
    name: String,
    time: Dictversion,
    versions: StringDictionary[FullVersion]
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
  
  @scala.inline
  implicit class FullMetadataOps[Self <: FullMetadata] (val x: Self) extends AnyVal {
    
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rev(value: String): Self = this.set("_rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Dictversion): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: StringDictionary[FullVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: StringDictionary[Boolean]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
