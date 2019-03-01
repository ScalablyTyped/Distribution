package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrbackModule extends js.Object {
  var require: js.UndefOr[
    (js.Function1[/* module */ java.lang.String, _]) | (js.Function3[
      /* modules */ js.Array[java.lang.String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      scala.Unit
    ])
  ] = js.undefined
  var viewModelPath: java.lang.String
}

object Anon_ErrbackModule {
  @scala.inline
  def apply(
    viewModelPath: java.lang.String,
    require: (js.Function1[/* module */ java.lang.String, _]) | (js.Function3[
      /* modules */ js.Array[java.lang.String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      scala.Unit
    ]) = null
  ): Anon_ErrbackModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("viewModelPath")(viewModelPath)
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrbackModule]
  }
}

