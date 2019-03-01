package typings
package owaspDashPasswordDashStrengthDashTestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Optional extends js.Object {
  var optional: js.Array[
    owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod.PasswordTest
  ]
  var required: js.Array[
    owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod.PasswordTest
  ]
}

object Anon_Optional {
  @scala.inline
  def apply(
    optional: js.Array[
      owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod.PasswordTest
    ],
    required: js.Array[
      owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod.PasswordTest
    ]
  ): Anon_Optional = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Optional]
  }
}

