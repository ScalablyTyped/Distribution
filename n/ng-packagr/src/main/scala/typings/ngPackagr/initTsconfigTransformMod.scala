package typings.ngPackagr

import typings.angularCompilerCli.performCompileMod.ParsedConfiguration
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initTsconfigTransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/init-tsconfig.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initTsConfigTransformFactory(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("initTsConfigTransformFactory")().asInstanceOf[Transform]
  inline def initTsConfigTransformFactory(defaultTsConfig: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("initTsConfigTransformFactory")(defaultTsConfig.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def initTsConfigTransformFactory(defaultTsConfig: ParsedConfiguration): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("initTsConfigTransformFactory")(defaultTsConfig.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
