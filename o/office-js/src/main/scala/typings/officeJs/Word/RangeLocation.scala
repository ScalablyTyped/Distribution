package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeLocation extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.RangeLocation")
@js.native
object RangeLocation extends StObject {
  
  /**
    * The point after the object. If the object is a paragraph content control or table content control, it is the point after the EOP or Table characters.
    *
    */
  @js.native
  sealed trait after
    extends StObject
       with RangeLocation
  
  /**
    * For content control only. It is the point before the opening tag.
    *
    */
  @js.native
  sealed trait before
    extends StObject
       with RangeLocation
  
  /**
    * The range between 'Start' and 'End'.
    *
    */
  @js.native
  sealed trait content
    extends StObject
       with RangeLocation
  
  /**
    * The ending point of the object. For paragraph, it is the point before the EOP. For content control, it is the point before the closing tag.
    *
    */
  @js.native
  sealed trait end
    extends StObject
       with RangeLocation
  
  /**
    * The starting point of the object. For content control, it is the point after the opening tag.
    *
    */
  @js.native
  sealed trait start
    extends StObject
       with RangeLocation
  
  /**
    * The object's whole range. If the object is a paragraph content control or table content control, the EOP or Table characters after the content control are also included.
    *
    */
  @js.native
  sealed trait whole
    extends StObject
       with RangeLocation
}
