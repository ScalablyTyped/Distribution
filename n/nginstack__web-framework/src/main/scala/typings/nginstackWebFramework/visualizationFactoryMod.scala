package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualizationFactoryMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(typeOrKey: String): Visualization = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(typeOrKey.asInstanceOf[js.Any]).asInstanceOf[Visualization]
  inline def create(typeOrKey: String, opt_def: Any): Visualization = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(typeOrKey.asInstanceOf[js.Any], opt_def.asInstanceOf[js.Any])).asInstanceOf[Visualization]
  inline def create(typeOrKey: Double): Visualization = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(typeOrKey.asInstanceOf[js.Any]).asInstanceOf[Visualization]
  inline def create(typeOrKey: Double, opt_def: Any): Visualization = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(typeOrKey.asInstanceOf[js.Any], opt_def.asInstanceOf[js.Any])).asInstanceOf[Visualization]
  
  inline def getVisualizationPath(key: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisualizationPath")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def register(typeName: String, constructor: js.Function1[/* arg0 */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(typeName.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Visualization = typings.nginstackWebFramework.visualizationMod.^
}
