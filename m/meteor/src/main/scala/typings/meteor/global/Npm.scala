package typings.meteor.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Npm {
  
  @JSGlobal("Npm")
  @js.native
  val ^ : js.Any = js.native
  
  inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def require(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
}
