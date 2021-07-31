package typings.miniStore

import typings.miniStore.typesMod.Store
import typings.react.mod.Component
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("mini-store/cjs/Provider", "MiniStoreContext")
  @js.native
  val MiniStoreContext: Context[Store[js.Object] | Null] = js.native
  
  @JSImport("mini-store/cjs/Provider", "Provider")
  @js.native
  class Provider protected ()
    extends Component[ProviderProps, js.Object, js.Any] {
    def this(props: ProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps, context: js.Any) = this()
  }
  
  trait ProviderProps extends StObject {
    
    var store: Store[js.Object]
  }
  object ProviderProps {
    
    @scala.inline
    def apply(store: Store[js.Object]): ProviderProps = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store[js.Object]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
