package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueSeverity extends StObject
@JSGlobal("IssueSeverity")
@js.native
object IssueSeverity extends StObject {
  
  @js.native
  sealed trait Error
    extends StObject
       with IssueSeverity
  
  @js.native
  sealed trait Hint
    extends StObject
       with IssueSeverity
  
  @js.native
  sealed trait Info
    extends StObject
       with IssueSeverity
  
  @js.native
  sealed trait Warning
    extends StObject
       with IssueSeverity
}
