package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListNumbering extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListNumbering")
@js.native
object ListNumbering extends StObject {
  
  @js.native
  sealed trait arabic
    extends StObject
       with ListNumbering
  
  @js.native
  sealed trait lowerLetter
    extends StObject
       with ListNumbering
  
  @js.native
  sealed trait lowerRoman
    extends StObject
       with ListNumbering
  
  @js.native
  sealed trait none
    extends StObject
       with ListNumbering
  
  @js.native
  sealed trait upperLetter
    extends StObject
       with ListNumbering
  
  @js.native
  sealed trait upperRoman
    extends StObject
       with ListNumbering
}
