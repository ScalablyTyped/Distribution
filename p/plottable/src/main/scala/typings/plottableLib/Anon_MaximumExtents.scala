package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumExtents[D] extends js.Object {
  var maximumExtents: plottableLib.buildSrcUtilsMod.Map[
    java.lang.String | scala.Double, 
    plottableLib.buildSrcUtilsStackingUtilsMod.StackExtent[D]
  ]
  var minimumExtents: plottableLib.buildSrcUtilsMod.Map[
    java.lang.String | scala.Double, 
    plottableLib.buildSrcUtilsStackingUtilsMod.StackExtent[D]
  ]
}

object Anon_MaximumExtents {
  @scala.inline
  def apply[D](
    maximumExtents: plottableLib.buildSrcUtilsMod.Map[
      java.lang.String | scala.Double, 
      plottableLib.buildSrcUtilsStackingUtilsMod.StackExtent[D]
    ],
    minimumExtents: plottableLib.buildSrcUtilsMod.Map[
      java.lang.String | scala.Double, 
      plottableLib.buildSrcUtilsStackingUtilsMod.StackExtent[D]
    ]
  ): Anon_MaximumExtents[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maximumExtents")(maximumExtents)
    __obj.updateDynamic("minimumExtents")(minimumExtents)
    __obj.asInstanceOf[Anon_MaximumExtents[D]]
  }
}

