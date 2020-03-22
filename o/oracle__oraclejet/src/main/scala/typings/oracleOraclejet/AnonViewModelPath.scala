package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonViewModelPath extends js.Object {
  var require: js.UndefOr[
    (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.undefined
  var viewModelPath: String
}

object AnonViewModelPath {
  @scala.inline
  def apply(
    viewModelPath: String,
    require: (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ]) = null
  ): AnonViewModelPath = {
    val __obj = js.Dynamic.literal(viewModelPath = viewModelPath.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewModelPath]
  }
}

