package typings.officeUiFabricReact.comboBoxTypesMod

import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.comboBoxClassNamesMod.IComboBoxClassNames
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.on
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import typings.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.mod._Global_.JSX.Element
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.decimal
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.email
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.inherit
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.search
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.url
import typings.react.reactStrings.vertical
import typings.react.reactStrings.yes
import typings.std.Event_
import typings.std.Partial
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxProps extends ISelectableDroppableTextProps[IComboBox, IComboBox] {
  /**
    * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
    */
  var allowFreeform: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from the list of options. If
    * the combo box is expanded, this will also scroll to the suggested option, and give it a selected style.
    *
    * @defaultvalue "on"
    */
  var autoComplete: js.UndefOr[on | off] = js.undefined
  /**
    * The AutofillProps to be passed into the Autofill component inside combobox
    */
  var autofill: js.UndefOr[IAutofillProps] = js.undefined
  /**
    * The IconProps to use for the button aspect of the combobox
    */
  var buttonIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Styles for the caret down button.
    */
  var caretDownButtonStyles: js.UndefOr[Partial[IButtonStyles]] = js.undefined
  /**
    * Default styles that should be applied to ComboBox options,
    * in case an option does not come with user-defined custom styles
    */
  var comboBoxOptionStyles: js.UndefOr[Partial[IComboBoxOptionStyles]] = js.undefined
  /**
    * Custom max width for dropdown
    */
  var dropdownMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom width for dropdown (unless useComboBoxAsMenuWidth is undefined or false)
    */
  var dropdownWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom function for providing the classNames for the ComboBox. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function8[
      /* theme */ ITheme, 
      /* isOpen */ Boolean, 
      /* disabled */ Boolean, 
      /* required */ Boolean, 
      /* focused */ Boolean, 
      /* allowFreeForm */ Boolean, 
      /* hasErrorMessage */ Boolean, 
      /* className */ js.UndefOr[String], 
      IComboBoxClassNames
    ]
  ] = js.undefined
  /**
    * Optional iconButton props on combo box
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle the element.
    * This element is hidden by default because all functionality is handled by the input element and the arrow button is
    * only meant to be decorative.
    * @defaultvalue true
    */
  var isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional keytip for this combo box
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Callback issued when either:
    * 1) the selected option changes
    * 2) a manually edited value is submitted. In this case there may not be a matched option if allowFreeform is also true
    *    (and hence only value would be true, the other parameter would be null in this case)
    */
  @JSName("onChange")
  var onChange_IComboBoxProps: js.UndefOr[
    js.Function4[
      /* event */ FormEvent[IComboBox], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback issued when a ComboBox item is clicked.
    */
  var onItemClick: js.UndefOr[
    js.Function3[
      /* event */ FormEvent[IComboBox], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Function that gets invoked before the menu gets dismissed
    */
  var onMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that gets invoked when the ComboBox menu is dismissed
    */
  var onMenuDismissed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function that gets invoked when the ComboBox menu is launched
    */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback issued when the user changes the pending value in ComboBox
    */
  var onPendingValueChanged: js.UndefOr[
    js.Function3[
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Add additional content below the callout list.
    */
  var onRenderLowerContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
  /**
    * Add additional content above the callout list.
    */
  var onRenderUpperContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.undefined
  /**
    * Callback issued when the options should be resolved, if they have been updated or
    * if they need to be passed in the first time
    */
  var onResolveOptions: js.UndefOr[
    js.Function1[
      /* options */ js.Array[IComboBoxOption], 
      js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ]
  ] = js.undefined
  /**
    * Callback issued when the ComboBox requests the list to scroll to a specific element
    */
  var onScrollToItem: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.undefined
  /**
    * Collection of options for this ComboBox
    */
  @JSName("options")
  var options_IComboBoxProps: js.Array[IComboBoxOption]
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elements in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the comboBox itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * When options are scrollable the selected option is positioned at the top of the callout when it is opened
    * (unless it has reached the end of the scrollbar).
    * @defaultvalue false;
    */
  var scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * When specified, determines whether the callout (the menu which drops down) should
    * restore the focus after being dismissed or not.  If false, then the menu will not try
    * to set focus to whichever element had focus before the menu was opened.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[Partial[IComboBoxStyles]] = js.undefined
  /**
    * Value to show in the input, does not have to map to a combobox option
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use the ComboBoxes width as the menu's width
    */
  var useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined
}

object IComboBoxProps {
  @scala.inline
  def apply(
    options: js.Array[IComboBoxOption],
    about: String = null,
    accessKey: String = null,
    allowFreeform: js.UndefOr[Boolean] = js.undefined,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: typings.react.reactStrings.off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    autoCapitalize: String = null,
    autoComplete: on | off = null,
    autoCorrect: String = null,
    autoSave: String = null,
    autofill: IAutofillProps = null,
    buttonIconProps: IIconProps = null,
    calloutProps: ICalloutProps = null,
    caretDownButtonStyles: Partial[IButtonStyles] = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    comboBoxOptionStyles: Partial[IComboBoxOptionStyles] = null,
    componentRef: IRefObject[IComboBox] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultSelectedKey: String | Double | (js.Array[Double | String]) = null,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    dropdownMaxWidth: Int | Double = null,
    dropdownWidth: Int | Double = null,
    errorMessage: String = null,
    getClassNames: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    iconButtonProps: IButtonProps = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    keytipProps: IKeytipProps = null,
    label: String = null,
    lang: String = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[IComboBox] => Unit = null,
    onAnimationIteration: AnimationEvent[IComboBox] => Unit = null,
    onAnimationStart: AnimationEvent[IComboBox] => Unit = null,
    onAuxClick: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[IComboBox] => Unit = null,
    onBlur: FocusEvent[IComboBox] => Unit = null,
    onCanPlay: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onChange: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit = null,
    onClick: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[IComboBox] => Unit = null,
    onCompositionStart: CompositionEvent[IComboBox] => Unit = null,
    onCompositionUpdate: CompositionEvent[IComboBox] => Unit = null,
    onContextMenu: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[IComboBox] => Unit = null,
    onCut: ClipboardEvent[IComboBox] => Unit = null,
    onDismiss: () => Unit = null,
    onDoubleClick: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[IComboBox] => Unit = null,
    onDragEnd: DragEvent[IComboBox] => Unit = null,
    onDragEnter: DragEvent[IComboBox] => Unit = null,
    onDragExit: DragEvent[IComboBox] => Unit = null,
    onDragLeave: DragEvent[IComboBox] => Unit = null,
    onDragOver: DragEvent[IComboBox] => Unit = null,
    onDragStart: DragEvent[IComboBox] => Unit = null,
    onDrop: DragEvent[IComboBox] => Unit = null,
    onDurationChange: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onEmptied: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onEnded: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onError: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onFocus: FocusEvent[IComboBox] => Unit = null,
    onInput: FormEvent[IComboBox] => Unit = null,
    onInvalid: FormEvent[IComboBox] => Unit = null,
    onItemClick: (/* event */ FormEvent[IComboBox], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit = null,
    onKeyDown: KeyboardEvent[IComboBox] => Unit = null,
    onKeyPress: KeyboardEvent[IComboBox] => Unit = null,
    onKeyUp: KeyboardEvent[IComboBox] => Unit = null,
    onLoad: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onMenuDismiss: () => Unit = null,
    onMenuDismissed: () => Unit = null,
    onMenuOpen: () => Unit = null,
    onMouseDown: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[IComboBox, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[IComboBox] => Unit = null,
    onPause: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onPendingValueChanged: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit = null,
    onPlay: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onPlaying: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onPointerCancel: PointerEvent[IComboBox] => Unit = null,
    onPointerDown: PointerEvent[IComboBox] => Unit = null,
    onPointerEnter: PointerEvent[IComboBox] => Unit = null,
    onPointerLeave: PointerEvent[IComboBox] => Unit = null,
    onPointerMove: PointerEvent[IComboBox] => Unit = null,
    onPointerOut: PointerEvent[IComboBox] => Unit = null,
    onPointerOver: PointerEvent[IComboBox] => Unit = null,
    onPointerUp: PointerEvent[IComboBox] => Unit = null,
    onProgress: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onRateChange: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onRenderContainer: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        Element | Null
      ]
    ]) => Element | Null = null,
    onRenderItem: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null = null,
    onRenderList: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        Element | Null
      ]
    ]) => Element | Null = null,
    onRenderLowerContent: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], Element | Null]]) => Element | Null = null,
    onRenderOption: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null = null,
    onRenderUpperContent: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], Element | Null]]) => Element | Null = null,
    onReset: FormEvent[IComboBox] => Unit = null,
    onResolveOptions: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]] = null,
    onScroll: UIEvent[IComboBox] => Unit = null,
    onScrollToItem: /* itemIndex */ Double => Unit = null,
    onSeeked: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onSeeking: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onSelect: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onStalled: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onSubmit: FormEvent[IComboBox] => Unit = null,
    onSuspend: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onTouchCancel: TouchEvent[IComboBox] => Unit = null,
    onTouchEnd: TouchEvent[IComboBox] => Unit = null,
    onTouchMove: TouchEvent[IComboBox] => Unit = null,
    onTouchStart: TouchEvent[IComboBox] => Unit = null,
    onTransitionEnd: TransitionEvent[IComboBox] => Unit = null,
    onVolumeChange: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onWaiting: SyntheticEvent[IComboBox, Event_] => Unit = null,
    onWheel: WheelEvent[IComboBox] => Unit = null,
    openOnKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    panelProps: IPanelProps = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selectedKey: String | Double | (js.Array[Double | String]) = null,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: Partial[IComboBoxStyles] = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    text: String = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: typings.react.reactStrings.on | typings.react.reactStrings.off = null,
    useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null
  ): IComboBoxProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFreeform)) __obj.updateDynamic("allowFreeform")(allowFreeform.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (autofill != null) __obj.updateDynamic("autofill")(autofill.asInstanceOf[js.Any])
    if (buttonIconProps != null) __obj.updateDynamic("buttonIconProps")(buttonIconProps.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (caretDownButtonStyles != null) __obj.updateDynamic("caretDownButtonStyles")(caretDownButtonStyles.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (comboBoxOptionStyles != null) __obj.updateDynamic("comboBoxOptionStyles")(comboBoxOptionStyles.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultSelectedKey != null) __obj.updateDynamic("defaultSelectedKey")(defaultSelectedKey.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dropdownMaxWidth != null) __obj.updateDynamic("dropdownMaxWidth")(dropdownMaxWidth.asInstanceOf[js.Any])
    if (dropdownWidth != null) __obj.updateDynamic("dropdownWidth")(dropdownWidth.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction8(getClassNames))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (iconButtonProps != null) __obj.updateDynamic("iconButtonProps")(iconButtonProps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isButtonAriaHidden)) __obj.updateDynamic("isButtonAriaHidden")(isButtonAriaHidden.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3(onItemClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMenuDismiss != null) __obj.updateDynamic("onMenuDismiss")(js.Any.fromFunction0(onMenuDismiss))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction0(onMenuDismissed))
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(js.Any.fromFunction0(onMenuOpen))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPendingValueChanged != null) __obj.updateDynamic("onPendingValueChanged")(js.Any.fromFunction3(onPendingValueChanged))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRenderContainer != null) __obj.updateDynamic("onRenderContainer")(js.Any.fromFunction2(onRenderContainer))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction2(onRenderItem))
    if (onRenderList != null) __obj.updateDynamic("onRenderList")(js.Any.fromFunction2(onRenderList))
    if (onRenderLowerContent != null) __obj.updateDynamic("onRenderLowerContent")(js.Any.fromFunction2(onRenderLowerContent))
    if (onRenderOption != null) __obj.updateDynamic("onRenderOption")(js.Any.fromFunction2(onRenderOption))
    if (onRenderUpperContent != null) __obj.updateDynamic("onRenderUpperContent")(js.Any.fromFunction2(onRenderUpperContent))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResolveOptions != null) __obj.updateDynamic("onResolveOptions")(js.Any.fromFunction1(onResolveOptions))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollToItem != null) __obj.updateDynamic("onScrollToItem")(js.Any.fromFunction1(onScrollToItem))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(openOnKeyboardFocus)) __obj.updateDynamic("openOnKeyboardFocus")(openOnKeyboardFocus.asInstanceOf[js.Any])
    if (panelProps != null) __obj.updateDynamic("panelProps")(panelProps.asInstanceOf[js.Any])
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSelectedToTop)) __obj.updateDynamic("scrollSelectedToTop")(scrollSelectedToTop.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useComboBoxAsMenuWidth)) __obj.updateDynamic("useComboBoxAsMenuWidth")(useComboBoxAsMenuWidth.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxProps]
  }
}

