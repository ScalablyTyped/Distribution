package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnType extends StObject
/**
  *
  * Represents the type of column values.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ColumnType")
@js.native
object ColumnType extends StObject {
  
  /**
    *
    * Currency
    *
    */
  @js.native
  sealed trait currency
    extends StObject
       with ColumnType
  
  /**
    *
    * Date
    *
    */
  @js.native
  sealed trait date
    extends StObject
       with ColumnType
  
  /**
    *
    * Numerical values
    *
    */
  @js.native
  sealed trait number
    extends StObject
       with ColumnType
  
  /**
    *
    * String values
    *
    */
  @js.native
  sealed trait string
    extends StObject
       with ColumnType
  
  /**
    *
    * Other
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with ColumnType
}
