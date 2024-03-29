package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakMap[K /* <: js.Object */, V] extends StObject {
  
  def delete(key: K): scala.Boolean = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def has(key: K): scala.Boolean = js.native
  
  def set(key: K, value: V): this.type = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.minappEnv.minappEnvStrings.WeakMap = js.native
}
