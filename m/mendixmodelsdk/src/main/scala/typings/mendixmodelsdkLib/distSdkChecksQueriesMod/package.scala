package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkChecksQueriesMod {
  type IQueryResolver = js.Function2[
    /* queryName */ java.lang.String, 
    /* qualifiedStructureName */ java.lang.String, 
    js.UndefOr[IQuery]
  ]
}
