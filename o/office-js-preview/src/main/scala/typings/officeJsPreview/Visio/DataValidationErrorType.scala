package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationErrorType extends StObject
/**
  *
  * Represents the types of data validation error.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.DataValidationErrorType")
@js.native
object DataValidationErrorType extends StObject {
  
  /**
    *
    * Data does not have one of the mapped column.
    *
    */
  @js.native
  sealed trait columnNotMapped
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * Connector column and connector label column are
    already mapped to other setting.
    *
    */
  @js.native
  sealed trait connectorColumnAndConnectorLabelMappedElsewhere
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * Connector column has error
    *
    */
  @js.native
  sealed trait connectorColumnError
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * Connector column is already mapped
    to another setting
    *
    */
  @js.native
  sealed trait connectorColumnMappedElsewhere
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * Connector label column already mapped
    to other setting
    *
    */
  @js.native
  sealed trait connectorLabelColumnMappedElsewhere
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * Delimiter can not have more then one character.
    *
    */
  @js.native
  sealed trait delimiterError
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * No error
    *
    */
  @js.native
  sealed trait none
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * Swim-lane column is empty.
    *
    */
  @js.native
  sealed trait swimlaneColumnError
    extends StObject
       with DataValidationErrorType
  
  /**
    *
    * UniqueId column has error.
    *
    */
  @js.native
  sealed trait uniqueIdColumnError
    extends StObject
       with DataValidationErrorType
}
