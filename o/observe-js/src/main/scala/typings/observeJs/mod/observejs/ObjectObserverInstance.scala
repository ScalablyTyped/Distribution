package typings.observeJs.mod.observejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectObserverInstance extends Observable {
  
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
