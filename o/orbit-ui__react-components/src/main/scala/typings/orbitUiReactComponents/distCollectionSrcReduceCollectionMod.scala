package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionItem
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcReduceCollectionMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/reduceCollection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduceCollection(nodes: js.Array[CollectionNode], acceptItem: js.Function1[/* item */ CollectionItem, Boolean]): js.Array[CollectionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceCollection")(nodes.asInstanceOf[js.Any], acceptItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[CollectionItem]]
}
