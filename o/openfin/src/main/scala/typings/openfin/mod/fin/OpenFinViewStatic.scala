package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinViewStatic extends js.Object {
  /**
    * Creates a new View.
    * @param { View~options } options - View creation options
    * @return {Promise.<View>}
    * @tutorial View.create
    * @experimental
    * @static
    */
  def create(options: ViewCreationOptions): js.Promise[View]
  /**
    * Asynchronously returns a View object that represents the current view
    * @return {Promise.<View>}
    * @tutorial View.getCurrent
    * @experimental
    * @static
    */
  def getCurrent(): js.Promise[View]
  /**
    * Synchronously returns a View object that represents the current view
    * @return {View}
    * @tutorial View.getCurrentSync
    * @experimental
    * @static
    */
  def getCurrentSync(): View
  /**
    * Asynchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {Promise.<View>}
    * @tutorial View.wrap
    * @experimental
    * @static
    */
  def wrap(identity: Identity): js.Promise[View]
  /**
    * Synchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {View}
    * @tutorial View.wrapSync
    * @experimental
    * @static
    */
  def wrapSync(identity: Identity): View
}

object OpenFinViewStatic {
  @scala.inline
  def apply(
    create: ViewCreationOptions => js.Promise[View],
    getCurrent: () => js.Promise[View],
    getCurrentSync: () => View,
    wrap: Identity => js.Promise[View],
    wrapSync: Identity => View
  ): OpenFinViewStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), getCurrent = js.Any.fromFunction0(getCurrent), getCurrentSync = js.Any.fromFunction0(getCurrentSync), wrap = js.Any.fromFunction1(wrap), wrapSync = js.Any.fromFunction1(wrapSync))
    __obj.asInstanceOf[OpenFinViewStatic]
  }
}

