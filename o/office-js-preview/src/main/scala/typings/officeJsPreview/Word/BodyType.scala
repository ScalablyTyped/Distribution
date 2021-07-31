package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BodyType extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.BodyType")
@js.native
object BodyType extends StObject {
  
  @js.native
  sealed trait footer
    extends StObject
       with BodyType
  
  @js.native
  sealed trait header
    extends StObject
       with BodyType
  
  @js.native
  sealed trait mainDoc
    extends StObject
       with BodyType
  
  @js.native
  sealed trait section
    extends StObject
       with BodyType
  
  @js.native
  sealed trait tableCell
    extends StObject
       with BodyType
  
  @js.native
  sealed trait unknown
    extends StObject
       with BodyType
}
