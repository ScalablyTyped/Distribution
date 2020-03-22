package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequire extends js.Object {
  var require: js.UndefOr[
    (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.undefined
  var viewPath: String
}

object AnonRequire {
  @scala.inline
  def apply(
    viewPath: String,
    require: (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ]) = null
  ): AnonRequire = {
    val __obj = js.Dynamic.literal(viewPath = viewPath.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequire]
  }
}

