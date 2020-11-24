package typings.observeJs.mod.observejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverTransformInstance extends Observable {
  
  /**
    * sets the observed value without notifying about the change.
    * @param value the value to set
    */
  def setValue(value: js.Any): Unit = js.native
}
