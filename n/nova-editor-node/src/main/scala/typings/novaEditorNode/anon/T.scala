package typings.novaEditorNode.anon

import typings.novaEditorNode.novaEditorNodeStrings.FileSystemBitField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait T extends StObject {
  
  var __t: FileSystemBitField = js.native
}
object T {
  
  @scala.inline
  def apply(__t: FileSystemBitField): T = {
    val __obj = js.Dynamic.literal(__t = __t.asInstanceOf[js.Any])
    __obj.asInstanceOf[T]
  }
  
  @scala.inline
  implicit class TMutableBuilder[Self <: T] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__t(value: FileSystemBitField): Self = StObject.set(x, "__t", value.asInstanceOf[js.Any])
  }
}
