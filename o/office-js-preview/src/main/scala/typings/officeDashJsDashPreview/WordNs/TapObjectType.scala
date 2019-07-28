package typings.officeDashJsDashPreview.WordNs

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
  sealed trait chart extends TapObjectType
  
  @js.native
  sealed trait image extends TapObjectType
  
  @js.native
  sealed trait ole extends TapObjectType
  
  @js.native
  sealed trait slide extends TapObjectType
  
  @js.native
  sealed trait smartArt extends TapObjectType
  
  @js.native
  sealed trait table extends TapObjectType
  
  @js.native
  sealed trait text extends TapObjectType
  
  /* "Chart" */ val chart: typings.officeDashJsDashPreview.WordNs.TapObjectType.chart with String = js.native
  /* "Image" */ val image: typings.officeDashJsDashPreview.WordNs.TapObjectType.image with String = js.native
  /* "OLE" */ val ole: typings.officeDashJsDashPreview.WordNs.TapObjectType.ole with String = js.native
  /* "Slide" */ val slide: typings.officeDashJsDashPreview.WordNs.TapObjectType.slide with String = js.native
  /* "SmartArt" */ val smartArt: typings.officeDashJsDashPreview.WordNs.TapObjectType.smartArt with String = js.native
  /* "Table" */ val table: typings.officeDashJsDashPreview.WordNs.TapObjectType.table with String = js.native
  /* "Text" */ val text: typings.officeDashJsDashPreview.WordNs.TapObjectType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TapObjectType with String] = js.native
}

