package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellPaddingLocation extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.CellPaddingLocation")
@js.native
object CellPaddingLocation extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait bottom
    extends StObject
       with CellPaddingLocation
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait left
    extends StObject
       with CellPaddingLocation
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait right
    extends StObject
       with CellPaddingLocation
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait top
    extends StObject
       with CellPaddingLocation
}
