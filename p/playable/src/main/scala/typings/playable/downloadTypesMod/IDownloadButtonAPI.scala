package typings.playable.downloadTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadButtonAPI extends js.Object {
  
  var setDownloadClickCallback: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
}
object IDownloadButtonAPI {
  
  @scala.inline
  def apply(): IDownloadButtonAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDownloadButtonAPI]
  }
  
  @scala.inline
  implicit class IDownloadButtonAPIOps[Self <: IDownloadButtonAPI] (val x: Self) extends AnyVal {
    
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
    def setSetDownloadClickCallback(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("setDownloadClickCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDownloadClickCallback: Self = this.set("setDownloadClickCallback", js.undefined)
  }
}
