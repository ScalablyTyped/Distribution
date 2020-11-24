package typings.observeJs.mod.observejs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*----------------------
  ObserverTransform
  ----------------------*/
@js.native
trait ObserverTransformStatic
  extends /**
  * Constructor
  * @param observer the observer to transform
  * @param getValue function that proxys getting a value
  * @param setValue function that proxys setting a value
  */
Instantiable3[
      /* observer */ Observable, 
      /* getValue */ js.Function1[/* value */ js.Any, js.Any], 
      /* setValue */ js.Function1[/* value */ js.Any, js.Any], 
      ObserverTransformInstance
    ]
     with /**
  * Constructor
  * @param observer the observer to transform
  * @param valueFn function that gets invoked with all observed values. May return a single new value.
  */
Instantiable2[
      /* observer */ Observable, 
      /* valueFn */ js.Function1[/* values */ js.Array[js.Any], js.Any], 
      ObserverTransformInstance
    ]
