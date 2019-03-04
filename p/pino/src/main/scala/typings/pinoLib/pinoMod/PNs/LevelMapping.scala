package typings
package pinoLib.pinoMod.PNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelMapping extends js.Object {
  /**
    * Returns the mappings of level internal level numbers to their string representations.
    */
  var labels: org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  /**
    * Returns the mappings of level names to their respective internal number representation.
    */
  var values: org.scalablytyped.runtime.StringDictionary[scala.Double]
}

object LevelMapping {
  @scala.inline
  def apply(
    labels: org.scalablytyped.runtime.NumberDictionary[java.lang.String],
    values: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): LevelMapping = {
    val __obj = js.Dynamic.literal(labels = labels, values = values)
  
    __obj.asInstanceOf[LevelMapping]
  }
}

