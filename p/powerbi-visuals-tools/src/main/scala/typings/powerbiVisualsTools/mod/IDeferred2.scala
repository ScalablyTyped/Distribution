package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeferred2[TSuccess, TError] extends StObject {
  
  var promise: IPromise2[TSuccess, TError] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: TError): Unit = js.native
  
  def resolve(value: TSuccess): Unit = js.native
}
