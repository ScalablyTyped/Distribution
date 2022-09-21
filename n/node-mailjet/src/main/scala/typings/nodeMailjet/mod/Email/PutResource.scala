package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResource extends StObject {
  
  def id(value: String): PutResource = js.native
  def id(value: Double): PutResource = js.native
  
  def request(params: js.Object): js.Promise[PutResponse] = js.native
  def request(params: js.Object, callback: js.Function2[/* error */ js.Error, /* res */ PutResponse, Unit]): js.Promise[PutResponse] = js.native
}
