package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.initial
import typings.officeUiFabricReact.officeUiFabricReactStrings.unset
import typings.react.mod.AriaAttributes
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.reactStrings.decimal
import typings.react.reactStrings.email
import typings.react.reactStrings.inherit
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.search
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.url
import typings.react.reactStrings.yes
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.ReturnType
import typings.uifabricFoundation.anon.Slots
import typings.uifabricFoundation.libIcomponentMod.IComponent
import typings.uifabricFoundation.libIcomponentMod.IStyleableComponentProps
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricFoundation.libIhtmlslotsMod.IHTMLSlot
import typings.uifabricFoundation.libIslotsMod.ISlotProp
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsStackStackDottypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactStrings.start
    - typings.officeUiFabricReact.officeUiFabricReactStrings.end
    - typings.officeUiFabricReact.officeUiFabricReactStrings.center
    - typings.officeUiFabricReact.officeUiFabricReactStrings.`space-between`
    - typings.officeUiFabricReact.officeUiFabricReactStrings.`space-around`
    - typings.officeUiFabricReact.officeUiFabricReactStrings.`space-evenly`
    - typings.officeUiFabricReact.officeUiFabricReactStrings.baseline
    - typings.officeUiFabricReact.officeUiFabricReactStrings.stretch
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def baseline: typings.officeUiFabricReact.officeUiFabricReactStrings.baseline = "baseline".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.baseline]
    
    inline def center: typings.officeUiFabricReact.officeUiFabricReactStrings.center = "center".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.center]
    
    inline def end: typings.officeUiFabricReact.officeUiFabricReactStrings.end = "end".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.end]
    
    inline def `space-around`: typings.officeUiFabricReact.officeUiFabricReactStrings.`space-around` = "space-around".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.`space-around`]
    
    inline def `space-between`: typings.officeUiFabricReact.officeUiFabricReactStrings.`space-between` = "space-between".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.`space-between`]
    
    inline def `space-evenly`: typings.officeUiFabricReact.officeUiFabricReactStrings.`space-evenly` = "space-evenly".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.`space-evenly`]
    
    inline def start: typings.officeUiFabricReact.officeUiFabricReactStrings.start = "start".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.start]
    
    inline def stretch: typings.officeUiFabricReact.officeUiFabricReactStrings.stretch = "stretch".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.stretch]
  }
  
  type IStackComponent = IComponent[IStackProps, IStackTokens, IStackStyles, IStackProps, js.Object]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, nonce, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results */ trait IStackProps
    extends StObject
       with IStackSlots
       with Slots[IStackSlots]
       with IStyleableComponentProps[IStackProps, IStackTokens, IStackStyles]
       with AriaAttributes
       with DOMAttributes[HTMLElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * Defines how to render the Stack.
      */
    var as: js.UndefOr[ElementType[HTMLAttributes[HTMLElement]]] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * Defines whether Stack children should not shrink to fit the available space.
      * @defaultvalue false
      */
    var disableShrink: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Defines the spacing between Stack children.
      * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
      * If 'column gap' is omitted, it's set to the same value as 'row gap'.
      * @deprecated Use `childrenGap` token in `IStackTokens` instead.
      */
    var gap: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines how much to grow the Stack in proportion to its siblings.
      */
    var grow: js.UndefOr[
        Boolean | Double | typings.officeUiFabricReact.officeUiFabricReactStrings.inherit | initial | unset
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether to render Stack children horizontally.
      * @defaultvalue false
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines how to align Stack children horizontally (along the x-axis).
      */
    var horizontalAlign: js.UndefOr[Alignment] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the maximum height that the Stack can take.
      * @deprecated Use `maxHeight` token in `IStackTokens` instead.
      */
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines the maximum width that the Stack can take.
      * @deprecated Use `maxWidth` token in `IStackTokens` instead.
      */
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the inner padding of the Stack.
      * @deprecated Use `padding` token in `IStackTokens` instead.
      */
    var padding: js.UndefOr[Double | String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines whether to render Stack children in the opposite direction (bottom-to-top if it's a vertical Stack and
      * right-to-left if it's a horizontal Stack).
      * @defaultvalue false
      */
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    /**
      * Defines how to align Stack children vertically (along the y-axis).
      */
    var verticalAlign: js.UndefOr[Alignment] = js.undefined
    
    /**
      * Defines whether the Stack should take up 100% of the height of its parent.
      * This property is required to be set to true when using the `grow` flag on children in vertical oriented Stacks.
      * Stacks are rendered as block elements and grow horizontally to the container already.
      * @defaultvalue false
      */
    var verticalFill: js.UndefOr[Boolean] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    /**
      * Defines whether Stack children should wrap onto multiple rows or columns when they are about to overflow
      * the size of the Stack.
      * @defaultvalue false
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object IStackProps {
    
    inline def apply(): IStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackProps]
    }
    
    extension [Self <: IStackProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAs(value: ElementType[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisableShrink(value: Boolean): Self = StObject.set(x, "disableShrink", value.asInstanceOf[js.Any])
      
      inline def setDisableShrinkUndefined: Self = StObject.set(x, "disableShrink", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setGap(value: Double | String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGrow(
        value: Boolean | Double | typings.officeUiFabricReact.officeUiFabricReactStrings.inherit | initial | unset
      ): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlign(value: Alignment): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVerticalAlign(value: Alignment): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVerticalFill(value: Boolean): Self = StObject.set(x, "verticalFill", value.asInstanceOf[js.Any])
      
      inline def setVerticalFillUndefined: Self = StObject.set(x, "verticalFill", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type IStackSlot = ISlotProp[IStackProps, scala.Nothing]
  
  trait IStackSlots extends StObject {
    
    /**
      * Defines a slot that is placed inside the root slot in order to achieve wrapping. Only used when the wrap
      * property is set to true.
      */
    var inner: js.UndefOr[IHTMLSlot] = js.undefined
    
    /**
      * Defines root slot of the component.
      */
    var root: js.UndefOr[IHTMLSlot] = js.undefined
  }
  object IStackSlots {
    
    inline def apply(): IStackSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackSlots]
    }
    
    extension [Self <: IStackSlots](x: Self) {
      
      inline def setInner(value: IHTMLSlot): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      inline def setRoot(value: IHTMLSlot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackSlots> */
  trait IStackStyles extends StObject {
    
    var inner: js.UndefOr[IStyle] = js.undefined
    
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IStackStyles {
    
    inline def apply(): IStackStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackStyles]
    }
    
    extension [Self <: IStackStyles](x: Self) {
      
      inline def setInner(value: IStyle): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerNull: Self = StObject.set(x, "inner", null)
      
      inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type IStackStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles], js.Function]
  ]
  
  type IStackTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackProps, IStackTokens], js.Function]]
  
  trait IStackTokens extends StObject {
    
    /**
      * Defines the spacing between Stack children.
      * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
      * If 'column gap' is omitted, it's set to the same value as 'row gap'.
      */
    var childrenGap: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines a maximum height for the Stack.
      */
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines a maximum width for the Stack.
      */
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Defines the padding to be applied to the Stack contents relative to its border.
      */
    var padding: js.UndefOr[Double | String] = js.undefined
  }
  object IStackTokens {
    
    inline def apply(): IStackTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStackTokens]
    }
    
    extension [Self <: IStackTokens](x: Self) {
      
      inline def setChildrenGap(value: Double | String): Self = StObject.set(x, "childrenGap", value.asInstanceOf[js.Any])
      
      inline def setChildrenGapUndefined: Self = StObject.set(x, "childrenGap", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
