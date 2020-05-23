package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinPlatformStatic extends js.Object {
  var Layout: OpenFinLayoutStatic = js.native
  /**
    * Asynchronously returns a Platform object that represents the current platform.
    * @return {Promise.<Platform>}
    * @tutorial Platform.getCurrent
    * @static
    */
  def getCurrent(): js.Promise[Platform] = js.native
  /**
    * Synchronously returns a Platform object that represents the current platform.
    * @return {Platform}
    * @tutorial Platform.getCurrentSync
    * @static
    */
  def getCurrentSync(): Platform = js.native
  /**
    * Initializes a Platform. Must be called from the Provider when using a custom provider.
    * @param { InitPlatformOptions } [options] - platform options including a callback function that can be used to extend or replace
    * default Provider behavior.
    * @return {Promise.<void>}
    * @tutorial Platform.init
    * @experimental
    * @static
    */
  def init(): js.Promise[_] = js.native
  def init(options: InitPlatformOptions): js.Promise[_] = js.native
  /**
    * Creates and starts a Platform and returns a wrapped and running Platform instance. The wrapped Platform methods can
    * be used to launch content into the platform.  Promise will reject if the platform is already running.
    * @param { PlatformOptions } platformOptions
    * @return {Promise.<Platform>}
    * @tutorial Platform.start
    * @static
    */
  def start(platformOptions: PlatformOptions): js.Promise[Platform] = js.native
  /**
    * Retrieves platforms's manifest and returns a wrapped and running Platform.  If there is a snapshot in the manifest,
    * it will be launched into the platform.
    * @param {string} manifestUrl - The URL of platform's manifest.
    * @param {RvmLaunchOptions} [opts] - Parameters that the RVM will use.
    * @return {Promise.<Platform>}
    * @tutorial Platform.startFromManifest
    * @static
    */
  def startFromManifest(manifestUrl: String): js.Promise[Platform] = js.native
  def startFromManifest(manifestUrl: String, opts: RvmLaunchOptions): js.Promise[Platform] = js.native
  /**
    * Asynchronously returns a Platform object that represents an existing platform.
    * @param { Identity } identity
    * @return {Promise.<Platform>}
    * @tutorial Platform.wrap
    * @static
    */
  def wrap(identity: Identity): js.Promise[Platform] = js.native
  /**
    * Synchronously returns a Platform object that represents an existing platform.
    * @param { Identity } identity
    * @return {Platform}
    * @tutorial Platform.wrapSync
    * @static
    */
  def wrapSync(identity: Identity): Platform = js.native
}

