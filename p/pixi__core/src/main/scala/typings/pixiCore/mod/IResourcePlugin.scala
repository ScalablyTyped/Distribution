package typings.pixiCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourcePlugin[R, RO]
  extends StObject
     with Instantiable1[/* source */ Any, R]
     with Instantiable2[/* source */ Any, /* options */ RO, R] {
  
  def test(source: Any, `extension`: String): Boolean = js.native
}
