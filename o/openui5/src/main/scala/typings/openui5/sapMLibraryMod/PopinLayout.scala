package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopinLayout extends StObject
@JSImport("sap/m/library", "PopinLayout")
@js.native
object PopinLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PopinLayout & String] = js.native
  
  /**
    * @SINCE 1.52
    *
    * Sets block layout for rendering the table popins. The elements inside the popin container are rendered
    * one below the other. **Note:** This option enables the former rendering behavior of the table popins.
    */
  @js.native
  sealed trait Block
    extends StObject
       with PopinLayout
  /* "Block" */ val Block: typings.openui5.sapMLibraryMod.PopinLayout.Block & String = js.native
  
  /**
    * @SINCE 1.52
    *
    * Sets grid layout for rendering the table popins. The grid width for each table popin is comparatively
    * larger than `GridSmall`, hence this allows less content to be rendered in a single popin row.
    *
    * **Note:** This feature is currently not supported with Internet Explorer and Edge (version lower than
    * 16) browsers.
    */
  @js.native
  sealed trait GridLarge
    extends StObject
       with PopinLayout
  /* "GridLarge" */ val GridLarge: typings.openui5.sapMLibraryMod.PopinLayout.GridLarge & String = js.native
  
  /**
    * @SINCE 1.52
    *
    * Sets grid layout for rendering the table popins. The grid width for each table popin is small, hence
    * this allows more content to be rendered in a single popin row. This value defines small grid width for
    * the table popins.
    *
    * **Note:** This feature is currently not supported with Internet Explorer and Edge (version lower than
    * 16) browsers.
    */
  @js.native
  sealed trait GridSmall
    extends StObject
       with PopinLayout
  /* "GridSmall" */ val GridSmall: typings.openui5.sapMLibraryMod.PopinLayout.GridSmall & String = js.native
}
