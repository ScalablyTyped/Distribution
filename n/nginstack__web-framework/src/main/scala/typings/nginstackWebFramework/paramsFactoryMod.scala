package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramsFactoryMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/anchor/ParamsFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createParams(names: Any, values: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createParams")(names.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def updateParams(params: Any, names: Any, values: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateParams")(params.asInstanceOf[js.Any], names.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
