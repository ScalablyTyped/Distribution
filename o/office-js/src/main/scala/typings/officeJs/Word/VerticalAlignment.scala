package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalAlignment extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.VerticalAlignment")
@js.native
object VerticalAlignment extends StObject {
  
  @js.native
  sealed trait bottom
    extends StObject
       with VerticalAlignment
  
  @js.native
  sealed trait center
    extends StObject
       with VerticalAlignment
  
  @js.native
  sealed trait mixed
    extends StObject
       with VerticalAlignment
  
  @js.native
  sealed trait top
    extends StObject
       with VerticalAlignment
}
