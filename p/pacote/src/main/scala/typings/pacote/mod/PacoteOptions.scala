package typings.pacote.mod

import typings.npmlog.mod.Logger
import typings.ssri.mod.Integrity
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacoteOptions extends js.Object {
  
  /**
    * When picking a manifest from a packument, only consider packages
    * published before the specified date. Default `null`.
    */
  var before: js.UndefOr[Date | Null] = js.native
  
  /**
    * Where to store cache entries and temp files. Passed to
    * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
    * that npm will use by default, based on platform and environment.
    */
  var cache: js.UndefOr[String] = js.native
  
  /**
    * The default `dist-tag` to use when choosing a manifest from a packument.
    * Defaults to `latest`.
    */
  var defaultTag: js.UndefOr[String] = js.native
  
  /**
    * Minimum permission mode for extracted directories. Defaults to `0o777`.
    */
  var dmode: js.UndefOr[Double] = js.native
  
  /**
    * Minimum permission mode for extracted files. Defaults to `0o666`.
    */
  var fmode: js.UndefOr[Double] = js.native
  
  /**
    * Fetch the full metadata from the registry for packuments, including
    * information not strictly required for installation (author, description,
    * etc.) Defaults to `true` when `before` is set, since the version publish
    * time is part of the extended packument metadata.
    */
  var fullMetadata: js.UndefOr[Boolean] = js.native
  
  /**
    * Expected integrity of fetched package tarball. If specified, tarballs
    * with mismatched integrity values will raise an `EINTEGRITY` error.
    */
  var integrity: js.UndefOr[String | Integrity] = js.native
  
  /**
    * A logger object with methods for various log levels. Typically, this will
    * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
    * specified, the default is a logger that emits 'log' events on the process
    * object.
    */
  var log: js.UndefOr[Logger] = js.native
  
  /**
    * Prefer to revalidate cache entries, even when it would not be strictly
    * necessary. Default `false`.
    */
  var preferOnline: js.UndefOr[Boolean] = js.native
  
  /**
    * The npm registry to use by default. Defaults to
    * `https://registry.npmjs.org/`.
    */
  var registry: js.UndefOr[String] = js.native
  
  /**
    * Shortcut for looking up resolved values. Should be specified if known.
    */
  var resolved: js.UndefOr[String] = js.native
  
  /**
    * Permission mode mask for extracted files and directories. Defaults to
    * `0o22`.
    */
  var umask: js.UndefOr[Double] = js.native
  
  /**
    * Base folder for resolving relative `file:` dependencies.
    */
  var where: js.UndefOr[String] = js.native
}
object PacoteOptions {
  
  @scala.inline
  def apply(): PacoteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacoteOptions]
  }
  
  @scala.inline
  implicit class PacoteOptionsOps[Self <: PacoteOptions] (val x: Self) extends AnyVal {
    
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
    def setBefore(value: Date): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBeforeNull: Self = this.set("before", null)
    
    @scala.inline
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setDefaultTag(value: String): Self = this.set("defaultTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTag: Self = this.set("defaultTag", js.undefined)
    
    @scala.inline
    def setDmode(value: Double): Self = this.set("dmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDmode: Self = this.set("dmode", js.undefined)
    
    @scala.inline
    def setFmode(value: Double): Self = this.set("fmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFmode: Self = this.set("fmode", js.undefined)
    
    @scala.inline
    def setFullMetadata(value: Boolean): Self = this.set("fullMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullMetadata: Self = this.set("fullMetadata", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String | Integrity): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    
    @scala.inline
    def setLog(value: Logger): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setPreferOnline(value: Boolean): Self = this.set("preferOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferOnline: Self = this.set("preferOnline", js.undefined)
    
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
    
    @scala.inline
    def setResolved(value: String): Self = this.set("resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
    
    @scala.inline
    def setUmask(value: Double): Self = this.set("umask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUmask: Self = this.set("umask", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
