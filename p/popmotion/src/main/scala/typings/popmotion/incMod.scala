package typings.popmotion

import typings.popmotion.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incMod {
  
  @JSImport("popmotion/lib/utils/inc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isNum(v: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(v.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @JSImport("popmotion/lib/utils/inc", "zeroPoint")
  @js.native
  val zeroPoint: Point = js.native
}
