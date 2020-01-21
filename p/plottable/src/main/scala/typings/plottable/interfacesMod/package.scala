package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type AppliedProjector = js.Function2[/* datum */ js.Any, /* index */ scala.Double, js.Any]
  type AttributeToAppliedProjector = org.scalablytyped.runtime.StringDictionary[typings.plottable.interfacesMod.AppliedProjector]
  type AttributeToProjector = org.scalablytyped.runtime.StringDictionary[typings.plottable.interfacesMod.Projector]
  type IAccessor[T] = js.Function3[
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ typings.plottable.datasetMod.Dataset, 
    T
  ]
  type IRangeProjector[T] = js.Function4[
    /* value */ T, 
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ typings.plottable.datasetMod.Dataset, 
    T
  ]
  type Projector = js.Function3[
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ typings.plottable.datasetMod.Dataset, 
    js.Any
  ]
  type SimpleSelection[Datum] = typings.d3Selection.mod.Selection_[typings.d3Selection.mod.BaseType, Datum | js.Object, js.Any, js.Any]
}
