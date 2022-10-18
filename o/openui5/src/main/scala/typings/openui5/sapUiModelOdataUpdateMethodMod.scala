package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataUpdateMethodMod {
  
  /**
    * Different methods for update operations.
    */
  @JSImport("sap/ui/model/odata/UpdateMethod", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UpdateMethod & String] = js.native
    
    /* "MERGE" */ val Merge: typings.openui5.sapUiModelOdataUpdateMethodMod.UpdateMethod.Merge & String = js.native
    
    /* "PUT" */ val Put: typings.openui5.sapUiModelOdataUpdateMethodMod.UpdateMethod.Put & String = js.native
  }
  
  @js.native
  sealed trait UpdateMethod extends StObject
  /**
    * Different methods for update operations.
    */
  @JSImport("sap/ui/model/odata/UpdateMethod", "UpdateMethod")
  @js.native
  object UpdateMethod extends StObject {
    
    /**
      * Update requests will be send with HTTP method `MERGE`.
      */
    @js.native
    sealed trait Merge
      extends StObject
         with UpdateMethod
    
    /**
      * Update requests will be send with HTTP method `PUT`.
      */
    @js.native
    sealed trait Put
      extends StObject
         with UpdateMethod
  }
}
