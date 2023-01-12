package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dash extends StObject {
  
  /** Length of each dash in `pt`. */
  var length: Double
  
  /**
    * Space between dashes in `pt`.
    *
    * Defaults to the same value as {@link length}.
    */
  var space: js.UndefOr[Double] = js.undefined
}
object Dash {
  
  inline def apply(length: Double): Dash = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dash] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
