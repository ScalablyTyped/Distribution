package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseLogDatumIteratorMod {
  
  inline def apply(values: String): Unit = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/LogDatumIterator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LogDatumIterator {
    def this(values: String) = this()
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    var endPos: Double = js.native
    
    /* CompleteClass */
    override def getFirstValue(): Boolean = js.native
    
    /* CompleteClass */
    override def getNextValue(): Boolean = js.native
    
    /* CompleteClass */
    override def initValues(values: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var values: String = js.native
  }
  @JSImport("@nginstack/engine/lib/database/LogDatumIterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LogDatumIterator extends StObject {
    
    var data: String
    
    var endPos: Double
    
    def getFirstValue(): Boolean
    
    def getNextValue(): Boolean
    
    def initValues(values: String): Unit
    
    var size: Double
    
    var values: String
  }
  object LogDatumIterator {
    
    inline def apply(
      data: String,
      endPos: Double,
      getFirstValue: () => Boolean,
      getNextValue: () => Boolean,
      initValues: String => Unit,
      size: Double,
      values: String
    ): LogDatumIterator = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], getFirstValue = js.Any.fromFunction0(getFirstValue), getNextValue = js.Any.fromFunction0(getNextValue), initValues = js.Any.fromFunction1(initValues), size = size.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogDatumIterator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogDatumIterator] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
      
      inline def setGetFirstValue(value: () => Boolean): Self = StObject.set(x, "getFirstValue", js.Any.fromFunction0(value))
      
      inline def setGetNextValue(value: () => Boolean): Self = StObject.set(x, "getNextValue", js.Any.fromFunction0(value))
      
      inline def setInitValues(value: String => Unit): Self = StObject.set(x, "initValues", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
