package typings.openfin.frameFrameMod

import typings.openfin.baseMod.Base
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameModule extends Base {
  
  /**
    * Asynchronously returns a reference to the current frame
    * @return {Promise.<_Frame>}
    * @tutorial Frame.getCurrent
    * @static
    */
  def getCurrent(): js.Promise[Frame] = js.native
  
  /**
    * Synchronously returns a reference to the current frame
    * @return {_Frame}
    * @tutorial Frame.getCurrentSync
    * @static
    */
  def getCurrentSync(): Frame = js.native
  
  /**
    * Asynchronously returns a reference to the specified frame. The frame does not have to exist
    * @param {Identity} identity - the identity of the frame you want to wrap
    * @return {Promise.<_Frame>}
    * @tutorial Frame.wrap
    * @static
    */
  def wrap(identity: Identity): js.Promise[Frame] = js.native
  
  /**
    * Synchronously returns a reference to the specified frame. The frame does not have to exist
    * @param {Identity} identity - the identity of the frame you want to wrap
    * @return {_Frame}
    * @tutorial Frame.wrapSync
    * @static
    */
  def wrapSync(identity: Identity): Frame = js.native
}
