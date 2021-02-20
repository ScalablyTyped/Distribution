package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("mobx/lib/types/modifiers", "deepEnhancer")
  @js.native
  def deepEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/types/modifiers", "refStructEnhancer")
  @js.native
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/types/modifiers", "referenceEnhancer")
  @js.native
  def referenceEnhancer(): js.Any = js.native
  @JSImport("mobx/lib/types/modifiers", "referenceEnhancer")
  @js.native
  def referenceEnhancer(newValue: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/types/modifiers", "shallowEnhancer")
  @js.native
  def shallowEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = js.native
  
  type IEnhancer[T] = js.Function3[/* newValue */ T, /* oldValue */ js.UndefOr[T], /* name */ String, T]
}
