package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait centered
    extends officeDashJsDashPreviewLib.WordNs.Alignment
  
  /**
           *
           * Fully justified alignment.
           *
           */
  @js.native
  sealed trait justified
    extends officeDashJsDashPreviewLib.WordNs.Alignment
  
  /**
           *
           * Alignment to the left.
           *
           */
  @js.native
  sealed trait left
    extends officeDashJsDashPreviewLib.WordNs.Alignment
  
  @js.native
  sealed trait mixed
    extends officeDashJsDashPreviewLib.WordNs.Alignment
  
  /**
           *
           * Alignment to the right.
           *
           */
  @js.native
  sealed trait right
    extends officeDashJsDashPreviewLib.WordNs.Alignment
  
  /**
           *
           * Unknown alignment.
           *
           */
  @js.native
  sealed trait unknown
    extends officeDashJsDashPreviewLib.WordNs.Alignment
  
  /* "Centered" */ val centered: centered with java.lang.String = js.native
  /* "Justified" */ val justified: justified with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Mixed" */ val mixed: mixed with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.Alignment with java.lang.String] = js.native
}

