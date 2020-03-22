package typings.openfin.externalApplicationExternalApplicationMod

import typings.openfin.baseMod.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalApplicationModule extends Base {
  /**
    * Asynchronously returns an External Application object that represents an external application.
    * <br>It is possible to wrap a process that does not yet exist, (for example, to listen for startup-related events)
    * provided its uuid is already known.
    * @param {string} uuid The UUID of the external application to be wrapped
    * @return {Promise.<ExternalApplication>}
    * @tutorial ExternalApplication.wrap
    * @static
    */
  def wrap(uuid: String): js.Promise[ExternalApplication] = js.native
  /**
    * Synchronously returns an External Application object that represents an external application.
    * <br>It is possible to wrap a process that does not yet exist, (for example, to listen for startup-related events)
    * provided its uuid is already known.
    * @param {string} uuid The UUID of the external application to be wrapped
    * @return {ExternalApplication}
    * @tutorial ExternalApplication.wrapSync
    * @static
    */
  def wrapSync(uuid: String): ExternalApplication = js.native
}

