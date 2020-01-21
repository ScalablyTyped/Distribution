package typings.officeJsPreview.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Alignment with String] = js.native
  /* "Centered" */ @js.native
  object centered extends TopLevel[centered with String]
  
  /* "Justified" */ @js.native
  object justified extends TopLevel[justified with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Mixed" */ @js.native
  object mixed extends TopLevel[mixed with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

