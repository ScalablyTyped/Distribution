package typings.nunjucks.mod

import typings.nunjucks.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecompileOptions extends js.Object {
  var asFunction: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[Environment] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var wrapper: js.UndefOr[js.Function2[/* templates */ AnonName, /* opts */ this.type, String]] = js.undefined
}

object PrecompileOptions {
  @scala.inline
  def apply(
    asFunction: js.UndefOr[Boolean] = js.undefined,
    env: Environment = null,
    exclude: js.Array[String] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String] = null,
    name: String = null,
    wrapper: (/* templates */ AnonName, PrecompileOptions) => String = null
  ): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asFunction)) __obj.updateDynamic("asFunction")(asFunction.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(js.Any.fromFunction2(wrapper))
    __obj.asInstanceOf[PrecompileOptions]
  }
}

