package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparerMod {
  
  object comparer {
    
    @JSImport("mobx/lib/utils/comparer", "comparer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/utils/comparer", "comparer.default")
    @js.native
    def default: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/utils/comparer", "comparer.default")
    @js.native
    def default(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def default_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/utils/comparer", "comparer.identity")
    @js.native
    def identity: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/utils/comparer", "comparer.identity")
    @js.native
    def identity(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def identity_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/utils/comparer", "comparer.shallow")
    @js.native
    def shallow: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/utils/comparer", "comparer.shallow")
    @js.native
    def shallow(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def shallow_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/utils/comparer", "comparer.structural")
    @js.native
    def structural: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSImport("mobx/lib/utils/comparer", "comparer.structural")
    @js.native
    def structural(a: js.Any, b: js.Any): Boolean = js.native
    @scala.inline
    def structural_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structural")(x.asInstanceOf[js.Any])
  }
  
  type IEqualsComparer[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}
