package typings
package mendixmodelsdkLib.distSdkChecksChecksDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheck extends js.Object {
  /** Qualified type names of all assignment-compatible and concrete types (among sub types of structure including self). */
  var allCompatibleTypes: js.Array[java.lang.String]
  var name: java.lang.String
  /** Qualified type name (matching Structure.structureTypeName) */
  var structure: java.lang.String
  var versionCheckBodies: js.Array[ICheckBodyForVersion]
}

