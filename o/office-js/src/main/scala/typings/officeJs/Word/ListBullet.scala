package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListBullet extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.ListBullet")
@js.native
object ListBullet extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait arrow
    extends StObject
       with ListBullet
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait checkmark
    extends StObject
       with ListBullet
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait custom
    extends StObject
       with ListBullet
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait diamonds
    extends StObject
       with ListBullet
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait hollow
    extends StObject
       with ListBullet
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait solid
    extends StObject
       with ListBullet
  
  /**
    * @remarks
    * [Api set: WordApi 1.3]
    */
  @js.native
  sealed trait square
    extends StObject
       with ListBullet
}
