package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilDeepCloneMod {
  
  @JSImport("sap/base/util/deepClone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * Source value that shall be cloned
    */
  src: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(
    /**
    * Source value that shall be cloned
    */
  src: Any,
    /**
    * Maximum recursion depth for the clone operation, deeper structures will throw an error
    */
  maxDepth: int
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[Any]
}
