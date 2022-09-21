package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResource extends StObject {
  
  def id(value: String): DeleteResource = js.native
  
  def request(): js.Promise[DeleteResponse] = js.native
  def request(params: js.Object): js.Promise[DeleteResponse] = js.native
  def request(params: js.Object, callback: js.Function2[/* error */ js.Error, /* res */ DeleteResponse, Unit]): js.Promise[DeleteResponse] = js.native
  def request(params: Unit, callback: js.Function2[/* error */ js.Error, /* res */ DeleteResponse, Unit]): js.Promise[DeleteResponse] = js.native
}
