package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typings.orbitUiReactComponents.distSharedSrcSizeMod.SizeAdapter
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcAugmentElementMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/augmentElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def augmentElement(element: ReactElement & RefAttributes[Any], newProps: Record[String, Any]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentElement")(element.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  inline def createEmbeddableAdapter[T /* <: Size */](sizeAdapter: SizeAdapter[T]): js.Function2[/* element */ ReactElement, /* param1 */ RecordWithSize, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmbeddableAdapter")(sizeAdapter.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* element */ ReactElement, /* param1 */ RecordWithSize, ReactElement]]
  
  type RecordWithSize = typings.orbitUiReactComponents.anon.Size & (Record[String, Any])
}
