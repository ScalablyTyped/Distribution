package typings.openfin

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refCounterMod {
  
  @JSImport("openfin/_v2/util/ref-counter", JSImport.Default)
  @js.native
  class default () extends RefCoutner
  
  @js.native
  trait RefCoutner extends StObject {
    
    def actOnFirst(key: String, firstAction: js.Function0[_]): js.Any = js.native
    def actOnFirst(key: String, firstAction: js.Function0[_], nonFirstAction: js.Function0[Unit]): js.Any = js.native
    
    def actOnLast(key: String, lastAction: js.Function0[_]): js.Any = js.native
    def actOnLast(key: String, lastAction: js.Function0[_], nonLastAction: js.Function0[Unit]): js.Any = js.native
    
    def decRefCount(key: String): Double = js.native
    
    def incRefCount(key: String): Double = js.native
    
    var topicRefMap: Map[_, _] = js.native
  }
}
