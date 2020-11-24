package typings.popperjsCore.typesMod

import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.enumsMod.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var modifiers: js.Array[PartialModifieranyany] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var placement: Placement = js.native
  
  var strategy: PositioningStrategy = js.native
}
object Options {
  
  @scala.inline
  def apply(modifiers: js.Array[PartialModifieranyany], placement: Placement, strategy: PositioningStrategy): Options = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModifiersVarargs(value: PartialModifieranyany*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[PartialModifieranyany]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = this.set("onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFirstUpdate: Self = this.set("onFirstUpdate", js.undefined)
  }
}
