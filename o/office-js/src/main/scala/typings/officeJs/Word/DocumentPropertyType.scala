package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentPropertyType extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.DocumentPropertyType")
@js.native
object DocumentPropertyType extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait boolean
    extends StObject
       with DocumentPropertyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait date
    extends StObject
       with DocumentPropertyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait number
    extends StObject
       with DocumentPropertyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait string
    extends StObject
       with DocumentPropertyType
}
