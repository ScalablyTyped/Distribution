package typings.opentelemetryApi.traceStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceState extends js.Object {
  
  /**
    * Returns the value to which the specified key is mapped, or `undefined` if
    * this map contains no mapping for the key.
    *
    * @param key with which the specified value is to be associated.
    * @returns the value to which the specified key is mapped, or `undefined` if
    *     this map contains no mapping for the key.
    */
  def get(key: String): js.UndefOr[String] = js.native
  
  /**
    * Serializes the TraceState to a `list` as defined below. The `list` is a
    * series of `list-members` separated by commas `,`, and a list-member is a
    * key/value pair separated by an equals sign `=`. Spaces and horizontal tabs
    * surrounding `list-members` are ignored. There can be a maximum of 32
    * `list-members` in a `list`.
    *
    * @returns the serialized string.
    */
  def serialize(): String = js.native
  
  /**
    * Adds or updates the TraceState that has the given `key` if it is
    * present. The new State will always be added in the front of the
    * list of states.
    *
    * @param key key of the TraceState entry.
    * @param value value of the TraceState entry.
    */
  def set(key: String, value: String): Unit = js.native
  
  /**
    * Removes the TraceState Entry that has the given `key` if it is present.
    *
    * @param key the key for the TraceState Entry to be removed.
    */
  def unset(key: String): Unit = js.native
}
object TraceState {
  
  @scala.inline
  def apply(
    get: String => js.UndefOr[String],
    serialize: () => String,
    set: (String, String) => Unit,
    unset: String => Unit
  ): TraceState = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), serialize = js.Any.fromFunction0(serialize), set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[TraceState]
  }
  
  @scala.inline
  implicit class TraceStateOps[Self <: TraceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: String => js.UndefOr[String]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: () => String): Self = this.set("serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnset(value: String => Unit): Self = this.set("unset", js.Any.fromFunction1(value))
  }
}
