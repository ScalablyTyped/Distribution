package typings.nodegit.statusOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var flags: js.UndefOr[Double] = js.native
  
  var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.native
  
  var show: js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object StatusOptions {
  
  @scala.inline
  def apply(): StatusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusOptions]
  }
  
  @scala.inline
  implicit class StatusOptionsOps[Self <: StatusOptions] (val x: Self) extends AnyVal {
    
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
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setPathspecVarargs(value: String*): Self = this.set("pathspec", js.Array(value :_*))
    
    @scala.inline
    def setPathspec(value: Strarray | String | js.Array[String]): Self = this.set("pathspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathspec: Self = this.set("pathspec", js.undefined)
    
    @scala.inline
    def setShow(value: Double): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
