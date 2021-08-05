package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odataHelperMod {
  
  object ODataParser {
    
    @JSImport("msportalfx-mock/lib/src/Helpers/odataHelper", "ODataParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Evaluates the OData filter on the passed in object.
      *
      * @param filter The OData filter string e.g. $filter='subscriptionId eq 'sub1''.
      * @param obj The object array on which the filter is applied.
      * @return The filtered object array.
      */
    inline def evaluate[T](filter: String, obj: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(filter.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  }
}
