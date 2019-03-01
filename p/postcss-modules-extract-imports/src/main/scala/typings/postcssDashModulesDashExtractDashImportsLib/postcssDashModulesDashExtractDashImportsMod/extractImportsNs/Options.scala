package typings
package postcssDashModulesDashExtractDashImportsLib.postcssDashModulesDashExtractDashImportsMod.extractImportsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var createImportedName: js.UndefOr[
    js.Function2[
      /* importName */ java.lang.String, 
      /* importPath */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var failOnWrongOrder: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    createImportedName: js.Function2[
      /* importName */ java.lang.String, 
      /* importPath */ java.lang.String, 
      java.lang.String
    ] = null,
    failOnWrongOrder: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (createImportedName != null) __obj.updateDynamic("createImportedName")(createImportedName)
    if (!js.isUndefined(failOnWrongOrder)) __obj.updateDynamic("failOnWrongOrder")(failOnWrongOrder)
    __obj.asInstanceOf[Options]
  }
}

