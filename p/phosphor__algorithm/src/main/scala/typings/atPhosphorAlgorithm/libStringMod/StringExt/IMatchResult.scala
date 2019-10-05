package typings.atPhosphorAlgorithm.libStringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a string match function.
  */
trait IMatchResult extends js.Object {
  /**
    * The indices of the matched characters in the source text.
    *
    * The indices will appear in increasing order.
    */
  var indices: js.Array[Double]
  /**
    * A score which indicates the strength of the match.
    *
    * The documentation of a given match function should specify
    * whether a lower or higher score is a stronger match.
    */
  var score: Double
}

object IMatchResult {
  @scala.inline
  def apply(indices: js.Array[Double], score: Double): IMatchResult = {
    val __obj = js.Dynamic.literal(indices = indices, score = score)
  
    __obj.asInstanceOf[IMatchResult]
  }
}

