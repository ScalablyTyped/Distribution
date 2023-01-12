package typings.npm

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npm", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  type CommandCallback = js.Function5[
    /* err */ js.UndefOr[js.Error], 
    /* result */ js.UndefOr[Any], 
    /* result2 */ js.UndefOr[Any], 
    /* result3 */ js.UndefOr[Any], 
    /* result4 */ js.UndefOr[Any], 
    Unit
  ]
  
  type CommandFunction = js.Function2[/* args */ js.Array[String], /* callback */ CommandCallback, Unit]
  
  @js.native
  trait Commands extends StObject {
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-access */
    def access(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-access */
    @JSName("access")
    var access_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-audit */
    def audit(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-audit */
    @JSName("audit")
    var audit_Original: CommandFunction = js.native
    
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
    
    // plumbing
    def build(args: js.Array[String], callback: CommandCallback): Unit = js.native
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-ci */
    def ci(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-ci */
    @JSName("ci")
    var ci_Original: CommandFunction = js.native
    
    /**
      * Alias for `install-ci-test`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-install-ci-test
      */
    def cit(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /**
      * Alias for `install-ci-test`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-install-ci-test
      */
    @JSName("cit")
    var cit_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-diff */
    def diff(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-diff */
    @JSName("diff")
    var diff_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-dist-tag */
    def `dist-tag`(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-dist-tag */
    @JSName("dist-tag")
    var `dist-tag_Original`: CommandFunction = js.native
    
    // dedupe
    /**
      * Alias for `dist-tag`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-dist-tag
      */
    def `dist-tags`(args: js.Array[String], callback: CommandCallback): Unit = js.native
    // dedupe
    /**
      * Alias for `dist-tag`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-dist-tag
      */
    @JSName("dist-tags")
    var `dist-tags_Original`: CommandFunction = js.native
    
    def docs(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("docs")
    var docs_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-doctor */
    def doctor(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-doctor */
    @JSName("doctor")
    var doctor_Original: CommandFunction = js.native
    
    def edit(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("edit")
    var edit_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-exec */
    def exec(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-exec */
    @JSName("exec")
    var exec_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-explain */
    def explain(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-explain */
    @JSName("explain")
    var explain_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-fund */
    def fund(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-fund */
    @JSName("fund")
    var fund_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-hook */
    def hook(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-hook */
    @JSName("hook")
    var hook_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-install-ci-test */
    def `install-ci-test`(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-install-ci-test */
    @JSName("install-ci-test")
    var `install-ci-test_Original`: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-install-test */
    def `install-test`(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-install-test */
    @JSName("install-test")
    var `install-test_Original`: CommandFunction = js.native
    
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
    
    /**
      * Alias for `install-test`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-install-test
      */
    def it(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /**
      * Alias for `install-test`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-install-test
      */
    @JSName("it")
    var it_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-logout */
    def logout(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-logout */
    @JSName("logout")
    var logout_Original: CommandFunction = js.native
    
    // help
    def long(args: js.Array[String], callback: CommandCallback): Unit = js.native
    // help
    @JSName("long")
    var long_Original: CommandFunction = js.native
    
    def ls(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("ls")
    var ls_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-org */
    @JSName("org")
    def org_(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-org */
    @JSName("org")
    var org_Original: CommandFunction = js.native
    
    def outdated(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("outdated")
    var outdated_Original: CommandFunction = js.native
    
    def owner(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("owner")
    var owner_Original: CommandFunction = js.native
    
    def pack(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("pack")
    var pack_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-ping */
    def ping(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-ping */
    @JSName("ping")
    var ping_Original: CommandFunction = js.native
    
    def prefix(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("prefix")
    var prefix_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-profile */
    def profile(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-profile */
    @JSName("profile")
    var profile_Original: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-set-script */
    def `set-script`(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-set-script */
    @JSName("set-script")
    var `set-script_Original`: CommandFunction = js.native
    
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
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-team */
    def team(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-team */
    @JSName("team")
    var team_Original: CommandFunction = js.native
    
    def test(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("test")
    var test_Original: CommandFunction = js.native
    
    /** https://docs.npmjs.com/cli/v7/commands/npm-token */
    def token(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /** https://docs.npmjs.com/cli/v7/commands/npm-token */
    @JSName("token")
    var token_Original: CommandFunction = js.native
    
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
    
    /**
      * Alias for `explain`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-dist-tag
      */
    def why(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /**
      * Alias for `explain`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-dist-tag
      */
    @JSName("why")
    var why_Original: CommandFunction = js.native
    
    /**
      * Alias for `exec`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-exec
      */
    def x(args: js.Array[String], callback: CommandCallback): Unit = js.native
    /**
      * Alias for `exec`
      *
      * https://docs.npmjs.com/cli/v7/commands/npm-exec
      */
    @JSName("x")
    var x_Original: CommandFunction = js.native
    
    def xmas(args: js.Array[String], callback: CommandCallback): Unit = js.native
    @JSName("xmas")
    var xmas_Original: CommandFunction = js.native
  }
  
  trait Config extends StObject {
    
    def Conf(base: Config): Config
    @JSName("Conf")
    var Conf_Original: ConfigStatic
    
    def add(data: js.Object, marker: js.Object): Any
    
    def addEnv(env: Dictionary[String]): Any
    
    def addFile(file: String, name: String): Config
    
    var defs: ConfigDefs
    
    def findPrefix(prefix: String, cb: SimpleCallback[String]): Unit
    
    def get(setting: String): Any
    
    def getCredentialsByURI(uri: String): Credentials
    
    def loadCAFile(caFilePath: String, cb: ErrorCallback): Unit
    
    def loadExtras(cb: ErrorCallback): Unit
    
    def loadPrefix(cb: ErrorCallback): Unit
    
    def loadUid(cb: SimpleCallback[String]): Unit
    
    var loaded: Boolean
    
    def parse(content: String, file: String): Any
    
    var root: js.UndefOr[Config] = js.undefined
    
    var rootConf: Config
    
    def save(where: String, cb: ErrorCallback): Config
    
    def set(setting: String, value: Any): Unit
    
    def setCredentialsByURI(uri: String, cred: Credentials): Unit
    
    def setUser(cb: ErrorCallback): Unit
    
    var sources: Dictionary[ConfigSource]
    
    var usingBuiltin: Boolean
  }
  object Config {
    
    inline def apply(
      Conf: ConfigStatic,
      add: (js.Object, js.Object) => Any,
      addEnv: Dictionary[String] => Any,
      addFile: (String, String) => Config,
      defs: ConfigDefs,
      findPrefix: (String, SimpleCallback[String]) => Unit,
      get: String => Any,
      getCredentialsByURI: String => Credentials,
      loadCAFile: (String, ErrorCallback) => Unit,
      loadExtras: ErrorCallback => Unit,
      loadPrefix: ErrorCallback => Unit,
      loadUid: SimpleCallback[String] => Unit,
      loaded: Boolean,
      parse: (String, String) => Any,
      rootConf: Config,
      save: (String, ErrorCallback) => Config,
      set: (String, Any) => Unit,
      setCredentialsByURI: (String, Credentials) => Unit,
      setUser: ErrorCallback => Unit,
      sources: Dictionary[ConfigSource],
      usingBuiltin: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(Conf = Conf.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), addEnv = js.Any.fromFunction1(addEnv), addFile = js.Any.fromFunction2(addFile), defs = defs.asInstanceOf[js.Any], findPrefix = js.Any.fromFunction2(findPrefix), get = js.Any.fromFunction1(get), getCredentialsByURI = js.Any.fromFunction1(getCredentialsByURI), loadCAFile = js.Any.fromFunction2(loadCAFile), loadExtras = js.Any.fromFunction1(loadExtras), loadPrefix = js.Any.fromFunction1(loadPrefix), loadUid = js.Any.fromFunction1(loadUid), loaded = loaded.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), rootConf = rootConf.asInstanceOf[js.Any], save = js.Any.fromFunction2(save), set = js.Any.fromFunction2(set), setCredentialsByURI = js.Any.fromFunction2(setCredentialsByURI), setUser = js.Any.fromFunction1(setUser), sources = sources.asInstanceOf[js.Any], usingBuiltin = usingBuiltin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (js.Object, js.Object) => Any): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddEnv(value: Dictionary[String] => Any): Self = StObject.set(x, "addEnv", js.Any.fromFunction1(value))
      
      inline def setAddFile(value: (String, String) => Config): Self = StObject.set(x, "addFile", js.Any.fromFunction2(value))
      
      inline def setConf(value: ConfigStatic): Self = StObject.set(x, "Conf", value.asInstanceOf[js.Any])
      
      inline def setDefs(value: ConfigDefs): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setFindPrefix(value: (String, SimpleCallback[String]) => Unit): Self = StObject.set(x, "findPrefix", js.Any.fromFunction2(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetCredentialsByURI(value: String => Credentials): Self = StObject.set(x, "getCredentialsByURI", js.Any.fromFunction1(value))
      
      inline def setLoadCAFile(value: (String, ErrorCallback) => Unit): Self = StObject.set(x, "loadCAFile", js.Any.fromFunction2(value))
      
      inline def setLoadExtras(value: ErrorCallback => Unit): Self = StObject.set(x, "loadExtras", js.Any.fromFunction1(value))
      
      inline def setLoadPrefix(value: ErrorCallback => Unit): Self = StObject.set(x, "loadPrefix", js.Any.fromFunction1(value))
      
      inline def setLoadUid(value: SimpleCallback[String] => Unit): Self = StObject.set(x, "loadUid", js.Any.fromFunction1(value))
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setParse(value: (String, String) => Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setRoot(value: Config): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootConf(value: Config): Self = StObject.set(x, "rootConf", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSave(value: (String, ErrorCallback) => Config): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetCredentialsByURI(value: (String, Credentials) => Unit): Self = StObject.set(x, "setCredentialsByURI", js.Any.fromFunction2(value))
      
      inline def setSetUser(value: ErrorCallback => Unit): Self = StObject.set(x, "setUser", js.Any.fromFunction1(value))
      
      inline def setSources(value: Dictionary[ConfigSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setUsingBuiltin(value: Boolean): Self = StObject.set(x, "usingBuiltin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigDefs extends StObject {
    
    var defaults: ConfigOptions
    
    var types: ConfigTypes
  }
  object ConfigDefs {
    
    inline def apply(defaults: ConfigOptions, types: ConfigTypes): ConfigDefs = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigDefs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigDefs] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: ConfigOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: ConfigTypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigOptions extends StObject {
    
    var _exit: js.UndefOr[Boolean] = js.undefined
    
    var `always-auth`: js.UndefOr[Boolean] = js.undefined
    
    var `bin-links`: js.UndefOr[Boolean] = js.undefined
    
    var browser: js.UndefOr[String] = js.undefined
    
    var ca: js.UndefOr[Any] = js.undefined
    
    var cache: js.UndefOr[String] = js.undefined
    
    var `cache-lock-retries`: js.UndefOr[Double] = js.undefined
    
    var `cache-lock-stale`: js.UndefOr[Double] = js.undefined
    
    var `cache-lock-wait`: js.UndefOr[Double] = js.undefined
    
    var `cache-max`: js.UndefOr[Double] = js.undefined
    
    var `cache-min`: js.UndefOr[Double] = js.undefined
    
    // string | string[]
    var cafile: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[Any] = js.undefined
    
    // boolean | string ("always")
    var depth: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[Boolean] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var editor: js.UndefOr[String] = js.undefined
    
    var `engine-strict`: js.UndefOr[Boolean] = js.undefined
    
    var `fetch-retries`: js.UndefOr[Double] = js.undefined
    
    var `fetch-retry-factor`: js.UndefOr[Double] = js.undefined
    
    var `fetch-retry-maxtimeout`: js.UndefOr[Double] = js.undefined
    
    var `fetch-retry-mintimeout`: js.UndefOr[Double] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var git: js.UndefOr[String] = js.undefined
    
    var `git-tag-version`: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var globalconfig: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[Any] = js.undefined
    
    // number | string
    var heading: js.UndefOr[String] = js.undefined
    
    // boolean | string
    var `https-proxy`: js.UndefOr[String] = js.undefined
    
    var `ignore-scripts`: js.UndefOr[Boolean] = js.undefined
    
    var `init-module`: js.UndefOr[String] = js.undefined
    
    @JSName("init.author.email")
    var initDotauthorDotemail: js.UndefOr[String] = js.undefined
    
    @JSName("init.author.name")
    var initDotauthorDotname: js.UndefOr[String] = js.undefined
    
    @JSName("init.author.url")
    var initDotauthorDoturl: js.UndefOr[String] = js.undefined
    
    @JSName("init.license")
    var initDotlicense: js.UndefOr[String] = js.undefined
    
    @JSName("init.version")
    var initDotversion: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[Boolean] = js.undefined
    
    var `local-address`: js.UndefOr[String] = js.undefined
    
    var loglevel: js.UndefOr[String] = js.undefined
    
    var logstream: js.UndefOr[ReadWriteStream] = js.undefined
    
    var long: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var `node-version`: js.UndefOr[String] = js.undefined
    
    var npat: js.UndefOr[Boolean] = js.undefined
    
    var `onload-script`: js.UndefOr[Boolean] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var parseable: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var production: js.UndefOr[Boolean] = js.undefined
    
    var `proprietary-attribs`: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var `rebuild-bundle`: js.UndefOr[Boolean] = js.undefined
    
    var registry: js.UndefOr[String] = js.undefined
    
    var rollback: js.UndefOr[Boolean] = js.undefined
    
    var save: js.UndefOr[Boolean] = js.undefined
    
    var `save-bundle`: js.UndefOr[Boolean] = js.undefined
    
    var `save-dev`: js.UndefOr[Boolean] = js.undefined
    
    var `save-exact`: js.UndefOr[Boolean] = js.undefined
    
    var `save-optional`: js.UndefOr[Boolean] = js.undefined
    
    var `save-prefix`: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var searchexclude: js.UndefOr[String] = js.undefined
    
    var searchopts: js.UndefOr[String] = js.undefined
    
    var searchsort: js.UndefOr[String] = js.undefined
    
    var shell: js.UndefOr[String] = js.undefined
    
    var shrinkwrap: js.UndefOr[Boolean] = js.undefined
    
    var `sign-git-tag`: js.UndefOr[Boolean] = js.undefined
    
    var spin: js.UndefOr[Any] = js.undefined
    
    // boolean | string ("always")
    var `strict-ssl`: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var tmp: js.UndefOr[String] = js.undefined
    
    var umask: js.UndefOr[Double] = js.undefined
    
    var unicode: js.UndefOr[Boolean] = js.undefined
    
    var `unsafe-perm`: js.UndefOr[Boolean] = js.undefined
    
    var usage: js.UndefOr[Boolean] = js.undefined
    
    var user: js.UndefOr[Any] = js.undefined
    
    var `user-agent`: js.UndefOr[String] = js.undefined
    
    // string | number
    var userconfig: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Boolean] = js.undefined
    
    var versions: js.UndefOr[Boolean] = js.undefined
    
    var viewer: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def `setAlways-auth`(value: Boolean): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
      
      inline def `setAlways-authUndefined`: Self = StObject.set(x, "always-auth", js.undefined)
      
      inline def `setBin-links`(value: Boolean): Self = StObject.set(x, "bin-links", value.asInstanceOf[js.Any])
      
      inline def `setBin-linksUndefined`: Self = StObject.set(x, "bin-links", js.undefined)
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setCa(value: Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-retries`(value: Double): Self = StObject.set(x, "cache-lock-retries", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-retriesUndefined`: Self = StObject.set(x, "cache-lock-retries", js.undefined)
      
      inline def `setCache-lock-stale`(value: Double): Self = StObject.set(x, "cache-lock-stale", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-staleUndefined`: Self = StObject.set(x, "cache-lock-stale", js.undefined)
      
      inline def `setCache-lock-wait`(value: Double): Self = StObject.set(x, "cache-lock-wait", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-waitUndefined`: Self = StObject.set(x, "cache-lock-wait", js.undefined)
      
      inline def `setCache-max`(value: Double): Self = StObject.set(x, "cache-max", value.asInstanceOf[js.Any])
      
      inline def `setCache-maxUndefined`: Self = StObject.set(x, "cache-max", js.undefined)
      
      inline def `setCache-min`(value: Double): Self = StObject.set(x, "cache-min", value.asInstanceOf[js.Any])
      
      inline def `setCache-minUndefined`: Self = StObject.set(x, "cache-min", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCafile(value: String): Self = StObject.set(x, "cafile", value.asInstanceOf[js.Any])
      
      inline def setCafileUndefined: Self = StObject.set(x, "cafile", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def `setEngine-strict`(value: Boolean): Self = StObject.set(x, "engine-strict", value.asInstanceOf[js.Any])
      
      inline def `setEngine-strictUndefined`: Self = StObject.set(x, "engine-strict", js.undefined)
      
      inline def `setFetch-retries`(value: Double): Self = StObject.set(x, "fetch-retries", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retriesUndefined`: Self = StObject.set(x, "fetch-retries", js.undefined)
      
      inline def `setFetch-retry-factor`(value: Double): Self = StObject.set(x, "fetch-retry-factor", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retry-factorUndefined`: Self = StObject.set(x, "fetch-retry-factor", js.undefined)
      
      inline def `setFetch-retry-maxtimeout`(value: Double): Self = StObject.set(x, "fetch-retry-maxtimeout", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retry-maxtimeoutUndefined`: Self = StObject.set(x, "fetch-retry-maxtimeout", js.undefined)
      
      inline def `setFetch-retry-mintimeout`(value: Double): Self = StObject.set(x, "fetch-retry-mintimeout", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retry-mintimeoutUndefined`: Self = StObject.set(x, "fetch-retry-mintimeout", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def `setGit-tag-version`(value: Boolean): Self = StObject.set(x, "git-tag-version", value.asInstanceOf[js.Any])
      
      inline def `setGit-tag-versionUndefined`: Self = StObject.set(x, "git-tag-version", js.undefined)
      
      inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setGlobalconfig(value: String): Self = StObject.set(x, "globalconfig", value.asInstanceOf[js.Any])
      
      inline def setGlobalconfigUndefined: Self = StObject.set(x, "globalconfig", js.undefined)
      
      inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def `setHttps-proxy`(value: String): Self = StObject.set(x, "https-proxy", value.asInstanceOf[js.Any])
      
      inline def `setHttps-proxyUndefined`: Self = StObject.set(x, "https-proxy", js.undefined)
      
      inline def `setIgnore-scripts`(value: Boolean): Self = StObject.set(x, "ignore-scripts", value.asInstanceOf[js.Any])
      
      inline def `setIgnore-scriptsUndefined`: Self = StObject.set(x, "ignore-scripts", js.undefined)
      
      inline def `setInit-module`(value: String): Self = StObject.set(x, "init-module", value.asInstanceOf[js.Any])
      
      inline def `setInit-moduleUndefined`: Self = StObject.set(x, "init-module", js.undefined)
      
      inline def setInitDotauthorDotemail(value: String): Self = StObject.set(x, "init.author.email", value.asInstanceOf[js.Any])
      
      inline def setInitDotauthorDotemailUndefined: Self = StObject.set(x, "init.author.email", js.undefined)
      
      inline def setInitDotauthorDotname(value: String): Self = StObject.set(x, "init.author.name", value.asInstanceOf[js.Any])
      
      inline def setInitDotauthorDotnameUndefined: Self = StObject.set(x, "init.author.name", js.undefined)
      
      inline def setInitDotauthorDoturl(value: String): Self = StObject.set(x, "init.author.url", value.asInstanceOf[js.Any])
      
      inline def setInitDotauthorDoturlUndefined: Self = StObject.set(x, "init.author.url", js.undefined)
      
      inline def setInitDotlicense(value: String): Self = StObject.set(x, "init.license", value.asInstanceOf[js.Any])
      
      inline def setInitDotlicenseUndefined: Self = StObject.set(x, "init.license", js.undefined)
      
      inline def setInitDotversion(value: String): Self = StObject.set(x, "init.version", value.asInstanceOf[js.Any])
      
      inline def setInitDotversionUndefined: Self = StObject.set(x, "init.version", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def `setLocal-address`(value: String): Self = StObject.set(x, "local-address", value.asInstanceOf[js.Any])
      
      inline def `setLocal-addressUndefined`: Self = StObject.set(x, "local-address", js.undefined)
      
      inline def setLoglevel(value: String): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
      
      inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
      
      inline def setLogstream(value: ReadWriteStream): Self = StObject.set(x, "logstream", value.asInstanceOf[js.Any])
      
      inline def setLogstreamUndefined: Self = StObject.set(x, "logstream", js.undefined)
      
      inline def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def `setNode-version`(value: String): Self = StObject.set(x, "node-version", value.asInstanceOf[js.Any])
      
      inline def `setNode-versionUndefined`: Self = StObject.set(x, "node-version", js.undefined)
      
      inline def setNpat(value: Boolean): Self = StObject.set(x, "npat", value.asInstanceOf[js.Any])
      
      inline def setNpatUndefined: Self = StObject.set(x, "npat", js.undefined)
      
      inline def `setOnload-script`(value: Boolean): Self = StObject.set(x, "onload-script", value.asInstanceOf[js.Any])
      
      inline def `setOnload-scriptUndefined`: Self = StObject.set(x, "onload-script", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setParseable(value: Boolean): Self = StObject.set(x, "parseable", value.asInstanceOf[js.Any])
      
      inline def setParseableUndefined: Self = StObject.set(x, "parseable", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def `setProprietary-attribs`(value: Boolean): Self = StObject.set(x, "proprietary-attribs", value.asInstanceOf[js.Any])
      
      inline def `setProprietary-attribsUndefined`: Self = StObject.set(x, "proprietary-attribs", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def `setRebuild-bundle`(value: Boolean): Self = StObject.set(x, "rebuild-bundle", value.asInstanceOf[js.Any])
      
      inline def `setRebuild-bundleUndefined`: Self = StObject.set(x, "rebuild-bundle", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setRollback(value: Boolean): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
      
      inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def `setSave-bundle`(value: Boolean): Self = StObject.set(x, "save-bundle", value.asInstanceOf[js.Any])
      
      inline def `setSave-bundleUndefined`: Self = StObject.set(x, "save-bundle", js.undefined)
      
      inline def `setSave-dev`(value: Boolean): Self = StObject.set(x, "save-dev", value.asInstanceOf[js.Any])
      
      inline def `setSave-devUndefined`: Self = StObject.set(x, "save-dev", js.undefined)
      
      inline def `setSave-exact`(value: Boolean): Self = StObject.set(x, "save-exact", value.asInstanceOf[js.Any])
      
      inline def `setSave-exactUndefined`: Self = StObject.set(x, "save-exact", js.undefined)
      
      inline def `setSave-optional`(value: Boolean): Self = StObject.set(x, "save-optional", value.asInstanceOf[js.Any])
      
      inline def `setSave-optionalUndefined`: Self = StObject.set(x, "save-optional", js.undefined)
      
      inline def `setSave-prefix`(value: String): Self = StObject.set(x, "save-prefix", value.asInstanceOf[js.Any])
      
      inline def `setSave-prefixUndefined`: Self = StObject.set(x, "save-prefix", js.undefined)
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSearchexclude(value: String): Self = StObject.set(x, "searchexclude", value.asInstanceOf[js.Any])
      
      inline def setSearchexcludeUndefined: Self = StObject.set(x, "searchexclude", js.undefined)
      
      inline def setSearchopts(value: String): Self = StObject.set(x, "searchopts", value.asInstanceOf[js.Any])
      
      inline def setSearchoptsUndefined: Self = StObject.set(x, "searchopts", js.undefined)
      
      inline def setSearchsort(value: String): Self = StObject.set(x, "searchsort", value.asInstanceOf[js.Any])
      
      inline def setSearchsortUndefined: Self = StObject.set(x, "searchsort", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setShrinkwrap(value: Boolean): Self = StObject.set(x, "shrinkwrap", value.asInstanceOf[js.Any])
      
      inline def setShrinkwrapUndefined: Self = StObject.set(x, "shrinkwrap", js.undefined)
      
      inline def `setSign-git-tag`(value: Boolean): Self = StObject.set(x, "sign-git-tag", value.asInstanceOf[js.Any])
      
      inline def `setSign-git-tagUndefined`: Self = StObject.set(x, "sign-git-tag", js.undefined)
      
      inline def setSpin(value: Any): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      inline def `setStrict-ssl`(value: Boolean): Self = StObject.set(x, "strict-ssl", value.asInstanceOf[js.Any])
      
      inline def `setStrict-sslUndefined`: Self = StObject.set(x, "strict-ssl", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
      
      inline def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      inline def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      inline def `setUnsafe-perm`(value: Boolean): Self = StObject.set(x, "unsafe-perm", value.asInstanceOf[js.Any])
      
      inline def `setUnsafe-permUndefined`: Self = StObject.set(x, "unsafe-perm", js.undefined)
      
      inline def setUsage(value: Boolean): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def `setUser-agent`(value: String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      inline def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setUserconfig(value: String): Self = StObject.set(x, "userconfig", value.asInstanceOf[js.Any])
      
      inline def setUserconfigUndefined: Self = StObject.set(x, "userconfig", js.undefined)
      
      inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVersions(value: Boolean): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
      
      inline def setViewer(value: String): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
      
      inline def setViewerUndefined: Self = StObject.set(x, "viewer", js.undefined)
      
      inline def set_exit(value: Boolean): Self = StObject.set(x, "_exit", value.asInstanceOf[js.Any])
      
      inline def set_exitUndefined: Self = StObject.set(x, "_exit", js.undefined)
    }
  }
  
  trait ConfigShorthands extends StObject {
    
    var B: js.Array[Any]
    
    var C: js.Array[Any]
    
    var D: js.Array[Any]
    
    var E: js.Array[Any]
    
    var H: js.Array[Any]
    
    var N: js.Array[Any]
    
    var O: js.Array[Any]
    
    @JSName("?")
    var Questionmark: js.Array[Any]
    
    var S: js.Array[Any]
    
    var d: js.Array[Any]
    
    var dd: js.Array[Any]
    
    var ddd: js.Array[Any]
    
    var desc: js.Array[Any]
    
    var f: js.Array[Any]
    
    var g: js.Array[Any]
    
    var gangsta: js.Array[Any]
    
    var gangster: js.Array[Any]
    
    var h: js.Array[Any]
    
    var help: js.Array[Any]
    
    var l: js.Array[Any]
    
    var local: js.Array[Any]
    
    var m: js.Array[Any]
    
    var n: js.Array[Any]
    
    var `no-desc`: js.Array[Any]
    
    var `no-reg`: js.Array[Any]
    
    var noreg: js.Array[Any]
    
    var p: js.Array[Any]
    
    var porcelain: js.Array[Any]
    
    var q: js.Array[Any]
    
    var quiet: js.Array[Any]
    
    var reg: js.Array[Any]
    
    var s: js.Array[Any]
    
    var silent: js.Array[Any]
    
    var v: js.Array[Any]
    
    var verbose: js.Array[Any]
    
    var y: js.Array[Any]
  }
  object ConfigShorthands {
    
    inline def apply(
      B: js.Array[Any],
      C: js.Array[Any],
      D: js.Array[Any],
      E: js.Array[Any],
      H: js.Array[Any],
      N: js.Array[Any],
      O: js.Array[Any],
      Questionmark: js.Array[Any],
      S: js.Array[Any],
      d: js.Array[Any],
      dd: js.Array[Any],
      ddd: js.Array[Any],
      desc: js.Array[Any],
      f: js.Array[Any],
      g: js.Array[Any],
      gangsta: js.Array[Any],
      gangster: js.Array[Any],
      h: js.Array[Any],
      help: js.Array[Any],
      l: js.Array[Any],
      local: js.Array[Any],
      m: js.Array[Any],
      n: js.Array[Any],
      `no-desc`: js.Array[Any],
      `no-reg`: js.Array[Any],
      noreg: js.Array[Any],
      p: js.Array[Any],
      porcelain: js.Array[Any],
      q: js.Array[Any],
      quiet: js.Array[Any],
      reg: js.Array[Any],
      s: js.Array[Any],
      silent: js.Array[Any],
      v: js.Array[Any],
      verbose: js.Array[Any],
      y: js.Array[Any]
    ): ConfigShorthands = {
      val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], gangsta = gangsta.asInstanceOf[js.Any], gangster = gangster.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], noreg = noreg.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], porcelain = porcelain.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("?")(Questionmark.asInstanceOf[js.Any])
      __obj.updateDynamic("no-desc")(`no-desc`.asInstanceOf[js.Any])
      __obj.updateDynamic("no-reg")(`no-reg`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigShorthands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigShorthands] (val x: Self) extends AnyVal {
      
      inline def setB(value: js.Array[Any]): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: Any*): Self = StObject.set(x, "B", js.Array(value*))
      
      inline def setC(value: js.Array[Any]): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCVarargs(value: Any*): Self = StObject.set(x, "C", js.Array(value*))
      
      inline def setD(value: js.Array[Any]): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setDVarargs(value: Any*): Self = StObject.set(x, "D", js.Array(value*))
      
      inline def setDd(value: js.Array[Any]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDdVarargs(value: Any*): Self = StObject.set(x, "dd", js.Array(value*))
      
      inline def setDdd(value: js.Array[Any]): Self = StObject.set(x, "ddd", value.asInstanceOf[js.Any])
      
      inline def setDddVarargs(value: Any*): Self = StObject.set(x, "ddd", js.Array(value*))
      
      inline def setDesc(value: js.Array[Any]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescVarargs(value: Any*): Self = StObject.set(x, "desc", js.Array(value*))
      
      inline def setE(value: js.Array[Any]): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setEVarargs(value: Any*): Self = StObject.set(x, "E", js.Array(value*))
      
      inline def setF(value: js.Array[Any]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFVarargs(value: Any*): Self = StObject.set(x, "f", js.Array(value*))
      
      inline def setG(value: js.Array[Any]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGVarargs(value: Any*): Self = StObject.set(x, "g", js.Array(value*))
      
      inline def setGangsta(value: js.Array[Any]): Self = StObject.set(x, "gangsta", value.asInstanceOf[js.Any])
      
      inline def setGangstaVarargs(value: Any*): Self = StObject.set(x, "gangsta", js.Array(value*))
      
      inline def setGangster(value: js.Array[Any]): Self = StObject.set(x, "gangster", value.asInstanceOf[js.Any])
      
      inline def setGangsterVarargs(value: Any*): Self = StObject.set(x, "gangster", js.Array(value*))
      
      inline def setH(value: js.Array[Any]): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      inline def setHVarargs(value: Any*): Self = StObject.set(x, "H", js.Array(value*))
      
      inline def setHelp(value: js.Array[Any]): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpVarargs(value: Any*): Self = StObject.set(x, "help", js.Array(value*))
      
      inline def setL(value: js.Array[Any]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLVarargs(value: Any*): Self = StObject.set(x, "l", js.Array(value*))
      
      inline def setLocal(value: js.Array[Any]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalVarargs(value: Any*): Self = StObject.set(x, "local", js.Array(value*))
      
      inline def setM(value: js.Array[Any]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMVarargs(value: Any*): Self = StObject.set(x, "m", js.Array(value*))
      
      inline def setN(value: js.Array[Any]): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNVarargs(value: Any*): Self = StObject.set(x, "N", js.Array(value*))
      
      inline def `setNo-desc`(value: js.Array[Any]): Self = StObject.set(x, "no-desc", value.asInstanceOf[js.Any])
      
      inline def `setNo-descVarargs`(value: Any*): Self = StObject.set(x, "no-desc", js.Array(value*))
      
      inline def `setNo-reg`(value: js.Array[Any]): Self = StObject.set(x, "no-reg", value.asInstanceOf[js.Any])
      
      inline def `setNo-regVarargs`(value: Any*): Self = StObject.set(x, "no-reg", js.Array(value*))
      
      inline def setNoreg(value: js.Array[Any]): Self = StObject.set(x, "noreg", value.asInstanceOf[js.Any])
      
      inline def setNoregVarargs(value: Any*): Self = StObject.set(x, "noreg", js.Array(value*))
      
      inline def setO(value: js.Array[Any]): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
      
      inline def setOVarargs(value: Any*): Self = StObject.set(x, "O", js.Array(value*))
      
      inline def setP(value: js.Array[Any]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: Any*): Self = StObject.set(x, "p", js.Array(value*))
      
      inline def setPorcelain(value: js.Array[Any]): Self = StObject.set(x, "porcelain", value.asInstanceOf[js.Any])
      
      inline def setPorcelainVarargs(value: Any*): Self = StObject.set(x, "porcelain", js.Array(value*))
      
      inline def setQ(value: js.Array[Any]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQVarargs(value: Any*): Self = StObject.set(x, "q", js.Array(value*))
      
      inline def setQuestionmark(value: js.Array[Any]): Self = StObject.set(x, "?", value.asInstanceOf[js.Any])
      
      inline def setQuestionmarkVarargs(value: Any*): Self = StObject.set(x, "?", js.Array(value*))
      
      inline def setQuiet(value: js.Array[Any]): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietVarargs(value: Any*): Self = StObject.set(x, "quiet", js.Array(value*))
      
      inline def setReg(value: js.Array[Any]): Self = StObject.set(x, "reg", value.asInstanceOf[js.Any])
      
      inline def setRegVarargs(value: Any*): Self = StObject.set(x, "reg", js.Array(value*))
      
      inline def setS(value: js.Array[Any]): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setSVarargs(value: Any*): Self = StObject.set(x, "S", js.Array(value*))
      
      inline def setSilent(value: js.Array[Any]): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentVarargs(value: Any*): Self = StObject.set(x, "silent", js.Array(value*))
      
      inline def setV(value: js.Array[Any]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setVVarargs(value: Any*): Self = StObject.set(x, "v", js.Array(value*))
      
      inline def setVerbose(value: js.Array[Any]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseVarargs(value: Any*): Self = StObject.set(x, "verbose", js.Array(value*))
      
      inline def setY(value: js.Array[Any]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: Any*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  trait ConfigSource extends StObject {
    
    var path: String
    
    var `type`: String
  }
  object ConfigSource {
    
    inline def apply(path: String, `type`: String): ConfigSource = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigSource] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigStatic
    extends StObject
       with Instantiable1[/* base */ Config, Config] {
    
    def apply(base: Config): Config = js.native
  }
  
  trait ConfigTypes extends StObject {
    
    /* standard es5 */
    def _exit[T](): Boolean
    def _exit[T](value: T): Boolean
    @JSName("_exit")
    var _exit_Original: BooleanConstructor
    
    /* standard es5 */
    def `always-auth`[T](): Boolean
    def `always-auth`[T](value: T): Boolean
    @JSName("always-auth")
    var `always-auth_Original`: BooleanConstructor
    
    /* standard es5 */
    def `bin-links`[T](): Boolean
    def `bin-links`[T](value: T): Boolean
    @JSName("bin-links")
    var `bin-links_Original`: BooleanConstructor
    
    var browser: js.Array[Any]
    
    var ca: js.Array[Any]
    
    /* standard es5 */
    def cache(): String
    def cache(value: Any): String
    
    /* standard es5 */
    def `cache-lock-retries`(): Double
    def `cache-lock-retries`(value: Any): Double
    @JSName("cache-lock-retries")
    var `cache-lock-retries_Original`: NumberConstructor
    
    /* standard es5 */
    def `cache-lock-stale`(): Double
    def `cache-lock-stale`(value: Any): Double
    @JSName("cache-lock-stale")
    var `cache-lock-stale_Original`: NumberConstructor
    
    /* standard es5 */
    def `cache-lock-wait`(): Double
    def `cache-lock-wait`(value: Any): Double
    @JSName("cache-lock-wait")
    var `cache-lock-wait_Original`: NumberConstructor
    
    /* standard es5 */
    def `cache-max`(): Double
    def `cache-max`(value: Any): Double
    @JSName("cache-max")
    var `cache-max_Original`: NumberConstructor
    
    /* standard es5 */
    def `cache-min`(): Double
    def `cache-min`(value: Any): Double
    @JSName("cache-min")
    var `cache-min_Original`: NumberConstructor
    
    @JSName("cache")
    var cache_Original: StringConstructor
    
    /* standard es5 */
    def cafile(): String
    def cafile(value: Any): String
    @JSName("cafile")
    var cafile_Original: StringConstructor
    
    /* standard es5 */
    def cert(): String
    def cert(value: Any): String
    @JSName("cert")
    var cert_Original: StringConstructor
    
    var color: js.Array[Any]
    
    /* standard es5 */
    def depth(): Double
    def depth(value: Any): Double
    @JSName("depth")
    var depth_Original: NumberConstructor
    
    /* standard es5 */
    def description[T](): Boolean
    def description[T](value: T): Boolean
    @JSName("description")
    var description_Original: BooleanConstructor
    
    /* standard es5 */
    def dev[T](): Boolean
    def dev[T](value: T): Boolean
    @JSName("dev")
    var dev_Original: BooleanConstructor
    
    /* standard es5 */
    def editor(): String
    def editor(value: Any): String
    @JSName("editor")
    var editor_Original: StringConstructor
    
    /* standard es5 */
    def `engine-strict`[T](): Boolean
    def `engine-strict`[T](value: T): Boolean
    @JSName("engine-strict")
    var `engine-strict_Original`: BooleanConstructor
    
    /* standard es5 */
    def `fetch-retries`(): Double
    def `fetch-retries`(value: Any): Double
    @JSName("fetch-retries")
    var `fetch-retries_Original`: NumberConstructor
    
    /* standard es5 */
    def `fetch-retry-factor`(): Double
    def `fetch-retry-factor`(value: Any): Double
    @JSName("fetch-retry-factor")
    var `fetch-retry-factor_Original`: NumberConstructor
    
    /* standard es5 */
    def `fetch-retry-maxtimeout`(): Double
    def `fetch-retry-maxtimeout`(value: Any): Double
    @JSName("fetch-retry-maxtimeout")
    var `fetch-retry-maxtimeout_Original`: NumberConstructor
    
    /* standard es5 */
    def `fetch-retry-mintimeout`(): Double
    def `fetch-retry-mintimeout`(value: Any): Double
    @JSName("fetch-retry-mintimeout")
    var `fetch-retry-mintimeout_Original`: NumberConstructor
    
    /* standard es5 */
    def force[T](): Boolean
    def force[T](value: T): Boolean
    @JSName("force")
    var force_Original: BooleanConstructor
    
    /* standard es5 */
    def git(): String
    def git(value: Any): String
    
    /* standard es5 */
    def `git-tag-version`[T](): Boolean
    def `git-tag-version`[T](value: T): Boolean
    @JSName("git-tag-version")
    var `git-tag-version_Original`: BooleanConstructor
    
    @JSName("git")
    var git_Original: StringConstructor
    
    /* standard es5 */
    def global[T](): Boolean
    def global[T](value: T): Boolean
    @JSName("global")
    var global_Original: BooleanConstructor
    
    /* standard es5 */
    def globalconfig(): String
    def globalconfig(value: Any): String
    @JSName("globalconfig")
    var globalconfig_Original: StringConstructor
    
    var group: js.Array[Any]
    
    /* standard es5 */
    def heading(): String
    def heading(value: Any): String
    @JSName("heading")
    var heading_Original: StringConstructor
    
    var `https-proxy`: js.Array[Any]
    
    /* standard es5 */
    def `ignore-scripts`[T](): Boolean
    def `ignore-scripts`[T](value: T): Boolean
    @JSName("ignore-scripts")
    var `ignore-scripts_Original`: BooleanConstructor
    
    /* standard es5 */
    def `init-module`(): String
    def `init-module`(value: Any): String
    @JSName("init-module")
    var `init-module_Original`: StringConstructor
    
    /* standard es5 */
    @JSName("init.author.email")
    def initDotauthorDotemail(): String
    @JSName("init.author.email")
    def initDotauthorDotemail(value: Any): String
    @JSName("init.author.email")
    var initDotauthorDotemail_Original: StringConstructor
    
    /* standard es5 */
    @JSName("init.author.name")
    def initDotauthorDotname(): String
    @JSName("init.author.name")
    def initDotauthorDotname(value: Any): String
    @JSName("init.author.name")
    var initDotauthorDotname_Original: StringConstructor
    
    /* standard es5 */
    @JSName("init.author.url")
    def initDotauthorDoturl(): String
    @JSName("init.author.url")
    def initDotauthorDoturl(value: Any): String
    @JSName("init.author.url")
    var initDotauthorDoturl_Original: StringConstructor
    
    /* standard es5 */
    @JSName("init.license")
    def initDotlicense(): String
    @JSName("init.license")
    def initDotlicense(value: Any): String
    @JSName("init.license")
    var initDotlicense_Original: StringConstructor
    
    /* standard es5 */
    @JSName("init.version")
    def initDotversion(): String
    @JSName("init.version")
    def initDotversion(value: Any): String
    @JSName("init.version")
    var initDotversion_Original: StringConstructor
    
    /* standard es5 */
    def json[T](): Boolean
    def json[T](value: T): Boolean
    @JSName("json")
    var json_Original: BooleanConstructor
    
    var key: js.Array[Any]
    
    /* standard es5 */
    def link[T](): Boolean
    def link[T](value: T): Boolean
    @JSName("link")
    var link_Original: BooleanConstructor
    
    /* standard es5 */
    def `local-address`(): String
    def `local-address`(value: Any): String
    @JSName("local-address")
    var `local-address_Original`: StringConstructor
    
    var loglevel: js.Array[Any]
    
    var logstream: Any
    
    /* standard es5 */
    // typeof stream.Stream
    def long[T](): Boolean
    // typeof stream.Stream
    def long[T](value: T): Boolean
    // typeof stream.Stream
    @JSName("long")
    var long_Original: BooleanConstructor
    
    /* standard es5 */
    def message(): String
    def message(value: Any): String
    @JSName("message")
    var message_Original: StringConstructor
    
    var `node-version`: js.Array[Any]
    
    /* standard es5 */
    def npat[T](): Boolean
    def npat[T](value: T): Boolean
    @JSName("npat")
    var npat_Original: BooleanConstructor
    
    var `onload-script`: js.Array[Any]
    
    /* standard es5 */
    def optional[T](): Boolean
    def optional[T](value: T): Boolean
    @JSName("optional")
    var optional_Original: BooleanConstructor
    
    /* standard es5 */
    def parseable[T](): Boolean
    def parseable[T](value: T): Boolean
    @JSName("parseable")
    var parseable_Original: BooleanConstructor
    
    /* standard es5 */
    def prefix(): String
    def prefix(value: Any): String
    @JSName("prefix")
    var prefix_Original: StringConstructor
    
    /* standard es5 */
    def production[T](): Boolean
    def production[T](value: T): Boolean
    @JSName("production")
    var production_Original: BooleanConstructor
    
    /* standard es5 */
    def `proprietary-attribs`[T](): Boolean
    def `proprietary-attribs`[T](value: T): Boolean
    @JSName("proprietary-attribs")
    var `proprietary-attribs_Original`: BooleanConstructor
    
    var proxy: js.Array[Any]
    
    var `rebuild-bundle`: Boolean
    
    var registry: js.Array[Any]
    
    /* standard es5 */
    def rollback[T](): Boolean
    def rollback[T](value: T): Boolean
    @JSName("rollback")
    var rollback_Original: BooleanConstructor
    
    /* standard es5 */
    def save[T](): Boolean
    def save[T](value: T): Boolean
    
    /* standard es5 */
    def `save-bundle`[T](): Boolean
    def `save-bundle`[T](value: T): Boolean
    @JSName("save-bundle")
    var `save-bundle_Original`: BooleanConstructor
    
    /* standard es5 */
    def `save-dev`[T](): Boolean
    def `save-dev`[T](value: T): Boolean
    @JSName("save-dev")
    var `save-dev_Original`: BooleanConstructor
    
    /* standard es5 */
    def `save-exact`[T](): Boolean
    def `save-exact`[T](value: T): Boolean
    @JSName("save-exact")
    var `save-exact_Original`: BooleanConstructor
    
    /* standard es5 */
    def `save-optional`[T](): Boolean
    def `save-optional`[T](value: T): Boolean
    @JSName("save-optional")
    var `save-optional_Original`: BooleanConstructor
    
    /* standard es5 */
    def `save-prefix`(): String
    def `save-prefix`(value: Any): String
    @JSName("save-prefix")
    var `save-prefix_Original`: StringConstructor
    
    @JSName("save")
    var save_Original: BooleanConstructor
    
    /* standard es5 */
    def scope(): String
    def scope(value: Any): String
    @JSName("scope")
    var scope_Original: StringConstructor
    
    var searchexclude: js.Array[Any]
    
    /* standard es5 */
    def searchopts(): String
    def searchopts(value: Any): String
    @JSName("searchopts")
    var searchopts_Original: StringConstructor
    
    var searchsort: js.Array[Any]
    
    /* standard es5 */
    def shell(): String
    def shell(value: Any): String
    @JSName("shell")
    var shell_Original: StringConstructor
    
    /* standard es5 */
    def shrinkwrap[T](): Boolean
    def shrinkwrap[T](value: T): Boolean
    @JSName("shrinkwrap")
    var shrinkwrap_Original: BooleanConstructor
    
    /* standard es5 */
    def `sign-git-tag`[T](): Boolean
    def `sign-git-tag`[T](value: T): Boolean
    @JSName("sign-git-tag")
    var `sign-git-tag_Original`: BooleanConstructor
    
    var spin: js.Array[Any]
    
    /* standard es5 */
    def `strict-ssl`[T](): Boolean
    def `strict-ssl`[T](value: T): Boolean
    @JSName("strict-ssl")
    var `strict-ssl_Original`: BooleanConstructor
    
    /* standard es5 */
    def tag(): String
    def tag(value: Any): String
    @JSName("tag")
    var tag_Original: StringConstructor
    
    /* standard es5 */
    def tmp(): String
    def tmp(value: Any): String
    @JSName("tmp")
    var tmp_Original: StringConstructor
    
    /* standard es5 */
    def umask(): Double
    def umask(value: Any): Double
    @JSName("umask")
    var umask_Original: NumberConstructor
    
    /* standard es5 */
    def unicode[T](): Boolean
    def unicode[T](value: T): Boolean
    @JSName("unicode")
    var unicode_Original: BooleanConstructor
    
    /* standard es5 */
    def `unsafe-perm`[T](): Boolean
    def `unsafe-perm`[T](value: T): Boolean
    @JSName("unsafe-perm")
    var `unsafe-perm_Original`: BooleanConstructor
    
    /* standard es5 */
    def usage[T](): Boolean
    def usage[T](value: T): Boolean
    @JSName("usage")
    var usage_Original: BooleanConstructor
    
    var user: Any
    
    /* standard es5 */
    def `user-agent`(): String
    def `user-agent`(value: Any): String
    @JSName("user-agent")
    var `user-agent_Original`: StringConstructor
    
    /* standard es5 */
    // String | Number
    def userconfig(): String
    // String | Number
    def userconfig(value: Any): String
    // String | Number
    @JSName("userconfig")
    var userconfig_Original: StringConstructor
    
    /* standard es5 */
    def version[T](): Boolean
    def version[T](value: T): Boolean
    @JSName("version")
    var version_Original: BooleanConstructor
    
    /* standard es5 */
    def versions[T](): Boolean
    def versions[T](value: T): Boolean
    @JSName("versions")
    var versions_Original: BooleanConstructor
    
    /* standard es5 */
    def viewer(): String
    def viewer(value: Any): String
    @JSName("viewer")
    var viewer_Original: StringConstructor
  }
  object ConfigTypes {
    
    inline def apply(
      _exit: BooleanConstructor,
      `always-auth`: BooleanConstructor,
      `bin-links`: BooleanConstructor,
      browser: js.Array[Any],
      ca: js.Array[Any],
      cache: StringConstructor,
      `cache-lock-retries`: NumberConstructor,
      `cache-lock-stale`: NumberConstructor,
      `cache-lock-wait`: NumberConstructor,
      `cache-max`: NumberConstructor,
      `cache-min`: NumberConstructor,
      cafile: StringConstructor,
      cert: StringConstructor,
      color: js.Array[Any],
      depth: NumberConstructor,
      description: BooleanConstructor,
      dev: BooleanConstructor,
      editor: StringConstructor,
      `engine-strict`: BooleanConstructor,
      `fetch-retries`: NumberConstructor,
      `fetch-retry-factor`: NumberConstructor,
      `fetch-retry-maxtimeout`: NumberConstructor,
      `fetch-retry-mintimeout`: NumberConstructor,
      force: BooleanConstructor,
      git: StringConstructor,
      `git-tag-version`: BooleanConstructor,
      global: BooleanConstructor,
      globalconfig: StringConstructor,
      group: js.Array[Any],
      heading: StringConstructor,
      `https-proxy`: js.Array[Any],
      `ignore-scripts`: BooleanConstructor,
      `init-module`: StringConstructor,
      initDotauthorDotemail: StringConstructor,
      initDotauthorDotname: StringConstructor,
      initDotauthorDoturl: StringConstructor,
      initDotlicense: StringConstructor,
      initDotversion: StringConstructor,
      json: BooleanConstructor,
      key: js.Array[Any],
      link: BooleanConstructor,
      `local-address`: StringConstructor,
      loglevel: js.Array[Any],
      logstream: Any,
      long: BooleanConstructor,
      message: StringConstructor,
      `node-version`: js.Array[Any],
      npat: BooleanConstructor,
      `onload-script`: js.Array[Any],
      optional: BooleanConstructor,
      parseable: BooleanConstructor,
      prefix: StringConstructor,
      production: BooleanConstructor,
      `proprietary-attribs`: BooleanConstructor,
      proxy: js.Array[Any],
      `rebuild-bundle`: Boolean,
      registry: js.Array[Any],
      rollback: BooleanConstructor,
      save: BooleanConstructor,
      `save-bundle`: BooleanConstructor,
      `save-dev`: BooleanConstructor,
      `save-exact`: BooleanConstructor,
      `save-optional`: BooleanConstructor,
      `save-prefix`: StringConstructor,
      scope: StringConstructor,
      searchexclude: js.Array[Any],
      searchopts: StringConstructor,
      searchsort: js.Array[Any],
      shell: StringConstructor,
      shrinkwrap: BooleanConstructor,
      `sign-git-tag`: BooleanConstructor,
      spin: js.Array[Any],
      `strict-ssl`: BooleanConstructor,
      tag: StringConstructor,
      tmp: StringConstructor,
      umask: NumberConstructor,
      unicode: BooleanConstructor,
      `unsafe-perm`: BooleanConstructor,
      usage: BooleanConstructor,
      user: Any,
      `user-agent`: StringConstructor,
      userconfig: StringConstructor,
      version: BooleanConstructor,
      versions: BooleanConstructor,
      viewer: StringConstructor
    ): ConfigTypes = {
      val __obj = js.Dynamic.literal(_exit = _exit.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cafile = cafile.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], globalconfig = globalconfig.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], loglevel = loglevel.asInstanceOf[js.Any], logstream = logstream.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], npat = npat.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], parseable = parseable.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], searchexclude = searchexclude.asInstanceOf[js.Any], searchopts = searchopts.asInstanceOf[js.Any], searchsort = searchsort.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], shrinkwrap = shrinkwrap.asInstanceOf[js.Any], spin = spin.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tmp = tmp.asInstanceOf[js.Any], umask = umask.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userconfig = userconfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
      __obj.updateDynamic("always-auth")(`always-auth`.asInstanceOf[js.Any])
      __obj.updateDynamic("bin-links")(`bin-links`.asInstanceOf[js.Any])
      __obj.updateDynamic("cache-lock-retries")(`cache-lock-retries`.asInstanceOf[js.Any])
      __obj.updateDynamic("cache-lock-stale")(`cache-lock-stale`.asInstanceOf[js.Any])
      __obj.updateDynamic("cache-lock-wait")(`cache-lock-wait`.asInstanceOf[js.Any])
      __obj.updateDynamic("cache-max")(`cache-max`.asInstanceOf[js.Any])
      __obj.updateDynamic("cache-min")(`cache-min`.asInstanceOf[js.Any])
      __obj.updateDynamic("engine-strict")(`engine-strict`.asInstanceOf[js.Any])
      __obj.updateDynamic("fetch-retries")(`fetch-retries`.asInstanceOf[js.Any])
      __obj.updateDynamic("fetch-retry-factor")(`fetch-retry-factor`.asInstanceOf[js.Any])
      __obj.updateDynamic("fetch-retry-maxtimeout")(`fetch-retry-maxtimeout`.asInstanceOf[js.Any])
      __obj.updateDynamic("fetch-retry-mintimeout")(`fetch-retry-mintimeout`.asInstanceOf[js.Any])
      __obj.updateDynamic("git-tag-version")(`git-tag-version`.asInstanceOf[js.Any])
      __obj.updateDynamic("https-proxy")(`https-proxy`.asInstanceOf[js.Any])
      __obj.updateDynamic("ignore-scripts")(`ignore-scripts`.asInstanceOf[js.Any])
      __obj.updateDynamic("init-module")(`init-module`.asInstanceOf[js.Any])
      __obj.updateDynamic("init.author.email")(initDotauthorDotemail.asInstanceOf[js.Any])
      __obj.updateDynamic("init.author.name")(initDotauthorDotname.asInstanceOf[js.Any])
      __obj.updateDynamic("init.author.url")(initDotauthorDoturl.asInstanceOf[js.Any])
      __obj.updateDynamic("init.license")(initDotlicense.asInstanceOf[js.Any])
      __obj.updateDynamic("init.version")(initDotversion.asInstanceOf[js.Any])
      __obj.updateDynamic("local-address")(`local-address`.asInstanceOf[js.Any])
      __obj.updateDynamic("node-version")(`node-version`.asInstanceOf[js.Any])
      __obj.updateDynamic("onload-script")(`onload-script`.asInstanceOf[js.Any])
      __obj.updateDynamic("proprietary-attribs")(`proprietary-attribs`.asInstanceOf[js.Any])
      __obj.updateDynamic("rebuild-bundle")(`rebuild-bundle`.asInstanceOf[js.Any])
      __obj.updateDynamic("save-bundle")(`save-bundle`.asInstanceOf[js.Any])
      __obj.updateDynamic("save-dev")(`save-dev`.asInstanceOf[js.Any])
      __obj.updateDynamic("save-exact")(`save-exact`.asInstanceOf[js.Any])
      __obj.updateDynamic("save-optional")(`save-optional`.asInstanceOf[js.Any])
      __obj.updateDynamic("save-prefix")(`save-prefix`.asInstanceOf[js.Any])
      __obj.updateDynamic("sign-git-tag")(`sign-git-tag`.asInstanceOf[js.Any])
      __obj.updateDynamic("strict-ssl")(`strict-ssl`.asInstanceOf[js.Any])
      __obj.updateDynamic("unsafe-perm")(`unsafe-perm`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigTypes] (val x: Self) extends AnyVal {
      
      inline def `setAlways-auth`(value: BooleanConstructor): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
      
      inline def `setBin-links`(value: BooleanConstructor): Self = StObject.set(x, "bin-links", value.asInstanceOf[js.Any])
      
      inline def setBrowser(value: js.Array[Any]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserVarargs(value: Any*): Self = StObject.set(x, "browser", js.Array(value*))
      
      inline def setCa(value: js.Array[Any]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaVarargs(value: Any*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCache(value: StringConstructor): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-retries`(value: NumberConstructor): Self = StObject.set(x, "cache-lock-retries", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-stale`(value: NumberConstructor): Self = StObject.set(x, "cache-lock-stale", value.asInstanceOf[js.Any])
      
      inline def `setCache-lock-wait`(value: NumberConstructor): Self = StObject.set(x, "cache-lock-wait", value.asInstanceOf[js.Any])
      
      inline def `setCache-max`(value: NumberConstructor): Self = StObject.set(x, "cache-max", value.asInstanceOf[js.Any])
      
      inline def `setCache-min`(value: NumberConstructor): Self = StObject.set(x, "cache-min", value.asInstanceOf[js.Any])
      
      inline def setCafile(value: StringConstructor): Self = StObject.set(x, "cafile", value.asInstanceOf[js.Any])
      
      inline def setCert(value: StringConstructor): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setColor(value: js.Array[Any]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorVarargs(value: Any*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setDepth(value: NumberConstructor): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: BooleanConstructor): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDev(value: BooleanConstructor): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setEditor(value: StringConstructor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def `setEngine-strict`(value: BooleanConstructor): Self = StObject.set(x, "engine-strict", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retries`(value: NumberConstructor): Self = StObject.set(x, "fetch-retries", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retry-factor`(value: NumberConstructor): Self = StObject.set(x, "fetch-retry-factor", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retry-maxtimeout`(value: NumberConstructor): Self = StObject.set(x, "fetch-retry-maxtimeout", value.asInstanceOf[js.Any])
      
      inline def `setFetch-retry-mintimeout`(value: NumberConstructor): Self = StObject.set(x, "fetch-retry-mintimeout", value.asInstanceOf[js.Any])
      
      inline def setForce(value: BooleanConstructor): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setGit(value: StringConstructor): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def `setGit-tag-version`(value: BooleanConstructor): Self = StObject.set(x, "git-tag-version", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: BooleanConstructor): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalconfig(value: StringConstructor): Self = StObject.set(x, "globalconfig", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: js.Array[Any]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupVarargs(value: Any*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setHeading(value: StringConstructor): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def `setHttps-proxy`(value: js.Array[Any]): Self = StObject.set(x, "https-proxy", value.asInstanceOf[js.Any])
      
      inline def `setHttps-proxyVarargs`(value: Any*): Self = StObject.set(x, "https-proxy", js.Array(value*))
      
      inline def `setIgnore-scripts`(value: BooleanConstructor): Self = StObject.set(x, "ignore-scripts", value.asInstanceOf[js.Any])
      
      inline def `setInit-module`(value: StringConstructor): Self = StObject.set(x, "init-module", value.asInstanceOf[js.Any])
      
      inline def setInitDotauthorDotemail(value: StringConstructor): Self = StObject.set(x, "init.author.email", value.asInstanceOf[js.Any])
      
      inline def setInitDotauthorDotname(value: StringConstructor): Self = StObject.set(x, "init.author.name", value.asInstanceOf[js.Any])
      
      inline def setInitDotauthorDoturl(value: StringConstructor): Self = StObject.set(x, "init.author.url", value.asInstanceOf[js.Any])
      
      inline def setInitDotlicense(value: StringConstructor): Self = StObject.set(x, "init.license", value.asInstanceOf[js.Any])
      
      inline def setInitDotversion(value: StringConstructor): Self = StObject.set(x, "init.version", value.asInstanceOf[js.Any])
      
      inline def setJson(value: BooleanConstructor): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setKey(value: js.Array[Any]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: Any*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setLink(value: BooleanConstructor): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def `setLocal-address`(value: StringConstructor): Self = StObject.set(x, "local-address", value.asInstanceOf[js.Any])
      
      inline def setLoglevel(value: js.Array[Any]): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
      
      inline def setLoglevelVarargs(value: Any*): Self = StObject.set(x, "loglevel", js.Array(value*))
      
      inline def setLogstream(value: Any): Self = StObject.set(x, "logstream", value.asInstanceOf[js.Any])
      
      inline def setLong(value: BooleanConstructor): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: StringConstructor): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def `setNode-version`(value: js.Array[Any]): Self = StObject.set(x, "node-version", value.asInstanceOf[js.Any])
      
      inline def `setNode-versionVarargs`(value: Any*): Self = StObject.set(x, "node-version", js.Array(value*))
      
      inline def setNpat(value: BooleanConstructor): Self = StObject.set(x, "npat", value.asInstanceOf[js.Any])
      
      inline def `setOnload-script`(value: js.Array[Any]): Self = StObject.set(x, "onload-script", value.asInstanceOf[js.Any])
      
      inline def `setOnload-scriptVarargs`(value: Any*): Self = StObject.set(x, "onload-script", js.Array(value*))
      
      inline def setOptional(value: BooleanConstructor): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setParseable(value: BooleanConstructor): Self = StObject.set(x, "parseable", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: StringConstructor): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setProduction(value: BooleanConstructor): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def `setProprietary-attribs`(value: BooleanConstructor): Self = StObject.set(x, "proprietary-attribs", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: js.Array[Any]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyVarargs(value: Any*): Self = StObject.set(x, "proxy", js.Array(value*))
      
      inline def `setRebuild-bundle`(value: Boolean): Self = StObject.set(x, "rebuild-bundle", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: js.Array[Any]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryVarargs(value: Any*): Self = StObject.set(x, "registry", js.Array(value*))
      
      inline def setRollback(value: BooleanConstructor): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
      
      inline def setSave(value: BooleanConstructor): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def `setSave-bundle`(value: BooleanConstructor): Self = StObject.set(x, "save-bundle", value.asInstanceOf[js.Any])
      
      inline def `setSave-dev`(value: BooleanConstructor): Self = StObject.set(x, "save-dev", value.asInstanceOf[js.Any])
      
      inline def `setSave-exact`(value: BooleanConstructor): Self = StObject.set(x, "save-exact", value.asInstanceOf[js.Any])
      
      inline def `setSave-optional`(value: BooleanConstructor): Self = StObject.set(x, "save-optional", value.asInstanceOf[js.Any])
      
      inline def `setSave-prefix`(value: StringConstructor): Self = StObject.set(x, "save-prefix", value.asInstanceOf[js.Any])
      
      inline def setScope(value: StringConstructor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setSearchexclude(value: js.Array[Any]): Self = StObject.set(x, "searchexclude", value.asInstanceOf[js.Any])
      
      inline def setSearchexcludeVarargs(value: Any*): Self = StObject.set(x, "searchexclude", js.Array(value*))
      
      inline def setSearchopts(value: StringConstructor): Self = StObject.set(x, "searchopts", value.asInstanceOf[js.Any])
      
      inline def setSearchsort(value: js.Array[Any]): Self = StObject.set(x, "searchsort", value.asInstanceOf[js.Any])
      
      inline def setSearchsortVarargs(value: Any*): Self = StObject.set(x, "searchsort", js.Array(value*))
      
      inline def setShell(value: StringConstructor): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShrinkwrap(value: BooleanConstructor): Self = StObject.set(x, "shrinkwrap", value.asInstanceOf[js.Any])
      
      inline def `setSign-git-tag`(value: BooleanConstructor): Self = StObject.set(x, "sign-git-tag", value.asInstanceOf[js.Any])
      
      inline def setSpin(value: js.Array[Any]): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinVarargs(value: Any*): Self = StObject.set(x, "spin", js.Array(value*))
      
      inline def `setStrict-ssl`(value: BooleanConstructor): Self = StObject.set(x, "strict-ssl", value.asInstanceOf[js.Any])
      
      inline def setTag(value: StringConstructor): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTmp(value: StringConstructor): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setUmask(value: NumberConstructor): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: BooleanConstructor): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def `setUnsafe-perm`(value: BooleanConstructor): Self = StObject.set(x, "unsafe-perm", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: BooleanConstructor): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def `setUser-agent`(value: StringConstructor): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      inline def setUserconfig(value: StringConstructor): Self = StObject.set(x, "userconfig", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: BooleanConstructor): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: BooleanConstructor): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setViewer(value: StringConstructor): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
      
      inline def set_exit(value: BooleanConstructor): Self = StObject.set(x, "_exit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var scope: String
    
    var token: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(scope: String): Credentials = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  type SimpleCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  
  trait Spinner extends StObject {
    
    var int: String
    
    def start(): Unit
    
    var started: Boolean
    
    def stop(): Unit
  }
  object Spinner {
    
    inline def apply(int: String, start: () => Unit, started: Boolean, stop: () => Unit): Spinner = {
      val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Spinner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spinner] (val x: Self) extends AnyVal {
      
      inline def setInt(value: String): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Static
    extends StObject
       with EventEmitter {
    
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
    
    def load(): js.Promise[Unit] = js.native
    def load(callback: SimpleCallback[Unit]): js.Promise[Unit] = js.native
    
    var prefix: String = js.native
    
    var rollbacks: js.Array[Any] = js.native
    
    var root: String = js.native
    
    var spinner: Spinner = js.native
    
    var tmp: String = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
