package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.pacoteBooleans.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest_
  extends CommonMetadata
     with // Non-standard properties may also appear when fullMetadata = true.
/* key */ StringDictionary[js.Any] {
  
  var _id: js.UndefOr[String] = js.native
  
  var _nodeVersion: js.UndefOr[String] = js.native
  
  var _npmUser: js.UndefOr[Person] = js.native
  
  var _npmVersion: js.UndefOr[String] = js.native
  
  var bin: js.UndefOr[Record[String, String]] = js.native
  
  // These properties usually only appear when fullMetadata = true.
  var browser: js.UndefOr[String] = js.native
  
  var bundledDependencies: js.UndefOr[`false` | js.Array[String]] = js.native
  
  var config: js.UndefOr[Record[String, _]] = js.native
  
  var cpu: js.UndefOr[js.Array[String]] = js.native
  
  // These properties usually appear in all requests.
  var dependencies: js.UndefOr[Record[String, String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var devDependencies: js.UndefOr[Record[String, String]] = js.native
  
  var directories: js.UndefOr[Record[String, String]] = js.native
  
  var dist: PackageDist = js.native
  
  var engines: js.UndefOr[Record[String, String]] = js.native
  
  var files: js.UndefOr[js.Array[String]] = js.native
  
  var main: js.UndefOr[String] = js.native
  
  var man: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: String = js.native
  
  var optionalDependencies: js.UndefOr[Record[String, String]] = js.native
  
  var os: js.UndefOr[js.Array[String]] = js.native
  
  var peerDependencies: js.UndefOr[Record[String, String]] = js.native
  
  var publishConfig: js.UndefOr[Record[String, _]] = js.native
  
  var scripts: js.UndefOr[Record[String, String]] = js.native
  
  var version: String = js.native
}
object Manifest_ {
  
  @scala.inline
  def apply(dist: PackageDist, name: String, version: String): Manifest_ = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest_]
  }
  
  @scala.inline
  implicit class Manifest_Ops[Self <: Manifest_] (val x: Self) extends AnyVal {
    
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
    def setDist(value: PackageDist): Self = this.set("dist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    
    @scala.inline
    def set_nodeVersion(value: String): Self = this.set("_nodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_nodeVersion: Self = this.set("_nodeVersion", js.undefined)
    
    @scala.inline
    def set_npmUser(value: Person): Self = this.set("_npmUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_npmUser: Self = this.set("_npmUser", js.undefined)
    
    @scala.inline
    def set_npmVersion(value: String): Self = this.set("_npmVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_npmVersion: Self = this.set("_npmVersion", js.undefined)
    
    @scala.inline
    def setBin(value: Record[String, String]): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setBundledDependenciesVarargs(value: String*): Self = this.set("bundledDependencies", js.Array(value :_*))
    
    @scala.inline
    def setBundledDependencies(value: `false` | js.Array[String]): Self = this.set("bundledDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundledDependencies: Self = this.set("bundledDependencies", js.undefined)
    
    @scala.inline
    def setConfig(value: Record[String, _]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCpuVarargs(value: String*): Self = this.set("cpu", js.Array(value :_*))
    
    @scala.inline
    def setCpu(value: js.Array[String]): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setDependencies(value: Record[String, String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDevDependencies(value: Record[String, String]): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    
    @scala.inline
    def setDirectories(value: Record[String, String]): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setEngines(value: Record[String, String]): Self = this.set("engines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngines: Self = this.set("engines", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setManVarargs(value: String*): Self = this.set("man", js.Array(value :_*))
    
    @scala.inline
    def setMan(value: String | js.Array[String]): Self = this.set("man", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMan: Self = this.set("man", js.undefined)
    
    @scala.inline
    def setOptionalDependencies(value: Record[String, String]): Self = this.set("optionalDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalDependencies: Self = this.set("optionalDependencies", js.undefined)
    
    @scala.inline
    def setOsVarargs(value: String*): Self = this.set("os", js.Array(value :_*))
    
    @scala.inline
    def setOs(value: js.Array[String]): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setPeerDependencies(value: Record[String, String]): Self = this.set("peerDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerDependencies: Self = this.set("peerDependencies", js.undefined)
    
    @scala.inline
    def setPublishConfig(value: Record[String, _]): Self = this.set("publishConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishConfig: Self = this.set("publishConfig", js.undefined)
    
    @scala.inline
    def setScripts(value: Record[String, String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
  }
}
