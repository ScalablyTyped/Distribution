package typings.mongooseDashSeeder.mongooseDashSeederMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose-seeder", "seed")
@js.native
object seed extends js.Object {
  def apply(data: js.Any, callback: seedCallback): Unit = js.native
  def apply(data: js.Any, options: IOptions): Promise[_] = js.native
  def apply(data: js.Any, options: IOptions, callback: seedCallback): Unit = js.native
}

