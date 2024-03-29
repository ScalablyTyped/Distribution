package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.avg
import typings.plotlyJs.plotlyJsStrings.count
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.max
import typings.plotlyJs.plotlyJsStrings.median
import typings.plotlyJs.plotlyJsStrings.min
import typings.plotlyJs.plotlyJsStrings.mode
import typings.plotlyJs.plotlyJsStrings.population
import typings.plotlyJs.plotlyJsStrings.rms
import typings.plotlyJs.plotlyJsStrings.sample
import typings.plotlyJs.plotlyJsStrings.stddev
import typings.plotlyJs.plotlyJsStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformAggregation extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var func: js.UndefOr[count | sum | avg | median | mode | rms | stddev | min | max | first | last] = js.undefined
  
  var funcmode: js.UndefOr[sample | population] = js.undefined
  
  var target: String
}
object TransformAggregation {
  
  inline def apply(target: String): TransformAggregation = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformAggregation] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFunc(value: count | sum | avg | median | mode | rms | stddev | min | max | first | last): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    inline def setFuncmode(value: sample | population): Self = StObject.set(x, "funcmode", value.asInstanceOf[js.Any])
    
    inline def setFuncmodeUndefined: Self = StObject.set(x, "funcmode", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
