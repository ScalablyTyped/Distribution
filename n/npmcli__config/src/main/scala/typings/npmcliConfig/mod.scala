package typings.npmcliConfig

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.node.pathMod.PlatformPath
import typings.node.processMod.global.NodeJS.Platform
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Stream
import typings.npmcliConfig.anon.TypeofimportedSemver
import typings.npmcliConfig.anon.TypeofimportedUrl
import typings.npmcliConfig.npmcliConfigBooleans.`true`
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.Map
import typings.std.NumberConstructor
import typings.std.Record
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@npmcli/config", JSImport.Namespace)
  @js.native
  open class ^[Definitions /* <: DefinitionsObject */] protected ()
    extends StObject
       with Config[Definitions] {
    /**
      * Returns a `config` object, which is not yet loaded.
      */
    def this(options: Options[Definitions]) = this()
  }
  
  /**
    * The type definitions passed to `nopt` for CLI option parsing and known
    * configuration validation.
    */
  /* static member */
  @JSImport("@npmcli/config", "typeDefs")
  @js.native
  val typeDefs: TypeDefs_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.npmcliConfig.npmcliConfigStrings.project
    - typings.npmcliConfig.npmcliConfigStrings.user
    - typings.npmcliConfig.npmcliConfigStrings.global
  */
  trait ConfFileType extends StObject
  object ConfFileType {
    
    inline def global: typings.npmcliConfig.npmcliConfigStrings.global = "global".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.global]
    
    inline def project: typings.npmcliConfig.npmcliConfigStrings.project = "project".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.project]
    
    inline def user: typings.npmcliConfig.npmcliConfigStrings.user = "user".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.user]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.npmcliConfig.npmcliConfigStrings.default
    - typings.npmcliConfig.npmcliConfigStrings.env
    - typings.npmcliConfig.npmcliConfigStrings.cli
    - typings.npmcliConfig.npmcliConfigStrings.builtin
    - typings.npmcliConfig.npmcliConfigStrings.project
    - typings.npmcliConfig.npmcliConfigStrings.user
    - typings.npmcliConfig.npmcliConfigStrings.global
  */
  trait ConfType extends StObject
  object ConfType {
    
    inline def default: typings.npmcliConfig.npmcliConfigStrings.default = "default".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.default]
    
    inline def builtin: typings.npmcliConfig.npmcliConfigStrings.builtin = "builtin".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.builtin]
    
    inline def cli: typings.npmcliConfig.npmcliConfigStrings.cli = "cli".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.cli]
    
    inline def env: typings.npmcliConfig.npmcliConfigStrings.env = "env".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.env]
    
    inline def global: typings.npmcliConfig.npmcliConfigStrings.global = "global".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.global]
    
    inline def project: typings.npmcliConfig.npmcliConfigStrings.project = "project".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.project]
    
    inline def user: typings.npmcliConfig.npmcliConfigStrings.user = "user".asInstanceOf[typings.npmcliConfig.npmcliConfigStrings.user]
  }
  
  @js.native
  trait Config[Definitions /* <: DefinitionsObject */] extends StObject {
    
    /** The `argv` param */
    var argv: js.Array[String] = js.native
    
    /** The `cwd` param */
    var cwd: String = js.native
    
    /**
      * A `Map` of config level to `ConfigData` objects.  These objects should
      * not be modified directly under any circumstances.
      */
    var data: Map[ConfType, ConfigData] = js.native
    
    /** The `defaults` param */
    var defaults: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Definitions ]: Definitions[K]['type']} */ js.Any = js.native
    
    /** The `definitions` param */
    var definitions: Definitions = js.native
    
    /**
      * Delete the configuration key from the specified level in the config stack.
      * @param [where='cli']
      */
    def delete(key: /* keyof Definitions */ String): Unit = js.native
    def delete(key: /* keyof Definitions */ String, where: ConfType): Unit = js.native
    
    var deprecated: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Definitions ]:? boolean} */ js.Any = js.native
    
    /** The `env` param */
    var env: ProcessEnv = js.native
    
    /** The `execPath` param */
    var execPath: String = js.native
    
    /**
      * Find the effective place in the configuration levels a given key is set.
      * Returns one of: `cli`, `env`, `project`, `user`, `global`, `builtin`, or
      * `default`.
      *
      * Returns `null` if the key is not set.
      */
    def find(key: /* keyof Definitions */ String): ConfType = js.native
    
    /**
      * `flat` A getter that returns a flattened object of the entire loaded config,
      * using the provided `flatten` option
      */
    val flat: Record[String, Any] = js.native
    
    /**
      * Load the given key from the config stack.
      * @param [where='cli']
      */
    def get[K /* <: /* keyof Definitions */ String */](key: K): ConfigValueType[
        /* import warning: importer.ImportType#apply Failed type conversion: Definitions[K]['type'] */ js.Any
      ] = js.native
    def get[K /* <: /* keyof Definitions */ String */](key: K, where: ConfType): ConfigValueType[
        /* import warning: importer.ImportType#apply Failed type conversion: Definitions[K]['type'] */ js.Any
      ] = js.native
    
    /**
      * The prefix for `global` operations.  Set by the `prefix` config value,
      * or defaults based on the location of the `execPath` option.
      */
    var globalPrefix: String = js.native
    
    /** The user's home directory, found by looking at `env.HOME` or calling `os.homedir()`. */
    var home: String | Null = js.native
    
    /**
      * Returns `true` if the value is coming directly from the
      * default definitions, if the current value for the key config is
      * coming from any other source, returns `false`.
      *
      * This method can be used for avoiding or tweaking default values, e.g:
      *
      * >  Given a global default definition of foo='foo' it's possible to read that
      * >  value such as:
      * >
      * >  ```js
      * >     const save = config.get('foo')
      * >  ```
      * >
      * >  Now in a different place of your app it's possible to avoid using the `foo`
      * >  default value, by checking to see if the current config value is currently
      * >  one that was defined by the default definitions:
      * >
      * >  ```js
      * >     const save = config.isDefault('foo') ? 'bar' : config.get('foo')
      * >  ```
      */
    def isDefault(key: /* keyof Definitions */ String): Boolean = js.native
    
    /**
      * A list sorted in priority of all the config data objects in the
      * prototype chain.  `config.list[0]` is the `cli` level, `config.list[1]`
      * is the `env` level, and so on.
      */
    var list: js.Array[ConfigData] = js.native
    
    /**
      * Load configuration from the various sources of information.
      *
      * Returns a `Promise` that resolves when configuration is loaded, and fails
      * if a fatal error is encountered.
      */
    def load(): js.Promise[Unit] = js.native
    
    /** A boolean indicating whether or not configs are loaded */
    val loaded: Boolean = js.native
    
    /**
      * The prefix for `local` operations.  Set by the `prefix` config value on
      * the CLI only, or defaults to either the `cwd` or its nearest ancestor
      * containing a `node_modules` folder or `package.json` file.
      */
    var localPrefix: String = js.native
    
    /** The `npmPath` param */
    var npmPath: String = js.native
    
    /** The `platform` param */
    var platform: Platform = js.native
    
    /** If `config.get('global')` is true, then `globalPrefix`, otherwise `localPrefix` */
    val prefix: String = js.native
    
    /**
      * Accept an optional array of problems (as thrown by `config.validate()`) and
      * perform the necessary steps to resolve them. If no problems are provided,
      * this method will call `config.validate()` internally to retrieve them.
      *
      * Note that you must `await config.save('user')` in order to persist the changes.
      */
    def repair(): Unit = js.native
    def repair(problems: js.Array[Problem]): Unit = js.native
    
    /**
      * Save the config file specified by the `where` param.  Must be one of
      * `project`, `user`, `global`, `builtin`.
      */
    def save(where: ConfFileType): js.Promise[Unit] = js.native
    
    /**
      * Set the key to the specified value, at the specified level in the config stack.
      * @param [where='cli']
      */
    @JSName("set")
    def set_type[K /* <: /* keyof Definitions */ String */](
      key: K,
      value: ConfigValueType[
          /* import warning: importer.ImportType#apply Failed type conversion: Definitions[K]['type'] */ js.Any
        ]
    ): Unit = js.native
    @JSName("set")
    def set_type[K /* <: /* keyof Definitions */ String */](
      key: K,
      value: ConfigValueType[
          /* import warning: importer.ImportType#apply Failed type conversion: Definitions[K]['type'] */ js.Any
        ],
      where: ConfType
    ): Unit = js.native
    
    /** The `shorthands` param */
    var shorthands: ShortFlags = js.native
    
    /**
      * A read-only `Map` of the file (or a comment, if no file found, or
      * relevant) to the config level loaded from that source.
      */
    var sources: Map[String, ConfType] = js.native
    
    /** The `types` param */
    var types: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Definitions ]: Definitions[K]['type']} */ js.Any = js.native
    
    /**
      * A getter that returns `true` if all the config objects are valid. Any
      * data objects that have been modified with `config.set(...)` will be
      * re-evaluated when `config.valid` is read.
      */
    val valid: Boolean = js.native
    
    /**
      * Verify that all known configuration options are set to valid values, and
      * log a warning if they are invalid.
      *
      * Invalid auth options will cause this method to throw an error with a `code`
      * property of `ERR_INVALID_AUTH`, and a `problems` property listing the specific
      * concerns with the current configuration.
      *
      * If `where` is not set, then all config objects are validated.
      *
      * Returns `true` if all configs are valid.
      *
      * Note that it's usually enough (and more efficient) to just check
      * `config.valid`, since each data object is marked for re-evaluation on every
      * `config.set()` operation.
      */
    def validate(): Boolean = js.native
    def validate(where: ConfType): Boolean = js.native
  }
  
  trait ConfigData extends StObject {
    
    /** The data object reflecting the inheritance of configs up to this point in the chain. */
    val data: Record[String, Any]
    
    /** Any errors encountered that prevented the loading of this config data. */
    var loadError: js.Error | Null
    
    /** The raw data used to generate this config data, as it was parsed initially from the environment, config file, or CLI options. */
    var raw: Record[String, Any]
    
    /** The source where this data was loaded from. */
    var source: String
    
    val valid: Boolean
  }
  object ConfigData {
    
    inline def apply(data: Record[String, Any], raw: Record[String, Any], source: String, valid: Boolean): ConfigData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], loadError = null)
      __obj.asInstanceOf[ConfigData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigData] (val x: Self) extends AnyVal {
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLoadError(value: js.Error): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
      
      inline def setLoadErrorNull: Self = StObject.set(x, "loadError", null)
      
      inline def setRaw(value: Record[String, Any]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Def extends string ? Def : Def extends std.ReadonlyArray<infer T> ? std.ArrayConstructor extends T ? @npmcli/config.@npmcli/config._ConfigValueType<std.Exclude<T, std.ArrayConstructor>> : @npmcli/config.@npmcli/config._ConfigValueType<T> : @npmcli/config.@npmcli/config._ConfigValueType<Def>
    }}}
    */
  type ConfigValueType[Def /* <: js.Object | (js.Array[js.Object | String | Null]) */] = Def
  
  trait Definition extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.Object | (js.Array[js.Object | String | Null])
  }
  object Definition {
    
    inline def apply(`type`: js.Object | (js.Array[js.Object | String | Null])): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setType(value: js.Object | (js.Array[js.Object | String | Null])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: (js.Object | String | Null)*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  type DefinitionsObject = StringDictionary[Definition]
  
  trait Options[Definitions /* <: DefinitionsObject */] extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var definitions: Definitions & DefinitionsObject
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    var execPath: js.UndefOr[String] = js.undefined
    
    /** Must be provided for `.flat` to work */
    var flatten: js.UndefOr[
        js.Function2[/* data */ Record[String, Any], /* flattened */ Record[String, Any], Unit]
      ] = js.undefined
    
    var npmPath: String
    
    var platform: js.UndefOr[Platform] = js.undefined
    
    var shorthands: ShortFlags
  }
  object Options {
    
    inline def apply[Definitions /* <: DefinitionsObject */](definitions: Definitions & DefinitionsObject, npmPath: String, shorthands: ShortFlags): Options[Definitions] = {
      val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], npmPath = npmPath.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[Definitions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Definitions /* <: DefinitionsObject */] (val x: Self & Options[Definitions]) extends AnyVal {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDefinitions(value: Definitions & DefinitionsObject): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      inline def setFlatten(value: (/* data */ Record[String, Any], /* flattened */ Record[String, Any]) => Unit): Self = StObject.set(x, "flatten", js.Any.fromFunction2(value))
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setNpmPath(value: String): Self = StObject.set(x, "npmPath", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setShorthands(value: ShortFlags): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.npmcliConfig.anon.Action
    - typings.npmcliConfig.anon.From
  */
  trait Problem extends StObject
  object Problem {
    
    inline def Action(key: String, where: ConfType): typings.npmcliConfig.anon.Action = {
      val __obj = js.Dynamic.literal(action = "delete", key = key.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.npmcliConfig.anon.Action]
    }
    
    inline def From(from: String, to: String, where: ConfType): typings.npmcliConfig.anon.From = {
      val __obj = js.Dynamic.literal(action = "rename", from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.npmcliConfig.anon.From]
    }
  }
  
  type ShortFlags = StringDictionary[js.Array[String] | String]
  
  trait TypeDefs_ extends StObject {
    
    var Boolean: TypeInfo[BooleanConstructor]
    
    var Date: TypeInfo[DateConstructor]
    
    var Number: TypeInfo[NumberConstructor]
    
    var Stream: TypeInfo[Instantiable0[typings.node.streamMod.Stream]]
    
    var String: TypeInfo[StringConstructor]
    
    var Umask: TypeInfo[Instantiable0[typings.npmcliConfig.mod.Umask]]
    
    var path: TypeInfo[PlatformPath]
    
    var semver: TypeInfo[TypeofimportedSemver]
    
    var url: TypeInfo[TypeofimportedUrl]
  }
  object TypeDefs_ {
    
    inline def apply(
      Boolean: TypeInfo[BooleanConstructor],
      Date: TypeInfo[DateConstructor],
      Number: TypeInfo[NumberConstructor],
      Stream: TypeInfo[Instantiable0[Stream]],
      String: TypeInfo[StringConstructor],
      Umask: TypeInfo[Instantiable0[Umask]],
      path: TypeInfo[PlatformPath],
      semver: TypeInfo[TypeofimportedSemver],
      url: TypeInfo[TypeofimportedUrl]
    ): TypeDefs_ = {
      val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Stream = Stream.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Umask = Umask.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], semver = semver.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeDefs_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeDefs_] (val x: Self) extends AnyVal {
      
      inline def setBoolean(value: TypeInfo[BooleanConstructor]): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      inline def setDate(value: TypeInfo[DateConstructor]): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: TypeInfo[NumberConstructor]): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setPath(value: TypeInfo[PlatformPath]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSemver(value: TypeInfo[TypeofimportedSemver]): Self = StObject.set(x, "semver", value.asInstanceOf[js.Any])
      
      inline def setStream(value: TypeInfo[Instantiable0[Stream]]): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
      
      inline def setString(value: TypeInfo[StringConstructor]): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
      
      inline def setUmask(value: TypeInfo[Instantiable0[Umask]]): Self = StObject.set(x, "Umask", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: TypeInfo[TypeofimportedUrl]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeInfo[Type] extends StObject {
    
    var description: String
    
    var `type`: Type
    
    def validate(data: Record[String, Any], k: String, `val`: String): Boolean
  }
  object TypeInfo {
    
    inline def apply[Type](description: String, `type`: Type, validate: (Record[String, Any], String, String) => Boolean): TypeInfo[Type] = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], validate = js.Any.fromFunction3(validate))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfo[Type]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeInfo[?], Type] (val x: Self & TypeInfo[Type]) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: (Record[String, Any], String, String) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
  
  trait Umask extends StObject {
    
    var __isUmask__ : `true`
  }
  object Umask {
    
    inline def apply(): Umask = {
      val __obj = js.Dynamic.literal(__isUmask__ = true)
      __obj.asInstanceOf[Umask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Umask] (val x: Self) extends AnyVal {
      
      inline def set__isUmask__(value: `true`): Self = StObject.set(x, "__isUmask__", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Def extends string | number | null ? Def : Def extends std.StringConstructor | {readonly resolve (from : string, to : string): string, readonly fileURLToPath (url : string): string, readonly fileURLToPath (url : node.url.URL): string, readonly format (urlObject : node.url.URL): string, readonly format (urlObject : node.url.URL, options : node.url.URLFormatOptions): string, readonly format (urlObject : node.url.UrlObject): string, readonly format (urlObject : string): string, readonly pathToFileURL (path : string): node.url.URL, readonly domainToASCII (domain : string): string,   URLSearchParams :new (): node.url.URLSearchParams,   URL :new (input : string): node.url.URL,  readonly URL :{readonly revokeObjectURL (objectUrl : string): void, readonly createObjectURL (blob : node.node:buffer.Blob): string}, readonly parse (urlString : string): node.url.UrlWithStringQuery, readonly parse (urlString : string): node.url.UrlWithStringQuery, readonly parse (urlString : string, parseQueryString : false): node.url.UrlWithStringQuery, readonly parse (urlString : string, parseQueryString : undefined, slashesDenoteHost : boolean): node.url.UrlWithStringQuery, readonly parse (urlString : string, parseQueryString : false, slashesDenoteHost : boolean): node.url.UrlWithStringQuery, readonly parse (urlString : string, parseQueryString : true): node.url.UrlWithParsedQuery, readonly parse (urlString : string, parseQueryString : true, slashesDenoteHost : boolean): node.url.UrlWithParsedQuery, readonly parse (urlString : string, parseQueryString : boolean): node.url.Url, readonly parse (urlString : string, parseQueryString : boolean, slashesDenoteHost : boolean): node.url.Url, readonly domainToUnicode (domain : string): string, readonly urlToHttpOptions (url : node.url.URL): node.http.ClientRequestArgs} | node.path.PlatformPath | { readonly eq :{readonly ^ (v1 : string, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean},  readonly Comparator,   Comparator :new (comp : string): semver.semver.Comparator,  readonly sort :{readonly ^ <T extends string | semver.semver/classes/semver.^>(list : std.Array<T>): std.Array<T>, readonly ^ <T extends string | semver.semver/classes/semver.^>(list : std.Array<T>, optionsOrLoose : boolean): std.Array<T>, readonly ^ <T extends string | semver.semver/classes/semver.^>(list : std.Array<T>, optionsOrLoose : semver.semver.Options): std.Array<T>},  readonly SemVer,   SemVer :new (version : string): semver.semver.SemVer,  readonly gte :{readonly ^ (v1 : string, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean},  readonly coerce :{readonly ^ (): semver.semver/classes/semver.^ | null, readonly ^ (): semver.semver/classes/semver.^ | null, readonly ^ (version : string): semver.semver/classes/semver.^ | null, readonly ^ (version : number): semver.semver/classes/semver.^ | null, readonly ^ (version : semver.semver/classes/semver.^): semver.semver/classes/semver.^ | null, readonly ^ (version : string, options : semver.semver.CoerceOptions): semver.semver/classes/semver.^ | null, readonly ^ (version : number, options : semver.semver.CoerceOptions): semver.semver/classes/semver.^ | null, readonly ^ (version : semver.semver/classes/semver.^, options : semver.semver.CoerceOptions): semver.semver/classes/semver.^ | null, readonly ^ (version : null, options : semver.semver.CoerceOptions): semver.semver/classes/semver.^ | null, readonly ^ (version : undefined, options : semver.semver.CoerceOptions): semver.semver/classes/semver.^ | null},  readonly toComparators :{readonly ^ (range : string): std.Array<std.Array<string>>, readonly ^ (range : semver.semver/classes/range.^): std.Array<std.Array<string>>, readonly ^ (range : string, optionsOrLoose : boolean): std.Array<std.Array<string>>, readonly ^ (range : semver.semver/classes/range.^, optionsOrLoose : boolean): std.Array<std.Array<string>>, readonly ^ (range : string, optionsOrLoose : semver.semver.Options): std.Array<std.Array<string>>, readonly ^ (range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.Options): std.Array<std.Array<string>>},  readonly compare :{readonly ^ (v1 : string, v2 : string): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): 1 | 0 | -1},  readonly gtr :{readonly ^ (version : string, range : string): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^): boolean, readonly ^ (version : string, range : string, optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean},  readonly cmp :{readonly ^ (v1 : string, operator : semver.semver.Operator, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, operator : semver.semver.Operator, v2 : string): boolean, readonly ^ (v1 : string, operator : semver.semver.Operator, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, operator : semver.semver.Operator, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, operator : semver.semver.Operator, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, operator : semver.semver.Operator, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, operator : semver.semver.Operator, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, operator : semver.semver.Operator, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, operator : semver.semver.Operator, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, operator : semver.semver.Operator, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, operator : semver.semver.Operator, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, operator : semver.semver.Operator, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean},  readonly rsort :{readonly ^ <T extends string | semver.semver/classes/semver.^>(list : std.Array<T>): std.Array<T>, readonly ^ <T extends string | semver.semver/classes/semver.^>(list : std.Array<T>, optionsOrLoose : boolean): std.Array<T>, readonly ^ <T extends string | semver.semver/classes/semver.^>(list : std.Array<T>, optionsOrLoose : semver.semver.Options): std.Array<T>},  readonly patch :{readonly ^ (version : string): number, readonly ^ (version : semver.semver/classes/semver.^): number, readonly ^ (version : string, optionsOrLoose : boolean): number, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : boolean): number, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): number, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): number},  readonly rcompare :{readonly ^ (v1 : string, v2 : string): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): 1 | 0 | -1},  readonly SEMVER_SPEC_VERSION :'2.0.0',  readonly neq :{readonly ^ (v1 : string, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean},  readonly clean :{readonly ^ (version : string): string | null, readonly ^ (version : string, optionsOrLoose : boolean): string | null, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): string | null},  readonly inc :{readonly ^ (version : string, release : semver.semver.ReleaseType): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, identifier : string): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, identifier : string): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, identifier : string, identifierBase : semver.semver/functions/inc.IdentifierBase): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, identifier : string, identifierBase : semver.semver/functions/inc.IdentifierBase): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, identifier : undefined, identifierBase : semver.semver/functions/inc.IdentifierBase): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, identifier : undefined, identifierBase : semver.semver/functions/inc.IdentifierBase): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, identifier : string, identifierBase : false): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, identifier : string, identifierBase : false): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, identifier : undefined, identifierBase : false): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, identifier : undefined, identifierBase : false): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, optionsOrLoose : boolean): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, optionsOrLoose : boolean): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, optionsOrLoose : semver.semver.Options): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, optionsOrLoose : semver.semver.Options): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, optionsOrLoose : boolean, identifier : string): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, optionsOrLoose : boolean, identifier : string): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, optionsOrLoose : semver.semver.Options, identifier : string): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, optionsOrLoose : semver.semver.Options, identifier : string): string | null, readonly ^ (version : string, release : semver.semver.ReleaseType, optionsOrLoose : undefined, identifier : string): string | null, readonly ^ (version : semver.semver/classes/semver.^, release : semver.semver.ReleaseType, optionsOrLoose : undefined, identifier : string): string | null}, readonly compareIdentifiers (): 1 | 0 | -1, readonly compareIdentifiers (): 1 | 0 | -1, readonly compareIdentifiers (): 1 | 0 | -1, readonly compareIdentifiers (): 1 | 0 | -1, readonly compareIdentifiers (a : string): 1 | 0 | -1, readonly compareIdentifiers (a : string): 1 | 0 | -1, readonly compareIdentifiers (a : string, b : string): 1 | 0 | -1, readonly compareIdentifiers (a : null, b : string): 1 | 0 | -1, readonly compareIdentifiers (a : undefined, b : string): 1 | 0 | -1,  readonly valid :{readonly ^ (): string | null, readonly ^ (): string | null, readonly ^ (version : string): string | null, readonly ^ (version : semver.semver/classes/semver.^): string | null, readonly ^ (version : string, optionsOrLoose : boolean): string | null, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : boolean): string | null, readonly ^ (version : null, optionsOrLoose : boolean): string | null, readonly ^ (version : undefined, optionsOrLoose : boolean): string | null, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): string | null, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): string | null, readonly ^ (version : null, optionsOrLoose : semver.semver.Options): string | null, readonly ^ (version : undefined, optionsOrLoose : semver.semver.Options): string | null},  readonly compareBuild :{readonly ^ (a : string, b : string): 1 | 0 | -1, readonly ^ (a : semver.semver/classes/semver.^, b : string): 1 | 0 | -1, readonly ^ (a : string, b : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (a : semver.semver/classes/semver.^, b : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (a : string, b : string, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (a : semver.semver/classes/semver.^, b : string, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (a : string, b : semver.semver/classes/semver.^, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (a : semver.semver/classes/semver.^, b : semver.semver/classes/semver.^, optionsOrLoose : boolean): 1 | 0 | -1, readonly ^ (a : string, b : string, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (a : semver.semver/classes/semver.^, b : string, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (a : string, b : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): 1 | 0 | -1, readonly ^ (a : semver.semver/classes/semver.^, b : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): 1 | 0 | -1},  readonly lt :{readonly ^ (v1 : string, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean},  readonly minVersion :{readonly ^ (range : string): semver.semver/classes/semver.^ | null, readonly ^ (range : semver.semver/classes/range.^): semver.semver/classes/semver.^ | null, readonly ^ (range : string, optionsOrLoose : boolean): semver.semver/classes/semver.^ | null, readonly ^ (range : semver.semver/classes/range.^, optionsOrLoose : boolean): semver.semver/classes/semver.^ | null, readonly ^ (range : string, optionsOrLoose : semver.semver.Options): semver.semver/classes/semver.^ | null, readonly ^ (range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.Options): semver.semver/classes/semver.^ | null},  readonly diff :{readonly ^ (v1 : string, v2 : string): semver.semver.ReleaseType | null, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): semver.semver.ReleaseType | null, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): semver.semver.ReleaseType | null, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): semver.semver.ReleaseType | null},  readonly outside :{readonly ^ (version : string, range : string, hilo : '>' | '<'): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, hilo : '>' | '<'): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, hilo : '>' | '<'): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, hilo : '>' | '<'): boolean, readonly ^ (version : string, range : string, hilo : '>' | '<', optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, hilo : '>' | '<', optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, hilo : '>' | '<', optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, hilo : '>' | '<', optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : string, hilo : '>' | '<', optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, hilo : '>' | '<', optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, hilo : '>' | '<', optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, hilo : '>' | '<', optionsOrLoose : semver.semver.RangeOptions): boolean},  readonly maxSatisfying :{readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : string): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : semver.semver/classes/range.^): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : string, optionsOrLoose : boolean): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : semver.semver/classes/range.^, optionsOrLoose : boolean): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : string, optionsOrLoose : semver.semver.RangeOptions): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): T | null},  readonly compareLoose :{readonly ^ (v1 : string, v2 : string): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): 1 | 0 | -1, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): 1 | 0 | -1, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): 1 | 0 | -1},  readonly simplifyRange :{readonly ^ (ranges : std.Array<string>, range : string): string | semver.semver/classes/range.^, readonly ^ (ranges : std.Array<string>, range : semver.semver/classes/range.^): string | semver.semver/classes/range.^, readonly ^ (ranges : std.Array<string>, range : string, options : semver.semver.Options): string | semver.semver/classes/range.^, readonly ^ (ranges : std.Array<string>, range : semver.semver/classes/range.^, options : semver.semver.Options): string | semver.semver/classes/range.^},  readonly prerelease :{readonly ^ (version : string): std.ReadonlyArray<string | number> | null, readonly ^ (version : semver.semver/classes/semver.^): std.ReadonlyArray<string | number> | null, readonly ^ (version : string, optionsOrLoose : boolean): std.ReadonlyArray<string | number> | null, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : boolean): std.ReadonlyArray<string | number> | null, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): std.ReadonlyArray<string | number> | null, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): std.ReadonlyArray<string | number> | null},  readonly intersects :{readonly ^ (range1 : string, range2 : string): boolean, readonly ^ (range1 : semver.semver/classes/range.^, range2 : string): boolean, readonly ^ (range1 : string, range2 : semver.semver/classes/range.^): boolean, readonly ^ (range1 : semver.semver/classes/range.^, range2 : semver.semver/classes/range.^): boolean, readonly ^ (range1 : string, range2 : string, optionsOrLoose : boolean): boolean, readonly ^ (range1 : semver.semver/classes/range.^, range2 : string, optionsOrLoose : boolean): boolean, readonly ^ (range1 : string, range2 : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (range1 : semver.semver/classes/range.^, range2 : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (range1 : string, range2 : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (range1 : semver.semver/classes/range.^, range2 : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (range1 : string, range2 : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (range1 : semver.semver/classes/range.^, range2 : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean},  readonly satisfies :{readonly ^ (version : string, range : string): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^): boolean, readonly ^ (version : string, range : string, optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean},  readonly ltr :{readonly ^ (version : string, range : string): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^): boolean, readonly ^ (version : string, range : string, optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, optionsOrLoose : boolean): boolean, readonly ^ (version : string, range : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : string, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : string, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean, readonly ^ (version : semver.semver/classes/semver.^, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): boolean}, readonly rcompareIdentifiers (): 1 | 0 | -1, readonly rcompareIdentifiers (): 1 | 0 | -1, readonly rcompareIdentifiers (): 1 | 0 | -1, readonly rcompareIdentifiers (): 1 | 0 | -1, readonly rcompareIdentifiers (a : string): 1 | 0 | -1, readonly rcompareIdentifiers (a : string): 1 | 0 | -1, readonly rcompareIdentifiers (a : string, b : string): 1 | 0 | -1, readonly rcompareIdentifiers (a : null, b : string): 1 | 0 | -1, readonly rcompareIdentifiers (a : undefined, b : string): 1 | 0 | -1,  readonly lte :{readonly ^ (v1 : string, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean},  readonly subset :{readonly ^ (sub : string, dom : string): boolean, readonly ^ (sub : semver.semver/classes/range.^, dom : string): boolean, readonly ^ (sub : string, dom : semver.semver/classes/range.^): boolean, readonly ^ (sub : semver.semver/classes/range.^, dom : semver.semver/classes/range.^): boolean, readonly ^ (sub : string, dom : string, options : semver.semver.RangeOptions): boolean, readonly ^ (sub : semver.semver/classes/range.^, dom : string, options : semver.semver.RangeOptions): boolean, readonly ^ (sub : string, dom : semver.semver/classes/range.^, options : semver.semver.RangeOptions): boolean, readonly ^ (sub : semver.semver/classes/range.^, dom : semver.semver/classes/range.^, options : semver.semver.RangeOptions): boolean},  readonly major :{readonly ^ (version : string): number, readonly ^ (version : semver.semver/classes/semver.^): number, readonly ^ (version : string, optionsOrLoose : boolean): number, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : boolean): number, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): number, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): number},  readonly minor :{readonly ^ (version : string): number, readonly ^ (version : semver.semver/classes/semver.^): number, readonly ^ (version : string, optionsOrLoose : boolean): number, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : boolean): number, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): number, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): number},  readonly minSatisfying :{readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : string): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : semver.semver/classes/range.^): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : string, optionsOrLoose : boolean): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : semver.semver/classes/range.^, optionsOrLoose : boolean): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : string, optionsOrLoose : semver.semver.RangeOptions): T | null, readonly ^ <T extends string | semver.semver/classes/semver.^>(versions : std.ReadonlyArray<T>, range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): T | null},  readonly Range,   Range :new (range : string): semver.semver.Range,  readonly parse :{readonly ^ (): semver.semver/classes/semver.^ | null, readonly ^ (): semver.semver/classes/semver.^ | null, readonly ^ (version : string): semver.semver/classes/semver.^ | null, readonly ^ (version : semver.semver/classes/semver.^): semver.semver/classes/semver.^ | null, readonly ^ (version : string, optionsOrLoose : boolean): semver.semver/classes/semver.^ | null, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : boolean): semver.semver/classes/semver.^ | null, readonly ^ (version : null, optionsOrLoose : boolean): semver.semver/classes/semver.^ | null, readonly ^ (version : undefined, optionsOrLoose : boolean): semver.semver/classes/semver.^ | null, readonly ^ (version : string, optionsOrLoose : semver.semver.Options): semver.semver/classes/semver.^ | null, readonly ^ (version : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): semver.semver/classes/semver.^ | null, readonly ^ (version : null, optionsOrLoose : semver.semver.Options): semver.semver/classes/semver.^ | null, readonly ^ (version : undefined, optionsOrLoose : semver.semver.Options): semver.semver/classes/semver.^ | null},  readonly validRange :{readonly ^ (): string | null, readonly ^ (): string | null, readonly ^ (range : string): string | null, readonly ^ (range : semver.semver/classes/range.^): string | null, readonly ^ (range : string, optionsOrLoose : boolean): string | null, readonly ^ (range : semver.semver/classes/range.^, optionsOrLoose : boolean): string | null, readonly ^ (range : null, optionsOrLoose : boolean): string | null, readonly ^ (range : undefined, optionsOrLoose : boolean): string | null, readonly ^ (range : string, optionsOrLoose : semver.semver.RangeOptions): string | null, readonly ^ (range : semver.semver/classes/range.^, optionsOrLoose : semver.semver.RangeOptions): string | null, readonly ^ (range : null, optionsOrLoose : semver.semver.RangeOptions): string | null, readonly ^ (range : undefined, optionsOrLoose : semver.semver.RangeOptions): string | null},  readonly gt :{readonly ^ (v1 : string, v2 : string): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : boolean): boolean, readonly ^ (v1 : string, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : string, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : string, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean, readonly ^ (v1 : semver.semver/classes/semver.^, v2 : semver.semver/classes/semver.^, optionsOrLoose : semver.semver.Options): boolean}} ? string : Def extends std.BooleanConstructor ? boolean : Def extends std.NumberConstructor | new (): @npmcli/config.@npmcli/config.Umask ? number : Def extends new (): node.stream.Stream ? node.stream.Stream : Def extends std.DateConstructor ? std.Date : Def extends std.ArrayConstructor ? std.Array<unknown> : unknown
    }}}
    */
  type _ConfigValueType[Def] = Def
}
