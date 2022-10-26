package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackRequireHookMod {
  
  @JSImport("next/dist/build/webpack/require-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadRequireHook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRequireHook")().asInstanceOf[Unit]
  inline def loadRequireHook(aliases: js.Array[js.Tuple2[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRequireHook")(aliases.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def overrideBuiltInReactPackages(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideBuiltInReactPackages")().asInstanceOf[Unit]
  
  inline def setRequireOverrides(aliases: js.Array[js.Tuple2[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRequireOverrides")(aliases.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
