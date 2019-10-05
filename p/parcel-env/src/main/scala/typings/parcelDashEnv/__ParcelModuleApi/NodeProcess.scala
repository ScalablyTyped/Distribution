package typings.parcelDashEnv.__ParcelModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inside env you can pass any variable
  */
trait NodeProcess extends js.Object {
  var env: js.UndefOr[js.Any] = js.undefined
}

object NodeProcess {
  @scala.inline
  def apply(env: js.Any = null): NodeProcess = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[NodeProcess]
  }
}

