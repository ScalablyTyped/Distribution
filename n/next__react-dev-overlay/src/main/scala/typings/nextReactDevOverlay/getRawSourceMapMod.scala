package typings.nextReactDevOverlay

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRawSourceMapMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/getRawSourceMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRawSourceMap(fileContents: String): RawSourceMap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawSourceMap")(fileContents.asInstanceOf[js.Any]).asInstanceOf[RawSourceMap | Null]
}
