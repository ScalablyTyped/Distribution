package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilEachMod {
  
  @JSImport("sap/base/util/each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * object or array to enumerate the properties of
    */
  oObject: js.Array[Any],
    /**
    * function to call for each property name
    */
  fnCallback: js.Function2[/* p1 */ Key, /* p2 */ Any, Boolean]
  ): js.Object | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oObject.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
  inline def default(
    /**
    * object or array to enumerate the properties of
    */
  oObject: js.Object,
    /**
    * function to call for each property name
    */
  fnCallback: js.Function2[/* p1 */ Key, /* p2 */ Any, Boolean]
  ): js.Object | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oObject.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
  
  type Key = int | String
}
