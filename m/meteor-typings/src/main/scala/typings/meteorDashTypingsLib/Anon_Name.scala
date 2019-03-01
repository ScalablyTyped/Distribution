package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var npmDependencies: js.UndefOr[js.Object] = js.undefined
  var sources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var use: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    npmDependencies: js.Object = null,
    sources: js.Array[java.lang.String] = null,
    use: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (npmDependencies != null) __obj.updateDynamic("npmDependencies")(npmDependencies)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

