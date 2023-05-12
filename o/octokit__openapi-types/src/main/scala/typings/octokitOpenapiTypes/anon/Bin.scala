package typings.octokitOpenapiTypes.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bin extends StObject {
  
  var author: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var bin: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var bugs: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var commit_oid: js.UndefOr[String] = js.undefined
  
  var contributors: js.UndefOr[js.Array[Record[String, scala.Nothing]]] = js.undefined
  
  var cpu: js.UndefOr[js.Array[String]] = js.undefined
  
  var deleted_by_id: js.UndefOr[Double] = js.undefined
  
  var dependencies: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dev_dependencies: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var directories: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var dist: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var engines: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  var git_head: js.UndefOr[String] = js.undefined
  
  var has_shrinkwrap: js.UndefOr[Boolean] = js.undefined
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var installation_command: js.UndefOr[String] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var license: js.UndefOr[String] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var maintainers: js.UndefOr[js.Array[Record[String, scala.Nothing]]] = js.undefined
  
  var man: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var node_version: js.UndefOr[String] = js.undefined
  
  var npm_user: js.UndefOr[String] = js.undefined
  
  var npm_version: js.UndefOr[String] = js.undefined
  
  var optional_dependencies: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var os: js.UndefOr[js.Array[String]] = js.undefined
  
  var peer_dependencies: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var published_via_actions: js.UndefOr[Boolean] = js.undefined
  
  var readme: js.UndefOr[String] = js.undefined
  
  var release_id: js.UndefOr[Double] = js.undefined
  
  var repository: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var scripts: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Bin {
  
  inline def apply(): Bin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Record[String, Any]): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBin(value: Record[String, scala.Nothing]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    inline def setBugs(value: Record[String, Any]): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
    
    inline def setBugsNull: Self = StObject.set(x, "bugs", null)
    
    inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
    
    inline def setCommit_oid(value: String): Self = StObject.set(x, "commit_oid", value.asInstanceOf[js.Any])
    
    inline def setCommit_oidUndefined: Self = StObject.set(x, "commit_oid", js.undefined)
    
    inline def setContributors(value: js.Array[Record[String, scala.Nothing]]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setContributorsVarargs(value: (Record[String, scala.Nothing])*): Self = StObject.set(x, "contributors", js.Array(value*))
    
    inline def setCpu(value: js.Array[String]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setCpuVarargs(value: String*): Self = StObject.set(x, "cpu", js.Array(value*))
    
    inline def setDeleted_by_id(value: Double): Self = StObject.set(x, "deleted_by_id", value.asInstanceOf[js.Any])
    
    inline def setDeleted_by_idUndefined: Self = StObject.set(x, "deleted_by_id", js.undefined)
    
    inline def setDependencies(value: Record[String, scala.Nothing]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDev_dependencies(value: Record[String, scala.Nothing]): Self = StObject.set(x, "dev_dependencies", value.asInstanceOf[js.Any])
    
    inline def setDev_dependenciesUndefined: Self = StObject.set(x, "dev_dependencies", js.undefined)
    
    inline def setDirectories(value: Record[String, Any]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesNull: Self = StObject.set(x, "directories", null)
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDist(value: Record[String, Any]): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
    
    inline def setDistNull: Self = StObject.set(x, "dist", null)
    
    inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
    
    inline def setEngines(value: Record[String, scala.Nothing]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setGit_head(value: String): Self = StObject.set(x, "git_head", value.asInstanceOf[js.Any])
    
    inline def setGit_headUndefined: Self = StObject.set(x, "git_head", js.undefined)
    
    inline def setHas_shrinkwrap(value: Boolean): Self = StObject.set(x, "has_shrinkwrap", value.asInstanceOf[js.Any])
    
    inline def setHas_shrinkwrapUndefined: Self = StObject.set(x, "has_shrinkwrap", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstallation_command(value: String): Self = StObject.set(x, "installation_command", value.asInstanceOf[js.Any])
    
    inline def setInstallation_commandUndefined: Self = StObject.set(x, "installation_command", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setMaintainers(value: js.Array[Record[String, scala.Nothing]]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
    
    inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
    
    inline def setMaintainersVarargs(value: (Record[String, scala.Nothing])*): Self = StObject.set(x, "maintainers", js.Array(value*))
    
    inline def setMan(value: Record[String, scala.Nothing]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
    
    inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_version(value: String): Self = StObject.set(x, "node_version", value.asInstanceOf[js.Any])
    
    inline def setNode_versionUndefined: Self = StObject.set(x, "node_version", js.undefined)
    
    inline def setNpm_user(value: String): Self = StObject.set(x, "npm_user", value.asInstanceOf[js.Any])
    
    inline def setNpm_userUndefined: Self = StObject.set(x, "npm_user", js.undefined)
    
    inline def setNpm_version(value: String): Self = StObject.set(x, "npm_version", value.asInstanceOf[js.Any])
    
    inline def setNpm_versionUndefined: Self = StObject.set(x, "npm_version", js.undefined)
    
    inline def setOptional_dependencies(value: Record[String, scala.Nothing]): Self = StObject.set(x, "optional_dependencies", value.asInstanceOf[js.Any])
    
    inline def setOptional_dependenciesUndefined: Self = StObject.set(x, "optional_dependencies", js.undefined)
    
    inline def setOs(value: js.Array[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVarargs(value: String*): Self = StObject.set(x, "os", js.Array(value*))
    
    inline def setPeer_dependencies(value: Record[String, scala.Nothing]): Self = StObject.set(x, "peer_dependencies", value.asInstanceOf[js.Any])
    
    inline def setPeer_dependenciesUndefined: Self = StObject.set(x, "peer_dependencies", js.undefined)
    
    inline def setPublished_via_actions(value: Boolean): Self = StObject.set(x, "published_via_actions", value.asInstanceOf[js.Any])
    
    inline def setPublished_via_actionsUndefined: Self = StObject.set(x, "published_via_actions", js.undefined)
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
    inline def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    inline def setRelease_idUndefined: Self = StObject.set(x, "release_id", js.undefined)
    
    inline def setRepository(value: Record[String, Any]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setScripts(value: Record[String, scala.Nothing]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
