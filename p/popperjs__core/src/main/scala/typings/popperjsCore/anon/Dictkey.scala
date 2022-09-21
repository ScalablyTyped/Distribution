package typings.popperjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popperjsCore.typesMod.OffsetData
import typings.popperjsCore.typesMod.Offsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var arrow: js.UndefOr[CenterOffset] = js.undefined
  
  var hide: js.UndefOr[HasPopperEscaped] = js.undefined
  
  var offset: js.UndefOr[OffsetData] = js.undefined
  
  var popperOffsets: js.UndefOr[Offsets] = js.undefined
  
  var preventOverflow: js.UndefOr[Offsets] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setArrow(value: CenterOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setHide(value: HasPopperEscaped): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setOffset(value: OffsetData): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPopperOffsets(value: Offsets): Self = StObject.set(x, "popperOffsets", value.asInstanceOf[js.Any])
    
    inline def setPopperOffsetsUndefined: Self = StObject.set(x, "popperOffsets", js.undefined)
    
    inline def setPreventOverflow(value: Offsets): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
    
    inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
  }
}
