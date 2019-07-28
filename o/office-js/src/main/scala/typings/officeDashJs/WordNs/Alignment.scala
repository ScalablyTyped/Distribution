package typings.officeDashJs.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.Alignment")
@js.native
object Alignment extends js.Object {
  /**
    *
    * Alignment to the center.
    *
    */
  @js.native
  sealed trait centered extends Alignment
  
  /**
    *
    * Fully justified alignment.
    *
    */
  @js.native
  sealed trait justified extends Alignment
  
  /**
    *
    * Alignment to the left.
    *
    */
  @js.native
  sealed trait left extends Alignment
  
  @js.native
  sealed trait mixed extends Alignment
  
  /**
    *
    * Alignment to the right.
    *
    */
  @js.native
  sealed trait right extends Alignment
  
  /**
    *
    * Unknown alignment.
    *
    */
  @js.native
  sealed trait unknown extends Alignment
  
  /* "Centered" */ val centered: typings.officeDashJs.WordNs.Alignment.centered with String = js.native
  /* "Justified" */ val justified: typings.officeDashJs.WordNs.Alignment.justified with String = js.native
  /* "Left" */ val left: typings.officeDashJs.WordNs.Alignment.left with String = js.native
  /* "Mixed" */ val mixed: typings.officeDashJs.WordNs.Alignment.mixed with String = js.native
  /* "Right" */ val right: typings.officeDashJs.WordNs.Alignment.right with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJs.WordNs.Alignment.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Alignment with String] = js.native
}

