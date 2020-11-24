package typings.popperjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.OffsetData
import typings.popperjsCore.typesMod.Offsets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var arrow: js.UndefOr[CenterOffset] = js.native
  
  var hide: js.UndefOr[HasPopperEscaped] = js.native
  
  var offset: js.UndefOr[OffsetData] = js.native
  
  var popperOffsets: js.UndefOr[Offsets] = js.native
  
  var preventOverflow: js.UndefOr[Offsets] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: CenterOffset): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setHide(value: HasPopperEscaped): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setOffset(value: OffsetData): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPopperOffsets(value: Offsets): Self = this.set("popperOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperOffsets: Self = this.set("popperOffsets", js.undefined)
    
    @scala.inline
    def setPreventOverflow(value: Offsets): Self = this.set("preventOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventOverflow: Self = this.set("preventOverflow", js.undefined)
  }
}
