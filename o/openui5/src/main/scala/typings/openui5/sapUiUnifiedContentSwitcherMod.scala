package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedContentSwitcherMod {
  
  @JSImport("sap/ui/unified/ContentSwitcher", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ContentSwitcher.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ContentSwitcher {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ContentSwitcherSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ContentSwitcherSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ContentSwitcherSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/ContentSwitcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.ContentSwitcher with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, ContentSwitcher]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ContentSwitcher],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.ContentSwitcher.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ContentSwitcher
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some content1 to the aggregation {@link #getContent1 content1}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent1(
      /**
      * The content1 to add; if empty, nothing is inserted
      */
    oContent1: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some content2 to the aggregation {@link #getContent2 content2}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent2(
      /**
      * The content2 to add; if empty, nothing is inserted
      */
    oContent2: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content1 in the aggregation {@link #getContent1 content1}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent1(): this.type = js.native
    
    /**
      * Destroys all the content2 in the aggregation {@link #getContent2 content2}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent2(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveContent activeContent}.
      *
      * The number of the currently active content (1 or 2).
      *
      * Default value is `1`.
      *
      * @returns Value of property `activeContent`
      */
    def getActiveContent(): int = js.native
    
    /**
      * Gets current value of property {@link #getAnimation animation}.
      *
      * Set the used animation when changing content. This just sets a CSS-class named "sapUiUnifiedACSwitcherAnimation"
      * + this value on the root element of the control. The animation has to be implemented in CSS. This also
      * enables applications to implement their own animations via CSS by reacting to the parent class. See the
      * types sap.ui.unified.ContentSwitcherAnimation for default implementations.
      *
      * Default value is `'None'`.
      *
      * @returns Value of property `animation`
      */
    def getAnimation(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getContent1 content1}.
      *
      * The controls that should be shown in the first content
      */
    def getContent1(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent2 content2}.
      *
      * The controls that should be shown in the second content
      */
    def getContent2(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent1 content1}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent1(
      /**
      * The content1 whose index is looked for
      */
    oContent1: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent2 content2}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent2(
      /**
      * The content2 whose index is looked for
      */
    oContent2: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content1 into the aggregation {@link #getContent1 content1}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent1(
      /**
      * The content1 to insert; if empty, nothing is inserted
      */
    oContent1: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content1 should be inserted at; for a negative value of `iIndex`, the content1
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content1
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a content2 into the aggregation {@link #getContent2 content2}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent2(
      /**
      * The content2 to insert; if empty, nothing is inserted
      */
    oContent2: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content2 should be inserted at; for a negative value of `iIndex`, the content2
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content2
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent1 content1}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent1(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent2 content2}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent2(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent1(/**
      * The content1 to remove or its index or id
      */
    vContent1: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content1 from the aggregation {@link #getContent1 content1}.
      *
      * @returns The removed content1 or `null`
      */
    def removeContent1(/**
      * The content1 to remove or its index or id
      */
    vContent1: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent1(
      /**
      * The content1 to remove or its index or id
      */
    vContent1: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeContent2(/**
      * The content2 to remove or its index or id
      */
    vContent2: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content2 from the aggregation {@link #getContent2 content2}.
      *
      * @returns The removed content2 or `null`
      */
    def removeContent2(/**
      * The content2 to remove or its index or id
      */
    vContent2: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent2(
      /**
      * The content2 to remove or its index or id
      */
    vContent2: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getActiveContent activeContent}.
      *
      * The number of the currently active content (1 or 2).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveContent(): this.type = js.native
    def setActiveContent(/**
      * New value for property `activeContent`
      */
    iActiveContent: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAnimation animation}.
      *
      * Set the used animation when changing content. This just sets a CSS-class named "sapUiUnifiedACSwitcherAnimation"
      * + this value on the root element of the control. The animation has to be implemented in CSS. This also
      * enables applications to implement their own animations via CSS by reacting to the parent class. See the
      * types sap.ui.unified.ContentSwitcherAnimation for default implementations.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'None'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnimation(): this.type = js.native
    def setAnimation(/**
      * New value for property `animation`
      */
    sAnimation: String): this.type = js.native
    
    /**
      * Changes the currently active content to the other one. If content 1 is active, content 2 will be activated
      * and the other way around.
      */
    def switchContent(): Unit = js.native
  }
  
  trait ContentSwitcherSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The number of the currently active content (1 or 2).
      */
    var activeContent: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Set the used animation when changing content. This just sets a CSS-class named "sapUiUnifiedACSwitcherAnimation"
      * + this value on the root element of the control. The animation has to be implemented in CSS. This also
      * enables applications to implement their own animations via CSS by reacting to the parent class. See the
      * types sap.ui.unified.ContentSwitcherAnimation for default implementations.
      */
    var animation: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The controls that should be shown in the first content
      */
    var content1: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The controls that should be shown in the second content
      */
    var content2: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ContentSwitcherSettings {
    
    inline def apply(): ContentSwitcherSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentSwitcherSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentSwitcherSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveContent(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeContent", value.asInstanceOf[js.Any])
      
      inline def setActiveContentUndefined: Self = StObject.set(x, "activeContent", js.undefined)
      
      inline def setAnimation(value: String | PropertyBindingInfo): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setContent1(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content1", value.asInstanceOf[js.Any])
      
      inline def setContent1Undefined: Self = StObject.set(x, "content1", js.undefined)
      
      inline def setContent1Varargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content1", js.Array(value*))
      
      inline def setContent2(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content2", value.asInstanceOf[js.Any])
      
      inline def setContent2Undefined: Self = StObject.set(x, "content2", js.undefined)
      
      inline def setContent2Varargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content2", js.Array(value*))
    }
  }
}
