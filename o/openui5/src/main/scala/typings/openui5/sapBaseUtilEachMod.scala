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
  fnCallback: js.Function
  ): js.Object | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oObject.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
  inline def default(
    /**
    * object or array to enumerate the properties of
    */
  oObject: js.Object,
    /**
    * function to call for each property name
    */
  fnCallback: js.Function
  ): js.Object | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oObject.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.Object | js.Array[Any]]
}
