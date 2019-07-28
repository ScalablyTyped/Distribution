package typings.plottable.buildSrcDispatchersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers", "Key")
@js.native
/**
  * This constructor should not be invoked directly.
  *
  * @constructor
  */
class Key ()
  extends typings.plottable.buildSrcDispatchersKeyDispatcherMod.Key

/* static members */
@JSImport("plottable/build/src/dispatchers", "Key")
@js.native
object Key extends js.Object {
  var _DISPATCHER_KEY: js.Any = js.native
  var _KEYDOWN_EVENT_NAME: js.Any = js.native
  var _KEYUP_EVENT_NAME: js.Any = js.native
  /**
    * Gets a Key Dispatcher. If one already exists it will be returned;
    * otherwise, a new one will be created.
    *
    * @return {Dispatchers.Key}
    */
  def getDispatcher(): Key = js.native
}

