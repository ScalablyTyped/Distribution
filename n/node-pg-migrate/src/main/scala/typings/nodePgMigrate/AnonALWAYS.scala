package typings.nodePgMigrate

import typings.nodePgMigrate.nodePgMigrateStrings.ALWAYS
import typings.nodePgMigrate.nodePgMigrateStrings.`BY DEFAULT`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonALWAYS extends js.Object {
  var precedence: ALWAYS | (`BY DEFAULT`)
}

object AnonALWAYS {
  @scala.inline
  def apply(precedence: ALWAYS | (`BY DEFAULT`)): AnonALWAYS = {
    val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonALWAYS]
  }
}

