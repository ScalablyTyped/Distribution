package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSdkInternalAbstractDashModelMod {
  type ISubResolver = js.Function2[/* parent */ IStructure, /* partName */ String, IStructure]
  type IUnitsByTypeCache = StringDictionary[js.Array[IAbstractUnit]]
  type IUnitsMap = StringDictionary[IAbstractUnit]
}
