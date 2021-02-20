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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("package-json", JSImport.Namespace)
  @js.native
  def apply(packageName: String): js.Promise[AbbreviatedMetadata] = js.native
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
  @JSImport("package-json", JSImport.Namespace)
  @js.native
  def apply(packageName: String, options: FullMetadataOptions): js.Promise[FullMetadata] = js.native
  @JSImport("package-json", JSImport.Namespace)
  @js.native
  def apply(packageName: String, options: Options): js.Promise[AbbreviatedMetadata] = js.native
  
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
  class PackageNotFoundErrorCls protected () extends PackageNotFoundErrorClass {
    def this(packageName: String) = this()
  }
  
  @scala.inline
  def PackageNotFoundError_=(x: Instantiable1[/* packageName */ String, PackageNotFoundErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackageNotFoundError")(x.asInstanceOf[js.Any])
  
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
  class VersionNotFoundErrorCls protected () extends VersionNotFoundErrorClass {
    def this(packageName: String, version: String) = this()
  }
  
  @scala.inline
  def VersionNotFoundError_=(x: Instantiable2[/* packageName */ String, /* version */ String, VersionNotFoundErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VersionNotFoundError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof packageJson */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
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
    implicit class AbbreviatedMetadataMutableBuilder[Self <: AbbreviatedMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setDist-tags`(value: DistTags): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersions(value: StringDictionary[AbbreviatedVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class AbbreviatedVersionMutableBuilder[Self <: AbbreviatedVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      @scala.inline
      def setBundleDependencies(value: StringDictionary[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value :_*))
      
      @scala.inline
      def setDist(value: Integrity): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngines(value: StringDictionary[String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependencies(value: StringDictionary[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      @scala.inline
      def setPeerDependencies(value: StringDictionary[String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hasShrinkwrap(value: Boolean): Self = StObject.set(x, "_hasShrinkwrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hasShrinkwrapUndefined: Self = StObject.set(x, "_hasShrinkwrap", js.undefined)
    }
  }
  
  @js.native
  trait Agents extends StObject {
    
    var http: js.UndefOr[Agent] = js.native
    
    var https: js.UndefOr[typings.node.httpsMod.Agent] = js.native
  }
  object Agents {
    
    @scala.inline
    def apply(): Agents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Agents]
    }
    
    @scala.inline
    implicit class AgentsMutableBuilder[Self <: Agents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  @js.native
  trait DistTags extends /* tagName */ StringDictionary[String] {
    
    val latest: String = js.native
  }
  object DistTags {
    
    @scala.inline
    def apply(latest: String): DistTags = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistTags]
    }
    
    @scala.inline
    implicit class DistTagsMutableBuilder[Self <: DistTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class FullMetadataMutableBuilder[Self <: FullMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: Dictversion): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: StringDictionary[Boolean]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      @scala.inline
      def setVersions(value: StringDictionary[FullVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FullMetadataOptions extends Options {
    
    /**
    		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
    		@default false
    		*/
    @JSName("fullMetadata")
    val fullMetadata_FullMetadataOptions: `true` = js.native
  }
  object FullMetadataOptions {
    
    @scala.inline
    def apply(fullMetadata: `true`): FullMetadataOptions = {
      val __obj = js.Dynamic.literal(fullMetadata = fullMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullMetadataOptions]
    }
    
    @scala.inline
    implicit class FullMetadataOptionsMutableBuilder[Self <: FullMetadataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullMetadata(value: `true`): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FullVersion
    extends AbbreviatedVersion
       with HoistedData {
    
    val _id: String = js.native
    
    val _nodeVersion: String = js.native
    
    val _npmUser: String = js.native
    
    val _npmVersion: String = js.native
    
    val files: js.UndefOr[js.Array[String]] = js.native
    
    val gitHead: js.UndefOr[String] = js.native
    
    val main: js.UndefOr[String] = js.native
    
    val man: js.UndefOr[js.Array[String]] = js.native
    
    val scripts: js.UndefOr[StringDictionary[String]] = js.native
    
    val types: js.UndefOr[String] = js.native
    
    @JSName("typings")
    val typings_ : js.UndefOr[String] = js.native
  }
  object FullVersion {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FullVersionMutableBuilder[Self <: FullVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setGitHead(value: String): Self = StObject.set(x, "gitHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitHeadUndefined: Self = StObject.set(x, "gitHead", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setMan(value: js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      @scala.inline
      def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      @scala.inline
      def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nodeVersion(value: String): Self = StObject.set(x, "_nodeVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_npmUser(value: String): Self = StObject.set(x, "_npmUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_npmVersion(value: String): Self = StObject.set(x, "_npmVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HoistedData extends StObject {
    
    val author: js.UndefOr[Person] = js.native
    
    val bugs: js.UndefOr[Email | Url] = js.native
    
    val contributors: js.UndefOr[js.Array[Person]] = js.native
    
    val description: js.UndefOr[String] = js.native
    
    val homepage: js.UndefOr[String] = js.native
    
    val keywords: js.UndefOr[js.Array[String]] = js.native
    
    val license: js.UndefOr[String] = js.native
    
    val maintainers: js.UndefOr[js.Array[Person]] = js.native
    
    val readme: js.UndefOr[String] = js.native
    
    val readmeFilename: js.UndefOr[String] = js.native
    
    val repository: js.UndefOr[Type] = js.native
  }
  object HoistedData {
    
    @scala.inline
    def apply(): HoistedData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoistedData]
    }
    
    @scala.inline
    implicit class HoistedDataMutableBuilder[Self <: HoistedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setBugs(value: Email | Url): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      @scala.inline
      def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      @scala.inline
      def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      @scala.inline
      def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeFilename(value: String): Self = StObject.set(x, "readmeFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeFilenameUndefined: Self = StObject.set(x, "readmeFilename", js.undefined)
      
      @scala.inline
      def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      @scala.inline
      def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Overwrite the `agent` option that is passed down to [`got`](https://github.com/sindresorhus/got#agent). This might be useful to add [proxy support](https://github.com/sindresorhus/got#proxies).
    		*/
    val agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | Agents | `false`] = js.native
    
    /**
    		Return the [main entry](https://registry.npmjs.org/ava) containing all versions.
    		@default false
    		*/
    val allVersions: js.UndefOr[Boolean] = js.native
    
    /**
    		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
    		@default false
    		*/
    val fullMetadata: js.UndefOr[Boolean] = js.native
    
    /**
    		The registry URL is by default inferred from the npm defaults and `.npmrc`. This is beneficial as `package-json` and any project using it will work just like npm. This option is*only** intended for internal tools. You should*not** use this option in reusable packages. Prefer just using `.npmrc` whenever possible.
    		*/
    val registryUrl: js.UndefOr[String] = js.native
    
    /**
    		Package version such as `1.0.0` or a [dist tag](https://docs.npmjs.com/cli/dist-tag) such as `latest`.
    		The version can also be in any format supported by the [semver](https://github.com/npm/node-semver) module. For example:
    		- `1` - Get the latest `1.x.x`
    		- `1.2` - Get the latest `1.2.x`
    		- `^1.2.3` - Get the latest `1.x.x` but at least `1.2.3`
    		- `~1.2.3` - Get the latest `1.2.x` but at least `1.2.3`
    		@default 'latest'
    		*/
    val version: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | typings.node.httpsMod.Agent | Agents | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAllVersions(value: Boolean): Self = StObject.set(x, "allVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVersionsUndefined: Self = StObject.set(x, "allVersions", js.undefined)
      
      @scala.inline
      def setFullMetadata(value: Boolean): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullMetadataUndefined: Self = StObject.set(x, "fullMetadata", js.undefined)
      
      @scala.inline
      def setRegistryUrl(value: String): Self = StObject.set(x, "registryUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUrlUndefined: Self = StObject.set(x, "registryUrl", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait PackageNotFoundErrorClass extends Error {
    
    @JSName("name")
    val name_PackageNotFoundErrorClass: typings.packageJson.packageJsonStrings.PackageNotFoundError = js.native
  }
  object PackageNotFoundErrorClass {
    
    @scala.inline
    def apply(message: String, name: typings.packageJson.packageJsonStrings.PackageNotFoundError): PackageNotFoundErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageNotFoundErrorClass]
    }
    
    @scala.inline
    implicit class PackageNotFoundErrorClassMutableBuilder[Self <: PackageNotFoundErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.packageJson.packageJsonStrings.PackageNotFoundError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Person extends StObject {
    
    val email: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val url: js.UndefOr[String] = js.native
  }
  object Person {
    
    @scala.inline
    def apply(): Person = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Person]
    }
    
    @scala.inline
    implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait VersionNotFoundErrorClass extends Error {
    
    @JSName("name")
    val name_VersionNotFoundErrorClass: typings.packageJson.packageJsonStrings.VersionNotFoundError = js.native
  }
  object VersionNotFoundErrorClass {
    
    @scala.inline
    def apply(message: String, name: typings.packageJson.packageJsonStrings.VersionNotFoundError): VersionNotFoundErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionNotFoundErrorClass]
    }
    
    @scala.inline
    implicit class VersionNotFoundErrorClassMutableBuilder[Self <: VersionNotFoundErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.packageJson.packageJsonStrings.VersionNotFoundError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
