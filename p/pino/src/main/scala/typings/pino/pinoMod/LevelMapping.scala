package typings.pino.pinoMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelMapping extends js.Object {
  /**
    * Returns the mappings of level internal level numbers to their string representations.
    */
  var labels: NumberDictionary[String]
  /**
    * Returns the mappings of level names to their respective internal number representation.
    */
  var values: StringDictionary[Double]
}

object LevelMapping {
  @scala.inline
  def apply(labels: NumberDictionary[String], values: StringDictionary[Double]): LevelMapping = {
    val __obj = js.Dynamic.literal(labels = labels, values = values)
  
    __obj.asInstanceOf[LevelMapping]
  }
}

