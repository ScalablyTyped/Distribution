package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countFieldAggregatorMod {
  
  inline def apply(fieldName: Any, dataSet: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(fieldName.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/field-aggregator/CountFieldAggregator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CountFieldAggregator {
    def this(fieldName: Any, dataSet: Any) = this()
    
    /* CompleteClass */
    var decimalPrecision: Double = js.native
    
    /* CompleteClass */
    override def getDescription(): Any = js.native
    
    /* CompleteClass */
    override def getReadOnly(): Any = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* CompleteClass */
    override def previewValue(): Unit = js.native
    
    /* CompleteClass */
    override def setDescription(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(args: Any*): Unit = js.native
    
    /* CompleteClass */
    var supportsCalculatedFields: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/field-aggregator/CountFieldAggregator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CountFieldAggregator extends StObject {
    
    var decimalPrecision: Double
    
    def getDescription(): Any
    
    def getReadOnly(): Any
    
    def getValue(): Any
    
    def previewValue(): Unit
    
    def setDescription(args: Any*): Unit
    
    def setReadOnly(args: Any*): Unit
    
    var supportsCalculatedFields: Boolean
  }
  object CountFieldAggregator {
    
    inline def apply(
      decimalPrecision: Double,
      getDescription: () => Any,
      getReadOnly: () => Any,
      getValue: () => Any,
      previewValue: () => Unit,
      setDescription: /* repeated */ Any => Unit,
      setReadOnly: /* repeated */ Any => Unit,
      supportsCalculatedFields: Boolean
    ): CountFieldAggregator = {
      val __obj = js.Dynamic.literal(decimalPrecision = decimalPrecision.asInstanceOf[js.Any], getDescription = js.Any.fromFunction0(getDescription), getReadOnly = js.Any.fromFunction0(getReadOnly), getValue = js.Any.fromFunction0(getValue), previewValue = js.Any.fromFunction0(previewValue), setDescription = js.Any.fromFunction1(setDescription), setReadOnly = js.Any.fromFunction1(setReadOnly), supportsCalculatedFields = supportsCalculatedFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountFieldAggregator]
    }
    
    extension [Self <: CountFieldAggregator](x: Self) {
      
      inline def setDecimalPrecision(value: Double): Self = StObject.set(x, "decimalPrecision", value.asInstanceOf[js.Any])
      
      inline def setGetDescription(value: () => Any): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      inline def setGetReadOnly(value: () => Any): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setPreviewValue(value: () => Unit): Self = StObject.set(x, "previewValue", js.Any.fromFunction0(value))
      
      inline def setSetDescription(value: /* repeated */ Any => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
      
      inline def setSetReadOnly(value: /* repeated */ Any => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      inline def setSupportsCalculatedFields(value: Boolean): Self = StObject.set(x, "supportsCalculatedFields", value.asInstanceOf[js.Any])
    }
  }
}
