package typings.observeDashJs.observeDashJsMod.observejsNs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*----------------------
		ObserverTransform
	----------------------*/
@js.native
trait ObserverTransform_static
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
      ObserverTransform_instance
    ]
     with /**
		 * Constructor
		 * @param observer the observer to transform
		 * @param valueFn function that gets invoked with all observed values. May return a single new value.
		 */
Instantiable2[
      /* observer */ Observable, 
      /* valueFn */ js.Function1[/* values */ js.Array[js.Any], js.Any], 
      ObserverTransform_instance
    ]

