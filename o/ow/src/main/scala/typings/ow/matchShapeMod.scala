package typings.ow

import org.scalablytyped.runtime.StringDictionary
import typings.ow.basePredicateMod.BasePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchShapeMod {
  
  @JSImport("ow/dist/source/utils/match-shape", "exact")
  @js.native
  def exact(`object`: StringDictionary[js.Any], shape: Shape): Boolean | String = js.native
  @JSImport("ow/dist/source/utils/match-shape", "exact")
  @js.native
  def exact(`object`: StringDictionary[js.Any], shape: Shape, parent: String): Boolean | String = js.native
  
  @JSImport("ow/dist/source/utils/match-shape", "partial")
  @js.native
  def partial(`object`: StringDictionary[js.Any], shape: Shape): Boolean | String = js.native
  @JSImport("ow/dist/source/utils/match-shape", "partial")
  @js.native
  def partial(`object`: StringDictionary[js.Any], shape: Shape, parent: String): Boolean | String = js.native
  
  @js.native
  trait Shape extends /* key */ StringDictionary[BasePredicate[_] | Shape]
  object Shape {
    
    @scala.inline
    def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
  }
}
