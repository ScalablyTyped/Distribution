package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenericTileMode extends StObject
@JSImport("sap/m/library", "GenericTileMode")
@js.native
object GenericTileMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GenericTileMode & String] = js.native
  
  /**
    * @EXPERIMENTAL (since 1.96)
    *
    * Action Mode (Two lines for the header).
    *
    * Generic Tile renders buttons that are specified under 'actionButtons' aggregation
    */
  @js.native
  sealed trait ActionMode
    extends StObject
       with GenericTileMode
  /* "ActionMode" */ val ActionMode: typings.openui5.sapMLibraryMod.GenericTileMode.ActionMode & String = js.native
  
  /**
    * @EXPERIMENTAL (since 1.96)
    *
    * Article Mode (Two lines for the header and one line for the subtitle).
    *
    * Enables Article Mode.
    */
  @js.native
  sealed trait ArticleMode
    extends StObject
       with GenericTileMode
  /* "ArticleMode" */ val ArticleMode: typings.openui5.sapMLibraryMod.GenericTileMode.ArticleMode & String = js.native
  
  /**
    * Default mode (Two lines for the header and one line for the subtitle).
    */
  @js.native
  sealed trait ContentMode
    extends StObject
       with GenericTileMode
  /* "ContentMode" */ val ContentMode: typings.openui5.sapMLibraryMod.GenericTileMode.ContentMode & String = js.native
  
  /**
    * Header mode (Four lines for the header and one line for the subtitle).
    */
  @js.native
  sealed trait HeaderMode
    extends StObject
       with GenericTileMode
  /* "HeaderMode" */ val HeaderMode: typings.openui5.sapMLibraryMod.GenericTileMode.HeaderMode & String = js.native
  
  /**
    * @SINCE 1.96
    * @EXPERIMENTAL (since 1.96)
    *
    * Icon mode.
    *
    * GenericTile displays a combination of icon and header title.
    *
    * It is applicable only for the OneByOne FrameType and TwoByHalf FrameType.
    */
  @js.native
  sealed trait IconMode
    extends StObject
       with GenericTileMode
  /* "IconMode" */ val IconMode: typings.openui5.sapMLibraryMod.GenericTileMode.IconMode & String = js.native
  
  /**
    * @SINCE 1.44.0
    *
    * Line mode (Implemented for both, cozy and compact densities).
    *
    * Generic Tile is displayed as in-line element, header and subheader are displayed in one line. In case
    * the texts need more than one line, the representation depends on the used density. **Cozy:** The text
    * will be truncated and the full text is shown in a tooltip as soon as the tile is hovered (desktop only).
    * **Compact:** Header and subheader are rendered continuously spanning multiple lines, no tooltip is provided).
    */
  @js.native
  sealed trait LineMode
    extends StObject
       with GenericTileMode
  /* "LineMode" */ val LineMode: typings.openui5.sapMLibraryMod.GenericTileMode.LineMode & String = js.native
}
