package typings.pacote.mod

import typings.npmlog.mod.Logger
import typings.ssri.mod.Integrity
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PacoteOptions extends js.Object {
  /**
    * When picking a manifest from a packument, only consider packages
    * published before the specified date. Default `null`.
    */
  var before: js.UndefOr[Date | Null] = js.undefined
  /**
    * Where to store cache entries and temp files. Passed to
    * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
    * that npm will use by default, based on platform and environment.
    */
  var cache: js.UndefOr[String] = js.undefined
  /**
    * The default `dist-tag` to use when choosing a manifest from a packument.
    * Defaults to `latest`.
    */
  var defaultTag: js.UndefOr[String] = js.undefined
  /**
    * Minimum permission mode for extracted directories. Defaults to `0o777`.
    */
  var dmode: js.UndefOr[Double] = js.undefined
  /**
    * Minimum permission mode for extracted files. Defaults to `0o666`.
    */
  var fmode: js.UndefOr[Double] = js.undefined
  /**
    * Fetch the full metadata from the registry for packuments, including
    * information not strictly required for installation (author, description,
    * etc.) Defaults to `true` when `before` is set, since the version publish
    * time is part of the extended packument metadata.
    */
  var fullMetadata: js.UndefOr[Boolean] = js.undefined
  /**
    * Expected integrity of fetched package tarball. If specified, tarballs
    * with mismatched integrity values will raise an `EINTEGRITY` error.
    */
  var integrity: js.UndefOr[String | Integrity] = js.undefined
  /**
    * A logger object with methods for various log levels. Typically, this will
    * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
    * specified, the default is a logger that emits 'log' events on the process
    * object.
    */
  var log: js.UndefOr[Logger] = js.undefined
  /**
    * Prefer to revalidate cache entries, even when it would not be strictly
    * necessary. Default `false`.
    */
  var preferOnline: js.UndefOr[Boolean] = js.undefined
  /**
    * The npm registry to use by default. Defaults to
    * `https://registry.npmjs.org/`.
    */
  var registry: js.UndefOr[String] = js.undefined
  /**
    * Shortcut for looking up resolved values. Should be specified if known.
    */
  var resolved: js.UndefOr[String] = js.undefined
  /**
    * Permission mode mask for extracted files and directories. Defaults to
    * `0o22`.
    */
  var umask: js.UndefOr[Double] = js.undefined
  /**
    * Base folder for resolving relative `file:` dependencies.
    */
  var where: js.UndefOr[String] = js.undefined
}

object PacoteOptions {
  @scala.inline
  def apply(
    before: js.UndefOr[Null | Date] = js.undefined,
    cache: String = null,
    defaultTag: String = null,
    dmode: js.UndefOr[Double] = js.undefined,
    fmode: js.UndefOr[Double] = js.undefined,
    fullMetadata: js.UndefOr[Boolean] = js.undefined,
    integrity: String | Integrity = null,
    log: Logger = null,
    preferOnline: js.UndefOr[Boolean] = js.undefined,
    registry: String = null,
    resolved: String = null,
    umask: js.UndefOr[Double] = js.undefined,
    where: String = null
  ): PacoteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (defaultTag != null) __obj.updateDynamic("defaultTag")(defaultTag.asInstanceOf[js.Any])
    if (!js.isUndefined(dmode)) __obj.updateDynamic("dmode")(dmode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fmode)) __obj.updateDynamic("fmode")(fmode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullMetadata)) __obj.updateDynamic("fullMetadata")(fullMetadata.get.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(preferOnline)) __obj.updateDynamic("preferOnline")(preferOnline.get.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    if (resolved != null) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    if (!js.isUndefined(umask)) __obj.updateDynamic("umask")(umask.get.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PacoteOptions]
  }
}

