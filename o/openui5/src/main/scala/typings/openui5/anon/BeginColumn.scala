package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginColumn extends StObject {
  
  /**
    * Determines whether `beginColumn` resize has completed.
    */
  var beginColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether `endColumn` resize has completed.
    */
  var endColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether `midColumn` resize has completed.
    */
  var midColumn: js.UndefOr[Boolean] = js.undefined
}
object BeginColumn {
  
  inline def apply(): BeginColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeginColumn] (val x: Self) extends AnyVal {
    
    inline def setBeginColumn(value: Boolean): Self = StObject.set(x, "beginColumn", value.asInstanceOf[js.Any])
    
    inline def setBeginColumnUndefined: Self = StObject.set(x, "beginColumn", js.undefined)
    
    inline def setEndColumn(value: Boolean): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setMidColumn(value: Boolean): Self = StObject.set(x, "midColumn", value.asInstanceOf[js.Any])
    
    inline def setMidColumnUndefined: Self = StObject.set(x, "midColumn", js.undefined)
  }
}
