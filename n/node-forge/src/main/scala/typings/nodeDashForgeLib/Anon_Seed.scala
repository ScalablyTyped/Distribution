package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Seed extends js.Object {
  var seed: js.UndefOr[nodeLib.Buffer | stdLib.Uint8Array | java.lang.String] = js.undefined
}

object Anon_Seed {
  @scala.inline
  def apply(seed: nodeLib.Buffer | stdLib.Uint8Array | java.lang.String = null): Anon_Seed = {
    val __obj = js.Dynamic.literal()
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Seed]
  }
}

