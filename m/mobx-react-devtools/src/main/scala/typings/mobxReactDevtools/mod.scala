package typings.mobxReactDevtools

import typings.mobxReactDevtools.anon.Bottom
import typings.mobxReactDevtools.anon.GraphEnabled
import typings.mobxReactDevtools.anon.HighlightTimeout
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.bottomLeft
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.bottomRight
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.topLeft
import typings.mobxReactDevtools.mobxReactDevtoolsStrings.topRight
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-react-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx-react-devtools", JSImport.Default)
  @js.native
  open class default ()
    extends Component[IDevToolProps, js.Object, Any]
  
  @JSImport("mobx-react-devtools", "GraphControl")
  @js.native
  open class GraphControl protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  @JSImport("mobx-react-devtools", "LogControl")
  @js.native
  open class LogControl protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  @JSImport("mobx-react-devtools", "UpdatesControl")
  @js.native
  open class UpdatesControl protected ()
    extends Component[HighlightTimeout, js.Object, Any] {
    def this(props: HighlightTimeout) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HighlightTimeout, context: Any) = this()
  }
  
  inline def configureDevtool(options: GraphEnabled): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureDevtool")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGraphEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGraphEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLogEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUpdatesEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type DevTools = Component[IDevToolProps, js.Object, Any]
  
  trait IDevToolProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var highlightTimeout: js.UndefOr[Double] = js.undefined
    
    var noPanel: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[topRight | bottomRight | bottomLeft | topLeft | Bottom] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IDevToolProps {
    
    inline def apply(): IDevToolProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDevToolProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDevToolProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHighlightTimeout(value: Double): Self = StObject.set(x, "highlightTimeout", value.asInstanceOf[js.Any])
      
      inline def setHighlightTimeoutUndefined: Self = StObject.set(x, "highlightTimeout", js.undefined)
      
      inline def setNoPanel(value: Boolean): Self = StObject.set(x, "noPanel", value.asInstanceOf[js.Any])
      
      inline def setNoPanelUndefined: Self = StObject.set(x, "noPanel", js.undefined)
      
      inline def setPosition(value: topRight | bottomRight | bottomLeft | topLeft | Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
