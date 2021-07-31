package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertTextFormat extends StObject
@JSGlobal("InsertTextFormat")
@js.native
object InsertTextFormat extends StObject {
  
  @js.native
  sealed trait PlainText
    extends StObject
       with InsertTextFormat
  
  @js.native
  sealed trait Snippet
    extends StObject
       with InsertTextFormat
}
