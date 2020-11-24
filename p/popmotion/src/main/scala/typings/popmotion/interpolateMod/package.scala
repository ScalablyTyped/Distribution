package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interpolateMod {
  
  type Mix[T] = js.Function1[/* v */ scala.Double, T]
  
  type MixEasing = typings.popmotion.easingTypesMod.Easing | js.Array[typings.popmotion.easingTypesMod.Easing]
  
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, typings.popmotion.interpolateMod.Mix[T]]
}
