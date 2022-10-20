package typings.ngPackagr

import typings.ngPackagr.anon.Project
import typings.ngPackagr.libNgPackagePackageMod.NgPackage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageDiscoverPackagesMod {
  
  @JSImport("ng-packagr/lib/ng-package/discover-packages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discoverPackages(hasProject: Project): js.Promise[NgPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("discoverPackages")(hasProject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NgPackage]]
}
