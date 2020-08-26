package typings.nodelibFsWalk.settingsMod

import typings.nodelibFsWalk.anon.PartialFileSystemAdapter
import typings.nodelibFsWalk.typesMod.Entry
import typings.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var concurrency: js.UndefOr[Double] = js.native
  var deepFilter: js.UndefOr[DeepFilterFunction] = js.native
  var entryFilter: js.UndefOr[EntryFilterFunction] = js.native
  var errorFilter: js.UndefOr[ErrorFilterFunction] = js.native
  var followSymbolicLinks: js.UndefOr[Boolean] = js.native
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
  var pathSegmentSeparator: js.UndefOr[String] = js.native
  var stats: js.UndefOr[Boolean] = js.native
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setDeepFilter(value: Entry => Boolean): Self = this.set("deepFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeepFilter: Self = this.set("deepFilter", js.undefined)
    @scala.inline
    def setEntryFilter(value: Entry => Boolean): Self = this.set("entryFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEntryFilter: Self = this.set("entryFilter", js.undefined)
    @scala.inline
    def setErrorFilter(value: Errno => Boolean): Self = this.set("errorFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorFilter: Self = this.set("errorFilter", js.undefined)
    @scala.inline
    def setFollowSymbolicLinks(value: Boolean): Self = this.set("followSymbolicLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowSymbolicLinks: Self = this.set("followSymbolicLinks", js.undefined)
    @scala.inline
    def setFs(value: PartialFileSystemAdapter): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setPathSegmentSeparator(value: String): Self = this.set("pathSegmentSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathSegmentSeparator: Self = this.set("pathSegmentSeparator", js.undefined)
    @scala.inline
    def setStats(value: Boolean): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = this.set("throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowErrorOnBrokenSymbolicLink: Self = this.set("throwErrorOnBrokenSymbolicLink", js.undefined)
  }
  
}

