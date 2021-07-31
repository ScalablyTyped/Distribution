package typings.popperjsCore

import typings.popperjsCore.anon.Element
import typings.popperjsCore.typesMod.Offsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeOffsetsMod {
  
  @JSImport("@popperjs/core/lib/utils/computeOffsets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasReferenceElementPlacement: Element): Offsets = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasReferenceElementPlacement.asInstanceOf[js.Any]).asInstanceOf[Offsets]
}
