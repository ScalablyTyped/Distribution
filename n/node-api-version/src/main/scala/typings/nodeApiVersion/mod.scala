package typings.nodeApiVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-api-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromElectronVersion(version: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElectronVersion")(version.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def fromNodeVersion(version: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeVersion")(version.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
}
