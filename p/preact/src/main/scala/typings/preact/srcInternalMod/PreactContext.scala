package typings.preact.srcInternalMod

import typings.preact.srcMod.Consumer
import typings.preact.srcMod.Context
import typings.preact.srcMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreactContext
  extends Context[js.Any] {
  var _defaultValue: js.Any
  var _id: String
}

object PreactContext {
  @scala.inline
  def apply(Consumer: Consumer[js.Any], Provider: Provider[js.Any], _defaultValue: js.Any, _id: String): PreactContext = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider, _defaultValue = _defaultValue, _id = _id)
  
    __obj.asInstanceOf[PreactContext]
  }
}

