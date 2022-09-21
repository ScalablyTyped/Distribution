package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultReader[R]
  extends StObject
     with ReadableStreamGenericReader {
  
  def read(): js.Promise[ReadableStreamDefaultReadResult[R]] = js.native
  
  def releaseLock(): Unit = js.native
}
