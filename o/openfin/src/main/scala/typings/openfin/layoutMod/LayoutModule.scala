package typings.openfin.layoutMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutModule extends js.Object {
  
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
    * Initialize the window's Layout.  Must be called from a custom window that has a 'layout' option set upon creation of that window.
    * If a containerId is not provided, this method attempts to find an element with the id `layout-container`.
    * A Layout will <a href="tutorial-Layout.DOMEvents.html">emit events locally</a> on the DOM element representing the layout-container.
    * In order to capture the relevant events during Layout initiation, set up the listeners on the DOM element prior to calling `init`.
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
