package typings.popperjsCore

import typings.popperjsCore.typesMod.ClientRectObject
import typings.popperjsCore.typesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectToClientRectMod {
  
  @JSImport("@popperjs/core/lib/utils/rectToClientRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(rect: Rect): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rect.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
}
