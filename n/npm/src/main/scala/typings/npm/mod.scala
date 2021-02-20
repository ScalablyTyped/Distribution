package typings.npm

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.npm.mod.NPM.Static
import typings.std.BooleanConstructor
import typings.std.Error
import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npm", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  object NPM {
    
    type CommandCallback = js.Function5[
        /* err */ js.UndefOr[Error], 
        /* result */ js.UndefOr[js.Any], 
        /* result2 */ js.UndefOr[js.Any], 
        /* result3 */ js.UndefOr[js.Any], 
        /* result4 */ js.UndefOr[js.Any], 
        Unit
      ]
    
    type CommandFunction = js.Function2[/* args */ js.Array[String], /* callback */ CommandCallback, Unit]
    
    @js.native
    trait Commands extends StObject {
      
      // adduser
      def `add-user`(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // adduser
      @JSName("add-user")
      var `add-user_Original`: CommandFunction = js.native
      
      def adduser(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("adduser")
      var adduser_Original: CommandFunction = js.native
      
      // star
      def apihelp(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // star
      @JSName("apihelp")
      var apihelp_Original: CommandFunction = js.native
      
      // search
      def author(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // search
      @JSName("author")
      var author_Original: CommandFunction = js.native
      
      def bin(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("bin")
      var bin_Original: CommandFunction = js.native
      
      def bugs(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("bugs")
      var bugs_Original: CommandFunction = js.native
      
      // dedupe
      // plumbing
      def build(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // dedupe
      // plumbing
      @JSName("build")
      var build_Original: CommandFunction = js.native
      
      // update
      def c(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // update
      @JSName("c")
      var c_Original: CommandFunction = js.native
      
      def cache(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("cache")
      var cache_Original: CommandFunction = js.native
      
      def completion(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("completion")
      var completion_Original: CommandFunction = js.native
      
      def config(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("config")
      var config_Original: CommandFunction = js.native
      
      // dedupe
      def ddp(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // dedupe
      @JSName("ddp")
      var ddp_Original: CommandFunction = js.native
      
      def dedupe(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("dedupe")
      var dedupe_Original: CommandFunction = js.native
      
      def deprecate(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("deprecate")
      var deprecate_Original: CommandFunction = js.native
      
      def docs(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("docs")
      var docs_Original: CommandFunction = js.native
      
      def edit(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("edit")
      var edit_Original: CommandFunction = js.native
      
      def explore(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("explore")
      var explore_Original: CommandFunction = js.native
      
      def faq(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("faq")
      var faq_Original: CommandFunction = js.native
      
      // config
      def find(args: js.Array[String], callback: CommandCallback): Unit = js.native
      
      // test
      def `find-dupes`(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // test
      @JSName("find-dupes")
      var `find-dupes_Original`: CommandFunction = js.native
      
      // config
      @JSName("find")
      var find_Original: CommandFunction = js.native
      
      def get(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("get")
      var get_Original: CommandFunction = js.native
      
      def help(args: js.Array[String], callback: CommandCallback): Unit = js.native
      
      def `help-search`(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("help-search")
      var `help-search_Original`: CommandFunction = js.native
      
      @JSName("help")
      var help_Original: CommandFunction = js.native
      
      // owner
      def home(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // owner
      @JSName("home")
      var home_Original: CommandFunction = js.native
      
      // ls
      def i(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // ls
      @JSName("i")
      var i_Original: CommandFunction = js.native
      
      def info(args: js.Array[String], callback: CommandCallback): Unit = js.native
      def info(args: js.Array[String], silent: Boolean, callback: CommandCallback): Unit = js.native
      
      def init(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("init")
      var init_Original: CommandFunction = js.native
      
      def install(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("install")
      var install_Original: CommandFunction = js.native
      
      // install
      def isntall(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // install
      @JSName("isntall")
      var isntall_Original: CommandFunction = js.native
      
      // docs
      def issues(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // docs
      @JSName("issues")
      var issues_Original: CommandFunction = js.native
      
      // ls
      def la(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // ls
      @JSName("la")
      var la_Original: CommandFunction = js.native
      
      def link(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("link")
      var link_Original: CommandFunction = js.native
      
      // rebuild
      def list(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // rebuild
      @JSName("list")
      var list_Original: CommandFunction = js.native
      
      // ls
      def ll(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // ls
      @JSName("ll")
      var ll_Original: CommandFunction = js.native
      
      // help
      def long(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // help
      @JSName("long")
      var long_Original: CommandFunction = js.native
      
      def ls(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("ls")
      var ls_Original: CommandFunction = js.native
      
      def outdated(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("outdated")
      var outdated_Original: CommandFunction = js.native
      
      def owner(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("owner")
      var owner_Original: CommandFunction = js.native
      
      def pack(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("pack")
      var pack_Original: CommandFunction = js.native
      
      def prefix(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("prefix")
      var prefix_Original: CommandFunction = js.native
      
      def prune(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("prune")
      var prune_Original: CommandFunction = js.native
      
      def publish(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("publish")
      var publish_Original: CommandFunction = js.native
      
      // uninstall
      def r(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // uninstall
      @JSName("r")
      var r_Original: CommandFunction = js.native
      
      // uninstall
      def rb(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // uninstall
      @JSName("rb")
      var rb_Original: CommandFunction = js.native
      
      def rebuild(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("rebuild")
      var rebuild_Original: CommandFunction = js.native
      
      // uninstall
      def remove(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // uninstall
      @JSName("remove")
      var remove_Original: CommandFunction = js.native
      
      def repo(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("repo")
      var repo_Original: CommandFunction = js.native
      
      def restart(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("restart")
      var restart_Original: CommandFunction = js.native
      
      //Aliases
      def rm(args: js.Array[String], callback: CommandCallback): Unit = js.native
      //Aliases
      @JSName("rm")
      var rm_Original: CommandFunction = js.native
      
      def root(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("root")
      var root_Original: CommandFunction = js.native
      
      def `run-script`(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("run-script")
      var `run-script_Original`: CommandFunction = js.native
      
      // search
      def s(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // search
      @JSName("s")
      var s_Original: CommandFunction = js.native
      
      // search
      def se(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // search
      @JSName("se")
      var se_Original: CommandFunction = js.native
      
      def search(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("search")
      var search_Original: CommandFunction = js.native
      
      def set(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("set")
      var set_Original: CommandFunction = js.native
      
      def show(args: js.Array[String], callback: CommandCallback): Unit = js.native
      def show(args: js.Array[String], silent: Boolean, callback: CommandCallback): Unit = js.native
      
      def shrinkwrap(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("shrinkwrap")
      var shrinkwrap_Original: CommandFunction = js.native
      
      def star(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("star")
      var star_Original: CommandFunction = js.native
      
      def stars(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("stars")
      var stars_Original: CommandFunction = js.native
      
      def start(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("start")
      var start_Original: CommandFunction = js.native
      
      def stop(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("stop")
      var stop_Original: CommandFunction = js.native
      
      def submodule(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("submodule")
      var submodule_Original: CommandFunction = js.native
      
      def substack(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("substack")
      var substack_Original: CommandFunction = js.native
      
      // test
      def t(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // test
      @JSName("t")
      var t_Original: CommandFunction = js.native
      
      def tag(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("tag")
      var tag_Original: CommandFunction = js.native
      
      def test(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("test")
      var test_Original: CommandFunction = js.native
      
      // adduser
      def tst(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // adduser
      @JSName("tst")
      var tst_Original: CommandFunction = js.native
      
      // uninstall
      def un(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // uninstall
      @JSName("un")
      var un_Original: CommandFunction = js.native
      
      def unbuild(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("unbuild")
      var unbuild_Original: CommandFunction = js.native
      
      def uninstall(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("uninstall")
      var uninstall_Original: CommandFunction = js.native
      
      // uninstall
      def unlink(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // uninstall
      @JSName("unlink")
      var unlink_Original: CommandFunction = js.native
      
      def unpublish(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("unpublish")
      var unpublish_Original: CommandFunction = js.native
      
      // bugs
      def unstar(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // bugs
      @JSName("unstar")
      var unstar_Original: CommandFunction = js.native
      
      // install
      def up(args: js.Array[String], callback: CommandCallback): Unit = js.native
      // install
      @JSName("up")
      var up_Original: CommandFunction = js.native
      
      def update(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("update")
      var update_Original: CommandFunction = js.native
      
      def v(args: js.Array[String], callback: CommandCallback): Unit = js.native
      def v(args: js.Array[String], silent: Boolean, callback: CommandCallback): Unit = js.native
      
      def version(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("version")
      var version_Original: CommandFunction = js.native
      
      // view and its aliases
      def view(args: js.Array[String], callback: CommandCallback): Unit = js.native
      def view(args: js.Array[String], silent: Boolean, callback: CommandCallback): Unit = js.native
      
      def visnup(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("visnup")
      var visnup_Original: CommandFunction = js.native
      
      def whoami(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("whoami")
      var whoami_Original: CommandFunction = js.native
      
      def xmas(args: js.Array[String], callback: CommandCallback): Unit = js.native
      @JSName("xmas")
      var xmas_Original: CommandFunction = js.native
    }
    
    @js.native
    trait Config extends StObject {
      
      def Conf(base: Config): Config = js.native
      @JSName("Conf")
      var Conf_Original: ConfigStatic = js.native
      
      def add(data: js.Object, marker: js.Object): js.Any = js.native
      
      def addEnv(env: Dictionary[String]): js.Any = js.native
      
      def addFile(file: String, name: String): Config = js.native
      
      var defs: ConfigDefs = js.native
      
      def findPrefix(prefix: String, cb: SimpleCallback[String]): Unit = js.native
      
      def get(setting: String): js.Any = js.native
      
      def getCredentialsByURI(uri: String): Credentials = js.native
      
      def loadCAFile(caFilePath: String, cb: ErrorCallback): Unit = js.native
      
      def loadExtras(cb: ErrorCallback): Unit = js.native
      
      def loadPrefix(cb: ErrorCallback): Unit = js.native
      
      def loadUid(cb: SimpleCallback[String]): Unit = js.native
      
      var loaded: Boolean = js.native
      
      def parse(content: String, file: String): js.Any = js.native
      
      var root: js.UndefOr[Config] = js.native
      
      var rootConf: Config = js.native
      
      def save(where: String, cb: ErrorCallback): Config = js.native
      
      def set(setting: String, value: js.Any): Unit = js.native
      
      def setCredentialsByURI(uri: String, cred: Credentials): Unit = js.native
      
      def setUser(cb: ErrorCallback): Unit = js.native
      
      var sources: Dictionary[ConfigSource] = js.native
      
      var usingBuiltin: Boolean = js.native
    }
    
    @js.native
    trait ConfigDefs extends StObject {
      
      var defaults: ConfigOptions = js.native
      
      var types: ConfigTypes = js.native
    }
    object ConfigDefs {
      
      @scala.inline
      def apply(defaults: ConfigOptions, types: ConfigTypes): ConfigDefs = {
        val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigDefs]
      }
      
      @scala.inline
      implicit class ConfigDefsMutableBuilder[Self <: ConfigDefs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaults(value: ConfigOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypes(value: ConfigTypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ConfigOptions extends StObject {
      
      var _exit: js.UndefOr[Boolean] = js.native
      
      var `always-auth`: js.UndefOr[Boolean] = js.native
      
      var `bin-links`: js.UndefOr[Boolean] = js.native
      
      var browser: js.UndefOr[String] = js.native
      
      var ca: js.UndefOr[js.Any] = js.native
      
      var cache: js.UndefOr[String] = js.native
      
      var `cache-lock-retries`: js.UndefOr[Double] = js.native
      
      var `cache-lock-stale`: js.UndefOr[Double] = js.native
      
      var `cache-lock-wait`: js.UndefOr[Double] = js.native
      
      var `cache-max`: js.UndefOr[Double] = js.native
      
      var `cache-min`: js.UndefOr[Double] = js.native
      
      // string | string[]
      var cafile: js.UndefOr[String] = js.native
      
      var cert: js.UndefOr[String] = js.native
      
      var color: js.UndefOr[js.Any] = js.native
      
      // boolean | string ("always")
      var depth: js.UndefOr[Double] = js.native
      
      var description: js.UndefOr[Boolean] = js.native
      
      var dev: js.UndefOr[Boolean] = js.native
      
      var editor: js.UndefOr[String] = js.native
      
      var `engine-strict`: js.UndefOr[Boolean] = js.native
      
      var `fetch-retries`: js.UndefOr[Double] = js.native
      
      var `fetch-retry-factor`: js.UndefOr[Double] = js.native
      
      var `fetch-retry-maxtimeout`: js.UndefOr[Double] = js.native
      
      var `fetch-retry-mintimeout`: js.UndefOr[Double] = js.native
      
      var force: js.UndefOr[Boolean] = js.native
      
      var git: js.UndefOr[String] = js.native
      
      var `git-tag-version`: js.UndefOr[Boolean] = js.native
      
      var global: js.UndefOr[Boolean] = js.native
      
      var globalconfig: js.UndefOr[String] = js.native
      
      var group: js.UndefOr[js.Any] = js.native
      
      // number | string
      var heading: js.UndefOr[String] = js.native
      
      // boolean | string
      var `https-proxy`: js.UndefOr[String] = js.native
      
      var `ignore-scripts`: js.UndefOr[Boolean] = js.native
      
      var `init-module`: js.UndefOr[String] = js.native
      
      @JSName("init.author.email")
      var initDotauthorDotemail: js.UndefOr[String] = js.native
      
      @JSName("init.author.name")
      var initDotauthorDotname: js.UndefOr[String] = js.native
      
      @JSName("init.author.url")
      var initDotauthorDoturl: js.UndefOr[String] = js.native
      
      @JSName("init.license")
      var initDotlicense: js.UndefOr[String] = js.native
      
      @JSName("init.version")
      var initDotversion: js.UndefOr[String] = js.native
      
      var json: js.UndefOr[Boolean] = js.native
      
      var key: js.UndefOr[String] = js.native
      
      var link: js.UndefOr[Boolean] = js.native
      
      var `local-address`: js.UndefOr[String] = js.native
      
      var loglevel: js.UndefOr[String] = js.native
      
      var logstream: js.UndefOr[ReadWriteStream] = js.native
      
      var long: js.UndefOr[Boolean] = js.native
      
      var message: js.UndefOr[String] = js.native
      
      var `node-version`: js.UndefOr[String] = js.native
      
      var npat: js.UndefOr[Boolean] = js.native
      
      var `onload-script`: js.UndefOr[Boolean] = js.native
      
      var optional: js.UndefOr[Boolean] = js.native
      
      var parseable: js.UndefOr[Boolean] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var production: js.UndefOr[Boolean] = js.native
      
      var `proprietary-attribs`: js.UndefOr[Boolean] = js.native
      
      var proxy: js.UndefOr[js.Any] = js.native
      
      var `rebuild-bundle`: js.UndefOr[Boolean] = js.native
      
      var registry: js.UndefOr[String] = js.native
      
      var rollback: js.UndefOr[Boolean] = js.native
      
      var save: js.UndefOr[Boolean] = js.native
      
      var `save-bundle`: js.UndefOr[Boolean] = js.native
      
      var `save-dev`: js.UndefOr[Boolean] = js.native
      
      var `save-exact`: js.UndefOr[Boolean] = js.native
      
      var `save-optional`: js.UndefOr[Boolean] = js.native
      
      var `save-prefix`: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[String] = js.native
      
      var searchexclude: js.UndefOr[String] = js.native
      
      var searchopts: js.UndefOr[String] = js.native
      
      var searchsort: js.UndefOr[String] = js.native
      
      var shell: js.UndefOr[String] = js.native
      
      var shrinkwrap: js.UndefOr[Boolean] = js.native
      
      var `sign-git-tag`: js.UndefOr[Boolean] = js.native
      
      var spin: js.UndefOr[js.Any] = js.native
      
      // boolean | string ("always")
      var `strict-ssl`: js.UndefOr[Boolean] = js.native
      
      var tag: js.UndefOr[String] = js.native
      
      var tmp: js.UndefOr[String] = js.native
      
      var umask: js.UndefOr[Double] = js.native
      
      var unicode: js.UndefOr[Boolean] = js.native
      
      var `unsafe-perm`: js.UndefOr[Boolean] = js.native
      
      var usage: js.UndefOr[Boolean] = js.native
      
      var user: js.UndefOr[js.Any] = js.native
      
      var `user-agent`: js.UndefOr[String] = js.native
      
      // string | number
      var userconfig: js.UndefOr[String] = js.native
      
      var version: js.UndefOr[Boolean] = js.native
      
      var versions: js.UndefOr[Boolean] = js.native
      
      var viewer: js.UndefOr[String] = js.native
    }
    object ConfigOptions {
      
      @scala.inline
      def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setAlways-auth`(value: Boolean): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAlways-authUndefined`: Self = StObject.set(x, "always-auth", js.undefined)
        
        @scala.inline
        def `setBin-links`(value: Boolean): Self = StObject.set(x, "bin-links", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setBin-linksUndefined`: Self = StObject.set(x, "bin-links", js.undefined)
        
        @scala.inline
        def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        @scala.inline
        def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
        
        @scala.inline
        def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCache-lock-retries`(value: Double): Self = StObject.set(x, "cache-lock-retries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCache-lock-retriesUndefined`: Self = StObject.set(x, "cache-lock-retries", js.undefined)
        
        @scala.inline
        def `setCache-lock-stale`(value: Double): Self = StObject.set(x, "cache-lock-stale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCache-lock-staleUndefined`: Self = StObject.set(x, "cache-lock-stale", js.undefined)
        
        @scala.inline
        def `setCache-lock-wait`(value: Double): Self = StObject.set(x, "cache-lock-wait", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCache-lock-waitUndefined`: Self = StObject.set(x, "cache-lock-wait", js.undefined)
        
        @scala.inline
        def `setCache-max`(value: Double): Self = StObject.set(x, "cache-max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCache-maxUndefined`: Self = StObject.set(x, "cache-max", js.undefined)
        
        @scala.inline
        def `setCache-min`(value: Double): Self = StObject.set(x, "cache-min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCache-minUndefined`: Self = StObject.set(x, "cache-min", js.undefined)
        
        @scala.inline
        def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
        
        @scala.inline
        def setCafile(value: String): Self = StObject.set(x, "cafile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCafileUndefined: Self = StObject.set(x, "cafile", js.undefined)
        
        @scala.inline
        def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
        
        @scala.inline
        def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
        
        @scala.inline
        def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
        
        @scala.inline
        def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
        
        @scala.inline
        def `setEngine-strict`(value: Boolean): Self = StObject.set(x, "engine-strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setEngine-strictUndefined`: Self = StObject.set(x, "engine-strict", js.undefined)
        
        @scala.inline
        def `setFetch-retries`(value: Double): Self = StObject.set(x, "fetch-retries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setFetch-retriesUndefined`: Self = StObject.set(x, "fetch-retries", js.undefined)
        
        @scala.inline
        def `setFetch-retry-factor`(value: Double): Self = StObject.set(x, "fetch-retry-factor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setFetch-retry-factorUndefined`: Self = StObject.set(x, "fetch-retry-factor", js.undefined)
        
        @scala.inline
        def `setFetch-retry-maxtimeout`(value: Double): Self = StObject.set(x, "fetch-retry-maxtimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setFetch-retry-maxtimeoutUndefined`: Self = StObject.set(x, "fetch-retry-maxtimeout", js.undefined)
        
        @scala.inline
        def `setFetch-retry-mintimeout`(value: Double): Self = StObject.set(x, "fetch-retry-mintimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setFetch-retry-mintimeoutUndefined`: Self = StObject.set(x, "fetch-retry-mintimeout", js.undefined)
        
        @scala.inline
        def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
        
        @scala.inline
        def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setGit-tag-version`(value: Boolean): Self = StObject.set(x, "git-tag-version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setGit-tag-versionUndefined`: Self = StObject.set(x, "git-tag-version", js.undefined)
        
        @scala.inline
        def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
        
        @scala.inline
        def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
        
        @scala.inline
        def setGlobalconfig(value: String): Self = StObject.set(x, "globalconfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlobalconfigUndefined: Self = StObject.set(x, "globalconfig", js.undefined)
        
        @scala.inline
        def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        @scala.inline
        def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
        
        @scala.inline
        def `setHttps-proxy`(value: String): Self = StObject.set(x, "https-proxy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setHttps-proxyUndefined`: Self = StObject.set(x, "https-proxy", js.undefined)
        
        @scala.inline
        def `setIgnore-scripts`(value: Boolean): Self = StObject.set(x, "ignore-scripts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setIgnore-scriptsUndefined`: Self = StObject.set(x, "ignore-scripts", js.undefined)
        
        @scala.inline
        def `setInit-module`(value: String): Self = StObject.set(x, "init-module", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setInit-moduleUndefined`: Self = StObject.set(x, "init-module", js.undefined)
        
        @scala.inline
        def setInitDotauthorDotemail(value: String): Self = StObject.set(x, "init.author.email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitDotauthorDotemailUndefined: Self = StObject.set(x, "init.author.email", js.undefined)
        
        @scala.inline
        def setInitDotauthorDotname(value: String): Self = StObject.set(x, "init.author.name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitDotauthorDotnameUndefined: Self = StObject.set(x, "init.author.name", js.undefined)
        
        @scala.inline
        def setInitDotauthorDoturl(value: String): Self = StObject.set(x, "init.author.url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitDotauthorDoturlUndefined: Self = StObject.set(x, "init.author.url", js.undefined)
        
        @scala.inline
        def setInitDotlicense(value: String): Self = StObject.set(x, "init.license", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitDotlicenseUndefined: Self = StObject.set(x, "init.license", js.undefined)
        
        @scala.inline
        def setInitDotversion(value: String): Self = StObject.set(x, "init.version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitDotversionUndefined: Self = StObject.set(x, "init.version", js.undefined)
        
        @scala.inline
        def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def `setLocal-address`(value: String): Self = StObject.set(x, "local-address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLocal-addressUndefined`: Self = StObject.set(x, "local-address", js.undefined)
        
        @scala.inline
        def setLoglevel(value: String): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
        
        @scala.inline
        def setLogstream(value: ReadWriteStream): Self = StObject.set(x, "logstream", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogstreamUndefined: Self = StObject.set(x, "logstream", js.undefined)
        
        @scala.inline
        def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def `setNode-version`(value: String): Self = StObject.set(x, "node-version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setNode-versionUndefined`: Self = StObject.set(x, "node-version", js.undefined)
        
        @scala.inline
        def setNpat(value: Boolean): Self = StObject.set(x, "npat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNpatUndefined: Self = StObject.set(x, "npat", js.undefined)
        
        @scala.inline
        def `setOnload-script`(value: Boolean): Self = StObject.set(x, "onload-script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setOnload-scriptUndefined`: Self = StObject.set(x, "onload-script", js.undefined)
        
        @scala.inline
        def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
        
        @scala.inline
        def setParseable(value: Boolean): Self = StObject.set(x, "parseable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParseableUndefined: Self = StObject.set(x, "parseable", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
        
        @scala.inline
        def `setProprietary-attribs`(value: Boolean): Self = StObject.set(x, "proprietary-attribs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setProprietary-attribsUndefined`: Self = StObject.set(x, "proprietary-attribs", js.undefined)
        
        @scala.inline
        def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
        
        @scala.inline
        def `setRebuild-bundle`(value: Boolean): Self = StObject.set(x, "rebuild-bundle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setRebuild-bundleUndefined`: Self = StObject.set(x, "rebuild-bundle", js.undefined)
        
        @scala.inline
        def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
        
        @scala.inline
        def setRollback(value: Boolean): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
        
        @scala.inline
        def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSave-bundle`(value: Boolean): Self = StObject.set(x, "save-bundle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSave-bundleUndefined`: Self = StObject.set(x, "save-bundle", js.undefined)
        
        @scala.inline
        def `setSave-dev`(value: Boolean): Self = StObject.set(x, "save-dev", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSave-devUndefined`: Self = StObject.set(x, "save-dev", js.undefined)
        
        @scala.inline
        def `setSave-exact`(value: Boolean): Self = StObject.set(x, "save-exact", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSave-exactUndefined`: Self = StObject.set(x, "save-exact", js.undefined)
        
        @scala.inline
        def `setSave-optional`(value: Boolean): Self = StObject.set(x, "save-optional", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSave-optionalUndefined`: Self = StObject.set(x, "save-optional", js.undefined)
        
        @scala.inline
        def `setSave-prefix`(value: String): Self = StObject.set(x, "save-prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSave-prefixUndefined`: Self = StObject.set(x, "save-prefix", js.undefined)
        
        @scala.inline
        def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setSearchexclude(value: String): Self = StObject.set(x, "searchexclude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchexcludeUndefined: Self = StObject.set(x, "searchexclude", js.undefined)
        
        @scala.inline
        def setSearchopts(value: String): Self = StObject.set(x, "searchopts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchoptsUndefined: Self = StObject.set(x, "searchopts", js.undefined)
        
        @scala.inline
        def setSearchsort(value: String): Self = StObject.set(x, "searchsort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchsortUndefined: Self = StObject.set(x, "searchsort", js.undefined)
        
        @scala.inline
        def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
        
        @scala.inline
        def setShrinkwrap(value: Boolean): Self = StObject.set(x, "shrinkwrap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShrinkwrapUndefined: Self = StObject.set(x, "shrinkwrap", js.undefined)
        
        @scala.inline
        def `setSign-git-tag`(value: Boolean): Self = StObject.set(x, "sign-git-tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSign-git-tagUndefined`: Self = StObject.set(x, "sign-git-tag", js.undefined)
        
        @scala.inline
        def setSpin(value: js.Any): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
        
        @scala.inline
        def `setStrict-ssl`(value: Boolean): Self = StObject.set(x, "strict-ssl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setStrict-sslUndefined`: Self = StObject.set(x, "strict-ssl", js.undefined)
        
        @scala.inline
        def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        @scala.inline
        def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
        
        @scala.inline
        def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
        
        @scala.inline
        def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
        
        @scala.inline
        def `setUnsafe-perm`(value: Boolean): Self = StObject.set(x, "unsafe-perm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setUnsafe-permUndefined`: Self = StObject.set(x, "unsafe-perm", js.undefined)
        
        @scala.inline
        def setUsage(value: Boolean): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
        
        @scala.inline
        def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setUser-agent`(value: String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        @scala.inline
        def setUserconfig(value: String): Self = StObject.set(x, "userconfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserconfigUndefined: Self = StObject.set(x, "userconfig", js.undefined)
        
        @scala.inline
        def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        
        @scala.inline
        def setVersions(value: Boolean): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
        
        @scala.inline
        def setViewer(value: String): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewerUndefined: Self = StObject.set(x, "viewer", js.undefined)
        
        @scala.inline
        def set_exit(value: Boolean): Self = StObject.set(x, "_exit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_exitUndefined: Self = StObject.set(x, "_exit", js.undefined)
      }
    }
    
    @js.native
    trait ConfigShorthands extends StObject {
      
      var B: js.Array[_] = js.native
      
      var C: js.Array[_] = js.native
      
      var D: js.Array[_] = js.native
      
      var E: js.Array[_] = js.native
      
      var H: js.Array[_] = js.native
      
      var N: js.Array[_] = js.native
      
      var O: js.Array[_] = js.native
      
      @JSName("?")
      var Questionmark: js.Array[_] = js.native
      
      var S: js.Array[_] = js.native
      
      var d: js.Array[_] = js.native
      
      var dd: js.Array[_] = js.native
      
      var ddd: js.Array[_] = js.native
      
      var desc: js.Array[_] = js.native
      
      var f: js.Array[_] = js.native
      
      var g: js.Array[_] = js.native
      
      var gangsta: js.Array[_] = js.native
      
      var gangster: js.Array[_] = js.native
      
      var h: js.Array[_] = js.native
      
      var help: js.Array[_] = js.native
      
      var l: js.Array[_] = js.native
      
      var local: js.Array[_] = js.native
      
      var m: js.Array[_] = js.native
      
      var n: js.Array[_] = js.native
      
      var `no-desc`: js.Array[_] = js.native
      
      var `no-reg`: js.Array[_] = js.native
      
      var noreg: js.Array[_] = js.native
      
      var p: js.Array[_] = js.native
      
      var porcelain: js.Array[_] = js.native
      
      var q: js.Array[_] = js.native
      
      var quiet: js.Array[_] = js.native
      
      var reg: js.Array[_] = js.native
      
      var s: js.Array[_] = js.native
      
      var silent: js.Array[_] = js.native
      
      var v: js.Array[_] = js.native
      
      var verbose: js.Array[_] = js.native
      
      var y: js.Array[_] = js.native
    }
    object ConfigShorthands {
      
      @scala.inline
      def apply(
        B: js.Array[_],
        C: js.Array[_],
        D: js.Array[_],
        E: js.Array[_],
        H: js.Array[_],
        N: js.Array[_],
        O: js.Array[_],
        Questionmark: js.Array[_],
        S: js.Array[_],
        d: js.Array[_],
        dd: js.Array[_],
        ddd: js.Array[_],
        desc: js.Array[_],
        f: js.Array[_],
        g: js.Array[_],
        gangsta: js.Array[_],
        gangster: js.Array[_],
        h: js.Array[_],
        help: js.Array[_],
        l: js.Array[_],
        local: js.Array[_],
        m: js.Array[_],
        n: js.Array[_],
        `no-desc`: js.Array[_],
        `no-reg`: js.Array[_],
        noreg: js.Array[_],
        p: js.Array[_],
        porcelain: js.Array[_],
        q: js.Array[_],
        quiet: js.Array[_],
        reg: js.Array[_],
        s: js.Array[_],
        silent: js.Array[_],
        v: js.Array[_],
        verbose: js.Array[_],
        y: js.Array[_]
      ): ConfigShorthands = {
        val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], gangsta = gangsta.asInstanceOf[js.Any], gangster = gangster.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], noreg = noreg.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], porcelain = porcelain.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.updateDynamic("?")(Questionmark.asInstanceOf[js.Any])
        __obj.updateDynamic("no-desc")(`no-desc`.asInstanceOf[js.Any])
        __obj.updateDynamic("no-reg")(`no-reg`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigShorthands]
      }
      
      @scala.inline
      implicit class ConfigShorthandsMutableBuilder[Self <: ConfigShorthands] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setB(value: js.Array[_]): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBVarargs(value: js.Any*): Self = StObject.set(x, "B", js.Array(value :_*))
        
        @scala.inline
        def setC(value: js.Array[_]): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCVarargs(value: js.Any*): Self = StObject.set(x, "C", js.Array(value :_*))
        
        @scala.inline
        def setD(value: js.Array[_]): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDVarargs(value: js.Any*): Self = StObject.set(x, "D", js.Array(value :_*))
        
        @scala.inline
        def setDd(value: js.Array[_]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDdVarargs(value: js.Any*): Self = StObject.set(x, "dd", js.Array(value :_*))
        
        @scala.inline
        def setDdd(value: js.Array[_]): Self = StObject.set(x, "ddd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDddVarargs(value: js.Any*): Self = StObject.set(x, "ddd", js.Array(value :_*))
        
        @scala.inline
        def setDesc(value: js.Array[_]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescVarargs(value: js.Any*): Self = StObject.set(x, "desc", js.Array(value :_*))
        
        @scala.inline
        def setE(value: js.Array[_]): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEVarargs(value: js.Any*): Self = StObject.set(x, "E", js.Array(value :_*))
        
        @scala.inline
        def setF(value: js.Array[_]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFVarargs(value: js.Any*): Self = StObject.set(x, "f", js.Array(value :_*))
        
        @scala.inline
        def setG(value: js.Array[_]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGVarargs(value: js.Any*): Self = StObject.set(x, "g", js.Array(value :_*))
        
        @scala.inline
        def setGangsta(value: js.Array[_]): Self = StObject.set(x, "gangsta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGangstaVarargs(value: js.Any*): Self = StObject.set(x, "gangsta", js.Array(value :_*))
        
        @scala.inline
        def setGangster(value: js.Array[_]): Self = StObject.set(x, "gangster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGangsterVarargs(value: js.Any*): Self = StObject.set(x, "gangster", js.Array(value :_*))
        
        @scala.inline
        def setH(value: js.Array[_]): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHVarargs(value: js.Any*): Self = StObject.set(x, "H", js.Array(value :_*))
        
        @scala.inline
        def setHelp(value: js.Array[_]): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHelpVarargs(value: js.Any*): Self = StObject.set(x, "help", js.Array(value :_*))
        
        @scala.inline
        def setL(value: js.Array[_]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLVarargs(value: js.Any*): Self = StObject.set(x, "l", js.Array(value :_*))
        
        @scala.inline
        def setLocal(value: js.Array[_]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalVarargs(value: js.Any*): Self = StObject.set(x, "local", js.Array(value :_*))
        
        @scala.inline
        def setM(value: js.Array[_]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMVarargs(value: js.Any*): Self = StObject.set(x, "m", js.Array(value :_*))
        
        @scala.inline
        def setN(value: js.Array[_]): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNVarargs(value: js.Any*): Self = StObject.set(x, "N", js.Array(value :_*))
        
        @scala.inline
        def `setNo-desc`(value: js.Array[_]): Self = StObject.set(x, "no-desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setNo-descVarargs`(value: js.Any*): Self = StObject.set(x, "no-desc", js.Array(value :_*))
        
        @scala.inline
        def `setNo-reg`(value: js.Array[_]): Self = StObject.set(x, "no-reg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setNo-regVarargs`(value: js.Any*): Self = StObject.set(x, "no-reg", js.Array(value :_*))
        
        @scala.inline
        def setNoreg(value: js.Array[_]): Self = StObject.set(x, "noreg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoregVarargs(value: js.Any*): Self = StObject.set(x, "noreg", js.Array(value :_*))
        
        @scala.inline
        def setO(value: js.Array[_]): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOVarargs(value: js.Any*): Self = StObject.set(x, "O", js.Array(value :_*))
        
        @scala.inline
        def setP(value: js.Array[_]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPVarargs(value: js.Any*): Self = StObject.set(x, "p", js.Array(value :_*))
        
        @scala.inline
        def setPorcelain(value: js.Array[_]): Self = StObject.set(x, "porcelain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPorcelainVarargs(value: js.Any*): Self = StObject.set(x, "porcelain", js.Array(value :_*))
        
        @scala.inline
        def setQ(value: js.Array[_]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQVarargs(value: js.Any*): Self = StObject.set(x, "q", js.Array(value :_*))
        
        @scala.inline
        def setQuestionmark(value: js.Array[_]): Self = StObject.set(x, "?", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuestionmarkVarargs(value: js.Any*): Self = StObject.set(x, "?", js.Array(value :_*))
        
        @scala.inline
        def setQuiet(value: js.Array[_]): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuietVarargs(value: js.Any*): Self = StObject.set(x, "quiet", js.Array(value :_*))
        
        @scala.inline
        def setReg(value: js.Array[_]): Self = StObject.set(x, "reg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegVarargs(value: js.Any*): Self = StObject.set(x, "reg", js.Array(value :_*))
        
        @scala.inline
        def setS(value: js.Array[_]): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSVarargs(value: js.Any*): Self = StObject.set(x, "S", js.Array(value :_*))
        
        @scala.inline
        def setSilent(value: js.Array[_]): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilentVarargs(value: js.Any*): Self = StObject.set(x, "silent", js.Array(value :_*))
        
        @scala.inline
        def setV(value: js.Array[_]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVVarargs(value: js.Any*): Self = StObject.set(x, "v", js.Array(value :_*))
        
        @scala.inline
        def setVerbose(value: js.Array[_]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerboseVarargs(value: js.Any*): Self = StObject.set(x, "verbose", js.Array(value :_*))
        
        @scala.inline
        def setY(value: js.Array[_]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYVarargs(value: js.Any*): Self = StObject.set(x, "y", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ConfigSource extends StObject {
      
      var path: String = js.native
      
      var `type`: String = js.native
    }
    object ConfigSource {
      
      @scala.inline
      def apply(path: String, `type`: String): ConfigSource = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigSource]
      }
      
      @scala.inline
      implicit class ConfigSourceMutableBuilder[Self <: ConfigSource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ConfigStatic extends Instantiable1[/* base */ Config, Config] {
      
      def apply(base: Config): Config = js.native
    }
    
    @js.native
    trait ConfigTypes extends StObject {
      
      def _exit[T](): Boolean = js.native
      def _exit[T](value: T): Boolean = js.native
      @JSName("_exit")
      var _exit_Original: BooleanConstructor = js.native
      
      def `always-auth`[T](): Boolean = js.native
      def `always-auth`[T](value: T): Boolean = js.native
      @JSName("always-auth")
      var `always-auth_Original`: BooleanConstructor = js.native
      
      def `bin-links`[T](): Boolean = js.native
      def `bin-links`[T](value: T): Boolean = js.native
      @JSName("bin-links")
      var `bin-links_Original`: BooleanConstructor = js.native
      
      var browser: js.Array[_] = js.native
      
      var ca: js.Array[_] = js.native
      
      def cache(): String = js.native
      def cache(value: js.Any): String = js.native
      
      def `cache-lock-retries`(): Double = js.native
      def `cache-lock-retries`(value: js.Any): Double = js.native
      @JSName("cache-lock-retries")
      var `cache-lock-retries_Original`: NumberConstructor = js.native
      
      def `cache-lock-stale`(): Double = js.native
      def `cache-lock-stale`(value: js.Any): Double = js.native
      @JSName("cache-lock-stale")
      var `cache-lock-stale_Original`: NumberConstructor = js.native
      
      def `cache-lock-wait`(): Double = js.native
      def `cache-lock-wait`(value: js.Any): Double = js.native
      @JSName("cache-lock-wait")
      var `cache-lock-wait_Original`: NumberConstructor = js.native
      
      def `cache-max`(): Double = js.native
      def `cache-max`(value: js.Any): Double = js.native
      @JSName("cache-max")
      var `cache-max_Original`: NumberConstructor = js.native
      
      def `cache-min`(): Double = js.native
      def `cache-min`(value: js.Any): Double = js.native
      @JSName("cache-min")
      var `cache-min_Original`: NumberConstructor = js.native
      
      @JSName("cache")
      var cache_Original: StringConstructor = js.native
      
      def cafile(): String = js.native
      def cafile(value: js.Any): String = js.native
      @JSName("cafile")
      var cafile_Original: StringConstructor = js.native
      
      def cert(): String = js.native
      def cert(value: js.Any): String = js.native
      @JSName("cert")
      var cert_Original: StringConstructor = js.native
      
      var color: js.Array[_] = js.native
      
      def depth(): Double = js.native
      def depth(value: js.Any): Double = js.native
      @JSName("depth")
      var depth_Original: NumberConstructor = js.native
      
      def description[T](): Boolean = js.native
      def description[T](value: T): Boolean = js.native
      @JSName("description")
      var description_Original: BooleanConstructor = js.native
      
      def dev[T](): Boolean = js.native
      def dev[T](value: T): Boolean = js.native
      @JSName("dev")
      var dev_Original: BooleanConstructor = js.native
      
      def editor(): String = js.native
      def editor(value: js.Any): String = js.native
      @JSName("editor")
      var editor_Original: StringConstructor = js.native
      
      def `engine-strict`[T](): Boolean = js.native
      def `engine-strict`[T](value: T): Boolean = js.native
      @JSName("engine-strict")
      var `engine-strict_Original`: BooleanConstructor = js.native
      
      def `fetch-retries`(): Double = js.native
      def `fetch-retries`(value: js.Any): Double = js.native
      @JSName("fetch-retries")
      var `fetch-retries_Original`: NumberConstructor = js.native
      
      def `fetch-retry-factor`(): Double = js.native
      def `fetch-retry-factor`(value: js.Any): Double = js.native
      @JSName("fetch-retry-factor")
      var `fetch-retry-factor_Original`: NumberConstructor = js.native
      
      def `fetch-retry-maxtimeout`(): Double = js.native
      def `fetch-retry-maxtimeout`(value: js.Any): Double = js.native
      @JSName("fetch-retry-maxtimeout")
      var `fetch-retry-maxtimeout_Original`: NumberConstructor = js.native
      
      def `fetch-retry-mintimeout`(): Double = js.native
      def `fetch-retry-mintimeout`(value: js.Any): Double = js.native
      @JSName("fetch-retry-mintimeout")
      var `fetch-retry-mintimeout_Original`: NumberConstructor = js.native
      
      def force[T](): Boolean = js.native
      def force[T](value: T): Boolean = js.native
      @JSName("force")
      var force_Original: BooleanConstructor = js.native
      
      def git(): String = js.native
      def git(value: js.Any): String = js.native
      
      def `git-tag-version`[T](): Boolean = js.native
      def `git-tag-version`[T](value: T): Boolean = js.native
      @JSName("git-tag-version")
      var `git-tag-version_Original`: BooleanConstructor = js.native
      
      @JSName("git")
      var git_Original: StringConstructor = js.native
      
      def global[T](): Boolean = js.native
      def global[T](value: T): Boolean = js.native
      @JSName("global")
      var global_Original: BooleanConstructor = js.native
      
      def globalconfig(): String = js.native
      def globalconfig(value: js.Any): String = js.native
      @JSName("globalconfig")
      var globalconfig_Original: StringConstructor = js.native
      
      var group: js.Array[_] = js.native
      
      def heading(): String = js.native
      def heading(value: js.Any): String = js.native
      @JSName("heading")
      var heading_Original: StringConstructor = js.native
      
      var `https-proxy`: js.Array[_] = js.native
      
      def `ignore-scripts`[T](): Boolean = js.native
      def `ignore-scripts`[T](value: T): Boolean = js.native
      @JSName("ignore-scripts")
      var `ignore-scripts_Original`: BooleanConstructor = js.native
      
      def `init-module`(): String = js.native
      def `init-module`(value: js.Any): String = js.native
      @JSName("init-module")
      var `init-module_Original`: StringConstructor = js.native
      
      @JSName("init.author.email")
      def initDotauthorDotemail(): String = js.native
      @JSName("init.author.email")
      def initDotauthorDotemail(value: js.Any): String = js.native
      @JSName("init.author.email")
      var initDotauthorDotemail_Original: StringConstructor = js.native
      
      @JSName("init.author.name")
      def initDotauthorDotname(): String = js.native
      @JSName("init.author.name")
      def initDotauthorDotname(value: js.Any): String = js.native
      @JSName("init.author.name")
      var initDotauthorDotname_Original: StringConstructor = js.native
      
      @JSName("init.author.url")
      def initDotauthorDoturl(): String = js.native
      @JSName("init.author.url")
      def initDotauthorDoturl(value: js.Any): String = js.native
      @JSName("init.author.url")
      var initDotauthorDoturl_Original: StringConstructor = js.native
      
      @JSName("init.license")
      def initDotlicense(): String = js.native
      @JSName("init.license")
      def initDotlicense(value: js.Any): String = js.native
      @JSName("init.license")
      var initDotlicense_Original: StringConstructor = js.native
      
      @JSName("init.version")
      def initDotversion(): String = js.native
      @JSName("init.version")
      def initDotversion(value: js.Any): String = js.native
      @JSName("init.version")
      var initDotversion_Original: StringConstructor = js.native
      
      def json[T](): Boolean = js.native
      def json[T](value: T): Boolean = js.native
      @JSName("json")
      var json_Original: BooleanConstructor = js.native
      
      var key: js.Array[_] = js.native
      
      def link[T](): Boolean = js.native
      def link[T](value: T): Boolean = js.native
      @JSName("link")
      var link_Original: BooleanConstructor = js.native
      
      def `local-address`(): String = js.native
      def `local-address`(value: js.Any): String = js.native
      @JSName("local-address")
      var `local-address_Original`: StringConstructor = js.native
      
      var loglevel: js.Array[_] = js.native
      
      var logstream: js.Any = js.native
      
      // typeof stream.Stream
      def long[T](): Boolean = js.native
      // typeof stream.Stream
      def long[T](value: T): Boolean = js.native
      // typeof stream.Stream
      @JSName("long")
      var long_Original: BooleanConstructor = js.native
      
      def message(): String = js.native
      def message(value: js.Any): String = js.native
      @JSName("message")
      var message_Original: StringConstructor = js.native
      
      var `node-version`: js.Array[_] = js.native
      
      def npat[T](): Boolean = js.native
      def npat[T](value: T): Boolean = js.native
      @JSName("npat")
      var npat_Original: BooleanConstructor = js.native
      
      var `onload-script`: js.Array[_] = js.native
      
      def optional[T](): Boolean = js.native
      def optional[T](value: T): Boolean = js.native
      @JSName("optional")
      var optional_Original: BooleanConstructor = js.native
      
      def parseable[T](): Boolean = js.native
      def parseable[T](value: T): Boolean = js.native
      @JSName("parseable")
      var parseable_Original: BooleanConstructor = js.native
      
      def prefix(): String = js.native
      def prefix(value: js.Any): String = js.native
      @JSName("prefix")
      var prefix_Original: StringConstructor = js.native
      
      def production[T](): Boolean = js.native
      def production[T](value: T): Boolean = js.native
      @JSName("production")
      var production_Original: BooleanConstructor = js.native
      
      def `proprietary-attribs`[T](): Boolean = js.native
      def `proprietary-attribs`[T](value: T): Boolean = js.native
      @JSName("proprietary-attribs")
      var `proprietary-attribs_Original`: BooleanConstructor = js.native
      
      var proxy: js.Array[_] = js.native
      
      var `rebuild-bundle`: Boolean = js.native
      
      var registry: js.Array[_] = js.native
      
      def rollback[T](): Boolean = js.native
      def rollback[T](value: T): Boolean = js.native
      @JSName("rollback")
      var rollback_Original: BooleanConstructor = js.native
      
      def save[T](): Boolean = js.native
      def save[T](value: T): Boolean = js.native
      
      def `save-bundle`[T](): Boolean = js.native
      def `save-bundle`[T](value: T): Boolean = js.native
      @JSName("save-bundle")
      var `save-bundle_Original`: BooleanConstructor = js.native
      
      def `save-dev`[T](): Boolean = js.native
      def `save-dev`[T](value: T): Boolean = js.native
      @JSName("save-dev")
      var `save-dev_Original`: BooleanConstructor = js.native
      
      def `save-exact`[T](): Boolean = js.native
      def `save-exact`[T](value: T): Boolean = js.native
      @JSName("save-exact")
      var `save-exact_Original`: BooleanConstructor = js.native
      
      def `save-optional`[T](): Boolean = js.native
      def `save-optional`[T](value: T): Boolean = js.native
      @JSName("save-optional")
      var `save-optional_Original`: BooleanConstructor = js.native
      
      def `save-prefix`(): String = js.native
      def `save-prefix`(value: js.Any): String = js.native
      @JSName("save-prefix")
      var `save-prefix_Original`: StringConstructor = js.native
      
      @JSName("save")
      var save_Original: BooleanConstructor = js.native
      
      def scope(): String = js.native
      def scope(value: js.Any): String = js.native
      @JSName("scope")
      var scope_Original: StringConstructor = js.native
      
      var searchexclude: js.Array[_] = js.native
      
      def searchopts(): String = js.native
      def searchopts(value: js.Any): String = js.native
      @JSName("searchopts")
      var searchopts_Original: StringConstructor = js.native
      
      var searchsort: js.Array[_] = js.native
      
      def shell(): String = js.native
      def shell(value: js.Any): String = js.native
      @JSName("shell")
      var shell_Original: StringConstructor = js.native
      
      def shrinkwrap[T](): Boolean = js.native
      def shrinkwrap[T](value: T): Boolean = js.native
      @JSName("shrinkwrap")
      var shrinkwrap_Original: BooleanConstructor = js.native
      
      def `sign-git-tag`[T](): Boolean = js.native
      def `sign-git-tag`[T](value: T): Boolean = js.native
      @JSName("sign-git-tag")
      var `sign-git-tag_Original`: BooleanConstructor = js.native
      
      var spin: js.Array[_] = js.native
      
      def `strict-ssl`[T](): Boolean = js.native
      def `strict-ssl`[T](value: T): Boolean = js.native
      @JSName("strict-ssl")
      var `strict-ssl_Original`: BooleanConstructor = js.native
      
      def tag(): String = js.native
      def tag(value: js.Any): String = js.native
      @JSName("tag")
      var tag_Original: StringConstructor = js.native
      
      def tmp(): String = js.native
      def tmp(value: js.Any): String = js.native
      @JSName("tmp")
      var tmp_Original: StringConstructor = js.native
      
      def umask(): Double = js.native
      def umask(value: js.Any): Double = js.native
      @JSName("umask")
      var umask_Original: NumberConstructor = js.native
      
      def unicode[T](): Boolean = js.native
      def unicode[T](value: T): Boolean = js.native
      @JSName("unicode")
      var unicode_Original: BooleanConstructor = js.native
      
      def `unsafe-perm`[T](): Boolean = js.native
      def `unsafe-perm`[T](value: T): Boolean = js.native
      @JSName("unsafe-perm")
      var `unsafe-perm_Original`: BooleanConstructor = js.native
      
      def usage[T](): Boolean = js.native
      def usage[T](value: T): Boolean = js.native
      @JSName("usage")
      var usage_Original: BooleanConstructor = js.native
      
      var user: js.Any = js.native
      
      def `user-agent`(): String = js.native
      def `user-agent`(value: js.Any): String = js.native
      @JSName("user-agent")
      var `user-agent_Original`: StringConstructor = js.native
      
      // String | Number
      def userconfig(): String = js.native
      // String | Number
      def userconfig(value: js.Any): String = js.native
      // String | Number
      @JSName("userconfig")
      var userconfig_Original: StringConstructor = js.native
      
      def version[T](): Boolean = js.native
      def version[T](value: T): Boolean = js.native
      @JSName("version")
      var version_Original: BooleanConstructor = js.native
      
      def versions[T](): Boolean = js.native
      def versions[T](value: T): Boolean = js.native
      @JSName("versions")
      var versions_Original: BooleanConstructor = js.native
      
      def viewer(): String = js.native
      def viewer(value: js.Any): String = js.native
      @JSName("viewer")
      var viewer_Original: StringConstructor = js.native
    }
    
    @js.native
    trait Credentials extends StObject {
      
      var auth: js.UndefOr[String] = js.native
      
      var email: js.UndefOr[String] = js.native
      
      var password: js.UndefOr[String] = js.native
      
      var scope: String = js.native
      
      var token: js.UndefOr[String] = js.native
      
      var username: js.UndefOr[String] = js.native
    }
    object Credentials {
      
      @scala.inline
      def apply(scope: String): Credentials = {
        val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
        __obj.asInstanceOf[Credentials]
      }
      
      @scala.inline
      implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    type Dictionary[T] = StringDictionary[T]
    
    type ErrorCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
    
    type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[T], Unit]
    
    @js.native
    trait Spinner extends StObject {
      
      var int: String = js.native
      
      def start(): Unit = js.native
      
      var started: Boolean = js.native
      
      def stop(): Unit = js.native
    }
    object Spinner {
      
      @scala.inline
      def apply(int: String, start: () => Unit, started: Boolean, stop: () => Unit): Spinner = {
        val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[Spinner]
      }
      
      @scala.inline
      implicit class SpinnerMutableBuilder[Self <: Spinner] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInt(value: String): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Static extends EventEmitter {
      
      var abbrevs: Dictionary[String] = js.native
      
      var bin: String = js.native
      
      var cache: String = js.native
      
      var commands: Commands = js.native
      
      var config: Config = js.native
      
      def deref(command: String): String = js.native
      
      var dir: String = js.native
      
      var fullList: js.Array[String] = js.native
      
      var globalBin: String = js.native
      
      var globalDir: String = js.native
      
      def load(callback: SimpleCallback[Config]): Unit = js.native
      def load(cli: ConfigOptions): Unit = js.native
      def load(cli: ConfigOptions, callback: SimpleCallback[Config]): Unit = js.native
      
      var prefix: String = js.native
      
      var rollbacks: js.Array[_] = js.native
      
      var root: String = js.native
      
      var spinner: Spinner = js.native
      
      var tmp: String = js.native
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
