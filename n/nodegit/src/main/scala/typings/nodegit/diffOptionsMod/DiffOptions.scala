package typings.nodegit.diffOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var contextLines: js.UndefOr[Double] = js.native
  
  var flags: js.UndefOr[Double] = js.native
  
  var idAbbrev: js.UndefOr[Double] = js.native
  
  var ignoreSubmodules: js.UndefOr[Double] = js.native
  
  var interhunkLines: js.UndefOr[Double] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var newPrefix: js.UndefOr[String] = js.native
  
  var notifyCb: js.UndefOr[js.Function] = js.native
  
  var oldPrefix: js.UndefOr[String] = js.native
  
  var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.native
  
  var payload: js.UndefOr[js.Any] = js.native
  
  var progressCb: js.UndefOr[js.Any] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object DiffOptions {
  
  @scala.inline
  def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  
  @scala.inline
  implicit class DiffOptionsOps[Self <: DiffOptions] (val x: Self) extends AnyVal {
    
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
    def setContextLines(value: Double): Self = this.set("contextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextLines: Self = this.set("contextLines", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setIdAbbrev(value: Double): Self = this.set("idAbbrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdAbbrev: Self = this.set("idAbbrev", js.undefined)
    
    @scala.inline
    def setIgnoreSubmodules(value: Double): Self = this.set("ignoreSubmodules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSubmodules: Self = this.set("ignoreSubmodules", js.undefined)
    
    @scala.inline
    def setInterhunkLines(value: Double): Self = this.set("interhunkLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterhunkLines: Self = this.set("interhunkLines", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setNewPrefix(value: String): Self = this.set("newPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPrefix: Self = this.set("newPrefix", js.undefined)
    
    @scala.inline
    def setNotifyCb(value: js.Function): Self = this.set("notifyCb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyCb: Self = this.set("notifyCb", js.undefined)
    
    @scala.inline
    def setOldPrefix(value: String): Self = this.set("oldPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldPrefix: Self = this.set("oldPrefix", js.undefined)
    
    @scala.inline
    def setPathspecVarargs(value: String*): Self = this.set("pathspec", js.Array(value :_*))
    
    @scala.inline
    def setPathspec(value: Strarray | String | js.Array[String]): Self = this.set("pathspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathspec: Self = this.set("pathspec", js.undefined)
    
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setProgressCb(value: js.Any): Self = this.set("progressCb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressCb: Self = this.set("progressCb", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
