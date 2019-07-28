package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCoreInterfacesMod {
  type AppliedProjector = js.Function2[/* datum */ js.Any, /* index */ Double, js.Any]
  type AttributeToAppliedProjector = StringDictionary[AppliedProjector]
  type AttributeToProjector = StringDictionary[Projector]
  type IAccessor[T] = js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, T]
  type IRangeProjector[T] = js.Function4[/* value */ T, /* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, T]
  type Projector = js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, js.Any]
  type SimpleSelection[Datum] = Selection[BaseType, Datum | js.Object, js.Any, js.Any]
}
