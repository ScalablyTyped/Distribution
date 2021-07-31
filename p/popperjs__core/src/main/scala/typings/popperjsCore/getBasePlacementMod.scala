package typings.popperjsCore

import typings.popperjsCore.enumsMod.BasePlacement
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.popperjsCoreStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBasePlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/getBasePlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(placement: Placement): BasePlacement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[BasePlacement]
  
  @scala.inline
  def default_auto(placement: auto): BasePlacement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[BasePlacement]
}
