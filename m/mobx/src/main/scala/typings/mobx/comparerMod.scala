package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparerMod {
  
  object comparer {
    
    @JSImport("mobx/dist/utils/comparer", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/dist/utils/comparer", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def default(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def default_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/dist/utils/comparer", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def identity(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def identity_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/dist/utils/comparer", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def shallow(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def shallow_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/dist/utils/comparer", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def structural(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("structural")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def structural_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  type IEqualsComparer[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}
