package typings.nodeDashJose.nodeDashJoseMod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptor extends js.Object {
  def `final`(): js.Promise[String]
  def update(input: js.Any): this.type
}

object Encryptor {
  @scala.inline
  def apply(`final`: () => js.Promise[String], update: js.Any => Encryptor): Encryptor = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
    __obj.asInstanceOf[Encryptor]
  }
}

