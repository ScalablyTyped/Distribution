package typings.officeJsPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileContentFormat extends js.Object
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.FileContentFormat")
@js.native
object FileContentFormat extends js.Object {
  
  @js.native
  sealed trait base64 extends FileContentFormat
  
  @js.native
  sealed trait html extends FileContentFormat
  
  @js.native
  sealed trait ooxml extends FileContentFormat
}
