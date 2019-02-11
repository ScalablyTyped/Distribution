package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Island")
@js.native
class Island ()
  extends p2Lib.p2Mod.p2Ns.Island {
  /* CompleteClass */
  override var bodies: js.Array[p2Lib.p2Mod.p2Ns.Body] = js.native
  /* CompleteClass */
  override var equations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override def getBodies(result: js.Array[_]): js.Array[p2Lib.p2Mod.p2Ns.Body] = js.native
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /* CompleteClass */
  override def sleep(): scala.Boolean = js.native
  /* CompleteClass */
  override def wantsToSleep(): scala.Boolean = js.native
}

