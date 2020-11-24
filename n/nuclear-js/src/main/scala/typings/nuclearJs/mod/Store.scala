package typings.nuclearJs.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[T] extends StoreLike[T] {
  
  /**
    * Deserializes plain JavaScript to store state.
    */
  @JSName("deserialize")
  def deserialize_MStore(state: js.Any): T = js.native
  
  /**
    * Takes a current reactor state, action type and payload, does the
    * reaction, and returns the new state.
    */
  def handle(state: T, actionType: String): T = js.native
  def handle(state: T, actionType: String, payload: js.Any): T = js.native
  
  /**
    * Pure function taking the current state of store and returning the new
    * state after a NuclearJS reactor has been reset
    */
  @JSName("handleReset")
  def handleReset_MStore(state: T): T = js.native
  
  /**
    * Binds an action type to a handler.
    */
  def on(actionType: String, handler: js.Function2[/* state */ T, /* payload */ js.UndefOr[js.Any], T]): Unit = js.native
  
  /**
    * Serializes store state to plain JSON serializable JavaScript.
    */
  @JSName("serialize")
  def serialize_MStore(state: T): js.Any = js.native
}
@JSImport("nuclear-js", "Store")
@js.native
object Store
  extends /**
  * A Store defines how a certain domain of the application should respond to
  * actions taken on the whole system. They manage their own section of the
  * entire app state and have no knowledge about the other parts of the
  * application state.
  */
Instantiable1[/* config */ StoreLike[js.Object], Store[js.Object]] {
  
  /**
    * A Store defines how a certain domain of the application should respond to
    * actions taken on the whole system. They manage their own section of the
    * entire app state and have no knowledge about the other parts of the
    * application state.
    */
  def apply[T](config: StoreLike[T]): Store[T] = js.native
}
