package typings.openfin.platformMod

import typings.openfin.applicationMod.RvmLaunchOptions
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformModule extends js.Object {
  var _channel: js.Any = js.native
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
    * @experimental
    */
  def getCurrentSync(): Platform = js.native
  /**
    * Creates and starts a Platform and returns a wrapped and running Platform.  The wrapped Platform methods can
    * be used to launch content into the platform.  Promise will reject if the platform is already running.
    * @param { PlatformOptions } platformOptions
    * @return {Promise.<Platform>}
    * @tutorial Platform.start
    * @static
    * @experimental
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
    * @experimental
    */
  def startFromManifest(manifestUrl: String): js.Promise[Platform] = js.native
  def startFromManifest(manifestUrl: String, opts: RvmLaunchOptions): js.Promise[Platform] = js.native
  /**
    * Asynchronously returns a Platform object that represents an existing platform.
    * @param { Identity } identity
    * @return {Promise.<Platform>}
    * @tutorial Platform.wrap
    * @static
    * @experimental
    */
  def wrap(identity: Identity): js.Promise[Platform] = js.native
  /**
    * Synchronously returns a Platform object that represents an existing platform.
    * @param { Identity } identity
    * @return {Platform}
    * @tutorial Platform.wrapSync
    * @static
    * @experimental
    */
  def wrapSync(identity: Identity): Platform = js.native
}

