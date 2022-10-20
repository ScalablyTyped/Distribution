package typings.ngPackagr

import typings.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointEntryPointDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/entry-point.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def entryPointTransformFactory(compileTs: Transform, writeBundles: Transform, writePackage: Transform): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("entryPointTransformFactory")(compileTs.asInstanceOf[js.Any], writeBundles.asInstanceOf[js.Any], writePackage.asInstanceOf[js.Any])).asInstanceOf[Transform]
}
