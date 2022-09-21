package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BodyType extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.BodyType")
@js.native
object BodyType extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  @js.native
  sealed trait endnote
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait footer
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  @js.native
  sealed trait footnote
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait header
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait mainDoc
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  @js.native
  sealed trait noteItem
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait section
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait tableCell
    extends StObject
       with BodyType
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with BodyType
}
