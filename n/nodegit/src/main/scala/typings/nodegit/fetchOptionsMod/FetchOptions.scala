package typings.nodegit.fetchOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions
  extends /* key */ StringDictionary[js.Any] {
  var callbacks: js.UndefOr[RemoteCallbacks] = js.native
  var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.native
  var downloadTags: js.UndefOr[Double] = js.native
  var proxyOpts: js.UndefOr[js.Any] = js.native
  var prune: js.UndefOr[Double] = js.native
  var updateFetchhead: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
}

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
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
    def setCallbacks(value: RemoteCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setCustomHeadersVarargs(value: String*): Self = this.set("customHeaders", js.Array(value :_*))
    @scala.inline
    def setCustomHeaders(value: Strarray | String | js.Array[String]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setDownloadTags(value: Double): Self = this.set("downloadTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadTags: Self = this.set("downloadTags", js.undefined)
    @scala.inline
    def setProxyOpts(value: js.Any): Self = this.set("proxyOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyOpts: Self = this.set("proxyOpts", js.undefined)
    @scala.inline
    def setPrune(value: Double): Self = this.set("prune", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrune: Self = this.set("prune", js.undefined)
    @scala.inline
    def setUpdateFetchhead(value: Double): Self = this.set("updateFetchhead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateFetchhead: Self = this.set("updateFetchhead", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

