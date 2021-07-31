package typings.nextReactDevOverlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSourceMapUrlMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/getSourceMapUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSourceMapUrl(fileContents: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceMapUrl")(fileContents.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
