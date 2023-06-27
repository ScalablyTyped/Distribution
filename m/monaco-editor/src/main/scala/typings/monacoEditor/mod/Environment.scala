package typings.monacoEditor.mod

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
  /**
    * The base url where the editor sources are found (which contains the vs folder)
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Create a trusted types policy (same API as window.trustedTypes.createPolicy)
    */
  def createTrustedTypesPolicy(policyName: String): js.UndefOr[ITrustedTypePolicy] = js.native
  def createTrustedTypesPolicy(policyName: String, policyOptions: ITrustedTypePolicyOptions): js.UndefOr[ITrustedTypePolicy] = js.native
  
  /**
    * A web worker factory.
    * NOTE: If `getWorker` is defined, `getWorkerUrl` is not invoked.
    */
  var getWorker: js.UndefOr[
    js.Function2[/* workerId */ String, /* label */ String, js.Promise[Worker] | Worker]
  ] = js.native
  
  /**
    * Return the location for web worker scripts.
    * NOTE: If `getWorker` is defined, `getWorkerUrl` is not invoked.
    */
  var getWorkerUrl: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, String]] = js.native
  
  /**
    * Define a global `monaco` symbol.
    * This is true by default in AMD and false by default in ESM.
    */
  var globalAPI: js.UndefOr[Boolean] = js.native
}
