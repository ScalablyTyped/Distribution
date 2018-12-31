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

