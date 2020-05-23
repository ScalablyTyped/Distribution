package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinLayoutStatic extends js.Object {
  /**
    * Asynchronously returns a Layout object that represents a Window's layout.
    * @return {Promise.<Layout>}
    * @tutorial Layout.getCurrent
    * @static
    */
  def getCurrent(): js.Promise[Layout] = js.native
  /**
    * Synchronously returns a Layout object that represents a Window's layout.
    * @return {Layout}
    * @tutorial Layout.getCurrentSync
    * @static
    */
  def getCurrentSync(): Layout = js.native
  /**
    * Initialize the window's Layout.  Must be called from a custom window that has a truthy 'layout' option property (set `layout` to
    * `true` in order to use this call with your own layout).  If a layout is not provided in the options for this call, the `layout`
    * property set upon creation of that window is used.  If a containerId is not provided, this method attempts to find an element
    * with the id `layout-container`.
    * @param { InitLayoutOptions } [options] - Layout init options.
    * @return { Promise<Layout> }
    * @static
    * @experimental
    * @tutorial Layout.init
    */
  def init(): js.Promise[Layout] = js.native
  def init(options: InitLayoutOptions): js.Promise[Layout] = js.native
  /**
    * Asynchronously returns a Layout object that represents a Window's layout.
    * @param { Identity } identity
    * @return {Promise.<Layout>}
    * @tutorial Layout.wrap
    * @static
    */
  def wrap(identity: Identity): js.Promise[Layout] = js.native
  /**
    * Synchronously returns a Layout object that represents a Window's layout.
    * @param { Identity } identity
    * @return {Layout}
    * @tutorial Layout.wrapSync
    * @static
    */
  def wrapSync(identity: Identity): Layout = js.native
}

