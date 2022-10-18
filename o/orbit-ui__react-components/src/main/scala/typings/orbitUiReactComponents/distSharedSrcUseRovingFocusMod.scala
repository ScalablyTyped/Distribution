package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.IsDisabled
import typings.orbitUiReactComponents.anon.`2`
import typings.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseRovingFocusMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useRovingFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyedRovingFocus(scope: DomScope, currentKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyedRovingFocus(scope: DomScope, currentKey: String, hasKeyPropIsDisabled: IsDisabled): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any], hasKeyPropIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useRovingFocus(scope: DomScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRovingFocus(scope: DomScope, hasIsDisabled: `2`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
