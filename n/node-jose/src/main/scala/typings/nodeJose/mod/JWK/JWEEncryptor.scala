package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWEEncryptor extends js.Object {
  def `final`(): js.Promise[String]
  def update(input: js.Any): this.type
}

object JWEEncryptor {
  @scala.inline
  def apply(`final`: () => js.Promise[String], update: js.Any => JWEEncryptor): JWEEncryptor = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
    __obj.asInstanceOf[JWEEncryptor]
  }
}

