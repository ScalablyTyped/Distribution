package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataRemoveItemsMod {
  
  @JSImport("@pixi/utils/lib/data/removeItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeItems(arr: js.Array[Any], startIdx: Double, removeCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItems")(arr.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
