package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Alignment extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Alignment")
@js.native
object Alignment extends StObject {
  
  /**
    * Alignment to the center.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait centered
    extends StObject
       with Alignment
  
  /**
    * Fully justified alignment.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait justified
    extends StObject
       with Alignment
  
  /**
    * Alignment to the left.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait left
    extends StObject
       with Alignment
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait mixed
    extends StObject
       with Alignment
  
  /**
    * Alignment to the right.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait right
    extends StObject
       with Alignment
  
  /**
    * Unknown alignment.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with Alignment
}
