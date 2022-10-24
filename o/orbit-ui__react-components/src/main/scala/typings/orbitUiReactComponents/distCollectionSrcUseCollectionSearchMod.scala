package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcUseCollectionSearchMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/useCollectionSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCollectionSearch(children: ReactNode, param1: UseCollectionSearchOptions): js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ SyntheticEvent[Element, Event], /* query */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectionSearch")(children.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ SyntheticEvent[Element, Event], /* query */ String, Unit]
  ]]
  
  trait UseCollectionSearchOptions extends StObject {
    
    var onSearch: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Element, Event], /* query */ String, Unit]
      ] = js.undefined
  }
  object UseCollectionSearchOptions {
    
    inline def apply(): UseCollectionSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCollectionSearchOptions]
    }
    
    extension [Self <: UseCollectionSearchOptions](x: Self) {
      
      inline def setOnSearch(value: (/* event */ SyntheticEvent[Element, Event], /* query */ String) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
}
