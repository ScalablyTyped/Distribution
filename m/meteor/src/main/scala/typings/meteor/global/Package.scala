package typings.meteor.global

import typings.meteor.PackageAPI
import typings.meteor.anon.DebugOnly
import typings.meteor.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Package {
  
  @JSGlobal("Package")
  @js.native
  val ^ : js.Any = js.native
  
  inline def describe(options: DebugOnly): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onTest(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTest")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onUse(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUse")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerBuildPlugin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")().asInstanceOf[Unit]
  inline def registerBuildPlugin(options: Name): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
