package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/workspace/
// The line is optional, unless a column is specified
/* Rewritten from type alias, can be one of: 
  - typings.novaEditorNode.anon.Column
  - typings.novaEditorNode.anon.Line
*/
trait FileLocation extends StObject
object FileLocation {
  
  inline def Column(): typings.novaEditorNode.anon.Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.novaEditorNode.anon.Column]
  }
  
  inline def Line(line: Double): typings.novaEditorNode.anon.Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.novaEditorNode.anon.Line]
  }
}
