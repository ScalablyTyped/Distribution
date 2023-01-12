package typings.prettierPackageJson

import typings.prettierPackageJson.prettierPackageJsonBooleans.`false`
import typings.prettierPackageJson.prettierPackageJsonInts.`-1`
import typings.prettierPackageJson.prettierPackageJsonInts.`0`
import typings.prettierPackageJson.prettierPackageJsonInts.`1`
import typings.prettierPackageJson.prettierPackageJsonStrings.Dot
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkaix
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkarm
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkarm64
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkdarwin
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkfreebsd
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkia32
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarklinux
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkmips
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkmipsel
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkopenbsd
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkppc
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkppc64
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarks390
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarks390x
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarksunos
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkwin32
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkx32
import typings.prettierPackageJson.prettierPackageJsonStrings.Exclamationmarkx64
import typings.prettierPackageJson.prettierPackageJsonStrings.aix
import typings.prettierPackageJson.prettierPackageJsonStrings.arm
import typings.prettierPackageJson.prettierPackageJsonStrings.arm64
import typings.prettierPackageJson.prettierPackageJsonStrings.commonjs
import typings.prettierPackageJson.prettierPackageJsonStrings.darwin
import typings.prettierPackageJson.prettierPackageJsonStrings.freebsd
import typings.prettierPackageJson.prettierPackageJsonStrings.ia32
import typings.prettierPackageJson.prettierPackageJsonStrings.linux
import typings.prettierPackageJson.prettierPackageJsonStrings.mips
import typings.prettierPackageJson.prettierPackageJsonStrings.mipsel
import typings.prettierPackageJson.prettierPackageJsonStrings.module
import typings.prettierPackageJson.prettierPackageJsonStrings.openbsd
import typings.prettierPackageJson.prettierPackageJsonStrings.ppc
import typings.prettierPackageJson.prettierPackageJsonStrings.ppc64
import typings.prettierPackageJson.prettierPackageJsonStrings.s390
import typings.prettierPackageJson.prettierPackageJsonStrings.s390x
import typings.prettierPackageJson.prettierPackageJsonStrings.sunos
import typings.prettierPackageJson.prettierPackageJsonStrings.win32
import typings.prettierPackageJson.prettierPackageJsonStrings.x32
import typings.prettierPackageJson.prettierPackageJsonStrings.x64
import typings.std.Partial
import typings.std.Record
import typings.typeFest.anon.DictmoduleName
import typings.typeFest.anon.Directory
import typings.typeFest.anon.Optional
import typings.typeFest.anon.Type
import typings.typeFest.anon.TypeUrl
import typings.typeFest.sourceBasicMod.JsonObject
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import typings.typeFest.sourcePackageJsonMod.PackageJson.BugsLocation
import typings.typeFest.sourcePackageJsonMod.PackageJson.Dependency
import typings.typeFest.sourcePackageJsonMod.PackageJson.DirectoryLocations
import typings.typeFest.sourcePackageJsonMod.PackageJson.Exports
import typings.typeFest.sourcePackageJsonMod.PackageJson.Imports
import typings.typeFest.sourcePackageJsonMod.PackageJson.Person
import typings.typeFest.sourcePackageJsonMod.PackageJson.PublishConfig
import typings.typeFest.sourcePackageJsonMod.PackageJson.Scripts
import typings.typeFest.sourcePackageJsonMod.PackageJson.WorkspaceConfig
import typings.typeFest.sourcePackageJsonMod.PackageJson.WorkspacePattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  /* Inlined std.Partial<{  useTabs :boolean,   tabWidth :number,   expandUsers :boolean,   enforceMultiple :boolean,   keyOrder :std.Array<prettier-package-json.prettier-package-json/build/types.PackageJsonKey> | (a : prettier-package-json.prettier-package-json/build/types.PackageJsonKey, b : prettier-package-json.prettier-package-json/build/types.PackageJsonKey): -1 | 0 | 1}> */
  trait Options extends StObject {
    
    var enforceMultiple: js.UndefOr[Boolean] = js.undefined
    
    var expandUsers: js.UndefOr[Boolean] = js.undefined
    
    var keyOrder: js.UndefOr[
        js.Array[PackageJsonKey] | (js.Function2[/* a */ PackageJsonKey, /* b */ PackageJsonKey, `-1` | `0` | `1`])
      ] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEnforceMultiple(value: Boolean): Self = StObject.set(x, "enforceMultiple", value.asInstanceOf[js.Any])
      
      inline def setEnforceMultipleUndefined: Self = StObject.set(x, "enforceMultiple", js.undefined)
      
      inline def setExpandUsers(value: Boolean): Self = StObject.set(x, "expandUsers", value.asInstanceOf[js.Any])
      
      inline def setExpandUsersUndefined: Self = StObject.set(x, "expandUsers", js.undefined)
      
      inline def setKeyOrder(
        value: js.Array[PackageJsonKey] | (js.Function2[/* a */ PackageJsonKey, /* b */ PackageJsonKey, `-1` | `0` | `1`])
      ): Self = StObject.set(x, "keyOrder", value.asInstanceOf[js.Any])
      
      inline def setKeyOrderFunction2(value: (/* a */ PackageJsonKey, /* b */ PackageJsonKey) => `-1` | `0` | `1`): Self = StObject.set(x, "keyOrder", js.Any.fromFunction2(value))
      
      inline def setKeyOrderUndefined: Self = StObject.set(x, "keyOrder", js.undefined)
      
      inline def setKeyOrderVarargs(value: PackageJsonKey*): Self = StObject.set(x, "keyOrder", js.Array(value*))
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    }
  }
  
  /* Inlined type-fest.type-fest.PackageJson & {  $schema :string | undefined} */
  @js.native
  trait PackageJson extends StObject {
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    var author: js.UndefOr[Person] = js.native
    
    /**
    		The executable files that should be installed into the `PATH`.
    		*/
    var bin: js.UndefOr[String | (Partial[Record[String, String]])] = js.native
    
    /**
    		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
    		*/
    var browser: js.UndefOr[String | (Partial[Record[String, String | `false`]])] = js.native
    
    /**
    		The URL to the package's issue tracker and/or the email address to which issues should be reported.
    		*/
    var bugs: js.UndefOr[BugsLocation] = js.native
    
    /**
    		Alias of `bundledDependencies`.
    		*/
    var bundleDependencies: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Package names that are bundled when the package is published.
    		*/
    var bundledDependencies: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Is used to set configuration parameters used in package scripts that persist across upgrades.
    		*/
    var config: js.UndefOr[JsonObject] = js.native
    
    /**
    		A list of people who contributed to the package.
    		*/
    var contributors: js.UndefOr[js.Array[Person]] = js.native
    
    /**
    		CPU architectures the module runs on.
    		*/
    var cpu: js.UndefOr[
        js.Array[
          LiteralUnion[
            arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
            String
          ]
        ]
      ] = js.native
    
    /**
    		The dependencies of the package.
    		*/
    var dependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Package description, listed in `npm search`.
    		*/
    var description: js.UndefOr[String] = js.native
    
    /**
    		Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
    		*/
    var devDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Indicates the structure of the package.
    		*/
    var directories: js.UndefOr[DirectoryLocations] = js.native
    
    /**
    		@deprecated
    		*/
    var engineStrict: js.UndefOr[Boolean] = js.native
    
    /**
    		Engines that this package runs on.
    		*/
    var engines: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ EngineName in 'npm' | 'node' | string ]:? string} */ js.Any
      ] = js.native
    
    /**
    		A module ID with untranspiled code that is the primary entry point to the program.
    		*/
    var esnext: js.UndefOr[String | DictmoduleName] = js.native
    
    /**
    		Subpath exports to define entry points of the package.
    		[Read more.](https://nodejs.org/api/packages.html#subpath-exports)
    		*/
    var exports: js.UndefOr[Exports] = js.native
    
    /**
    		The files included in the package.
    		*/
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command-line, set this to `true`.
    		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an app), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
    		*/
    var flat: js.UndefOr[Boolean] = js.native
    
    /**
    		Describes and notifies consumers of a package's monetary support information.
    		[Read more.](https://github.com/npm/rfcs/blob/latest/accepted/0017-add-funding-support.md)
    		*/
    var funding: js.UndefOr[String | TypeUrl] = js.native
    
    /**
    		The URL to the package's homepage.
    		*/
    var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.native
    
    /**
    		Subpath imports to define internal package import maps that only apply to import specifiers from within the package itself.
    		[Read more.](https://nodejs.org/api/packages.html#subpath-imports)
    		*/
    var imports: js.UndefOr[Imports] = js.native
    
    /**
    		JSPM configuration.
    		*/
    var jspm: js.UndefOr[typings.typeFest.sourcePackageJsonMod.PackageJson] = js.native
    
    /**
    		Keywords associated with package, listed in `npm search`.
    		*/
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		The license for the package.
    		*/
    var license: js.UndefOr[String] = js.native
    
    /**
    		The licenses for the package.
    		*/
    var licenses: js.UndefOr[js.Array[Type]] = js.native
    
    /**
    		The module ID that is the primary entry point to the program.
    		*/
    var main: js.UndefOr[String] = js.native
    
    /**
    		A list of people who maintain the package.
    		*/
    var maintainers: js.UndefOr[js.Array[Person]] = js.native
    
    /**
    		Filenames to put in place for the `man` program to find.
    		*/
    var man: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
    		An ECMAScript module ID that is the primary entry point to the program.
    		*/
    var module: js.UndefOr[String] = js.native
    
    /**
    		The name of the package.
    		*/
    var name: js.UndefOr[String] = js.native
    
    /**
    		Dependencies that are skipped if they fail to install.
    		*/
    var optionalDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Operating systems the module runs on.
    		*/
    var os: js.UndefOr[
        js.Array[
          LiteralUnion[
            aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
            String
          ]
        ]
      ] = js.native
    
    /**
    		Defines which package manager is expected to be used when working on the current project. It can set to any of the [supported package managers](https://nodejs.org/api/corepack.html#supported-package-managers), and will ensure that your teams use the exact same package manager versions without having to install anything else than Node.js.
    		__This field is currently experimental and needs to be opted-in; check the [Corepack](https://nodejs.org/api/corepack.html) page for details about the procedure.__
    		@example
    		```json
    		{
    			"packageManager": "<package manager name>@<version>"
    		}
    		```
    		*/
    var packageManager: js.UndefOr[String] = js.native
    
    /**
    		Dependencies that will usually be required by the package user directly or via another dependency.
    		*/
    var peerDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    		Indicate peer dependencies that are optional.
    		*/
    var peerDependenciesMeta: js.UndefOr[Partial[Record[String, Optional]]] = js.native
    
    /**
    		If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
    		@deprecated
    		*/
    var preferGlobal: js.UndefOr[Boolean] = js.native
    
    /**
    		If set to `true`, then npm will refuse to publish it.
    		*/
    var `private`: js.UndefOr[Boolean] = js.native
    
    /**
    		A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
    		*/
    var publishConfig: js.UndefOr[PublishConfig] = js.native
    
    /**
    		Location for the code repository.
    		*/
    var repository: js.UndefOr[String | Directory] = js.native
    
    /**
    		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
    		*/
    var resolutions: js.UndefOr[Dependency] = js.native
    
    /**
    		Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
    		*/
    var scripts: js.UndefOr[Scripts] = js.native
    
    /**
    		Denote which files in your project are "pure" and therefore safe for Webpack to prune if unused.
    		[Read more.](https://webpack.js.org/guides/tree-shaking/)
    		*/
    var sideEffects: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
    		Resolution algorithm for importing ".js" files from the package's scope.
    		[Read more.](https://nodejs.org/api/esm.html#esm_package_json_type_field)
    		*/
    var `type`: js.UndefOr[module | commonjs] = js.native
    
    /**
    		Location of the bundled TypeScript declaration file.
    		*/
    var types: js.UndefOr[String] = js.native
    
    /**
    		Version selection map of TypeScript.
    		*/
    var typesVersions: js.UndefOr[Partial[Record[String, Partial[Record[String, js.Array[String]]]]]] = js.native
    
    /**
    		Location of the bundled TypeScript declaration file. Alias of `types`.
    		*/
    @JSName("typings")
    var typings_ : js.UndefOr[String] = js.native
    
    /**
    		Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
    		*/
    var version: js.UndefOr[String] = js.native
    
    /**
    		Used to configure [Yarn workspaces](https://classic.yarnpkg.com/docs/workspaces/).
    		Workspaces allow you to manage multiple packages within the same repository in such a way that you only need to run `yarn install` once to install all of them in a single pass.
    		Please note that the top-level `private` property of `package.json` **must** be set to `true` in order to use workspaces.
    		*/
    var workspaces: js.UndefOr[js.Array[WorkspacePattern] | WorkspaceConfig] = js.native
  }
  
  /* Inlined keyof prettier-package-json.prettier-package-json/build/types.PackageJson */
  /* Rewritten from type alias, can be one of: 
    - typings.prettierPackageJson.prettierPackageJsonStrings.main
    - typings.prettierPackageJson.prettierPackageJsonStrings.description
    - typings.prettierPackageJson.prettierPackageJsonStrings.version
    - typings.prettierPackageJson.prettierPackageJsonStrings.funding
    - typings.prettierPackageJson.prettierPackageJsonStrings.typesVersions
    - typings.prettierPackageJson.prettierPackageJsonStrings.directories
    - typings.prettierPackageJson.prettierPackageJsonStrings.workspaces
    - typings.prettierPackageJson.prettierPackageJsonStrings.exports
    - typings.prettierPackageJson.prettierPackageJsonStrings.module
    - typings.prettierPackageJson.prettierPackageJsonStrings.browser
    - typings.prettierPackageJson.prettierPackageJsonStrings.engines
    - typings.prettierPackageJson.prettierPackageJsonStrings.typings_
    - typings.prettierPackageJson.prettierPackageJsonStrings.cpu
    - typings.prettierPackageJson.prettierPackageJsonStrings.bugs
    - typings.prettierPackageJson.prettierPackageJsonStrings.contributors
    - typings.prettierPackageJson.prettierPackageJsonStrings.`private`
    - typings.prettierPackageJson.prettierPackageJsonStrings.author
    - typings.prettierPackageJson.prettierPackageJsonStrings.config
    - typings.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies
    - typings.prettierPackageJson.prettierPackageJsonStrings.devDependencies
    - typings.prettierPackageJson.prettierPackageJsonStrings.flat
    - typings.prettierPackageJson.prettierPackageJsonStrings.bin
    - typings.prettierPackageJson.prettierPackageJsonStrings.maintainers
    - typings.prettierPackageJson.prettierPackageJsonStrings.publishConfig
    - typings.prettierPackageJson.prettierPackageJsonStrings.files
    - typings.prettierPackageJson.prettierPackageJsonStrings.jspm
    - typings.prettierPackageJson.prettierPackageJsonStrings.$schema
    - typings.prettierPackageJson.prettierPackageJsonStrings.peerDependencies
    - typings.prettierPackageJson.prettierPackageJsonStrings.license
    - typings.prettierPackageJson.prettierPackageJsonStrings.sideEffects
    - typings.prettierPackageJson.prettierPackageJsonStrings.types
    - typings.prettierPackageJson.prettierPackageJsonStrings.homepage
    - typings.prettierPackageJson.prettierPackageJsonStrings.packageManager
    - typings.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies
    - typings.prettierPackageJson.prettierPackageJsonStrings.`type`
    - typings.prettierPackageJson.prettierPackageJsonStrings.dependencies
    - typings.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies
    - typings.prettierPackageJson.prettierPackageJsonStrings.scripts
    - typings.prettierPackageJson.prettierPackageJsonStrings.name
    - typings.prettierPackageJson.prettierPackageJsonStrings.esnext
    - typings.prettierPackageJson.prettierPackageJsonStrings.peerDependenciesMeta
    - typings.prettierPackageJson.prettierPackageJsonStrings.preferGlobal
    - typings.prettierPackageJson.prettierPackageJsonStrings.resolutions
    - typings.prettierPackageJson.prettierPackageJsonStrings.man
    - typings.prettierPackageJson.prettierPackageJsonStrings.os
    - typings.prettierPackageJson.prettierPackageJsonStrings.imports
    - typings.prettierPackageJson.prettierPackageJsonStrings.keywords
    - typings.prettierPackageJson.prettierPackageJsonStrings.repository
    - typings.prettierPackageJson.prettierPackageJsonStrings.engineStrict
    - typings.prettierPackageJson.prettierPackageJsonStrings.licenses
  */
  trait PackageJsonKey extends StObject
  object PackageJsonKey {
    
    inline def $schema: typings.prettierPackageJson.prettierPackageJsonStrings.$schema = "$schema".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.$schema]
    
    inline def author: typings.prettierPackageJson.prettierPackageJsonStrings.author = "author".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.author]
    
    inline def bin: typings.prettierPackageJson.prettierPackageJsonStrings.bin = "bin".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.bin]
    
    inline def browser: typings.prettierPackageJson.prettierPackageJsonStrings.browser = "browser".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.browser]
    
    inline def bugs: typings.prettierPackageJson.prettierPackageJsonStrings.bugs = "bugs".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.bugs]
    
    inline def bundleDependencies: typings.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies = "bundleDependencies".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies]
    
    inline def bundledDependencies: typings.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies = "bundledDependencies".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies]
    
    inline def config: typings.prettierPackageJson.prettierPackageJsonStrings.config = "config".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.config]
    
    inline def contributors: typings.prettierPackageJson.prettierPackageJsonStrings.contributors = "contributors".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.contributors]
    
    inline def cpu: typings.prettierPackageJson.prettierPackageJsonStrings.cpu = "cpu".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.cpu]
    
    inline def dependencies: typings.prettierPackageJson.prettierPackageJsonStrings.dependencies = "dependencies".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.dependencies]
    
    inline def description: typings.prettierPackageJson.prettierPackageJsonStrings.description = "description".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.description]
    
    inline def devDependencies: typings.prettierPackageJson.prettierPackageJsonStrings.devDependencies = "devDependencies".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.devDependencies]
    
    inline def directories: typings.prettierPackageJson.prettierPackageJsonStrings.directories = "directories".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.directories]
    
    inline def engineStrict: typings.prettierPackageJson.prettierPackageJsonStrings.engineStrict = "engineStrict".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.engineStrict]
    
    inline def engines: typings.prettierPackageJson.prettierPackageJsonStrings.engines = "engines".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.engines]
    
    inline def esnext: typings.prettierPackageJson.prettierPackageJsonStrings.esnext = "esnext".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.esnext]
    
    inline def exports: typings.prettierPackageJson.prettierPackageJsonStrings.exports = "exports".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.exports]
    
    inline def files: typings.prettierPackageJson.prettierPackageJsonStrings.files = "files".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.files]
    
    inline def flat: typings.prettierPackageJson.prettierPackageJsonStrings.flat = "flat".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.flat]
    
    inline def funding: typings.prettierPackageJson.prettierPackageJsonStrings.funding = "funding".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.funding]
    
    inline def homepage: typings.prettierPackageJson.prettierPackageJsonStrings.homepage = "homepage".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.homepage]
    
    inline def imports: typings.prettierPackageJson.prettierPackageJsonStrings.imports = "imports".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.imports]
    
    inline def jspm: typings.prettierPackageJson.prettierPackageJsonStrings.jspm = "jspm".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.jspm]
    
    inline def keywords: typings.prettierPackageJson.prettierPackageJsonStrings.keywords = "keywords".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.keywords]
    
    inline def license: typings.prettierPackageJson.prettierPackageJsonStrings.license = "license".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.license]
    
    inline def licenses: typings.prettierPackageJson.prettierPackageJsonStrings.licenses = "licenses".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.licenses]
    
    inline def main: typings.prettierPackageJson.prettierPackageJsonStrings.main = "main".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.main]
    
    inline def maintainers: typings.prettierPackageJson.prettierPackageJsonStrings.maintainers = "maintainers".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.maintainers]
    
    inline def man: typings.prettierPackageJson.prettierPackageJsonStrings.man = "man".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.man]
    
    inline def module: typings.prettierPackageJson.prettierPackageJsonStrings.module = "module".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.module]
    
    inline def name: typings.prettierPackageJson.prettierPackageJsonStrings.name = "name".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.name]
    
    inline def optionalDependencies: typings.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies = "optionalDependencies".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies]
    
    inline def os: typings.prettierPackageJson.prettierPackageJsonStrings.os = "os".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.os]
    
    inline def packageManager: typings.prettierPackageJson.prettierPackageJsonStrings.packageManager = "packageManager".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.packageManager]
    
    inline def peerDependencies: typings.prettierPackageJson.prettierPackageJsonStrings.peerDependencies = "peerDependencies".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.peerDependencies]
    
    inline def peerDependenciesMeta: typings.prettierPackageJson.prettierPackageJsonStrings.peerDependenciesMeta = "peerDependenciesMeta".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.peerDependenciesMeta]
    
    inline def preferGlobal: typings.prettierPackageJson.prettierPackageJsonStrings.preferGlobal = "preferGlobal".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.preferGlobal]
    
    inline def `private`: typings.prettierPackageJson.prettierPackageJsonStrings.`private` = "private".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.`private`]
    
    inline def publishConfig: typings.prettierPackageJson.prettierPackageJsonStrings.publishConfig = "publishConfig".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.publishConfig]
    
    inline def repository: typings.prettierPackageJson.prettierPackageJsonStrings.repository = "repository".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.repository]
    
    inline def resolutions: typings.prettierPackageJson.prettierPackageJsonStrings.resolutions = "resolutions".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.resolutions]
    
    inline def scripts: typings.prettierPackageJson.prettierPackageJsonStrings.scripts = "scripts".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.scripts]
    
    inline def sideEffects: typings.prettierPackageJson.prettierPackageJsonStrings.sideEffects = "sideEffects".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.sideEffects]
    
    inline def `type`: typings.prettierPackageJson.prettierPackageJsonStrings.`type` = "type".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.`type`]
    
    inline def types: typings.prettierPackageJson.prettierPackageJsonStrings.types = "types".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.types]
    
    inline def typesVersions: typings.prettierPackageJson.prettierPackageJsonStrings.typesVersions = "typesVersions".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.typesVersions]
    
    inline def typings_ : typings.prettierPackageJson.prettierPackageJsonStrings.typings_ = "typings".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.typings_]
    
    inline def version: typings.prettierPackageJson.prettierPackageJsonStrings.version = "version".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.version]
    
    inline def workspaces: typings.prettierPackageJson.prettierPackageJsonStrings.workspaces = "workspaces".asInstanceOf[typings.prettierPackageJson.prettierPackageJsonStrings.workspaces]
  }
}
