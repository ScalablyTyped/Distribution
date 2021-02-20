package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Learnset extends StObject {
  
  var egg_move: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var move: String = js.native
  
  var tm: js.UndefOr[String] = js.native
  
  var variations: js.UndefOr[js.Array[String]] = js.native
}
object Learnset {
  
  @scala.inline
  def apply(move: String): Learnset = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[Learnset]
  }
  
  @scala.inline
  implicit class LearnsetMutableBuilder[Self <: Learnset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEgg_move(value: Boolean): Self = StObject.set(x, "egg_move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgg_moveUndefined: Self = StObject.set(x, "egg_move", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMove(value: String): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTm(value: String): Self = StObject.set(x, "tm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmUndefined: Self = StObject.set(x, "tm", js.undefined)
    
    @scala.inline
    def setVariations(value: js.Array[String]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationsUndefined: Self = StObject.set(x, "variations", js.undefined)
    
    @scala.inline
    def setVariationsVarargs(value: String*): Self = StObject.set(x, "variations", js.Array(value :_*))
  }
}
