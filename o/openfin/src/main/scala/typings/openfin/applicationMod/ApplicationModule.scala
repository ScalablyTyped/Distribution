package typings.openfin.applicationMod

import typings.openfin.applicationOptionMod.ApplicationOption
import typings.openfin.baseMod.Base
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationModule extends Base {
  
  var _create: js.Any = js.native
  
  var _createFromManifest: js.Any = js.native
  
  /**
    * DEPRECATED method to create a new Application. Use {@link Application.start} instead.
    * @param { ApplicationOption } appOptions
    * @return {Promise.<Application>}
    * @tutorial Application.create
    * @ignore
    */
  def create(appOptions: ApplicationOption): js.Promise[Application] = js.native
  
  def createFromManifest(manifestUrl: String): js.Promise[Application] = js.native
  
  /**
    * Asynchronously returns an Application object that represents the current application
    * @return {Promise.<Application>}
    * @tutorial Application.getCurrent
    * @static
    */
  def getCurrent(): js.Promise[Application] = js.native
  
  /**
    * Synchronously returns an Application object that represents the current application
    * @return {Application}
    * @tutorial Application.getCurrentSync
    * @static
    */
  def getCurrentSync(): Application = js.native
  
  /**
    * Creates and starts a new Application.
    * @param { ApplicationOption } appOptions
    * @return {Promise.<Application>}
    * @tutorial Application.start
    * @static
    */
  def start(appOptions: ApplicationOption): js.Promise[Application] = js.native
  
  /**
    * Retrieves application's manifest and returns a running instance of the application.
    * @param {string} manifestUrl - The URL of app's manifest.
    * @param {RvmLaunchOptions} [opts] - Parameters that the RVM will use.
    * @return {Promise.<Application>}
    * @tutorial Application.startFromManifest
    * @static
    */
  def startFromManifest(manifestUrl: String): js.Promise[Application] = js.native
  def startFromManifest(manifestUrl: String, opts: RvmLaunchOptions): js.Promise[Application] = js.native
  
  /**
    * Asynchronously starts a batch of applications given an array of application identifiers and manifestUrls.
    * Returns once the RVM is finished attempting to launch the applications.
    * @param { Array.<ManifestInfo> } applications
    * @return {Promise.<void>}
    * @static
    * @tutorial Application.startManyManifests
    * @experimental
    */
  def startManyManifests(applications: js.Array[ManifestInfo]): js.Promise[Unit] = js.native
  
  /**
    * Asynchronously returns an Application object that represents an existing application.
    * @param { Identity } identity
    * @return {Promise.<Application>}
    * @tutorial Application.wrap
    * @static
    */
  def wrap(identity: Identity): js.Promise[Application] = js.native
  
  /**
    * Synchronously returns an Application object that represents an existing application.
    * @param { Identity } identity
    * @return {Application}
    * @tutorial Application.wrapSync
    * @static
    */
  def wrapSync(identity: Identity): Application = js.native
}
