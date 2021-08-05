package typings.nodeMachineId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-machine-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This function gets the OS native UUID/GUID asynchronously (recommended), hashed by default.
    * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
    */
  inline def machineId(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("machineId")().asInstanceOf[js.Promise[String]]
  inline def machineId(original: Boolean): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("machineId")(original.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * This function gets the OS native UUID/GUID synchronously, hashed by default.
    * @param {boolean} [original=false] - If true return original value of machine id, otherwise return hashed value (sha - 256)
    */
  inline def machineIdSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("machineIdSync")().asInstanceOf[String]
  inline def machineIdSync(original: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("machineIdSync")(original.asInstanceOf[js.Any]).asInstanceOf[String]
}
