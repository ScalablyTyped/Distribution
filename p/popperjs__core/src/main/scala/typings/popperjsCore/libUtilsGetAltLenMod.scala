package typings.popperjsCore

import typings.popperjsCore.popperjsCoreStrings.height
import typings.popperjsCore.popperjsCoreStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetAltLenMod {
  
  @JSImport("@popperjs/core/lib/utils/getAltLen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(len: width | height): width | height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(len.asInstanceOf[js.Any]).asInstanceOf[width | height]
}
