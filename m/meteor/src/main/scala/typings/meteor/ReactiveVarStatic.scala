package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveVarStatic
  extends StObject
     with /**
  * Constructor for a ReactiveVar, which represents a single reactive variable.
  * @param initialValue The initial value to set. `equalsFunc` is ignored when setting the initial value.
  * @param equalsFunc A function of two arguments, called on the old value and the new value whenever the ReactiveVar is set. If it returns true, no set is performed. If omitted, the default
  * `equalsFunc` returns true if its arguments are `===` and are of type number, boolean, string, undefined, or null.
  */
Instantiable1[/* initialValue */ js.Object, ReactiveVar[js.Object]]
     with Instantiable2[
      /* initialValue */ js.Object, 
      /* equalsFunc */ js.Function2[/* oldValue */ js.Object, /* newValue */ js.Object, Boolean], 
      ReactiveVar[js.Object]
    ]
