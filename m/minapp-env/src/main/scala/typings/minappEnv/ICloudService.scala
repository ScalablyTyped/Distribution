package typings.minappEnv

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloudService extends js.Object {
  var name: java.lang.String
  def getAPIs(): StringDictionary[IAPIFunction[_, _]]
}

object ICloudService {
  @scala.inline
  def apply(getAPIs: () => StringDictionary[IAPIFunction[_, _]], name: java.lang.String): ICloudService = {
    val __obj = js.Dynamic.literal(getAPIs = js.Any.fromFunction0(getAPIs), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudService]
  }
}

