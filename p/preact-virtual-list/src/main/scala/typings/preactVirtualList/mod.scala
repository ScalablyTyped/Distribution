package typings.preactVirtualList

import org.scalablytyped.runtime.StringDictionary
import typings.preact.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("preact-virtual-list", JSImport.Namespace)
  @js.native
  open class ^ protected () extends VirtualList {
    def this(props: Props) = this()
  }
  
  trait Props
    extends StObject
       with /* otherProps */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.Array[Any]
    
    var overscanCount: js.UndefOr[Double] = js.undefined
    
    def renderRow(row: Any): Any
    
    var rowHeight: Double
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(data: js.Array[Any], renderRow: Any => Any, rowHeight: Double): Props = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow), rowHeight = rowHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOverscanCount(value: Double): Self = StObject.set(x, "overscanCount", value.asInstanceOf[js.Any])
      
      inline def setOverscanCountUndefined: Self = StObject.set(x, "overscanCount", js.undefined)
      
      inline def setRenderRow(value: Any => Any): Self = StObject.set(x, "renderRow", js.Any.fromFunction1(value))
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  @js.native
  trait VirtualList
    extends Component[
          Props, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
        ]
}
