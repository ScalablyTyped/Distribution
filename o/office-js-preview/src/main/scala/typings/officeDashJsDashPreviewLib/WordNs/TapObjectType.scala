package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TapObjectType extends js.Object

/**
     * [Api set: WordApi]
     */
@JSGlobal("Word.TapObjectType")
@js.native
object TapObjectType extends js.Object {
  @js.native
  sealed trait chart
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  @js.native
  sealed trait image
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  @js.native
  sealed trait ole
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  @js.native
  sealed trait slide
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  @js.native
  sealed trait smartArt
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  @js.native
  sealed trait table
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  @js.native
  sealed trait text
    extends officeDashJsDashPreviewLib.WordNs.TapObjectType
  
  /* "Chart" */ val chart: chart with java.lang.String = js.native
  /* "Image" */ val image: image with java.lang.String = js.native
  /* "OLE" */ val ole: ole with java.lang.String = js.native
  /* "Slide" */ val slide: slide with java.lang.String = js.native
  /* "SmartArt" */ val smartArt: smartArt with java.lang.String = js.native
  /* "Table" */ val table: table with java.lang.String = js.native
  /* "Text" */ val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.TapObjectType with java.lang.String] = js.native
}

