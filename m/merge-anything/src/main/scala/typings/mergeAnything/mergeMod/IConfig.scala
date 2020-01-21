package typings.mergeAnything.mergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var extensions: js.Array[Extension]
}

object IConfig {
  @scala.inline
  def apply(extensions: js.Array[Extension]): IConfig = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConfig]
  }
}

