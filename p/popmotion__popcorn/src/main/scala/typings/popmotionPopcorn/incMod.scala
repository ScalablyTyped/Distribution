package typings.popmotionPopcorn

import typings.popmotionPopcorn.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incMod {
  
  @JSImport("@popmotion/popcorn/lib/inc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNum(v: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(v.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @JSImport("@popmotion/popcorn/lib/inc", "zeroPoint")
  @js.native
  val zeroPoint: Point = js.native
}
