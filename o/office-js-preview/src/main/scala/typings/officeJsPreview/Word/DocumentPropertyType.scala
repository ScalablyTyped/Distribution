package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentPropertyType extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.DocumentPropertyType")
@js.native
object DocumentPropertyType extends StObject {
  
  @js.native
  sealed trait boolean
    extends StObject
       with DocumentPropertyType
  
  @js.native
  sealed trait date
    extends StObject
       with DocumentPropertyType
  
  @js.native
  sealed trait number
    extends StObject
       with DocumentPropertyType
  
  @js.native
  sealed trait string
    extends StObject
       with DocumentPropertyType
}
