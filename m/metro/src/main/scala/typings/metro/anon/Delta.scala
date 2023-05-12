package typings.metro.anon

import typings.metro.srcDeltaBundlerTypesMod.DeltaResult
import typings.metro.srcIncrementalBundlerMod.GraphRevision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var delta: DeltaResult[Unit]
  
  var revision: GraphRevision
}
object Delta {
  
  inline def apply(delta: DeltaResult[Unit], revision: GraphRevision): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: DeltaResult[Unit]): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: GraphRevision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
