package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgFieldAggregatorMod {
  
  inline def apply(fieldName: Any, dataSet: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(fieldName.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/field-aggregator/AvgFieldAggregator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AvgFieldAggregator {
    def this(fieldName: Any, dataSet: Any) = this()
    
    /* CompleteClass */
    var fValue: Any = js.native
    
    /* CompleteClass */
    override def getDescription(): Any = js.native
    
    /* CompleteClass */
    override def getReadOnly(): Any = js.native
    
    /* CompleteClass */
    override def getValue(): Double = js.native
    
    /* CompleteClass */
    override def previewValue(recNo: Any, newValue: Any): Unit = js.native
    
    /* CompleteClass */
    override def setDescription(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(args: Any*): Unit = js.native
    
    /* CompleteClass */
    var supportsCalculatedFields: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/field-aggregator/AvgFieldAggregator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AvgFieldAggregator extends StObject {
    
    var fValue: Any
    
    def getDescription(): Any
    
    def getReadOnly(): Any
    
    def getValue(): Double
    
    def previewValue(recNo: Any, newValue: Any): Unit
    
    def setDescription(args: Any*): Unit
    
    def setReadOnly(args: Any*): Unit
    
    var supportsCalculatedFields: Boolean
  }
  object AvgFieldAggregator {
    
    inline def apply(
      fValue: Any,
      getDescription: () => Any,
      getReadOnly: () => Any,
      getValue: () => Double,
      previewValue: (Any, Any) => Unit,
      setDescription: /* repeated */ Any => Unit,
      setReadOnly: /* repeated */ Any => Unit,
      supportsCalculatedFields: Boolean
    ): AvgFieldAggregator = {
      val __obj = js.Dynamic.literal(fValue = fValue.asInstanceOf[js.Any], getDescription = js.Any.fromFunction0(getDescription), getReadOnly = js.Any.fromFunction0(getReadOnly), getValue = js.Any.fromFunction0(getValue), previewValue = js.Any.fromFunction2(previewValue), setDescription = js.Any.fromFunction1(setDescription), setReadOnly = js.Any.fromFunction1(setReadOnly), supportsCalculatedFields = supportsCalculatedFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvgFieldAggregator]
    }
    
    extension [Self <: AvgFieldAggregator](x: Self) {
      
      inline def setFValue(value: Any): Self = StObject.set(x, "fValue", value.asInstanceOf[js.Any])
      
      inline def setGetDescription(value: () => Any): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      inline def setGetReadOnly(value: () => Any): Self = StObject.set(x, "getReadOnly", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setPreviewValue(value: (Any, Any) => Unit): Self = StObject.set(x, "previewValue", js.Any.fromFunction2(value))
      
      inline def setSetDescription(value: /* repeated */ Any => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
      
      inline def setSetReadOnly(value: /* repeated */ Any => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      inline def setSupportsCalculatedFields(value: Boolean): Self = StObject.set(x, "supportsCalculatedFields", value.asInstanceOf[js.Any])
    }
  }
}
