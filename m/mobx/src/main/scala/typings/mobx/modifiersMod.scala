package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("mobx/lib/types/modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deepEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEnhancer")(v.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def refStructEnhancer(v: js.Any, oldValue: js.Any, name: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("refStructEnhancer")(v.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def referenceEnhancer(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceEnhancer")().asInstanceOf[js.Any]
  @scala.inline
  def referenceEnhancer(newValue: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceEnhancer")(newValue.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def shallowEnhancer(v: js.Any, _underscore: js.Any, name: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEnhancer")(v.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type IEnhancer[T] = js.Function3[/* newValue */ T, /* oldValue */ js.UndefOr[T], /* name */ String, T]
}
