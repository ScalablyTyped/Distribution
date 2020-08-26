package typings.minappEnv

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICloudService extends js.Object {
  var name: java.lang.String = js.native
  def getAPIs(): StringDictionary[IAPIFunction[_, _]] = js.native
}

object ICloudService {
  @scala.inline
  def apply(getAPIs: () => StringDictionary[IAPIFunction[_, _]], name: java.lang.String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = js.Any.fromFunction0(getAPIs), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
  @scala.inline
  implicit class ICloudServiceOps[Self <: ICloudService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAPIs(value: () => StringDictionary[IAPIFunction[_, _]]): Self = this.set("getAPIs", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

