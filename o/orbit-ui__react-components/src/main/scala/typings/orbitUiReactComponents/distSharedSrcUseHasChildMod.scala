package typings.orbitUiReactComponents

import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseHasChildMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useHasChild", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHasChild(querySelector: String, rootRef: RefObject[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChild")(querySelector.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useHasChildren(querySelectors: Record[String, String], rootRef: RefObject[HTMLElement]): Record[String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChildren")(querySelectors.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Record[String, Boolean]]
}
