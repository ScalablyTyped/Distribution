package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListLevelType extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListLevelType")
@js.native
object ListLevelType extends StObject {
  
  @js.native
  sealed trait bullet
    extends StObject
       with ListLevelType
  
  @js.native
  sealed trait number
    extends StObject
       with ListLevelType
  
  @js.native
  sealed trait picture
    extends StObject
       with ListLevelType
}
