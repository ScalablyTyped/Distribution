package typings.officeUiFabricReact.scrollablePaneDetailsListExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneDetailsListExampleItem extends js.Object {
  var key: Double | String = js.native
  var test1: String = js.native
  var test2: String = js.native
  var test3: String = js.native
  var test4: String = js.native
  var test5: String = js.native
  var test6: String = js.native
}

object IScrollablePaneDetailsListExampleItem {
  @scala.inline
  def apply(
    key: Double | String,
    test1: String,
    test2: String,
    test3: String,
    test4: String,
    test5: String,
    test6: String
  ): IScrollablePaneDetailsListExampleItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], test1 = test1.asInstanceOf[js.Any], test2 = test2.asInstanceOf[js.Any], test3 = test3.asInstanceOf[js.Any], test4 = test4.asInstanceOf[js.Any], test5 = test5.asInstanceOf[js.Any], test6 = test6.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneDetailsListExampleItem]
  }
  @scala.inline
  implicit class IScrollablePaneDetailsListExampleItemOps[Self <: IScrollablePaneDetailsListExampleItem] (val x: Self) extends AnyVal {
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
    def setKey(value: Double | String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest1(value: String): Self = this.set("test1", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest2(value: String): Self = this.set("test2", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest3(value: String): Self = this.set("test3", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest4(value: String): Self = this.set("test4", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest5(value: String): Self = this.set("test5", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest6(value: String): Self = this.set("test6", value.asInstanceOf[js.Any])
  }
  
}

