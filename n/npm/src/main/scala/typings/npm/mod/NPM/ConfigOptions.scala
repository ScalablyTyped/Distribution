package typings.npm.mod.NPM

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
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
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_exit(value: Boolean): Self = this.set("_exit", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_exit: Self = this.set("_exit", js.undefined)
    @scala.inline
    def `setAlways-auth`(value: Boolean): Self = this.set("always-auth", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlways-auth`: Self = this.set("always-auth", js.undefined)
    @scala.inline
    def `setBin-links`(value: Boolean): Self = this.set("bin-links", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBin-links`: Self = this.set("bin-links", js.undefined)
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setCa(value: js.Any): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def `setCache-lock-retries`(value: Double): Self = this.set("cache-lock-retries", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-lock-retries`: Self = this.set("cache-lock-retries", js.undefined)
    @scala.inline
    def `setCache-lock-stale`(value: Double): Self = this.set("cache-lock-stale", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-lock-stale`: Self = this.set("cache-lock-stale", js.undefined)
    @scala.inline
    def `setCache-lock-wait`(value: Double): Self = this.set("cache-lock-wait", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-lock-wait`: Self = this.set("cache-lock-wait", js.undefined)
    @scala.inline
    def `setCache-max`(value: Double): Self = this.set("cache-max", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-max`: Self = this.set("cache-max", js.undefined)
    @scala.inline
    def `setCache-min`(value: Double): Self = this.set("cache-min", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-min`: Self = this.set("cache-min", js.undefined)
    @scala.inline
    def setCafile(value: String): Self = this.set("cafile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCafile: Self = this.set("cafile", js.undefined)
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDescription(value: Boolean): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    @scala.inline
    def setEditor(value: String): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def `setEngine-strict`(value: Boolean): Self = this.set("engine-strict", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEngine-strict`: Self = this.set("engine-strict", js.undefined)
    @scala.inline
    def `setFetch-retries`(value: Double): Self = this.set("fetch-retries", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-retries`: Self = this.set("fetch-retries", js.undefined)
    @scala.inline
    def `setFetch-retry-factor`(value: Double): Self = this.set("fetch-retry-factor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-retry-factor`: Self = this.set("fetch-retry-factor", js.undefined)
    @scala.inline
    def `setFetch-retry-maxtimeout`(value: Double): Self = this.set("fetch-retry-maxtimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-retry-maxtimeout`: Self = this.set("fetch-retry-maxtimeout", js.undefined)
    @scala.inline
    def `setFetch-retry-mintimeout`(value: Double): Self = this.set("fetch-retry-mintimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFetch-retry-mintimeout`: Self = this.set("fetch-retry-mintimeout", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setGit(value: String): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    @scala.inline
    def `setGit-tag-version`(value: Boolean): Self = this.set("git-tag-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGit-tag-version`: Self = this.set("git-tag-version", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setGlobalconfig(value: String): Self = this.set("globalconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalconfig: Self = this.set("globalconfig", js.undefined)
    @scala.inline
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def `setHttps-proxy`(value: String): Self = this.set("https-proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHttps-proxy`: Self = this.set("https-proxy", js.undefined)
    @scala.inline
    def `setIgnore-scripts`(value: Boolean): Self = this.set("ignore-scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIgnore-scripts`: Self = this.set("ignore-scripts", js.undefined)
    @scala.inline
    def `setInit-module`(value: String): Self = this.set("init-module", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInit-module`: Self = this.set("init-module", js.undefined)
    @scala.inline
    def setInitDotauthorDotemail(value: String): Self = this.set("init.author.email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDotauthorDotemail: Self = this.set("init.author.email", js.undefined)
    @scala.inline
    def setInitDotauthorDotname(value: String): Self = this.set("init.author.name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDotauthorDotname: Self = this.set("init.author.name", js.undefined)
    @scala.inline
    def setInitDotauthorDoturl(value: String): Self = this.set("init.author.url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDotauthorDoturl: Self = this.set("init.author.url", js.undefined)
    @scala.inline
    def setInitDotlicense(value: String): Self = this.set("init.license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDotlicense: Self = this.set("init.license", js.undefined)
    @scala.inline
    def setInitDotversion(value: String): Self = this.set("init.version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDotversion: Self = this.set("init.version", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def `setLocal-address`(value: String): Self = this.set("local-address", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLocal-address`: Self = this.set("local-address", js.undefined)
    @scala.inline
    def setLoglevel(value: String): Self = this.set("loglevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoglevel: Self = this.set("loglevel", js.undefined)
    @scala.inline
    def setLogstream(value: ReadWriteStream): Self = this.set("logstream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogstream: Self = this.set("logstream", js.undefined)
    @scala.inline
    def setLong(value: Boolean): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def `setNode-version`(value: String): Self = this.set("node-version", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNode-version`: Self = this.set("node-version", js.undefined)
    @scala.inline
    def setNpat(value: Boolean): Self = this.set("npat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpat: Self = this.set("npat", js.undefined)
    @scala.inline
    def `setOnload-script`(value: Boolean): Self = this.set("onload-script", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOnload-script`: Self = this.set("onload-script", js.undefined)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setParseable(value: Boolean): Self = this.set("parseable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseable: Self = this.set("parseable", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    @scala.inline
    def `setProprietary-attribs`(value: Boolean): Self = this.set("proprietary-attribs", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProprietary-attribs`: Self = this.set("proprietary-attribs", js.undefined)
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def `setRebuild-bundle`(value: Boolean): Self = this.set("rebuild-bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRebuild-bundle`: Self = this.set("rebuild-bundle", js.undefined)
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
    @scala.inline
    def setRollback(value: Boolean): Self = this.set("rollback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollback: Self = this.set("rollback", js.undefined)
    @scala.inline
    def setSave(value: Boolean): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def `setSave-bundle`(value: Boolean): Self = this.set("save-bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-bundle`: Self = this.set("save-bundle", js.undefined)
    @scala.inline
    def `setSave-dev`(value: Boolean): Self = this.set("save-dev", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-dev`: Self = this.set("save-dev", js.undefined)
    @scala.inline
    def `setSave-exact`(value: Boolean): Self = this.set("save-exact", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-exact`: Self = this.set("save-exact", js.undefined)
    @scala.inline
    def `setSave-optional`(value: Boolean): Self = this.set("save-optional", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-optional`: Self = this.set("save-optional", js.undefined)
    @scala.inline
    def `setSave-prefix`(value: String): Self = this.set("save-prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSave-prefix`: Self = this.set("save-prefix", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSearchexclude(value: String): Self = this.set("searchexclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchexclude: Self = this.set("searchexclude", js.undefined)
    @scala.inline
    def setSearchopts(value: String): Self = this.set("searchopts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchopts: Self = this.set("searchopts", js.undefined)
    @scala.inline
    def setSearchsort(value: String): Self = this.set("searchsort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchsort: Self = this.set("searchsort", js.undefined)
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setShrinkwrap(value: Boolean): Self = this.set("shrinkwrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkwrap: Self = this.set("shrinkwrap", js.undefined)
    @scala.inline
    def `setSign-git-tag`(value: Boolean): Self = this.set("sign-git-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSign-git-tag`: Self = this.set("sign-git-tag", js.undefined)
    @scala.inline
    def setSpin(value: js.Any): Self = this.set("spin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def `setStrict-ssl`(value: Boolean): Self = this.set("strict-ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrict-ssl`: Self = this.set("strict-ssl", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTmp(value: String): Self = this.set("tmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmp: Self = this.set("tmp", js.undefined)
    @scala.inline
    def setUmask(value: Double): Self = this.set("umask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUmask: Self = this.set("umask", js.undefined)
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    @scala.inline
    def `setUnsafe-perm`(value: Boolean): Self = this.set("unsafe-perm", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnsafe-perm`: Self = this.set("unsafe-perm", js.undefined)
    @scala.inline
    def setUsage(value: Boolean): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    @scala.inline
    def setUser(value: js.Any): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def `setUser-agent`(value: String): Self = this.set("user-agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-agent`: Self = this.set("user-agent", js.undefined)
    @scala.inline
    def setUserconfig(value: String): Self = this.set("userconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserconfig: Self = this.set("userconfig", js.undefined)
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersions(value: Boolean): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    @scala.inline
    def setViewer(value: String): Self = this.set("viewer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewer: Self = this.set("viewer", js.undefined)
  }
  
}

