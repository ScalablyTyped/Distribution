package typings.openui5.anon

import typings.openui5.float
import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultWidth extends StObject {
  
  /**
    * The default column content width when type check fails
    */
  var defaultWidth: js.UndefOr[int] = js.undefined
  
  /**
    * A list of invisible referenced property names
    */
  var excludeProperties: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The additional content width in rem
    */
  var gap: js.UndefOr[float] = js.undefined
  
  /**
    * Whether the label should be taken into account
    */
  var includeLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum content width in rem
    */
  var maxWidth: js.UndefOr[int] = js.undefined
  
  /**
    * The minimum content width in rem
    */
  var minWidth: js.UndefOr[int] = js.undefined
  
  /**
    * Whether the label should be trucated or not
    */
  var truncateLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the referenced properties are arranged vertically
    */
  var verticalArrangement: js.UndefOr[Boolean] = js.undefined
}
object DefaultWidth {
  
  inline def apply(): DefaultWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultWidth] (val x: Self) extends AnyVal {
    
    inline def setDefaultWidth(value: int): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
    
    inline def setExcludeProperties(value: js.Array[String]): Self = StObject.set(x, "excludeProperties", value.asInstanceOf[js.Any])
    
    inline def setExcludePropertiesUndefined: Self = StObject.set(x, "excludeProperties", js.undefined)
    
    inline def setExcludePropertiesVarargs(value: String*): Self = StObject.set(x, "excludeProperties", js.Array(value*))
    
    inline def setGap(value: float): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setIncludeLabel(value: Boolean): Self = StObject.set(x, "includeLabel", value.asInstanceOf[js.Any])
    
    inline def setIncludeLabelUndefined: Self = StObject.set(x, "includeLabel", js.undefined)
    
    inline def setMaxWidth(value: int): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: int): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setTruncateLabel(value: Boolean): Self = StObject.set(x, "truncateLabel", value.asInstanceOf[js.Any])
    
    inline def setTruncateLabelUndefined: Self = StObject.set(x, "truncateLabel", js.undefined)
    
    inline def setVerticalArrangement(value: Boolean): Self = StObject.set(x, "verticalArrangement", value.asInstanceOf[js.Any])
    
    inline def setVerticalArrangementUndefined: Self = StObject.set(x, "verticalArrangement", js.undefined)
  }
}
