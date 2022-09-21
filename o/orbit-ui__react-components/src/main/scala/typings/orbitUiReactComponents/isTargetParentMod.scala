package typings.orbitUiReactComponents

import typings.react.mod.RefObject
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isTargetParentMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/isTargetParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTargetParent(target: EventTarget, parentRef: RefObject[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetParent")(target.asInstanceOf[js.Any], parentRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
