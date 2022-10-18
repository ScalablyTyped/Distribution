package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildIsWriteableMod {
  
  @JSImport("next/dist/build/is-writeable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isWriteable(directory: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isWriteable")(directory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
