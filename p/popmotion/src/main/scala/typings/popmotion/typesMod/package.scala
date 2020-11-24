package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationOptions[V] = typings.popmotion.typesMod.PlaybackOptions[V] with (typings.popmotion.typesMod.DecayOptions | typings.popmotion.typesMod.KeyframeOptions[V] | typings.popmotion.typesMod.SpringOptions)
  
  type Driver = js.Function1[
    /* update */ typings.popmotion.typesMod.Update, 
    typings.popmotion.typesMod.DriverControls
  ]
  
  type Update = js.Function1[/* timestamp */ scala.Double, scala.Unit]
}
