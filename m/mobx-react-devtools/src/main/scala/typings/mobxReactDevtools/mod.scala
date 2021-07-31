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
  class default ()
    extends Component[IDevToolProps, js.Object, js.Any]
  
  @JSImport("mobx-react-devtools", "GraphControl")
  @js.native
  class GraphControl protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("mobx-react-devtools", "LogControl")
  @js.native
  class LogControl protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("mobx-react-devtools", "UpdatesControl")
  @js.native
  class UpdatesControl protected ()
    extends Component[HighlightTimeout, js.Object, js.Any] {
    def this(props: HighlightTimeout) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HighlightTimeout, context: js.Any) = this()
  }
  
  @scala.inline
  def configureDevtool(options: GraphEnabled): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureDevtool")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setGraphEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGraphEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setLogEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setUpdatesEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpdatesEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type DevTools = Component[IDevToolProps, js.Object, js.Any]
  
  trait IDevToolProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var highlightTimeout: js.UndefOr[Double] = js.undefined
    
    var noPanel: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[topRight | bottomRight | bottomLeft | topLeft | Bottom] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IDevToolProps {
    
    @scala.inline
    def apply(): IDevToolProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDevToolProps]
    }
    
    @scala.inline
    implicit class IDevToolPropsMutableBuilder[Self <: IDevToolProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHighlightTimeout(value: Double): Self = StObject.set(x, "highlightTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightTimeoutUndefined: Self = StObject.set(x, "highlightTimeout", js.undefined)
      
      @scala.inline
      def setNoPanel(value: Boolean): Self = StObject.set(x, "noPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPanelUndefined: Self = StObject.set(x, "noPanel", js.undefined)
      
      @scala.inline
      def setPosition(value: topRight | bottomRight | bottomLeft | topLeft | Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
