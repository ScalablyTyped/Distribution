package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityCardLayoutType extends StObject
/**
  * Types of entity card layouts.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.EntityCardLayoutType")
@js.native
object EntityCardLayoutType extends StObject {
  
  /**
    * Array layout of the entity card.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait array
    extends StObject
       with EntityCardLayoutType
  
  /**
    * Entity layout of the entity card.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait entity
    extends StObject
       with EntityCardLayoutType
}
