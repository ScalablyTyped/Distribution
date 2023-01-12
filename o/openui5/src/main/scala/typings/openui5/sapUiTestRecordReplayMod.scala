package typings.openui5

import typings.openui5.anon.ClearTextFirst
import typings.openui5.anon.DomElement
import typings.openui5.anon.Interval
import typings.openui5.anon.Selector
import typings.openui5.sap.ClassInfo
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestRecordReplayMod {
  
  @JSImport("sap/ui/test/RecordReplay", JSImport.Default)
  @js.native
  open class default ()
    extends typings.openui5.sapUiBaseObjectMod.default
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/RecordReplay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.RecordReplay with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RecordReplay]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RecordReplay],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Find DOM element representations of all controls specified by a selector object. Useful when the selector
      * matches multiple controls and you want all the results.
      *
      * @returns Promise to be resolved with an array of DOM elements or rejected with Error when no suitable
      * DOM elements are found
      */
    inline def findAllDOMElementsByControlSelector(/**
      * Options for the search
      */
    oOptions: Selector): js.Promise[js.Array[Any] | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllDOMElementsByControlSelector")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any] | js.Error]]
    
    /**
      * Find the best control selector for a DOM element. A selector uniquely represents a single element. The
      * 'best' selector is the one with which it is most likely to uniquely identify a control with the least
      * possible inspection of the control tree.
      *
      * @returns Promise for control selector or error
      */
    inline def findControlSelectorByDOMElement(/**
      * Options to influence the generation of the selector
      */
    oOptions: DomElement): js.Promise[ControlSelector | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findControlSelectorByDOMElement")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ControlSelector | js.Error]]
    
    /**
      * Find DOM element representation of a control specified by a selector object.
      *
      * @returns Promise to be resolved with DOM element or rejected with Error when no suitable representation
      * can be found
      */
    inline def findDOMElementByControlSelector(/**
      * Options for the search
      */
    oOptions: Selector): js.Promise[Element | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMElementByControlSelector")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element | js.Error]]
    
    /**
      * Returns a metadata object for class sap.ui.test.RecordReplay.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Interact with specific control.
      *
      * @returns Promise to be resolved when the interaction is done or rejected if interaction is not possible
      */
    inline def interactWithControl(/**
      * Options for the interaction
      */
    oOptions: ClearTextFirst): js.Promise[js.UndefOr[js.Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("interactWithControl")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Error]]]
    
    /**
      * Wait for UI5 to complete processing, poll until all asynchronous work is finished, or timeout.
      *
      * @returns Promise to be resolved when UI5 is awaited, or rejected if timeout is reached The promise will
      * be rejected with an error containing a stringified list of pending work.
      */
    inline def waitForUI5(/**
      * Override default wait options like polling timeout and interval
      */
    oOptions: Interval): js.Promise[js.UndefOr[js.Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForUI5")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Error]]]
  }
  
  @js.native
  sealed trait InteractionType extends StObject
  @JSImport("sap/ui/test/RecordReplay", "InteractionType")
  @js.native
  object InteractionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InteractionType & String] = js.native
    
    @js.native
    sealed trait EnterText
      extends StObject
         with InteractionType
    /* "ENTER_TEXT" */ val EnterText: typings.openui5.sapUiTestRecordReplayMod.InteractionType.EnterText & String = js.native
    
    @js.native
    sealed trait Press
      extends StObject
         with InteractionType
    /* "PRESS" */ val Press: typings.openui5.sapUiTestRecordReplayMod.InteractionType.Press & String = js.native
  }
  
  trait ControlSelector extends StObject {
    
    /**
      * I18N Text matcher, {@link sap.ui.test.matchers.I18NText}
      */
    var I18NText: js.Object
    
    /**
      * Binding path matcher, {@link sap.ui.test.matchers.BindingPath}
      */
    var bindingPath: js.Object
    
    /**
      * Fully qualified control class name in dot notation, eg: "sap.m.ObjectHeader"
      */
    var controlType: String
    
    /**
      * ID of a control (global or within viewName, if viewName is defined)
      */
    var id: String | js.RegExp
    
    /**
      * Label matcher, {@link sap.ui.test.matchers.LabelFor}
      */
    var labelFor: js.Object
    
    /**
      * Properties matcher, {@link sap.ui.test.matchers.Properties}
      */
    var properties: js.Object
    
    /**
      * Name of the control's view parent
      */
    var viewName: String
  }
  object ControlSelector {
    
    inline def apply(
      I18NText: js.Object,
      bindingPath: js.Object,
      controlType: String,
      id: String | js.RegExp,
      labelFor: js.Object,
      properties: js.Object,
      viewName: String
    ): ControlSelector = {
      val __obj = js.Dynamic.literal(I18NText = I18NText.asInstanceOf[js.Any], bindingPath = bindingPath.asInstanceOf[js.Any], controlType = controlType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelFor = labelFor.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlSelector] (val x: Self) extends AnyVal {
      
      inline def setBindingPath(value: js.Object): Self = StObject.set(x, "bindingPath", value.asInstanceOf[js.Any])
      
      inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
      
      inline def setI18NText(value: js.Object): Self = StObject.set(x, "I18NText", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | js.RegExp): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabelFor(value: js.Object): Self = StObject.set(x, "labelFor", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    }
  }
  
  type RecordReplay = typings.openui5.sapUiBaseObjectMod.default
}
