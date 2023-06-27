package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StyleType extends StObject
/**
  * Represents the type of style.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.StyleType")
@js.native
object StyleType extends StObject {
  
  /**
    * Represents that the style is a character style.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait character
    extends StObject
       with StyleType
  
  /**
    * Represents that the style is a list style. Currently supported on desktop.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait list
    extends StObject
       with StyleType
  
  /**
    * Represents that the style is a paragraph style.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait paragraph
    extends StObject
       with StyleType
  
  /**
    * Represents that the style is a table style.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait table
    extends StObject
       with StyleType
}
