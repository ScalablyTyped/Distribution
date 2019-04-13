package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCoreInterfacesMod {
  type AppliedProjector = js.Function2[/* datum */ js.Any, /* index */ scala.Double, js.Any]
  type AttributeToAppliedProjector = org.scalablytyped.runtime.StringDictionary[AppliedProjector]
  type AttributeToProjector = org.scalablytyped.runtime.StringDictionary[Projector]
  type IAccessor[T] = js.Function3[
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ plottableLib.buildSrcCoreDatasetMod.Dataset, 
    T
  ]
  type IRangeProjector[T] = js.Function4[
    /* value */ T, 
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ plottableLib.buildSrcCoreDatasetMod.Dataset, 
    T
  ]
  type Projector = js.Function3[
    /* datum */ js.Any, 
    /* index */ scala.Double, 
    /* dataset */ plottableLib.buildSrcCoreDatasetMod.Dataset, 
    js.Any
  ]
  type SimpleSelection[Datum] = d3DashSelectionLib.d3DashSelectionMod.Selection[d3DashSelectionLib.d3DashSelectionMod.BaseType, Datum | js.Object, js.Any, js.Any]
}
