package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBinaryMode
  extends StObject
     with File {
  
  def read(): js.typedarray.ArrayBuffer | Null = js.native
  def read(size: Double): js.typedarray.ArrayBuffer | Null = js.native
}
