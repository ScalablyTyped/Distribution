package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofBindingMode extends StObject {
    
    /**
      * BindingMode default means that the binding mode of the model is used
      */
    var Default: js.Any = js.native
    
    /**
      * BindingMode one time means value is only read from the model once
      */
    var OneTime: js.Any = js.native
    
    /**
      * BindingMode one way means from model to view
      */
    var OneWay: js.Any = js.native
    
    /**
      * BindingMode two way means from model to view and vice versa
      */
    var TwoWay: js.Any = js.native
  }
  object TypeofBindingMode {
    
    @scala.inline
    def apply(Default: js.Any, OneTime: js.Any, OneWay: js.Any, TwoWay: js.Any): TypeofBindingMode = {
      val __obj = js.Dynamic.literal(Default = Default.asInstanceOf[js.Any], OneTime = OneTime.asInstanceOf[js.Any], OneWay = OneWay.asInstanceOf[js.Any], TwoWay = TwoWay.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofBindingMode]
    }
    
    @scala.inline
    implicit class TypeofBindingModeMutableBuilder[Self <: TypeofBindingMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneTime(value: js.Any): Self = StObject.set(x, "OneTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneWay(value: js.Any): Self = StObject.set(x, "OneWay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoWay(value: js.Any): Self = StObject.set(x, "TwoWay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBlockBackgroundType extends StObject {
    
    /**
      * Background is transparent
      */
    var Default: js.Any = js.native
    
    /**
      * Background is with predefined light colors
      */
    var Light: js.Any = js.native
  }
  object TypeofBlockBackgroundType {
    
    @scala.inline
    def apply(Default: js.Any, Light: js.Any): TypeofBlockBackgroundType = {
      val __obj = js.Dynamic.literal(Default = Default.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofBlockBackgroundType]
    }
    
    @scala.inline
    implicit class TypeofBlockBackgroundTypeMutableBuilder[Self <: TypeofBlockBackgroundType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLight(value: js.Any): Self = StObject.set(x, "Light", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBusyIndicator extends StObject {
    
    /**
      * Registers a handler for the "close" event
      * @param fnFunction The function to call, when the event occurs.           This function will be
      * called on the oListener-instance (if           present) or in a 'static way'.
      * @param oListener Object on which to call the given function.
      * @returns <code>this</code> to allow method chaining
      */
    def attachClose(fnFunction: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
    def attachClose(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
    
    /**
      * Registers a handler for the "open" event.
      * @param fnFunction The function to call, when the event occurs. This           function will be
      * called on the oListener-instance (if present)           or in a 'static way'.
      * @param oListener Object on which to call the given function.
      * @returns <code>this</code> to allow method chaining
      */
    def attachOpen(fnFunction: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
    def attachOpen(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
    
    /**
      * Unregisters a handler for the "close" event
      * @param fnFunction The callback function to unregister
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachClose(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
    
    /**
      * Unregisters a handler for the "open" event
      * @param fnFunction The callback function to unregister
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachOpen(fnFunction: js.Any, oListener: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof sap.ui.core.BusyIndicator */ js.Any = js.native
    
    /**
      * Removes the BusyIndicator from the screen
      */
    def hide(): Unit = js.native
    
    /**
      * Displays the BusyIndicator and starts blocking all user input.This only happens after some delay and
      * if after that delay theBusyIndicator.hide() has not yet been called in the meantime.There is a
      * certain default value for the delay, but that one can beoverridden.
      * @param iDelay The delay in milliseconds before opening the                      BusyIndicator. It is
      * not opened if hide() is called                      before end of the delay. If no delay (or no
      * valid                      delay) is given, the default value is used.
      */
    def show(iDelay: Double): Unit = js.native
    
    val tils: js.Any = js.native
  }
  
  @js.native
  trait TypeofCountMode extends StObject {
    
    /**
      * Count is retrieved by a separate request upfront and inline with each data request
      */
    var Both: js.Any = js.native
    
    /**
      * Count is retrieved by adding $inlinecount=allpages and is included in the data request
      */
    var Inline: js.Any = js.native
    
    /**
      * Count is retrieved by adding $inlinecount=allpages and is included in every data request
      */
    var InlineRepeat: js.Any = js.native
    
    /**
      * Count is not requested from the server
      */
    var None: js.Any = js.native
    
    /**
      * Count is retrieved by sending a separate $count request, before requesting data
      */
    var Request: js.Any = js.native
  }
  object TypeofCountMode {
    
    @scala.inline
    def apply(Both: js.Any, Inline: js.Any, InlineRepeat: js.Any, None: js.Any, Request: js.Any): TypeofCountMode = {
      val __obj = js.Dynamic.literal(Both = Both.asInstanceOf[js.Any], Inline = Inline.asInstanceOf[js.Any], InlineRepeat = InlineRepeat.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCountMode]
    }
    
    @scala.inline
    implicit class TypeofCountModeMutableBuilder[Self <: TypeofCountMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoth(value: js.Any): Self = StObject.set(x, "Both", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline(value: js.Any): Self = StObject.set(x, "Inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRepeat(value: js.Any): Self = StObject.set(x, "InlineRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: js.Any): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDock extends StObject {
    
    /**
      */
    var BeginBottom: js.Any = js.native
    
    /**
      */
    var BeginCenter: js.Any = js.native
    
    /**
      */
    var BeginTop: js.Any = js.native
    
    /**
      */
    var CenterBottom: js.Any = js.native
    
    /**
      */
    var CenterCenter: js.Any = js.native
    
    /**
      */
    var CenterTop: js.Any = js.native
    
    /**
      */
    var EndBottom: js.Any = js.native
    
    /**
      */
    var EndCenter: js.Any = js.native
    
    /**
      */
    var EndTop: js.Any = js.native
    
    /**
      */
    var LeftBottom: js.Any = js.native
    
    /**
      */
    var LeftCenter: js.Any = js.native
    
    /**
      */
    var LeftTop: js.Any = js.native
    
    /**
      */
    var RightBottom: js.Any = js.native
    
    /**
      */
    var RightCenter: js.Any = js.native
    
    /**
      */
    var RightTop: js.Any = js.native
  }
  object TypeofDock {
    
    @scala.inline
    def apply(
      BeginBottom: js.Any,
      BeginCenter: js.Any,
      BeginTop: js.Any,
      CenterBottom: js.Any,
      CenterCenter: js.Any,
      CenterTop: js.Any,
      EndBottom: js.Any,
      EndCenter: js.Any,
      EndTop: js.Any,
      LeftBottom: js.Any,
      LeftCenter: js.Any,
      LeftTop: js.Any,
      RightBottom: js.Any,
      RightCenter: js.Any,
      RightTop: js.Any
    ): TypeofDock = {
      val __obj = js.Dynamic.literal(BeginBottom = BeginBottom.asInstanceOf[js.Any], BeginCenter = BeginCenter.asInstanceOf[js.Any], BeginTop = BeginTop.asInstanceOf[js.Any], CenterBottom = CenterBottom.asInstanceOf[js.Any], CenterCenter = CenterCenter.asInstanceOf[js.Any], CenterTop = CenterTop.asInstanceOf[js.Any], EndBottom = EndBottom.asInstanceOf[js.Any], EndCenter = EndCenter.asInstanceOf[js.Any], EndTop = EndTop.asInstanceOf[js.Any], LeftBottom = LeftBottom.asInstanceOf[js.Any], LeftCenter = LeftCenter.asInstanceOf[js.Any], LeftTop = LeftTop.asInstanceOf[js.Any], RightBottom = RightBottom.asInstanceOf[js.Any], RightCenter = RightCenter.asInstanceOf[js.Any], RightTop = RightTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofDock]
    }
    
    @scala.inline
    implicit class TypeofDockMutableBuilder[Self <: TypeofDock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginBottom(value: js.Any): Self = StObject.set(x, "BeginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginCenter(value: js.Any): Self = StObject.set(x, "BeginCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginTop(value: js.Any): Self = StObject.set(x, "BeginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterBottom(value: js.Any): Self = StObject.set(x, "CenterBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterCenter(value: js.Any): Self = StObject.set(x, "CenterCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterTop(value: js.Any): Self = StObject.set(x, "CenterTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndBottom(value: js.Any): Self = StObject.set(x, "EndBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndCenter(value: js.Any): Self = StObject.set(x, "EndCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTop(value: js.Any): Self = StObject.set(x, "EndTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftBottom(value: js.Any): Self = StObject.set(x, "LeftBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftCenter(value: js.Any): Self = StObject.set(x, "LeftCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTop(value: js.Any): Self = StObject.set(x, "LeftTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightBottom(value: js.Any): Self = StObject.set(x, "RightBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightCenter(value: js.Any): Self = StObject.set(x, "RightCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTop(value: js.Any): Self = StObject.set(x, "RightTop", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofFilterOperator extends StObject {
    
    /**
      * FilterOperator between.When used on strings, the BT operator might not behave intuitively. For
      * example,when filtering a list of Names with BT "A", "B", all Names starting with "A" will beincluded
      * as well as the name "B" itself, but no other name starting with "B".
      */
    var BT: js.Any = js.native
    
    /**
      * FilterOperator contains
      */
    var Contains: js.Any = js.native
    
    /**
      * FilterOperator equals
      */
    var EQ: js.Any = js.native
    
    /**
      * FilterOperator ends with
      */
    var EndsWith: js.Any = js.native
    
    /**
      * FilterOperator greater or equals
      */
    var GE: js.Any = js.native
    
    /**
      * FilterOperator greater than
      */
    var GT: js.Any = js.native
    
    /**
      * FilterOperator less or equals
      */
    var LE: js.Any = js.native
    
    /**
      * FilterOperator less than
      */
    var LT: js.Any = js.native
    
    /**
      * FilterOperator not equals
      */
    var NE: js.Any = js.native
    
    /**
      * FilterOperator starts with
      */
    var StartsWith: js.Any = js.native
  }
  object TypeofFilterOperator {
    
    @scala.inline
    def apply(
      BT: js.Any,
      Contains: js.Any,
      EQ: js.Any,
      EndsWith: js.Any,
      GE: js.Any,
      GT: js.Any,
      LE: js.Any,
      LT: js.Any,
      NE: js.Any,
      StartsWith: js.Any
    ): TypeofFilterOperator = {
      val __obj = js.Dynamic.literal(BT = BT.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EQ = EQ.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], GE = GE.asInstanceOf[js.Any], GT = GT.asInstanceOf[js.Any], LE = LE.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofFilterOperator]
    }
    
    @scala.inline
    implicit class TypeofFilterOperatorMutableBuilder[Self <: TypeofFilterOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBT(value: js.Any): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContains(value: js.Any): Self = StObject.set(x, "Contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEQ(value: js.Any): Self = StObject.set(x, "EQ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsWith(value: js.Any): Self = StObject.set(x, "EndsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGE(value: js.Any): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGT(value: js.Any): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLE(value: js.Any): Self = StObject.set(x, "LE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLT(value: js.Any): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNE(value: js.Any): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWith(value: js.Any): Self = StObject.set(x, "StartsWith", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofFilterType extends StObject {
    
    /**
      * Filters which are changed by the application
      */
    var Application: js.Any = js.native
    
    /**
      * Filters which are set by the different controls
      */
    var Control: js.Any = js.native
  }
  object TypeofFilterType {
    
    @scala.inline
    def apply(Application: js.Any, Control: js.Any): TypeofFilterType = {
      val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofFilterType]
    }
    
    @scala.inline
    implicit class TypeofFilterTypeMutableBuilder[Self <: TypeofFilterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControl(value: js.Any): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofReadyState extends StObject {
    
    /**
      * The connection has been closed or could not be opened.
      */
    var CLOSED: js.Any = js.native
    
    /**
      * The connection is going through the closing handshake.
      */
    var CLOSING: js.Any = js.native
    
    /**
      * The connection has not yet been established.
      */
    var CONNECTING: js.Any = js.native
    
    /**
      * The WebSocket connection is established and communication is possible.
      */
    var OPEN: js.Any = js.native
  }
  object TypeofReadyState {
    
    @scala.inline
    def apply(CLOSED: js.Any, CLOSING: js.Any, CONNECTING: js.Any, OPEN: js.Any): TypeofReadyState = {
      val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofReadyState]
    }
    
    @scala.inline
    implicit class TypeofReadyStateMutableBuilder[Self <: TypeofReadyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCLOSED(value: js.Any): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSING(value: js.Any): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONNECTING(value: js.Any): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN(value: js.Any): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    }
  }
}
