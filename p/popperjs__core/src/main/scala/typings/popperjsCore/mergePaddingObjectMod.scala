package typings.popperjsCore

import typings.popperjsCore.anon.PartialSideObject
import typings.popperjsCore.typesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergePaddingObjectMod {
  
  @JSImport("@popperjs/core/lib/utils/mergePaddingObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(paddingObject: PartialSideObject): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(paddingObject.asInstanceOf[js.Any]).asInstanceOf[SideObject]
}
