package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixed extends StObject {
  
  /**
    * False indicates that the Anchor bar has just detached from the Header and became part of the scrolling
    * area. True means that the Anchor bar has just snapped to the Header.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
}
object Fixed {
  
  inline def apply(): Fixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fixed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fixed] (val x: Self) extends AnyVal {
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
  }
}
