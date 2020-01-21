package typings.officeJs.Word

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InsertLocation extends js.Object

/**
  *
  * The insertion location types
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.InsertLocation")
@js.native
object InsertLocation extends js.Object {
  /**
    *
    * Add content after the contents of the calling object.
    *
    */
  @js.native
  sealed trait after extends InsertLocation
  
  /**
    *
    * Add content before the contents of the calling object.
    *
    */
  @js.native
  sealed trait before extends InsertLocation
  
  /**
    *
    * Append content to the contents of the calling object.
    *
    */
  @js.native
  sealed trait end extends InsertLocation
  
  /**
    *
    * Replace the contents of the current object.
    *
    */
  @js.native
  sealed trait replace extends InsertLocation
  
  /**
    *
    * Prepend content to the contents of the calling object.
    *
    */
  @js.native
  sealed trait start extends InsertLocation
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertLocation with String] = js.native
  /* "After" */ @js.native
  object after extends TopLevel[after with String]
  
  /* "Before" */ @js.native
  object before extends TopLevel[before with String]
  
  /* "End" */ @js.native
  object end extends TopLevel[end with String]
  
  /* "Replace" */ @js.native
  object replace extends TopLevel[replace with String]
  
  /* "Start" */ @js.native
  object start extends TopLevel[start with String]
  
}

