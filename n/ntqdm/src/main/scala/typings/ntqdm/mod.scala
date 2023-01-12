package typings.ntqdm

import typings.ntqdm.anon.PartialTqdmOptions
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Adds a timed progress bar to iterables */
  inline def apply[T](iter: js.Iterable[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  inline def apply[T](iter: js.Iterable[T], par: PartialTqdmOptions): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any], par.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
  
  @JSImport("ntqdm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TqdmOptions extends StObject {
    
    /** A desciption string to add before the progress bar */
    var desc: String
    
    /** whether to output as a log, or update the same line */
    var logging: Boolean
    
    /** The minimum amount of time between progress bar updates */
    var minInterval: Double
    
    /** The minimum number of iterations between progress bar updates */
    var minIter: Double
    
    /** The number of iterations to complete, needed for infinite iterables */
    var total: Double
  }
  object TqdmOptions {
    
    inline def apply(desc: String, logging: Boolean, minInterval: Double, minIter: Double, total: Double): TqdmOptions = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], minInterval = minInterval.asInstanceOf[js.Any], minIter = minIter.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TqdmOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TqdmOptions] (val x: Self) extends AnyVal {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setMinInterval(value: Double): Self = StObject.set(x, "minInterval", value.asInstanceOf[js.Any])
      
      inline def setMinIter(value: Double): Self = StObject.set(x, "minIter", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
