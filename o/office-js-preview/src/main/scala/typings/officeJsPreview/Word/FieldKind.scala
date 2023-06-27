package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldKind extends StObject
/**
  * Represents the kind of field. Indicates how the field works in relation to updating.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.FieldKind")
@js.native
object FieldKind extends StObject {
  
  /**
    * Represents that the field doesn't have a result.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait cold
    extends StObject
       with FieldKind
  
  /**
    * Represents that the field is automatically updated each time it's displayed or each time the page is reformatted, but which can also be manually updated.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait hot
    extends StObject
       with FieldKind
  
  /**
    * Represents that the field is invalid. For example, a pair of field characters with nothing inside.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait none
    extends StObject
       with FieldKind
  
  /**
    * Represents that the field is automatically updated when the source changes or the field can be manually updated.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait warm
    extends StObject
       with FieldKind
}
