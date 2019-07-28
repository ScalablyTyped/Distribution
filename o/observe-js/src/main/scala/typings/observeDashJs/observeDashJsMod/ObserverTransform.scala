package typings.observeDashJs.observeDashJsMod

import typings.observeDashJs.observeDashJsMod.observejsNs.Observable
import typings.observeDashJs.observeDashJsMod.observejsNs.ObserverTransform_instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("observe-js", "ObserverTransform")
@js.native
class ObserverTransform protected () extends ObserverTransform_instance {
  /**
  		 * Constructor
  		 * @param observer the observer to transform
  		 * @param valueFn function that gets invoked with all observed values. May return a single new value.
  		 */
  def this(observer: Observable, valueFn: js.Function1[/* values */ js.Array[_], _]) = this()
  /**
  		 * Constructor
  		 * @param observer the observer to transform
  		 * @param getValue function that proxys getting a value
  		 * @param setValue function that proxys setting a value
  		 */
  def this(
    observer: Observable,
    getValue: js.Function1[/* value */ js.Any, _],
    setValue: js.Function1[/* value */ js.Any, _]
  ) = this()
}

