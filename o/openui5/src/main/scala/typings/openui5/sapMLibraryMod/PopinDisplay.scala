package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PopinDisplay extends StObject
@JSImport("sap/m/library", "PopinDisplay")
@js.native
object PopinDisplay extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PopinDisplay & String] = js.native
  
  /**
    * Inside the table popin, header is displayed at the first line and cell content is displayed at the next
    * line.
    */
  @js.native
  sealed trait Block
    extends StObject
       with PopinDisplay
  /* "Block" */ val Block: typings.openui5.sapMLibraryMod.PopinDisplay.Block & String = js.native
  
  /**
    * Inside the table popin, cell content is displayed next to the header in the same line. **Note:** If there
    * is not enough space for the cell content then it jumps to the next line.
    */
  @js.native
  sealed trait Inline
    extends StObject
       with PopinDisplay
  /* "Inline" */ val Inline: typings.openui5.sapMLibraryMod.PopinDisplay.Inline & String = js.native
  
  /**
    * @since 1.28
    *
    * Inside the table popin, only the cell content will be visible.
    */
  @js.native
  sealed trait WithoutHeader
    extends StObject
       with PopinDisplay
  /* "WithoutHeader" */ val WithoutHeader: typings.openui5.sapMLibraryMod.PopinDisplay.WithoutHeader & String = js.native
}
