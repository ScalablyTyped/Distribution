package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModifiersMod {
  
  @JSImport("mobx/dist/types/modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepEnhancer(v: Any, _underscore: Any, name: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEnhancer")(v.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def refStructEnhancer(v: Any, oldValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("refStructEnhancer")(v.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def referenceEnhancer(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceEnhancer")().asInstanceOf[Any]
  inline def referenceEnhancer(newValue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("referenceEnhancer")(newValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def shallowEnhancer(v: Any, _underscore: Any, name: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEnhancer")(v.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type IEnhancer[T] = js.Function3[/* newValue */ T, /* oldValue */ js.UndefOr[T], /* name */ String, T]
}
