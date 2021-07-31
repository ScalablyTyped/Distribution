package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellPaddingLocation extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.CellPaddingLocation")
@js.native
object CellPaddingLocation extends StObject {
  
  @js.native
  sealed trait bottom
    extends StObject
       with CellPaddingLocation
  
  @js.native
  sealed trait left
    extends StObject
       with CellPaddingLocation
  
  @js.native
  sealed trait right
    extends StObject
       with CellPaddingLocation
  
  @js.native
  sealed trait top
    extends StObject
       with CellPaddingLocation
}
