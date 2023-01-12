package typings.nginstackWebFramework

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvVisualizationFilterMod {
  
  inline def apply(name: String, `type`: String, size: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VisualizationFilter {
    def this(name: String, `type`: String, size: Double) = this()
    
    /* CompleteClass */
    override def assignFrom(obj: StringDictionary[Any]): Unit = js.native
    
    /* CompleteClass */
    override def getVisibleValue(): Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var propertiesToAssign_ : Any = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var targets: js.Array[Any] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait VisualizationFilter extends StObject {
    
    def assignFrom(obj: StringDictionary[Any]): Unit
    
    def getVisibleValue(): Any
    
    var name: String
    
    /* private */ var propertiesToAssign_ : Any
    
    var size: Double
    
    var targets: js.Array[Any]
    
    var `type`: String
  }
  object VisualizationFilter {
    
    inline def apply(
      assignFrom: StringDictionary[Any] => Unit,
      getVisibleValue: () => Any,
      name: String,
      propertiesToAssign_ : Any,
      size: Double,
      targets: js.Array[Any],
      `type`: String
    ): VisualizationFilter = {
      val __obj = js.Dynamic.literal(assignFrom = js.Any.fromFunction1(assignFrom), getVisibleValue = js.Any.fromFunction0(getVisibleValue), name = name.asInstanceOf[js.Any], propertiesToAssign_ = propertiesToAssign_.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisualizationFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisualizationFilter] (val x: Self) extends AnyVal {
      
      inline def setAssignFrom(value: StringDictionary[Any] => Unit): Self = StObject.set(x, "assignFrom", js.Any.fromFunction1(value))
      
      inline def setGetVisibleValue(value: () => Any): Self = StObject.set(x, "getVisibleValue", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToAssign_(value: Any): Self = StObject.set(x, "propertiesToAssign_", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: js.Array[Any]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: Any*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
