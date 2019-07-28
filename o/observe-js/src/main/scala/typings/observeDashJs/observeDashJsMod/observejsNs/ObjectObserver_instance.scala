package typings.observeDashJs.observeDashJsMod.observejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectObserver_instance extends Observable {
  def open(
    onChange: js.Function4[
      /* added */ Properties, 
      /* removed */ Properties, 
      /* changed */ Properties, 
      /* getOldValueFn */ js.Function1[/* property */ String, _], 
      _
    ]
  ): Unit = js.native
}

