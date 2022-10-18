package typings.openui5

import typings.openui5.anon.Horizontal
import typings.openui5.sap.ClassInfo
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDelegateScrollEnablementMod {
  
  @JSImport("sap/ui/core/delegate/ScrollEnablement", JSImport.Default)
  @js.native
  open class default protected () extends ScrollEnablement {
    /**
      * Creates a ScrollEnablement delegate that can be attached to Controls requiring capabilities for scrolling
      * of a certain part of their DOM.
      */
    def this(
      /**
      * the Control of which this Scroller is the delegate
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * the Id of the element within the DOM of the Control which should be scrollable
      */
    sScrollContentDom: String,
      /**
      * the configuration of the scroll delegate
      */
    oConfig: Horizontal
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/delegate/ScrollEnablement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.delegate.ScrollEnablement with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ScrollEnablement]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ScrollEnablement],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.delegate.ScrollEnablement.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ScrollEnablement
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    def getChildPosition(
      /**
      * An element(DOM or jQuery) for which the scroll position will be calculated.
      */
    vElement: jQuery[HTMLElement]
    ): js.Object = js.native
    /**
      * Calculates scroll position of a child of a container.
      *
      * @returns Position object.
      */
    def getChildPosition(
      /**
      * An element(DOM or jQuery) for which the scroll position will be calculated.
      */
    vElement: HTMLElement
    ): js.Object = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Get current setting for horizontal scrolling.
      *
      * @returns true if horizontal scrolling is enabled
      */
    def getHorizontal(): Boolean = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Get current setting for vertical scrolling.
      *
      * @returns true if vertical scrolling is enabled
      */
    def getVertical(): Boolean = js.native
    
    /**
      * Refreshes this Scrolling delegate.
      */
    def refresh(): Unit = js.native
    
    /**
      * Scrolls to a specific position in scroll container.
      */
    def scrollTo(
      /**
      * Horizontal position of the scrollbar
      */
    x: int,
      /**
      * Vertical position of the scrollbar
      */
    y: int,
      /**
      * Called when the scroll completes or stops without completing
      */
    fnScrollEndCallback: js.Function
    ): this.type = js.native
    /**
      * Scrolls to a specific position in scroll container.
      */
    def scrollTo(
      /**
      * Horizontal position of the scrollbar
      */
    x: int,
      /**
      * Vertical position of the scrollbar
      */
    y: int,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    time: int,
      /**
      * Called when the scroll completes or stops without completing
      */
    fnScrollEndCallback: js.Function
    ): this.type = js.native
    
    /**
      * Scrolls to an element within a container.
      */
    def scrollToElement(/**
      * A DOM element.
      */
    oElement: HTMLElement): this.type = js.native
    def scrollToElement(
      /**
      * A DOM element.
      */
    oElement: HTMLElement,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: Unit,
      /**
      * Specifies an additional left and top offset of the target scroll position, relative to the upper left
      * corner of the DOM element
      */
    aOffset: js.Array[int]
    ): this.type = js.native
    def scrollToElement(
      /**
      * A DOM element.
      */
    oElement: HTMLElement,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: int
    ): this.type = js.native
    def scrollToElement(
      /**
      * A DOM element.
      */
    oElement: HTMLElement,
      /**
      * The duration of animated scrolling in milliseconds. To scroll immediately without animation, give 0 as
      * value.
      */
    iTime: int,
      /**
      * Specifies an additional left and top offset of the target scroll position, relative to the upper left
      * corner of the DOM element
      */
    aOffset: js.Array[int]
    ): this.type = js.native
    
    /**
      * @SINCE 1.17
      * @deprecated (since 1.42)
      *
      * Setter for property `bounce`.
      */
    def setBounce(/**
      * new value for property `bounce`.
      */
    bBounce: Boolean): Unit = js.native
    
    /**
      * @SINCE 1.11.0
      *
      * Sets GrowingList control to scroll container
      */
    def setGrowingList(
      /**
      * Scrolling callback
      */
    fnScrollLoadCallback: js.Function,
      /**
      * Scrolling direction
      */
    sScrollLoadDirection: /* was: sap.m.ListGrowingDirection */ Any,
      /**
      * listener for the `overflowChange` event
      */
    fnOverflowChange: js.Function
    ): Unit = js.native
    
    /**
      * Enable or disable horizontal scrolling.
      */
    def setHorizontal(/**
      * set true to enable horizontal scrolling, false - to disable
      */
    bHorizontal: Boolean): Unit = js.native
    
    /**
      * @SINCE 1.16.1
      *
      * Sets IconTabBar control to scroll container
      */
    def setIconTabBar(
      /**
      * instance
      */
    oIconTabBar: /* was: sap.m.IconTabBar */ Any,
      /**
      * callback function for the scroll end event
      */
    fnScrollEndCallback: js.Function,
      /**
      * callback function for the scroll start event
      */
    fnScrollStartCallback: js.Function
    ): Unit = js.native
    
    /**
      * @SINCE 1.9.2
      *
      * Set overflow control on top of scroll container.
      */
    def setPullDown(
      /**
      * Top control that should be normally hidden over the top border of the scroll container (pull-down content).
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * Enable or disable vertical scrolling.
      */
    def setVertical(/**
      * set true to enable vertical scrolling, false - to disable
      */
    bVertical: Boolean): Unit = js.native
  }
}
