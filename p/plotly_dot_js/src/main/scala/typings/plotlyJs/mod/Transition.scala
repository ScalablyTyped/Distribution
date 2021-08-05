package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.`back-in-out`
import typings.plotlyJs.plotlyJsStrings.`back-in`
import typings.plotlyJs.plotlyJsStrings.`back-out`
import typings.plotlyJs.plotlyJsStrings.`bounce-in-out`
import typings.plotlyJs.plotlyJsStrings.`bounce-in`
import typings.plotlyJs.plotlyJsStrings.`bounce-out`
import typings.plotlyJs.plotlyJsStrings.`circle-in-out`
import typings.plotlyJs.plotlyJsStrings.`circle-in`
import typings.plotlyJs.plotlyJsStrings.`circle-out`
import typings.plotlyJs.plotlyJsStrings.`cubic-in-out`
import typings.plotlyJs.plotlyJsStrings.`cubic-in`
import typings.plotlyJs.plotlyJsStrings.`cubic-out`
import typings.plotlyJs.plotlyJsStrings.`elastic-in-out`
import typings.plotlyJs.plotlyJsStrings.`elastic-in`
import typings.plotlyJs.plotlyJsStrings.`elastic-out`
import typings.plotlyJs.plotlyJsStrings.`exp-in-out`
import typings.plotlyJs.plotlyJsStrings.`exp-in`
import typings.plotlyJs.plotlyJsStrings.`exp-out`
import typings.plotlyJs.plotlyJsStrings.`layout first`
import typings.plotlyJs.plotlyJsStrings.`linear-in-out`
import typings.plotlyJs.plotlyJsStrings.`linear-in`
import typings.plotlyJs.plotlyJsStrings.`linear-out`
import typings.plotlyJs.plotlyJsStrings.`quad-in-out`
import typings.plotlyJs.plotlyJsStrings.`quad-in`
import typings.plotlyJs.plotlyJsStrings.`quad-out`
import typings.plotlyJs.plotlyJsStrings.`sin-in-out`
import typings.plotlyJs.plotlyJsStrings.`sin-in`
import typings.plotlyJs.plotlyJsStrings.`sin-out`
import typings.plotlyJs.plotlyJsStrings.`traces first`
import typings.plotlyJs.plotlyJsStrings.back
import typings.plotlyJs.plotlyJsStrings.bounce
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.cubic
import typings.plotlyJs.plotlyJsStrings.elastic
import typings.plotlyJs.plotlyJsStrings.exp
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.quad
import typings.plotlyJs.plotlyJsStrings.sin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition extends StObject {
  
  /**
    * Sets the duration of the slider transition
    */
  var duration: Double
  
  /**
    * Sets the easing function of the slider transition
    */
  var easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
  
  /**
    * Determines whether the figure's layout or traces smoothly transitions during updates that make both traces
    * and layout change. Default is "layout first".
    */
  var ordering: js.UndefOr[(`layout first`) | (`traces first`)] = js.undefined
}
object Transition {
  
  inline def apply(
    duration: Double,
    easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
  ): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  
  extension [Self <: Transition](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(
      value: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
    ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setOrdering(value: (`layout first`) | (`traces first`)): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
  }
}
