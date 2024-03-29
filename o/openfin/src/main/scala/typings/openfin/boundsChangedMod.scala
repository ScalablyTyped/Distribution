package typings.openfin

import typings.openfin.baseMod.Reply
import typings.openfin.openfinInts.`0`
import typings.openfin.openfinInts.`1`
import typings.openfin.openfinInts.`2`
import typings.openfin.openfinStrings.`bounds-changed`
import typings.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundsChangedMod {
  
  @JSImport("openfin/_v2/api/window/bounds-changed", JSImport.Default)
  @js.native
  open class default () extends BoundsChangedReply
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.openfinInts.`0`
    - typings.openfin.openfinInts.`1`
    - typings.openfin.openfinInts.`2`
  */
  trait BoundsChangeType extends StObject
  object BoundsChangeType {
    
    inline def POSITION: `0` = 0.asInstanceOf[`0`]
    
    inline def POSITION_AND_SIZE: `2` = 2.asInstanceOf[`2`]
    
    inline def SIZE: `1` = 1.asInstanceOf[`1`]
  }
  
  @js.native
  trait BoundsChangedReply extends Reply[window, `bounds-changed`] {
    
    var changeType: BoundsChangeType = js.native
    
    var deferred: Boolean = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
}
