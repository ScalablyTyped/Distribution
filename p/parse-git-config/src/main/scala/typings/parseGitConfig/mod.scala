package typings.parseGitConfig

import org.scalablytyped.runtime.StringDictionary
import typings.parseGitConfig.parseGitConfigStrings.global
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Config | Null]]
  /**
    * Asynchronously parse a `.git/config` file. If only the callback is passed,
    * the `.git/config` file relative to `process.cwd()` is used.
    *
    * @example ```js
    * parse((err, config) => {
    *   if (err) throw err;
    *   // do stuff with config
    * });
    *
    * // or, using async/await
    * (async () => {
    *   console.log(await parse());
    *   console.log(await parse({ cwd: 'foo' }));
    *   console.log(await parse({ cwd: 'foo', path: 'some/.git/config' }));
    * })();
    * ```
    * @param options Options with `cwd` or `path`, the cwd to use, or the callback function.
    * @param callback callback function if the first argument is options or cwd.
    */
  inline def apply(cb: ParseCallback): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(options: String): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | Null]]
  inline def apply(options: String, cb: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(options: Options): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | Null]]
  inline def apply(options: Options, cb: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an object with only the properties that had ini-style keys
    * converted to objects.
    *
    * @example ```js
    * const config = parse.sync({ path: '/path/to/.gitconfig' });
    * const obj = parse.expandKeys(config);
    * ```
    * @param config The parsed git config object.
    */
  inline def expandKeys(config: Config): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("expandKeys")(config.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  /**
    * Asynchronously parse a .git/config file. Returns a promise.
    * Resolves with `null` if unable to resolve path to the git config file.
    * If no arguments are passed, the .git/config file relative to process.cwd() is used.
    */
  inline def promise(): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")().asInstanceOf[js.Promise[Config | Null]]
  inline def promise(options: String): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | Null]]
  inline def promise(options: Options): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | Null]]
  
  /**
    * Resolve the git config path
    */
  inline def resolveConfigPath(options: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigPath")(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def resolveConfigPath(options: ResolveConfigOptions): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigPath")(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * Synchronously parse a `.git/config` file. If no arguments are passed,
    * the `.git/config` file relative to `process.cwd()` is used.
    *
    * @example ```js
    * console.log(parse.sync());
    * console.log(parse.sync({ cwd: 'foo' }));
    * console.log(parse.sync({ cwd: 'foo', path: 'some/.git/config' }));
    * ```
    * @param options Options with `cwd` or `path`, or the cwd to use.
    */
  inline def sync(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[Config]
  inline def sync(options: String): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[Config]
  inline def sync(options: Options): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  // TODO: Can this be defined more precisely?
  type Config = StringDictionary[js.Any]
  
  trait Options
    extends StObject
       with ResolveConfigOptions {
    
    var expandKeys: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExpandKeys(value: Boolean): Self = StObject.set(x, "expandKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandKeysUndefined: Self = StObject.set(x, "expandKeys", js.undefined)
      
      inline def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  type ParseCallback = js.Function2[/* err */ Error | Null, /* config */ Config, Unit]
  
  trait ResolveConfigOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[global] = js.undefined
  }
  object ResolveConfigOptions {
    
    inline def apply(): ResolveConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveConfigOptions]
    }
    
    extension [Self <: ResolveConfigOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: global): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
