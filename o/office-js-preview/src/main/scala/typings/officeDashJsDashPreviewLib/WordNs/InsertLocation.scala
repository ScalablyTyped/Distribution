package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait after
    extends officeDashJsDashPreviewLib.WordNs.InsertLocation
  
  /**
           *
           * Add content before the contents of the calling object.
           *
           */
  @js.native
  sealed trait before
    extends officeDashJsDashPreviewLib.WordNs.InsertLocation
  
  /**
           *
           * Append content to the contents of the calling object.
           *
           */
  @js.native
  sealed trait end
    extends officeDashJsDashPreviewLib.WordNs.InsertLocation
  
  /**
           *
           * Replace the contents of the current object.
           *
           */
  @js.native
  sealed trait replace
    extends officeDashJsDashPreviewLib.WordNs.InsertLocation
  
  /**
           *
           * Prepend content to the contents of the calling object.
           *
           */
  @js.native
  sealed trait start
    extends officeDashJsDashPreviewLib.WordNs.InsertLocation
  
  /* "After" */ val after: after with java.lang.String = js.native
  /* "Before" */ val before: before with java.lang.String = js.native
  /* "End" */ val end: end with java.lang.String = js.native
  /* "Replace" */ val replace: replace with java.lang.String = js.native
  /* "Start" */ val start: start with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.InsertLocation with java.lang.String] = js.native
}

