package typings.nodegit.statusFileOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.statusEntryMod.StatusEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusFileOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var entry: js.UndefOr[StatusEntry] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[Double] = js.native
}
object StatusFileOptions {
  
  @scala.inline
  def apply(): StatusFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusFileOptions]
  }
  
  @scala.inline
  implicit class StatusFileOptionsOps[Self <: StatusFileOptions] (val x: Self) extends AnyVal {
    
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
    def setEntry(value: StatusEntry): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
