package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNamePair extends js.Object {
  val Key: Double
  val Name: String
  def Clone(): IKeyNamePair
}

object IKeyNamePair {
  @scala.inline
  def apply(Clone: () => IKeyNamePair, Key: Double, Name: String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyNamePair]
  }
}

