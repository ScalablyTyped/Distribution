package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amplifier extends js.Object {
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var amplifier: Double
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var chance: Double
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var duration: Double
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var name: String
}

object Anon_Amplifier {
  @scala.inline
  def apply(amplifier: Double, chance: Double, duration: Double, name: String): Anon_Amplifier = {
    val __obj = js.Dynamic.literal(amplifier = amplifier, chance = chance, duration = duration, name = name)
  
    __obj.asInstanceOf[Anon_Amplifier]
  }
}

