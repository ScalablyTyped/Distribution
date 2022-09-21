package typings.onfleetNodeOnfleet.tasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Barcode extends StObject {
  
  /** Whether the worker must capture this data prior to task completion, defaults to false */
  var blockCompletion: js.UndefOr[Boolean] = js.undefined
  
  /** Base64 representation of the data encoded within the barcode to be captured, max length of 500 characters */
  var data: js.UndefOr[String] = js.undefined
}
object Barcode {
  
  inline def apply(): Barcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Barcode]
  }
  
  extension [Self <: Barcode](x: Self) {
    
    inline def setBlockCompletion(value: Boolean): Self = StObject.set(x, "blockCompletion", value.asInstanceOf[js.Any])
    
    inline def setBlockCompletionUndefined: Self = StObject.set(x, "blockCompletion", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
