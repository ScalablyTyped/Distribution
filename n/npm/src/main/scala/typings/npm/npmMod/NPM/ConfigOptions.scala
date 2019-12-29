package typings.npm.npmMod.NPM

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var _exit: js.UndefOr[Boolean] = js.undefined
  var `always-auth`: js.UndefOr[Boolean] = js.undefined
  var `bin-links`: js.UndefOr[Boolean] = js.undefined
  var browser: js.UndefOr[String] = js.undefined
  var ca: js.UndefOr[js.Any] = js.undefined
  var cache: js.UndefOr[String] = js.undefined
  var `cache-lock-retries`: js.UndefOr[Double] = js.undefined
  var `cache-lock-stale`: js.UndefOr[Double] = js.undefined
  var `cache-lock-wait`: js.UndefOr[Double] = js.undefined
  var `cache-max`: js.UndefOr[Double] = js.undefined
  var `cache-min`: js.UndefOr[Double] = js.undefined
   // string | string[]
  var cafile: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
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
  var group: js.UndefOr[js.Any] = js.undefined
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
  var proxy: js.UndefOr[js.Any] = js.undefined
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
  var spin: js.UndefOr[js.Any] = js.undefined
   // boolean | string ("always")
  var `strict-ssl`: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var tmp: js.UndefOr[String] = js.undefined
  var umask: js.UndefOr[Double] = js.undefined
  var unicode: js.UndefOr[Boolean] = js.undefined
  var `unsafe-perm`: js.UndefOr[Boolean] = js.undefined
  var usage: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[js.Any] = js.undefined
  var `user-agent`: js.UndefOr[String] = js.undefined
   // string | number
  var userconfig: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Boolean] = js.undefined
  var versions: js.UndefOr[Boolean] = js.undefined
  var viewer: js.UndefOr[String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    _exit: js.UndefOr[Boolean] = js.undefined,
    `always-auth`: js.UndefOr[Boolean] = js.undefined,
    `bin-links`: js.UndefOr[Boolean] = js.undefined,
    browser: String = null,
    ca: js.Any = null,
    cache: String = null,
    `cache-lock-retries`: Int | Double = null,
    `cache-lock-stale`: Int | Double = null,
    `cache-lock-wait`: Int | Double = null,
    `cache-max`: Int | Double = null,
    `cache-min`: Int | Double = null,
    cafile: String = null,
    cert: String = null,
    color: js.Any = null,
    depth: Int | Double = null,
    description: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    editor: String = null,
    `engine-strict`: js.UndefOr[Boolean] = js.undefined,
    `fetch-retries`: Int | Double = null,
    `fetch-retry-factor`: Int | Double = null,
    `fetch-retry-maxtimeout`: Int | Double = null,
    `fetch-retry-mintimeout`: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    git: String = null,
    `git-tag-version`: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    globalconfig: String = null,
    group: js.Any = null,
    heading: String = null,
    `https-proxy`: String = null,
    `ignore-scripts`: js.UndefOr[Boolean] = js.undefined,
    `init-module`: String = null,
    initDotauthorDotemail: String = null,
    initDotauthorDotname: String = null,
    initDotauthorDoturl: String = null,
    initDotlicense: String = null,
    initDotversion: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    link: js.UndefOr[Boolean] = js.undefined,
    `local-address`: String = null,
    loglevel: String = null,
    logstream: ReadWriteStream = null,
    long: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    `node-version`: String = null,
    npat: js.UndefOr[Boolean] = js.undefined,
    `onload-script`: js.UndefOr[Boolean] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    parseable: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    production: js.UndefOr[Boolean] = js.undefined,
    `proprietary-attribs`: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    `rebuild-bundle`: js.UndefOr[Boolean] = js.undefined,
    registry: String = null,
    rollback: js.UndefOr[Boolean] = js.undefined,
    save: js.UndefOr[Boolean] = js.undefined,
    `save-bundle`: js.UndefOr[Boolean] = js.undefined,
    `save-dev`: js.UndefOr[Boolean] = js.undefined,
    `save-exact`: js.UndefOr[Boolean] = js.undefined,
    `save-optional`: js.UndefOr[Boolean] = js.undefined,
    `save-prefix`: String = null,
    scope: String = null,
    searchexclude: String = null,
    searchopts: String = null,
    searchsort: String = null,
    shell: String = null,
    shrinkwrap: js.UndefOr[Boolean] = js.undefined,
    `sign-git-tag`: js.UndefOr[Boolean] = js.undefined,
    spin: js.Any = null,
    `strict-ssl`: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    tmp: String = null,
    umask: Int | Double = null,
    unicode: js.UndefOr[Boolean] = js.undefined,
    `unsafe-perm`: js.UndefOr[Boolean] = js.undefined,
    usage: js.UndefOr[Boolean] = js.undefined,
    user: js.Any = null,
    `user-agent`: String = null,
    userconfig: String = null,
    version: js.UndefOr[Boolean] = js.undefined,
    versions: js.UndefOr[Boolean] = js.undefined,
    viewer: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_exit)) __obj.updateDynamic("_exit")(_exit.asInstanceOf[js.Any])
    if (!js.isUndefined(`always-auth`)) __obj.updateDynamic("always-auth")(`always-auth`.asInstanceOf[js.Any])
    if (!js.isUndefined(`bin-links`)) __obj.updateDynamic("bin-links")(`bin-links`.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (`cache-lock-retries` != null) __obj.updateDynamic("cache-lock-retries")(`cache-lock-retries`.asInstanceOf[js.Any])
    if (`cache-lock-stale` != null) __obj.updateDynamic("cache-lock-stale")(`cache-lock-stale`.asInstanceOf[js.Any])
    if (`cache-lock-wait` != null) __obj.updateDynamic("cache-lock-wait")(`cache-lock-wait`.asInstanceOf[js.Any])
    if (`cache-max` != null) __obj.updateDynamic("cache-max")(`cache-max`.asInstanceOf[js.Any])
    if (`cache-min` != null) __obj.updateDynamic("cache-min")(`cache-min`.asInstanceOf[js.Any])
    if (cafile != null) __obj.updateDynamic("cafile")(cafile.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (!js.isUndefined(`engine-strict`)) __obj.updateDynamic("engine-strict")(`engine-strict`.asInstanceOf[js.Any])
    if (`fetch-retries` != null) __obj.updateDynamic("fetch-retries")(`fetch-retries`.asInstanceOf[js.Any])
    if (`fetch-retry-factor` != null) __obj.updateDynamic("fetch-retry-factor")(`fetch-retry-factor`.asInstanceOf[js.Any])
    if (`fetch-retry-maxtimeout` != null) __obj.updateDynamic("fetch-retry-maxtimeout")(`fetch-retry-maxtimeout`.asInstanceOf[js.Any])
    if (`fetch-retry-mintimeout` != null) __obj.updateDynamic("fetch-retry-mintimeout")(`fetch-retry-mintimeout`.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (!js.isUndefined(`git-tag-version`)) __obj.updateDynamic("git-tag-version")(`git-tag-version`.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (globalconfig != null) __obj.updateDynamic("globalconfig")(globalconfig.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (`https-proxy` != null) __obj.updateDynamic("https-proxy")(`https-proxy`.asInstanceOf[js.Any])
    if (!js.isUndefined(`ignore-scripts`)) __obj.updateDynamic("ignore-scripts")(`ignore-scripts`.asInstanceOf[js.Any])
    if (`init-module` != null) __obj.updateDynamic("init-module")(`init-module`.asInstanceOf[js.Any])
    if (initDotauthorDotemail != null) __obj.updateDynamic("init.author.email")(initDotauthorDotemail.asInstanceOf[js.Any])
    if (initDotauthorDotname != null) __obj.updateDynamic("init.author.name")(initDotauthorDotname.asInstanceOf[js.Any])
    if (initDotauthorDoturl != null) __obj.updateDynamic("init.author.url")(initDotauthorDoturl.asInstanceOf[js.Any])
    if (initDotlicense != null) __obj.updateDynamic("init.license")(initDotlicense.asInstanceOf[js.Any])
    if (initDotversion != null) __obj.updateDynamic("init.version")(initDotversion.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (`local-address` != null) __obj.updateDynamic("local-address")(`local-address`.asInstanceOf[js.Any])
    if (loglevel != null) __obj.updateDynamic("loglevel")(loglevel.asInstanceOf[js.Any])
    if (logstream != null) __obj.updateDynamic("logstream")(logstream.asInstanceOf[js.Any])
    if (!js.isUndefined(long)) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`node-version` != null) __obj.updateDynamic("node-version")(`node-version`.asInstanceOf[js.Any])
    if (!js.isUndefined(npat)) __obj.updateDynamic("npat")(npat.asInstanceOf[js.Any])
    if (!js.isUndefined(`onload-script`)) __obj.updateDynamic("onload-script")(`onload-script`.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(parseable)) __obj.updateDynamic("parseable")(parseable.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.asInstanceOf[js.Any])
    if (!js.isUndefined(`proprietary-attribs`)) __obj.updateDynamic("proprietary-attribs")(`proprietary-attribs`.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(`rebuild-bundle`)) __obj.updateDynamic("rebuild-bundle")(`rebuild-bundle`.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    if (!js.isUndefined(rollback)) __obj.updateDynamic("rollback")(rollback.asInstanceOf[js.Any])
    if (!js.isUndefined(save)) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (!js.isUndefined(`save-bundle`)) __obj.updateDynamic("save-bundle")(`save-bundle`.asInstanceOf[js.Any])
    if (!js.isUndefined(`save-dev`)) __obj.updateDynamic("save-dev")(`save-dev`.asInstanceOf[js.Any])
    if (!js.isUndefined(`save-exact`)) __obj.updateDynamic("save-exact")(`save-exact`.asInstanceOf[js.Any])
    if (!js.isUndefined(`save-optional`)) __obj.updateDynamic("save-optional")(`save-optional`.asInstanceOf[js.Any])
    if (`save-prefix` != null) __obj.updateDynamic("save-prefix")(`save-prefix`.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (searchexclude != null) __obj.updateDynamic("searchexclude")(searchexclude.asInstanceOf[js.Any])
    if (searchopts != null) __obj.updateDynamic("searchopts")(searchopts.asInstanceOf[js.Any])
    if (searchsort != null) __obj.updateDynamic("searchsort")(searchsort.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkwrap)) __obj.updateDynamic("shrinkwrap")(shrinkwrap.asInstanceOf[js.Any])
    if (!js.isUndefined(`sign-git-tag`)) __obj.updateDynamic("sign-git-tag")(`sign-git-tag`.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (!js.isUndefined(`strict-ssl`)) __obj.updateDynamic("strict-ssl")(`strict-ssl`.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tmp != null) __obj.updateDynamic("tmp")(tmp.asInstanceOf[js.Any])
    if (umask != null) __obj.updateDynamic("umask")(umask.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    if (!js.isUndefined(`unsafe-perm`)) __obj.updateDynamic("unsafe-perm")(`unsafe-perm`.asInstanceOf[js.Any])
    if (!js.isUndefined(usage)) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    if (userconfig != null) __obj.updateDynamic("userconfig")(userconfig.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(versions)) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (viewer != null) __obj.updateDynamic("viewer")(viewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

