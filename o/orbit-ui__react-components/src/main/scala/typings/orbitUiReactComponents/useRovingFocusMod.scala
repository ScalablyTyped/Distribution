package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.IsDisabled
import typings.orbitUiReactComponents.anon.KeyProp
import typings.orbitUiReactComponents.useFocusScopeMod.DomScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRovingFocusMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useRovingFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyedRovingFocus(scope: DomScope, currentKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyedRovingFocus(scope: DomScope, currentKey: String, hasKeyPropIsDisabled: KeyProp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any], hasKeyPropIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useRovingFocus(scope: DomScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRovingFocus(scope: DomScope, hasIsDisabled: IsDisabled): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
