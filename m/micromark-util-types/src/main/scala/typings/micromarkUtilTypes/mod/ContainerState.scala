package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerState extends StObject {
  
  /**
    * Special field to close the current flow (or containers).
    */
  var _closeFlow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether there are further blank lines, used by lists.
    */
  var furtherBlankLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether there first line is blank, used by lists.
    */
  var initialBlankLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current marker, used by lists.
    */
  var marker: js.UndefOr[Code] = js.undefined
  
  /**
    * Used by block quotes.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current size, used by lists.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Current token type, used by lists.
    */
  var `type`: js.UndefOr[TokenType] = js.undefined
}
object ContainerState {
  
  inline def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
    
    inline def setFurtherBlankLines(value: Boolean): Self = StObject.set(x, "furtherBlankLines", value.asInstanceOf[js.Any])
    
    inline def setFurtherBlankLinesUndefined: Self = StObject.set(x, "furtherBlankLines", js.undefined)
    
    inline def setInitialBlankLine(value: Boolean): Self = StObject.set(x, "initialBlankLine", value.asInstanceOf[js.Any])
    
    inline def setInitialBlankLineUndefined: Self = StObject.set(x, "initialBlankLine", js.undefined)
    
    inline def setMarker(value: Code): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerNull: Self = StObject.set(x, "marker", null)
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_closeFlow(value: Boolean): Self = StObject.set(x, "_closeFlow", value.asInstanceOf[js.Any])
    
    inline def set_closeFlowUndefined: Self = StObject.set(x, "_closeFlow", js.undefined)
  }
}
