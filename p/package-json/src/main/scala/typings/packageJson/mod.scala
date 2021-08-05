package typings.packageJson

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.packageJson.anon.Dictversion
import typings.packageJson.anon.Email
import typings.packageJson.anon.Integrity
import typings.packageJson.anon.Type
import typings.packageJson.anon.Url
import typings.packageJson.packageJsonBooleans.`false`
import typings.packageJson.packageJsonBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(packageName: String): js.Promise[AbbreviatedMetadata] = ^.asInstanceOf[js.Dynamic].apply(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AbbreviatedMetadata]]
  /**
  	Get metadata of a package from the npm registry.
  	@param packageName - Name of the package.
  	@example
  	```
  	import packageJson = require('package-json');
  	(async () => {
  		console.log(await packageJson('ava'));
  		//=> {name: 'ava', ...}
  		// Also works with scoped packages
  		console.log(await packageJson('@sindresorhus/df'));
  	})();
  	```
  	*/
  inline def apply(packageName: String, options: FullMetadataOptions): js.Promise[FullMetadata] = (^.asInstanceOf[js.Dynamic].apply(packageName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FullMetadata]]
  inline def apply(packageName: String, options: Options): js.Promise[AbbreviatedMetadata] = (^.asInstanceOf[js.Dynamic].apply(packageName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AbbreviatedMetadata]]
  
  @JSImport("package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  @JSImport("package-json", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof packageJson */ js.Any = js.native
  
  /**
  	The error thrown when the given package name cannot be found.
  	*/
  @JSImport("package-json", "PackageNotFoundError")
  @js.native
  def PackageNotFoundError: Instantiable1[/* packageName */ String, PackageNotFoundErrorClass] = js.native
  type PackageNotFoundError = PackageNotFoundErrorClass
  
  /**
  	The error thrown when the given package name cannot be found.
  	*/
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("package-json", "PackageNotFoundError")
  @js.native
  class PackageNotFoundErrorCls protected ()
    extends StObject
       with PackageNotFoundErrorClass {
    def this(packageName: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_PackageNotFoundErrorClass: typings.packageJson.packageJsonStrings.PackageNotFoundError = js.native
  }
  
  inline def PackageNotFoundError_=(x: Instantiable1[/* packageName */ String, PackageNotFoundErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackageNotFoundError")(x.asInstanceOf[js.Any])
  
  /**
  	The error thrown when the given package version cannot be found.
  	*/
  @JSImport("package-json", "VersionNotFoundError")
  @js.native
  def VersionNotFoundError: Instantiable2[/* packageName */ String, /* version */ String, VersionNotFoundErrorClass] = js.native
  type VersionNotFoundError = VersionNotFoundErrorClass
  
  /**
  	The error thrown when the given package version cannot be found.
  	*/
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("package-json", "VersionNotFoundError")
  @js.native
  class VersionNotFoundErrorCls protected ()
    extends StObject
       with VersionNotFoundErrorClass {
    def this(packageName: String, version: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_VersionNotFoundErrorClass: typings.packageJson.packageJsonStrings.VersionNotFoundError = js.native
  }
  
  inline def VersionNotFoundError_=(x: Instantiable2[/* packageName */ String, /* version */ String, VersionNotFoundErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VersionNotFoundError")(x.asInstanceOf[js.Any])
  
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof packageJson */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait AbbreviatedMetadata
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    val `dist-tags`: DistTags
    
    val modified: String
    
    val name: String
    
    val versions: StringDictionary[AbbreviatedVersion]
  }
  object AbbreviatedMetadata {
    
    inline def apply(
      `dist-tags`: DistTags,
      modified: String,
      name: String,
      versions: StringDictionary[AbbreviatedVersion]
    ): AbbreviatedMetadata = {
      val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbbreviatedMetadata]
    }
    
    extension [Self <: AbbreviatedMetadata](x: Self) {
      
      inline def `setDist-tags`(value: DistTags): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: StringDictionary[AbbreviatedVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbbreviatedVersion
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    val _hasShrinkwrap: js.UndefOr[Boolean] = js.undefined
    
    val bin: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val bundleDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val deprecated: js.UndefOr[String] = js.undefined
    
    val devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val directories: js.UndefOr[js.Array[String]] = js.undefined
    
    val dist: Integrity
    
    val engines: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val name: String
    
    val optionalDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val peerDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val version: String
  }
  object AbbreviatedVersion {
    
    inline def apply(dist: Integrity, name: String, version: String): AbbreviatedVersion = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbbreviatedVersion]
    }
    
    extension [Self <: AbbreviatedVersion](x: Self) {
      
      inline def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBundleDependencies(value: StringDictionary[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value :_*))
      
      inline def setDist(value: Integrity): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setEngines(value: StringDictionary[String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependencies(value: StringDictionary[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setPeerDependencies(value: StringDictionary[String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def set_hasShrinkwrap(value: Boolean): Self = StObject.set(x, "_hasShrinkwrap", value.asInstanceOf[js.Any])
      
      inline def set_hasShrinkwrapUndefined: Self = StObject.set(x, "_hasShrinkwrap", js.undefined)
    }
  }
  
  trait Agents extends StObject {
    
    var http: js.UndefOr[Agent] = js.undefined
    
    var https: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
  }
  object Agents {
    
    inline def apply(): Agents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Agents]
    }
    
    extension [Self <: Agents](x: Self) {
      
      inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  trait DistTags
    extends StObject
       with /* tagName */ StringDictionary[String] {
    
    val latest: String
  }
  object DistTags {
    
    inline def apply(latest: String): DistTags = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistTags]
    }
    
    extension [Self <: DistTags](x: Self) {
      
      inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullMetadata
    extends StObject
       with AbbreviatedMetadata
       with HoistedData {
    
    val _id: String
    
    val _rev: String
    
    val time: Dictversion
    
    val users: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    @JSName("versions")
    val versions_FullMetadata: StringDictionary[FullVersion]
  }
  object FullMetadata {
    
    inline def apply(
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
    
    extension [Self <: FullMetadata](x: Self) {
      
      inline def setTime(value: Dictversion): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: StringDictionary[Boolean]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setVersions(value: StringDictionary[FullVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullMetadataOptions
    extends StObject
       with Options {
    
    /**
    		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
    		@default false
    		*/
    @JSName("fullMetadata")
    val fullMetadata_FullMetadataOptions: `true`
  }
  object FullMetadataOptions {
    
    inline def apply(): FullMetadataOptions = {
      val __obj = js.Dynamic.literal(fullMetadata = true)
      __obj.asInstanceOf[FullMetadataOptions]
    }
    
    extension [Self <: FullMetadataOptions](x: Self) {
      
      inline def setFullMetadata(value: `true`): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullVersion
    extends StObject
       with AbbreviatedVersion
       with HoistedData {
    
    val _id: String
    
    val _nodeVersion: String
    
    val _npmUser: String
    
    val _npmVersion: String
    
    val files: js.UndefOr[js.Array[String]] = js.undefined
    
    val gitHead: js.UndefOr[String] = js.undefined
    
    val main: js.UndefOr[String] = js.undefined
    
    val man: js.UndefOr[js.Array[String]] = js.undefined
    
    val scripts: js.UndefOr[StringDictionary[String]] = js.undefined
    
    val types: js.UndefOr[String] = js.undefined
    
    @JSName("typings")
    val typings_ : js.UndefOr[String] = js.undefined
  }
  object FullVersion {
    
    inline def apply(
      _id: String,
      _nodeVersion: String,
      _npmUser: String,
      _npmVersion: String,
      dist: Integrity,
      name: String,
      version: String
    ): FullVersion = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _nodeVersion = _nodeVersion.asInstanceOf[js.Any], _npmUser = _npmUser.asInstanceOf[js.Any], _npmVersion = _npmVersion.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullVersion]
    }
    
    extension [Self <: FullVersion](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setGitHead(value: String): Self = StObject.set(x, "gitHead", value.asInstanceOf[js.Any])
      
      inline def setGitHeadUndefined: Self = StObject.set(x, "gitHead", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setMan(value: js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      inline def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_nodeVersion(value: String): Self = StObject.set(x, "_nodeVersion", value.asInstanceOf[js.Any])
      
      inline def set_npmUser(value: String): Self = StObject.set(x, "_npmUser", value.asInstanceOf[js.Any])
      
      inline def set_npmVersion(value: String): Self = StObject.set(x, "_npmVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait HoistedData extends StObject {
    
    val author: js.UndefOr[Person] = js.undefined
    
    val bugs: js.UndefOr[Email | Url] = js.undefined
    
    val contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    val description: js.UndefOr[String] = js.undefined
    
    val homepage: js.UndefOr[String] = js.undefined
    
    val keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    val license: js.UndefOr[String] = js.undefined
    
    val maintainers: js.UndefOr[js.Array[Person]] = js.undefined
    
    val readme: js.UndefOr[String] = js.undefined
    
    val readmeFilename: js.UndefOr[String] = js.undefined
    
    val repository: js.UndefOr[Type] = js.undefined
  }
  object HoistedData {
    
    inline def apply(): HoistedData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoistedData]
    }
    
    extension [Self <: HoistedData](x: Self) {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBugs(value: Email | Url): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      inline def setReadmeFilename(value: String): Self = StObject.set(x, "readmeFilename", value.asInstanceOf[js.Any])
      
      inline def setReadmeFilenameUndefined: Self = StObject.set(x, "readmeFilename", js.undefined)
      
      inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      inline def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    		Overwrite the `agent` option that is passed down to [`got`](https://github.com/sindresorhus/got#agent). This might be useful to add [proxy support](https://github.com/sindresorhus/got#proxies).
    		*/
    val agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | Agents | `false`] = js.undefined
    
    /**
    		Return the [main entry](https://registry.npmjs.org/ava) containing all versions.
    		@default false
    		*/
    val allVersions: js.UndefOr[Boolean] = js.undefined
    
    /**
    		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
    		@default false
    		*/
    val fullMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
    		The registry URL is by default inferred from the npm defaults and `.npmrc`. This is beneficial as `package-json` and any project using it will work just like npm. This option is*only** intended for internal tools. You should*not** use this option in reusable packages. Prefer just using `.npmrc` whenever possible.
    		*/
    val registryUrl: js.UndefOr[String] = js.undefined
    
    /**
    		Package version such as `1.0.0` or a [dist tag](https://docs.npmjs.com/cli/dist-tag) such as `latest`.
    		The version can also be in any format supported by the [semver](https://github.com/npm/node-semver) module. For example:
    		- `1` - Get the latest `1.x.x`
    		- `1.2` - Get the latest `1.2.x`
    		- `^1.2.3` - Get the latest `1.x.x` but at least `1.2.3`
    		- `~1.2.3` - Get the latest `1.2.x` but at least `1.2.3`
    		@default 'latest'
    		*/
    val version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: Agent | typings.node.httpsMod.Agent | Agents | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAllVersions(value: Boolean): Self = StObject.set(x, "allVersions", value.asInstanceOf[js.Any])
      
      inline def setAllVersionsUndefined: Self = StObject.set(x, "allVersions", js.undefined)
      
      inline def setFullMetadata(value: Boolean): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      inline def setFullMetadataUndefined: Self = StObject.set(x, "fullMetadata", js.undefined)
      
      inline def setRegistryUrl(value: String): Self = StObject.set(x, "registryUrl", value.asInstanceOf[js.Any])
      
      inline def setRegistryUrlUndefined: Self = StObject.set(x, "registryUrl", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PackageNotFoundErrorClass
    extends StObject
       with Error {
    
    @JSName("name")
    val name_PackageNotFoundErrorClass: typings.packageJson.packageJsonStrings.PackageNotFoundError
  }
  object PackageNotFoundErrorClass {
    
    inline def apply(message: String): PackageNotFoundErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "PackageNotFoundError")
      __obj.asInstanceOf[PackageNotFoundErrorClass]
    }
    
    extension [Self <: PackageNotFoundErrorClass](x: Self) {
      
      inline def setName(value: typings.packageJson.packageJsonStrings.PackageNotFoundError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Person extends StObject {
    
    val email: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val url: js.UndefOr[String] = js.undefined
  }
  object Person {
    
    inline def apply(): Person = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Person]
    }
    
    extension [Self <: Person](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait VersionNotFoundErrorClass
    extends StObject
       with Error {
    
    @JSName("name")
    val name_VersionNotFoundErrorClass: typings.packageJson.packageJsonStrings.VersionNotFoundError
  }
  object VersionNotFoundErrorClass {
    
    inline def apply(message: String): VersionNotFoundErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "VersionNotFoundError")
      __obj.asInstanceOf[VersionNotFoundErrorClass]
    }
    
    extension [Self <: VersionNotFoundErrorClass](x: Self) {
      
      inline def setName(value: typings.packageJson.packageJsonStrings.VersionNotFoundError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
