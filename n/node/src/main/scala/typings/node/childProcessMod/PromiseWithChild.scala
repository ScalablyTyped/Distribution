package typings.node.childProcessMod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseWithChild[T]
  extends StObject
     with Promise[T] {
  
  var child: ChildProcess = js.native
}
