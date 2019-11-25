package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var npmDependencies: js.UndefOr[js.Object] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
  var use: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(
    name: String = null,
    npmDependencies: js.Object = null,
    sources: js.Array[String] = null,
    use: String | js.Array[String] = null
  ): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (npmDependencies != null) __obj.updateDynamic("npmDependencies")(npmDependencies.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

