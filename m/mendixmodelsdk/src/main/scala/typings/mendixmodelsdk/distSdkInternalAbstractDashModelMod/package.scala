package typings.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkInternalAbstractDashModelMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
  import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit

  type ISubResolver = js.Function2[/* parent */ IStructure, /* partName */ String, IStructure]
  type IUnitsByTypeCache = StringDictionary[js.Array[IAbstractUnit]]
  type IUnitsMap = StringDictionary[IAbstractUnit]
}
