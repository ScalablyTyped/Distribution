package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyNamePair extends js.Object {
  val Key: Double = js.native
  val Name: String = js.native
  def Clone(): IKeyNamePair = js.native
}

object IKeyNamePair {
  @scala.inline
  def apply(Clone: () => IKeyNamePair, Key: Double, Name: String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyNamePair]
  }
  @scala.inline
  implicit class IKeyNamePairOps[Self <: IKeyNamePair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IKeyNamePair): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: Double): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

