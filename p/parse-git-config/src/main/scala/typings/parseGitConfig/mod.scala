package typings.parseGitConfig

import org.scalablytyped.runtime.StringDictionary
import typings.parseGitConfig.parseGitConfigStrings.global
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Config | Null] = js.native
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
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  def apply(cb: ParseCallback): Unit = js.native
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  def apply(options: String): js.Promise[Config | Null] = js.native
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  def apply(options: String, cb: ParseCallback): Unit = js.native
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[Config | Null] = js.native
  @JSImport("parse-git-config", JSImport.Namespace)
  @js.native
  def apply(options: Options, cb: ParseCallback): Unit = js.native
  
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
  @JSImport("parse-git-config", "expandKeys")
  @js.native
  def expandKeys(config: Config): Config = js.native
  
  /**
    * Asynchronously parse a .git/config file. Returns a promise.
    * Resolves with `null` if unable to resolve path to the git config file.
    * If no arguments are passed, the .git/config file relative to process.cwd() is used.
    */
  @JSImport("parse-git-config", "promise")
  @js.native
  def promise(): js.Promise[Config | Null] = js.native
  @JSImport("parse-git-config", "promise")
  @js.native
  def promise(options: String): js.Promise[Config | Null] = js.native
  @JSImport("parse-git-config", "promise")
  @js.native
  def promise(options: Options): js.Promise[Config | Null] = js.native
  
  /**
    * Resolve the git config path
    */
  @JSImport("parse-git-config", "resolveConfigPath")
  @js.native
  def resolveConfigPath(options: String): String | Null = js.native
  @JSImport("parse-git-config", "resolveConfigPath")
  @js.native
  def resolveConfigPath(options: ResolveConfigOptions): String | Null = js.native
  
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
  @JSImport("parse-git-config", "sync")
  @js.native
  def sync(): Config = js.native
  @JSImport("parse-git-config", "sync")
  @js.native
  def sync(options: String): Config = js.native
  @JSImport("parse-git-config", "sync")
  @js.native
  def sync(options: Options): Config = js.native
  
  // TODO: Can this be defined more precisely?
  type Config = StringDictionary[js.Any]
  
  @js.native
  trait Options extends ResolveConfigOptions {
    
    var expandKeys: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[Boolean] = js.native
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
      def setExpandKeys(value: Boolean): Self = StObject.set(x, "expandKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandKeysUndefined: Self = StObject.set(x, "expandKeys", js.undefined)
      
      @scala.inline
      def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  type ParseCallback = js.Function2[/* err */ Error | Null, /* config */ Config, Unit]
  
  @js.native
  trait ResolveConfigOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[global] = js.native
  }
  object ResolveConfigOptions {
    
    @scala.inline
    def apply(): ResolveConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveConfigOptions]
    }
    
    @scala.inline
    implicit class ResolveConfigOptionsMutableBuilder[Self <: ResolveConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setType(value: global): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
