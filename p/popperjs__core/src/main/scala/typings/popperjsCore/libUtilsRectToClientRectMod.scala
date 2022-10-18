package typings.popperjsCore

import typings.popperjsCore.libTypesMod.ClientRectObject
import typings.popperjsCore.libTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsRectToClientRectMod {
  
  @JSImport("@popperjs/core/lib/utils/rectToClientRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(rect: Rect): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rect.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
}
