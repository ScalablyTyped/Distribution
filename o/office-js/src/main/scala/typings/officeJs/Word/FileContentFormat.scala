package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileContentFormat extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.FileContentFormat")
@js.native
object FileContentFormat extends StObject {
  
  @js.native
  sealed trait base64
    extends StObject
       with FileContentFormat
  
  @js.native
  sealed trait html
    extends StObject
       with FileContentFormat
  
  @js.native
  sealed trait ooxml
    extends StObject
       with FileContentFormat
}
