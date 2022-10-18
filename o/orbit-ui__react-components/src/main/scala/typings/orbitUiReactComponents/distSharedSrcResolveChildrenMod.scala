package typings.orbitUiReactComponents

import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcResolveChildrenMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/resolveChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveChildren(children: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def resolveChildren(children: ReactNode, renderProps: Record[String, Any]): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any], renderProps.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def resolveFragment(children: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFragment")(children.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
}
