package typings.officeDashJs.Word

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
  
  /* "After" */ val after: typings.officeDashJs.Word.InsertLocation.after with String = js.native
  /* "Before" */ val before: typings.officeDashJs.Word.InsertLocation.before with String = js.native
  /* "End" */ val end: typings.officeDashJs.Word.InsertLocation.end with String = js.native
  /* "Replace" */ val replace: typings.officeDashJs.Word.InsertLocation.replace with String = js.native
  /* "Start" */ val start: typings.officeDashJs.Word.InsertLocation.start with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertLocation with String] = js.native
}

