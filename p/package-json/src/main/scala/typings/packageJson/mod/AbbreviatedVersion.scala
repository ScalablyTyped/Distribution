package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.packageJson.anon.Integrity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbbreviatedVersion
  extends /* key */ StringDictionary[js.Any] {
  
  val _hasShrinkwrap: js.UndefOr[Boolean] = js.native
  
  val bin: js.UndefOr[StringDictionary[String]] = js.native
  
  val bundleDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  val dependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  val deprecated: js.UndefOr[String] = js.native
  
  val devDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  val directories: js.UndefOr[js.Array[String]] = js.native
  
  val dist: Integrity = js.native
  
  val engines: js.UndefOr[StringDictionary[String]] = js.native
  
  val name: String = js.native
  
  val optionalDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  val peerDependencies: js.UndefOr[StringDictionary[String]] = js.native
  
  val version: String = js.native
}
object AbbreviatedVersion {
  
  @scala.inline
  def apply(dist: Integrity, name: String, version: String): AbbreviatedVersion = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbreviatedVersion]
  }
  
  @scala.inline
  implicit class AbbreviatedVersionOps[Self <: AbbreviatedVersion] (val x: Self) extends AnyVal {
    
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
    def setDist(value: Integrity): Self = this.set("dist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hasShrinkwrap(value: Boolean): Self = this.set("_hasShrinkwrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_hasShrinkwrap: Self = this.set("_hasShrinkwrap", js.undefined)
    
    @scala.inline
    def setBin(value: StringDictionary[String]): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    
    @scala.inline
    def setBundleDependencies(value: StringDictionary[String]): Self = this.set("bundleDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleDependencies: Self = this.set("bundleDependencies", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDevDependencies(value: StringDictionary[String]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: String*): Self = this.set("directories", js.Array(value :_*))
    
    @scala.inline
    def setDirectories(value: js.Array[String]): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setEngines(value: StringDictionary[String]): Self = this.set("engines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngines: Self = this.set("engines", js.undefined)
    
    @scala.inline
    def setOptionalDependencies(value: StringDictionary[String]): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalDependencies: Self = this.set("optionalDependencies", js.undefined)
    
    @scala.inline
    def setPeerDependencies(value: StringDictionary[String]): Self = this.set("peerDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerDependencies: Self = this.set("peerDependencies", js.undefined)
  }
}
