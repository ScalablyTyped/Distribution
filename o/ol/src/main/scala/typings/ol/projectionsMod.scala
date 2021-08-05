package typings.ol

import typings.ol.projectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionsMod {
  
  @JSImport("ol/proj/projections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(code: String, projection: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(code.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def get(code: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(code.asInstanceOf[js.Any]).asInstanceOf[default]
}
