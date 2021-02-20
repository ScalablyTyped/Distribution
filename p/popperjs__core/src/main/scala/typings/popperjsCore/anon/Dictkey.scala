package typings.popperjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.OffsetData
import typings.popperjsCore.typesMod.Offsets
import org.scalablytyped.runtime.StObject
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
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: CenterOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setHide(value: HasPopperEscaped): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setOffset(value: OffsetData): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPopperOffsets(value: Offsets): Self = StObject.set(x, "popperOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperOffsetsUndefined: Self = StObject.set(x, "popperOffsets", js.undefined)
    
    @scala.inline
    def setPreventOverflow(value: Offsets): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
  }
}
