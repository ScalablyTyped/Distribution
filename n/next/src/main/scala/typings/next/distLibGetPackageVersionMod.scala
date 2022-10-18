package typings.next

import typings.next.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibGetPackageVersionMod {
  
  @JSImport("next/dist/lib/get-package-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackageVersion(hasCwdName: Cwd): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageVersion")(hasCwdName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
}
