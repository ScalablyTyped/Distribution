package typings.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkInternalStructuresMod {
  import typings.mendixmodelsdk.distSdkInternalPropertiesMod.PartListProperty
  import typings.mendixmodelsdk.distSdkInternalPropertiesMod.PartProperty
  import typings.mendixmodelsdk.distSdkInternalPropertiesMod.StructuralChildListProperty
  import typings.mendixmodelsdk.distSdkInternalPropertiesMod.StructuralChildProperty

  type AbstractStructureProperty = PartProperty[js.Any] | PartListProperty[js.Any] | StructuralChildProperty[js.Any] | StructuralChildListProperty[js.Any]
}
