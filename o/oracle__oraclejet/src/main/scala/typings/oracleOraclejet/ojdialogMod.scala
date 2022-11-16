package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DictpropNameAction
import typings.oracleOraclejet.anon.EndCallback
import typings.oracleOraclejet.anon.Event
import typings.oracleOraclejet.anon.LabelCloseIcon
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojdialogMod.ojDialog.Position
import typings.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.cancelBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.cancelBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.dialogTitle
import typings.oracleOraclejet.oracleOraclejetStrings.dialogTitleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dragAffordance
import typings.oracleOraclejet.oracleOraclejetStrings.dragAffordanceChanged
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.escape
import typings.oracleOraclejet.oracleOraclejetStrings.fit
import typings.oracleOraclejet.oracleOraclejetStrings.flip
import typings.oracleOraclejet.oracleOraclejetStrings.flipfit
import typings.oracleOraclejet.oracleOraclejetStrings.hide
import typings.oracleOraclejet.oracleOraclejetStrings.icon
import typings.oracleOraclejet.oracleOraclejetStrings.initialVisibility
import typings.oracleOraclejet.oracleOraclejetStrings.initialVisibilityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modality
import typings.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojFocus
import typings.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojResize
import typings.oracleOraclejet.oracleOraclejetStrings.ojResizeStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojResizeStop
import typings.oracleOraclejet.oracleOraclejetStrings.position
import typings.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.resizable
import typings.oracleOraclejet.oracleOraclejetStrings.resizeBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.resizeBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.role
import typings.oracleOraclejet.oracleOraclejetStrings.roleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.show
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdialogMod {
  
  @js.native
  trait ojDialog
    extends StObject
       with baseComponent[ojDialogSettableProperties] {
    
    def addEventListener(
      `type`: cancelBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: cancelBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: dragAffordanceChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: dragAffordanceChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: initialVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: initialVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: resizeBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], Any]
    ): Unit = js.native
    def addEventListener(
      `type`: resizeBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dialogTitleChanged(
      `type`: dialogTitleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dialogTitleChanged(
      `type`: dialogTitleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStart(
      `type`: ojResizeStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStart(
      `type`: ojResizeStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStop(
      `type`: ojResizeStop,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, 
          Any
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStop(
      `type`: ojResizeStop,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, 
          Any
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_roleChanged(
      `type`: roleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_roleChanged(
      `type`: roleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var cancelBehavior: icon | escape | none = js.native
    
    def close(): Unit = js.native
    
    var dialogTitle: String | Null = js.native
    
    var dragAffordance: `title-bar` | none = js.native
    
    @JSName("getProperty")
    def getProperty_cancelBehavior(property: cancelBehavior): icon | escape | none = js.native
    @JSName("getProperty")
    def getProperty_dialogTitle(property: dialogTitle): String | Null = js.native
    @JSName("getProperty")
    def getProperty_dragAffordance(property: dragAffordance): `title-bar` | none = js.native
    @JSName("getProperty")
    def getProperty_initialVisibility(property: initialVisibility): hide | show = js.native
    @JSName("getProperty")
    def getProperty_modality(property: modality): modal | modeless = js.native
    @JSName("getProperty")
    def getProperty_position(property: position): Position = js.native
    @JSName("getProperty")
    def getProperty_resizeBehavior(property: resizeBehavior): resizable | none = js.native
    @JSName("getProperty")
    def getProperty_role(property: role): String = js.native
    
    var initialVisibility: hide | show = js.native
    
    def isOpen(): Boolean = js.native
    
    var modality: modal | modeless = js.native
    
    var onCancelBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[icon | escape | none], Any]) | Null = js.native
    
    var onDialogTitleChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], Any]) | Null = js.native
    
    var onDragAffordanceChanged: (js.Function1[/* event */ JetElementCustomEvent[`title-bar` | none], Any]) | Null = js.native
    
    var onInitialVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[hide | show], Any]) | Null = js.native
    
    var onModalityChanged: (js.Function1[/* event */ JetElementCustomEvent[modal | modeless], Any]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, Any]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, Any]) | Null = js.native
    
    var onOjBeforeClose: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, Any]) | Null = js.native
    
    var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, Any]) | Null = js.native
    
    var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, Any]) | Null = js.native
    
    var onOjFocus: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, Any]) | Null = js.native
    
    var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, Any]) | Null = js.native
    
    var onOjResize: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, Any]) | Null = js.native
    
    var onOjResizeStart: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, Any]) | Null = js.native
    
    var onOjResizeStop: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, Any]) | Null = js.native
    
    var onPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Position], Any]) | Null = js.native
    
    var onResizeBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[resizable | none], Any]) | Null = js.native
    
    var onRoleChanged: (js.Function1[/* event */ JetElementCustomEvent[String], Any]) | Null = js.native
    
    def open(): Unit = js.native
    
    var position: Position = js.native
    
    var resizeBehavior: resizable | none = js.native
    
    @JSName("role")
    var role_ojDialog: String = js.native
    
    def setProperties(properties: ojDialogSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: cancelBehavior, value: icon | escape | none): Unit = js.native
    def setProperty(property: dragAffordance, value: `title-bar` | none): Unit = js.native
    def setProperty(property: initialVisibility, value: hide | show): Unit = js.native
    def setProperty(property: modality, value: modal | modeless): Unit = js.native
    def setProperty(property: resizeBehavior, value: resizable | none): Unit = js.native
    @JSName("setProperty")
    def setProperty_dialogTitle(property: dialogTitle): Unit = js.native
    @JSName("setProperty")
    def setProperty_dialogTitle(property: dialogTitle, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_position(property: position, value: Position): Unit = js.native
    @JSName("setProperty")
    def setProperty_role(property: role, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelCloseIcon): Unit = js.native
    
    @JSName("translations")
    var translations_ojDialog: LabelCloseIcon = js.native
  }
  object ojDialog {
    
    // tslint:disable-next-line interface-over-type-literal
    trait Position extends StObject {
      
      var at: js.UndefOr[PositionAlign] = js.undefined
      
      var collision: js.UndefOr[flip | fit | flipfit | none] = js.undefined
      
      var my: js.UndefOr[PositionAlign] = js.undefined
      
      var of: js.UndefOr[String | PositionPoint] = js.undefined
      
      var offset: js.UndefOr[PositionPoint] = js.undefined
    }
    object Position {
      
      inline def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      extension [Self <: Position](x: Self) {
        
        inline def setAt(value: PositionAlign): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        inline def setCollision(value: flip | fit | flipfit | none): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
        
        inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
        
        inline def setMy(value: PositionAlign): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
        
        inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
        
        inline def setOf(value: String | PositionPoint): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
        
        inline def setOffset(value: PositionPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait PositionAlign extends StObject {
      
      var horizontal: js.UndefOr[start | end | left | center | bottom] = js.undefined
      
      var vertical: js.UndefOr[top | bottom | center] = js.undefined
    }
    object PositionAlign {
      
      inline def apply(): PositionAlign = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionAlign]
      }
      
      extension [Self <: PositionAlign](x: Self) {
        
        inline def setHorizontal(value: start | end | left | center | bottom): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        inline def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
        
        inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait PositionPoint extends StObject {
      
      var x: js.UndefOr[Double] = js.undefined
      
      var y: js.UndefOr[Double] = js.undefined
    }
    object PositionPoint {
      
      inline def apply(): PositionPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionPoint]
      }
      
      extension [Self <: PositionPoint](x: Self) {
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
    
    type ojAnimateEnd = CustomEvent[DictpropNameAction]
    
    type ojAnimateStart = CustomEvent[EndCallback]
    
    type ojBeforeClose = CustomEvent[Event]
    
    type ojBeforeOpen = CustomEvent[Event]
    
    type ojClose = CustomEvent[Event]
    
    type ojFocus = CustomEvent[Event]
    
    type ojOpen = CustomEvent[Event]
    
    type ojResize = CustomEvent[Event]
    
    type ojResizeStart = CustomEvent[Event]
    
    type ojResizeStop = CustomEvent[Event]
  }
  
  trait ojDialogEventMap
    extends StObject
       with baseComponentEventMap[ojDialogSettableProperties] {
    
    var cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none]
    
    var dialogTitleChanged: JetElementCustomEvent[String | Null]
    
    var dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none]
    
    var initialVisibilityChanged: JetElementCustomEvent[hide | show]
    
    var modalityChanged: JetElementCustomEvent[modal | modeless]
    
    var ojAnimateEnd: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd
    
    var ojAnimateStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart
    
    var ojBeforeClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose
    
    var ojBeforeOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen
    
    var ojClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose
    
    var ojFocus: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus
    
    var ojOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen
    
    var ojResize: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize
    
    var ojResizeStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart
    
    var ojResizeStop: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop
    
    var positionChanged: JetElementCustomEvent[Position]
    
    var resizeBehaviorChanged: JetElementCustomEvent[resizable | none]
    
    var roleChanged: JetElementCustomEvent[String]
  }
  object ojDialogEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      cancel: typings.std.Event,
      cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none],
      canplay: typings.std.Event,
      canplaythrough: typings.std.Event,
      change: typings.std.Event,
      click: MouseEvent,
      close: typings.std.Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: typings.std.Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      dialogTitleChanged: JetElementCustomEvent[String | Null],
      drag: DragEvent,
      dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none],
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: typings.std.Event,
      emptied: typings.std.Event,
      ended: typings.std.Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: typings.std.Event,
      fullscreenerror: typings.std.Event,
      gotpointercapture: PointerEvent,
      initialVisibilityChanged: JetElementCustomEvent[hide | show],
      input: typings.std.Event,
      invalid: typings.std.Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: typings.std.Event,
      loadeddata: typings.std.Event,
      loadedmetadata: typings.std.Event,
      loadstart: typings.std.Event,
      lostpointercapture: PointerEvent,
      modalityChanged: JetElementCustomEvent[modal | modeless],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd,
      ojAnimateStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart,
      ojBeforeClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose,
      ojBeforeOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen,
      ojClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose,
      ojFocus: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus,
      ojOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen,
      ojResize: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize,
      ojResizeStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart,
      ojResizeStop: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop,
      paste: ClipboardEvent,
      pause: typings.std.Event,
      play: typings.std.Event,
      playing: typings.std.Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      positionChanged: JetElementCustomEvent[Position],
      progress: ProgressEvent[EventTarget],
      ratechange: typings.std.Event,
      reset: typings.std.Event,
      resize: UIEvent,
      resizeBehaviorChanged: JetElementCustomEvent[resizable | none],
      roleChanged: JetElementCustomEvent[String],
      scroll: typings.std.Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: typings.std.Event,
      seeking: typings.std.Event,
      select: typings.std.Event,
      selectionchange: typings.std.Event,
      selectstart: typings.std.Event,
      slotchange: typings.std.Event,
      stalled: typings.std.Event,
      submit: SubmitEvent,
      suspend: typings.std.Event,
      timeupdate: typings.std.Event,
      toggle: typings.std.Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: JetElementCustomEvent[js.Object | Null],
      volumechange: typings.std.Event,
      waiting: typings.std.Event,
      webkitanimationend: typings.std.Event,
      webkitanimationiteration: typings.std.Event,
      webkitanimationstart: typings.std.Event,
      webkittransitionend: typings.std.Event,
      wheel: WheelEvent
    ): ojDialogEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], cancelBehaviorChanged = cancelBehaviorChanged.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialogTitleChanged = dialogTitleChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragAffordanceChanged = dragAffordanceChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialVisibilityChanged = initialVisibilityChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojResizeStart = ojResizeStart.asInstanceOf[js.Any], ojResizeStop = ojResizeStop.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], resizeBehaviorChanged = resizeBehaviorChanged.asInstanceOf[js.Any], roleChanged = roleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDialogEventMap]
    }
    
    extension [Self <: ojDialogEventMap](x: Self) {
      
      inline def setCancelBehaviorChanged(value: JetElementCustomEvent[icon | escape | none]): Self = StObject.set(x, "cancelBehaviorChanged", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "dialogTitleChanged", value.asInstanceOf[js.Any])
      
      inline def setDragAffordanceChanged(value: JetElementCustomEvent[`title-bar` | none]): Self = StObject.set(x, "dragAffordanceChanged", value.asInstanceOf[js.Any])
      
      inline def setInitialVisibilityChanged(value: JetElementCustomEvent[hide | show]): Self = StObject.set(x, "initialVisibilityChanged", value.asInstanceOf[js.Any])
      
      inline def setModalityChanged(value: JetElementCustomEvent[modal | modeless]): Self = StObject.set(x, "modalityChanged", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateEnd(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateStart(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeClose(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose): Self = StObject.set(x, "ojBeforeClose", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeOpen(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen): Self = StObject.set(x, "ojBeforeOpen", value.asInstanceOf[js.Any])
      
      inline def setOjClose(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose): Self = StObject.set(x, "ojClose", value.asInstanceOf[js.Any])
      
      inline def setOjFocus(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus): Self = StObject.set(x, "ojFocus", value.asInstanceOf[js.Any])
      
      inline def setOjOpen(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen): Self = StObject.set(x, "ojOpen", value.asInstanceOf[js.Any])
      
      inline def setOjResize(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      inline def setOjResizeStart(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart): Self = StObject.set(x, "ojResizeStart", value.asInstanceOf[js.Any])
      
      inline def setOjResizeStop(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop): Self = StObject.set(x, "ojResizeStop", value.asInstanceOf[js.Any])
      
      inline def setPositionChanged(value: JetElementCustomEvent[Position]): Self = StObject.set(x, "positionChanged", value.asInstanceOf[js.Any])
      
      inline def setResizeBehaviorChanged(value: JetElementCustomEvent[resizable | none]): Self = StObject.set(x, "resizeBehaviorChanged", value.asInstanceOf[js.Any])
      
      inline def setRoleChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "roleChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojDialogSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var cancelBehavior: icon | escape | none
    
    var dialogTitle: String | Null
    
    var dragAffordance: `title-bar` | none
    
    var initialVisibility: hide | show
    
    var modality: modal | modeless
    
    var position: Position
    
    var resizeBehavior: resizable | none
    
    var role: String
    
    @JSName("translations")
    var translations_ojDialogSettableProperties: LabelCloseIcon
  }
  object ojDialogSettableProperties {
    
    inline def apply(
      cancelBehavior: icon | escape | none,
      dragAffordance: `title-bar` | none,
      initialVisibility: hide | show,
      modality: modal | modeless,
      position: Position,
      resizeBehavior: resizable | none,
      role: String,
      translations: LabelCloseIcon
    ): ojDialogSettableProperties = {
      val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], dialogTitle = null)
      __obj.asInstanceOf[ojDialogSettableProperties]
    }
    
    extension [Self <: ojDialogSettableProperties](x: Self) {
      
      inline def setCancelBehavior(value: icon | escape | none): Self = StObject.set(x, "cancelBehavior", value.asInstanceOf[js.Any])
      
      inline def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleNull: Self = StObject.set(x, "dialogTitle", null)
      
      inline def setDragAffordance(value: `title-bar` | none): Self = StObject.set(x, "dragAffordance", value.asInstanceOf[js.Any])
      
      inline def setInitialVisibility(value: hide | show): Self = StObject.set(x, "initialVisibility", value.asInstanceOf[js.Any])
      
      inline def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setResizeBehavior(value: resizable | none): Self = StObject.set(x, "resizeBehavior", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: LabelCloseIcon): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdialog.ojDialogSettableProperties> */
  trait ojDialogSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var cancelBehavior: js.UndefOr[icon | escape | none] = js.undefined
    
    var dialogTitle: js.UndefOr[String | Null] = js.undefined
    
    var dragAffordance: js.UndefOr[`title-bar` | none] = js.undefined
    
    var initialVisibility: js.UndefOr[hide | show] = js.undefined
    
    var modality: js.UndefOr[modal | modeless] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var resizeBehavior: js.UndefOr[resizable | none] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[LabelCloseIcon] = js.undefined
  }
  object ojDialogSettablePropertiesLenient {
    
    inline def apply(): ojDialogSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojDialogSettablePropertiesLenient]
    }
    
    extension [Self <: ojDialogSettablePropertiesLenient](x: Self) {
      
      inline def setCancelBehavior(value: icon | escape | none): Self = StObject.set(x, "cancelBehavior", value.asInstanceOf[js.Any])
      
      inline def setCancelBehaviorUndefined: Self = StObject.set(x, "cancelBehavior", js.undefined)
      
      inline def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleNull: Self = StObject.set(x, "dialogTitle", null)
      
      inline def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
      
      inline def setDragAffordance(value: `title-bar` | none): Self = StObject.set(x, "dragAffordance", value.asInstanceOf[js.Any])
      
      inline def setDragAffordanceUndefined: Self = StObject.set(x, "dragAffordance", js.undefined)
      
      inline def setInitialVisibility(value: hide | show): Self = StObject.set(x, "initialVisibility", value.asInstanceOf[js.Any])
      
      inline def setInitialVisibilityUndefined: Self = StObject.set(x, "initialVisibility", js.undefined)
      
      inline def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizeBehavior(value: resizable | none): Self = StObject.set(x, "resizeBehavior", value.asInstanceOf[js.Any])
      
      inline def setResizeBehaviorUndefined: Self = StObject.set(x, "resizeBehavior", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTranslations(value: LabelCloseIcon): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
